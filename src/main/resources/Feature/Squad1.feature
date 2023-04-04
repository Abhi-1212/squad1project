Feature: Login Test
  
  I want to test login functionality

  Background: 
    Given User navigates to Squad1 login page

  Scenario Outline: User login with the valid credentials
    When User enters email <email>
    And User enters password <password>
    And User click on login button
    Then USer logged in sucessfully

    Examples: 
      | email                | password |
      | abhishek@yopmail.com | hghhhhh  |
      | abhihjjk@yopmail.com | hghgyghh |

  Scenario: User login with the invalid credentials
    When User enters invalid email "jhkn.65"
    And User enters invalid password "Admin@12345"
    And User click on login button
    Then USer logged in unsucessfully

  Scenario: User login with the blank credentials
    When User keep email as blank " "
    And User keep password as blank " "
    And User click on login button
    Then USer got error message
