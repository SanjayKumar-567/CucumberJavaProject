Feature: Test loginfunctionality 
  Scenario: check login sucessfully with valid credentials
    Given brower is open
    And User is on the login page
    When User enters username and password
    And User clicks on the login button
    Then User is redirected to the products page
