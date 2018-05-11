
Feature: Curricula toggle
User can toggle the core
And User can toggle the focus
User should see a list of item once toggle is clicked
User should not see a list of item if toggle is not clicked

Scenario Outline: 
	Given I <click> on the core toggle
	Then a list of core <item> should be displayed


	   Examples: 
      | click  |   item    | 
      |"toggle"  | "listofcore" | 
     

Scenario Outline:
	Given I <click> on the focus toggle
	Then a list of focus<item> should be displayed
		Examples: 
      | click |   item    |  
      |"toggle" |"listoffocus"|
	
	
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
