Feature: API Testing for Auth Token Switching, Toast Message Display, Code Segregation and Shifting

  Scenario: Testing the functionality of switching auth tokens after selecting the connector
  Given the API base URL 'http://localhost:3000' 
  And a connector is selected
  When I send a POST request to '/switchAuthToken' with the new auth token in the payload
  Then the response status should be 200
  And the response should contain 'Auth token switched successfully'
  But when no connector is selected
  And I send a POST request to '/switchAuthToken' with the new auth token in the payload
  Then the response status should be 400
  And the response should contain 'Select a connector first'

  Scenario: Testing the toast message in Gemini Pro
  Given the API base URL 'http://localhost:3000' 
  When I send a POST request to '/triggerToastMessage'
  Then the response status should be 200
  And the response should contain 'Toast message displayed'
  But when no action is performed
  And I send a GET request to '/checkToastMessage'
  Then the response status should be 200
  And the response should not contain 'Toast message displayed'

  Scenario: Testing the segregation of Vertex File Input and Vertex Token Input components
  Given the API base URL 'http://localhost:3000' 
  When I send a GET request to '/checkCodeSegregation'
  Then the response status should be 200
  And the response should contain 'Components are segregated'

  Scenario: Testing the shift of the API of fetching vertex token from the Json file to aiModel.handles.js
  Given the API base URL 'http://localhost:3000' 
  When I send a GET request to '/fetchVertexToken'
  Then the response status should be 200
  And the response should contain 'Fetched from aiModel.handles.js'

  Scenario: Testing the functionality present in aiModels.js that can be called in connector as well
  Given the API base URL 'http://localhost:3000' 
  When I send a GET request to '/callFunction'
  Then the response status should be 200
  And the response should contain 'Function called successfully'

  Scenario: Testing the shift of verifySelectedModels code to the aiModels.js
  Given the API base URL 'http://localhost:3000' 
  When I send a GET request to '/checkVerifySelectedModelsCode'
  Then the response status should be 200
  And the response should contain 'Code present in aiModels.js'

  Scenario: Testing the performance of the system after implementing the changes
  Given the API base URL 'http://localhost:3000' 
  When I send a GET request to '/checkPerformance'
  Then the response status should be 200
  And the response should contain 'System performing optimally'

  Scenario: Testing the security of the auth token switching operation
  Given the API base URL 'http://localhost:3000' 
  When I send a GET request to '/checkAuthTokenSecurity'
  Then the response status should be 200
  And the response should contain 'Auth token switch operation is secure'

  Scenario: Testing the usability of the system after implementing the changes
  Given the API base URL 'http://localhost:3000' 
  When I send a GET request to '/checkUsability'
  Then the response status should be 200
  And the response should contain 'System is user-friendly'

  Scenario: Testing the maintainability of the code after segregation and shifting of components and code
  Given the API base URL 'http://localhost:3000' 
  When I send a GET request to '/checkCodeMaintainability'
  Then the response status should be 200
  And the response should contain 'Code is maintainable'

  Scenario: Testing the reliability of the system after implementing the changes
  Given the API base URL 'http://localhost:3000' 
  When I send a GET request to '/checkReliability'
  Then the response status should be 200
  And the response should contain 'System is reliable'
