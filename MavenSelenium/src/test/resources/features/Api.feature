Feature: Test CRUD methods in Sample Employee REST API testing
Scenario: Add Employee record
Given I Set POST employee service api endpoint
When I Set request HEADER
And Send a POST HTTP request
Then I receive valid Response 
Scenario: Update Employee record
Given I Set PUT employee service api endpoint
When I Set Update request Body
And Send PUT HTTP request
Then I receive valid HTTP response code 200
Scenario: Get Employee record
Given I Set GET employee service api endpoint When I Set request HEADER
And Send GET HTTP request
Then I receive valid HTTP response code 200
Scenario: DELETE Employee record
Given I Set DELETE employee service api endpoint When I Send DELETE HTTP request
Then I receive valid HTTP response code 200
