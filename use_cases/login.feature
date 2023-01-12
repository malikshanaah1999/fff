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
@tag
Feature: Admin login

  @tag1
  Scenario: Administrator can login with valid credentials.
    Given The Administrator is on the login page.
    When The Admin. enters a valid username and password.
    And Clicks on the login button.
    Then The user should be navigated to the Home page.

	@tag2
  Scenario: Administrator has a wrong password.
    Given The Administrator is on the login page.
    When The Admin. entered a wrong username or password.
    And Clicks on the login button.
    Then The Administrator will still on the login page.
