
Feature: Curricula toggle
User can toggle the focus
User should not see a list of item once toggle is clicked
User should  see a list of item if toggle is not clicked

Scenario Outline: 
	Given I <click> on the focus toggle
	Then a list of focus <item> should not be displayed


	   Examples: 
      | click  |   item    | 
      |"toggle"  | "listoffocus" | 