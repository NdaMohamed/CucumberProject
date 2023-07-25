#description

Feature: feature to test login functionaity

Background: setup driver


  Scenario: S1 Check login is successful with valid password
    Given browser is open
    And user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

 Scenario: S2 Check login is successful with valid password
    Given browser is open
    And user is on login page
    When user leaves username empty
    And user enters password
    And clicks on login button
    Then user is navigated to the home page

    #Examples: 
    #|username|password|
    #|Nada|123456|