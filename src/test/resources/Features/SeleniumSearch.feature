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
Feature: Search job openings
  
  #@SeleniumSearch
  Scenario: Selenium Search
    Given On indeed home page
    When search for selenium jobs
    Then refine job search
    Then register for email alerts
    #Then sort by date posted
    
  #@AmazonRadioSearch 
  Scenario: Amazon Radio Search
    Given Open web browser
    When open amazon home page
    Then refine by internet service supported
    Then refine search by price 
    
   Scenario: NBA Champions Search
    Given Open google home page
    When navigate wikipedia page
    #Then navigate wikipedia page
    #Then refine search by price 