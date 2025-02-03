Feature: Testing API that interacts with different components of the application

Scenario: Checking the accessibility of the session recording link
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/session-recording-link'
Then the response status should be 200
And the response should contain 'session recording video'

Scenario: Verifying the documentation link accessibility
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/documentation-link'
Then the response status should be 200
And the response should contain 'documentation'

Scenario: Verifying the main repo link
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/main-repo-link'
Then the response status should be 200
And the response should contain 'main repo'

Scenario: Verifying the internal development repo link
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/internal-development-repo-link'
Then the response status should be 200
And the response should contain 'internal development repo'

Scenario: Verifying the load time of session recording video
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/session-recording-link'
Then the response status should be 200
And the response should load within a reasonable time frame

Scenario: Verifying the load time of documentation
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/documentation-link'
Then the response status should be 200
And the response should load within a reasonable time frame

Scenario: Verifying the load time of the main repo
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/main-repo-link'
Then the response status should be 200
And the response should load within a reasonable time frame

Scenario: Verifying the load time of the internal development repo
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/internal-development-repo-link'
Then the response status should be 200
And the response should load within a reasonable time frame

Scenario: Verifying the load time of the development repository
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/development-repository-link'
Then the response status should be 200
And the response should load within a reasonable time frame

Scenario: Verifying the load time of the development repository paths
Given the API base URL 'http://localhost:3000' 
When I send a GET request to '/development-repository-paths'
Then the response status should be 200
And the response should load within a reasonable time frame
