
Feature: Pet clinic website
		As an Admin
		I want to manage the details of owners in the system
		So that I can keep up to date information about all owners
		
		
  
  Scenario: Testing the website
    Given the home page
    When I click owners
    And I click on a specific owner
    And I edit the owners details
    Then I can view the owner I have just updated
    


  Scenario: Testing the business logic
    Given a content type JSON
		When I delete a user 
  	Then the status code reads 204
  	
   
   
      
