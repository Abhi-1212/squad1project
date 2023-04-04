Feature: 
  Gmail Login

  Scenario: Gmail login with valid user
    Given User navigates to login page
    When User enters username "abhishek"
    And User enter password "abhi123"
    And User clicks on submit button
    Then user logged in successfully.

    Scenario Outline: Gmail login functionality with multiple users
    Given User go to login page
    When user enters user <email>
    And user enters passw <passwo>
    And User clicks on login
    Then Users  successful.
    
    Examples:
    |email       |passwo        |
    |bhi         |hgfg          |
    |bhikk       |jjikhgfg      |