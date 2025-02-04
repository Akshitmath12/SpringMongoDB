Feature: API Testing

# Scenario for testing POST method
Scenario: Testing HTTP POST method
  Given the API base URL 'http://api.example.com/v1'
  When I send a POST request to '/users' with payload:
    | name   | email            | password |
    | John   | john@example.com | Pass123# |
  Then the response status should be 201
  And the response should contain user details including 'id'

# Scenario for testing GET method  
Scenario: Testing HTTP GET method
  Given the API base URL 'http://api.example.com/v1'
  And I am an authenticated user
  When I send a GET request to '/users/123'
  Then the response status should be 200
  And the response should contain user details for 'id' 123

# Scenario for testing PUT method
Scenario: Testing HTTP PUT method
  Given the API base URL 'http://api.example.com/v1'  
  And I am an authenticated user
  When I send a PUT request to '/users/123' with payload:
    | name | email             |
    | Jane | jane@example.com  |
  Then the response status should be 200
  And the response should contain updated user details

# Scenario for testing DELETE method  
Scenario: Testing HTTP DELETE method
  Given the API base URL 'http://api.example.com/v1'
  And I am an authenticated user
  When I send a DELETE request to '/users/123'
  Then the response status should be 204
  And subsequent GET request to '/users/123' should return 404

# Scenario for testing incorrect input
Scenario: Testing incorrect input
  Given the API base URL 'http://api.example.com/v1'
  When I send a POST request to '/users' with payload:
    | name | email | password |
    |      |       |          |
  Then the response status should be 400
  And the response body should contain 'Missing required fields'

# Scenario for testing authentication
Scenario: Testing authentication
  Given the API base URL 'http://api.example.com/v1'  
  When I send a GET request to '/users/123' without authentication
  Then the response status should be 401
  And the response body should contain 'Unauthorized'

# Scenario for testing rate limiting
Scenario: Testing rate limiting
  Given the API base URL 'http://api.example.com/v1'
  And I am an authenticated user
  When I send 100 GET requests to '/users' in 1 second
  Then the response status for requests after 60 should be 429
  And the response header should contain 'Retry-After'
