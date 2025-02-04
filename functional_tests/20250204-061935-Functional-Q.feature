Feature: Vertex AI Model Input Flow

Scenario: Verify UI flow for selecting Vertex AI model
  Given I navigate to the Vertex AI model input page
  When I select the "Fine-tune model" radio button
  Then the UI should respond without any errors or unresponsiveness

Scenario: Verify UI error handling for invalid model selection  
  Given I navigate to the Vertex AI model input page
  When I attempt to select an invalid or non-existent Vertex AI model
  Then the UI should display an appropriate error message
  And it should prevent further progression

Scenario: Verify file input functionality for Vertex AI models
  Given I navigate to the Vertex AI model input page
  And I select the desired Vertex AI model
  When I provide a valid file input
  Then the UI should accept the file input
  And proceed to the next step without any issues

Scenario: Verify token input functionality for Vertex AI models
  Given I navigate to the Vertex AI model input page 
  And I select the desired Vertex AI model
  When I provide a valid token input
  Then the UI should accept the token input
  And proceed to the next step without any issues

Scenario: Verify error handling for invalid token input
  Given I navigate to the Vertex AI model input page
  And I select the desired Vertex AI model 
  When I provide an invalid token input
  Then the UI should display an appropriate error message
  And prevent further progression

Feature: Jira Access Token and Connector

Scenario: Verify error notification for invalid Jira access token
  Given I navigate to the Jira connector configuration page
  When I enter an invalid Jira access token
  And attempt to connect to Jira
  Then the UI should display an error notification indicating invalid token

Scenario: Verify successful connection with valid Jira access token  
  Given I navigate to the Jira connector configuration page
  When I enter a valid Jira access token
  And attempt to connect to Jira
  Then the UI should successfully connect to Jira without errors

Feature: Non-functional Tests

Scenario: Verify user-friendliness of UI
  Given I navigate through various application pages and features
  When I interact with different UI elements
  Then the UI should be intuitive, easy to navigate
  And provide clear instructions and feedback

Scenario: Verify compatibility across browsers
  Given I access the application using different browsers
  When I perform various actions and test cases
  Then the application should function consistently across all supported browsers

Scenario: Verify application performance under high load
  Given I simulate a high load scenario
  When I generate multiple concurrent requests or simulate large number of users
  Then the application should remain responsive and stable
  And there should be no significant performance degradation

Scenario: Verify application security measures
  Given I attempt various security testing techniques  
  When I test for vulnerabilities like input validation, XSS, SQL injection
  Then the application should be resilient against common vulnerabilities
  And protect user data and sensitive information

Scenario: Verify application accessibility features
  Given I use assistive technologies to navigate the application
  When I interact with the application using these technologies
  Then the application should be accessible to users with disabilities
  And adhere to accessibility standards and guidelines
