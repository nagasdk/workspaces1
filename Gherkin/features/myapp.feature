
Feature: Test Facebook home Page

  Scenario: Test Login with credentials
    Given Open Chrome
    And Launch FB App
    When I enter valid username
    And valid password
    Then User should be able to login
    

    
