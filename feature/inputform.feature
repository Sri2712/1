
Feature: To fill all 7 forms in the Input Forms

Background:
Given User inistialize the selenium easy page
    And user navigate to the input form
  
 Scenario: Fill First simple form
    When User click simple form 
   And Insert a message & add value
    Then User verfies the given msg values
   
    Scenario: Clicking the Checkbox
    When User click Single Checkbox
    And User also clicks all Multiple Checkboxs
    Then User ensures everyrhing clicks
    
   Scenario: Clickingthe Radio Button
    When User clicks single and group Radio Buttons
   Then User checking value after clicking
    
    Scenario: Select dropd down list 
   When User selecting single value
     And User selecting multiple values
    
     Scenario: Filling the simple input form
     When User to fill the input form
    |First Name|Sriram|
    |Last Name|G|
    |E-Mail|sri@gmail.com|
    |Phone|9876543210|
    |Address|456 MG road|
    |City|Los Angeles|
    |Zip Code|90001|
    |Website or domain name|www.sri.com|
    |Project Description|selenium automation|
     And User send the filled infomartion
    
     Scenario: Filling Ajax Form
    When User fill the ajax form and send
     Then User should see Form submited Successfully message
    
     Scenario: Singleand multiple Search and Select 
    When User select single and multi values with search
     And User select single value with some disable values
     When User select Drop-down with Category related options