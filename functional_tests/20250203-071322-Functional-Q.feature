Feature: User Registration and Authentication
  Background:
    Given the API base URL 'https://example.com/api'

  # Registration scenarios
  Scenario: Successful user registration
    When I send a POST request to '/register' with payload
      | email              | password     | confirmPassword |
      | user@example.com   | Passw0rd!123 | Passw0rd!123    |
    Then the response status should be 201
    And the response should contain 'User registered successfully'

  Scenario: Registration with empty fields
    When I send a POST request to '/register' with payload
      | email | password | confirmPassword |
      |       |          |                 |
    Then the response status should be 400
    And the response should contain 'Email and password are required'

  Scenario: Registration with password mismatch
    When I send a POST request to '/register' with payload
      | email             | password     | confirmPassword |
      | user@example.com  | Passw0rd!123 | Passw0rd!124    |
    Then the response status should be 400
    And the response should contain 'Passwords do not match'

  Scenario: Registration with existing email
    When I send a POST request to '/register' with payload
      | email              | password     | confirmPassword |
      | user@example.com   | Passw0rd!123 | Passw0rd!123    |
    Then the response status should be 409
    And the response should contain 'Email already exists'

  # Login scenarios
  Scenario: Successful login
    When I send a POST request to '/login' with payload
      | email             | password     |
      | user@example.com  | Passw0rd!123 |
    Then the response status should be 200
    And the response should contain 'Login successful'

  Scenario: Login with invalid credentials
    When I send a POST request to '/login' with payload
      | email             | password     |
      | user@example.com  | WrongPassword|
    Then the response status should be 401
    And the response should contain 'Invalid credentials'

  Scenario: Login with locked account
    When I send a POST request to '/login' with payload
      | email                | password     |
      | lockeduser@example.com  | Passw0rd!123 |
    Then the response status should be 403
    And the response should contain 'Account is locked'

  # Profile management scenarios
  Scenario: Update user profile
    When I send a PUT request to '/profile' with payload
      | name     | email             | phoneNumber |
      | John Doe | user@example.com  | 1234567890  |
    Then the response status should be 200
    And the response should contain 'Profile updated successfully'

  Scenario: Change password
    When I send a PUT request to '/profile/password' with payload
      | currentPassword | newPassword  | confirmPassword |
      | Passw0rd!123    | NewPassw0rd! | NewPassw0rd!    |
    Then the response status should be 200
    And the response should contain 'Password changed successfully'

  Scenario: Change password with invalid input
    When I send a PUT request to '/profile/password' with payload
      | currentPassword | newPassword | confirmPassword |
      | WrongPassword   | simple      | simple          |
    Then the response status should be 400
    And the response should contain 'Invalid password'
