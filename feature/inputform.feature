
Feature: To fill all 7 forms in the Input Forms
  
  Scenario: Fill First simple form
    Given User inistialize the selenium easy page
    And user navigate to the input form
    When User click simple form 
    And Insert a message & add value
    Then User verfies the given msg values