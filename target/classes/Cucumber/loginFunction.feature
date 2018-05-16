Feature: User login
User can login with correct username and password.
User should be navigated to home page once logged in.
User will be shown a message about wrong username and password.
User should remain on login page if username and password is wrong.

	Scenario: Check login page has loaded
	Given I navigate to "http://dev.assignforce.revaturelabs.com/" 
	Then login page should load
	
	
	Scenario Outline: Login with correct username and password
	Given I have correct "<username>" and "<password>"
	When I click login
	Then I should be directed to home page "https://dev.assignforce.revaturelabs.com/home"
	
	    Examples: 
      |username | password | 
      |test.trainer@revature.com.int1 |trainer123 | 
     # |test.vpoftech@revature.com.int1 |yuvi1712  | 
      
  Scenario Outline: Remain on login page with incorrect username and password
    Given I have incorrect or missing "<username>" and "<password>"
    When I click loginw
    Then I should remain on login page 
    And shown a message about wrong username and password

    Examples: 
      |username | password | 
      |         |trainer123 | 
    
   Scenario: Write result to file
   Given I have a result
   Then I should have result written in "JsonFile.json"
     
