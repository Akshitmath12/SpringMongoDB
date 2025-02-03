Feature: User Login API Testing

Scenario: Successful login
Given I have the API endpoint '/login'
And I have the valid username and password 
When I send a POST request with the valid username and password
Then the response status should be 200
And the response body should contain 'dashboard'

Scenario: Login with incorrect password
Given I have the API endpoint '/login'
And I have a valid username and incorrect password
When I send a POST request with the valid username and incorrect password
Then the response status should be 401
And the response body should contain 'Incorrect password. Try again.'

Scenario: Login with incorrect username
Given I have the API endpoint '/login'
And I have an incorrect username and valid password
When I send a POST request with the incorrect username and valid password
Then the response status should be 404
And the response body should contain 'Username does not exist.'

Scenario: Login with empty username and password fields
Given I have the API endpoint '/login'
And I have an empty username and password
When I send a POST request with the empty username and password
Then the response status should be 400
And the response body should contain 'Username and password are required.'

Scenario: Verify the 'Forgot Password' functionality
Given I have the API endpoint '/forgot-password'
When I send a GET request to '/forgot-password'
Then the response status should be 200
And the response body should contain 'Reset Password'

Scenario: Verify the visibility of password while typing
Given I have the API endpoint '/login'
And I have a password to type in
When I send a POST request with the password
Then the response status should be 200
And the response body should not reveal the password

Scenario: Verify the session timeout after a certain period of inactivity
Given I have the API endpoint '/logout'
And I have been inactive for a certain period
When I send a GET request to '/logout'
Then the response status should be 200
And the response body should contain 'Session expired'

Scenario: Verify the load time of login page
Given I have the API endpoint '/login'
When I send a GET request to '/login'
Then the response status should be 200
And the response time should be less than 2 seconds

Scenario: Verify the system's behavior under heavy load
Given I have the API endpoint '/login'
And I have multiple users logging in at the same time
When I send multiple POST requests to '/login'
Then the response status should be 200
And the system should not crash

Scenario: Verify the security of the login process
Given I have the API endpoint '/login'
And I have an attempt to login using SQL Injection or Cross-Site Scripting
When I send a POST request with the malicious input
Then the response status should be 403
And the system should not allow unauthorized access

Scenario: Verify the compatibility of the login page on different browsers
Given I have the API endpoint '/login'
And I have different browsers
When I send a GET request to '/login' from each browser
Then the response status should be 200
And the login page should display and function correctly on all tested browsers

Scenario: Verify the responsiveness of the login page on different devices
Given I have the API endpoint '/login'
And I have different devices
When I send a GET request to '/login' from each device
Then the response status should be 200
And the login page should display and function correctly on all tested devices
