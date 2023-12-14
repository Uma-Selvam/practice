Feature: Validate the reqres API
Scenario: Validate the GET request of the Reqres api 
Given User Create the request object
When User adds the querey parameters 
And User creates the response object
Then User validates the response code and response body
