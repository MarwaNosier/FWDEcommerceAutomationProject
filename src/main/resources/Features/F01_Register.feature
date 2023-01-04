@smoke
Feature: Register || User could register with new account


  Scenario: User could register with valid data
    Given user navigates to register page
    When user choose Gender
    And user enter valid first name
    And user enter valid last name
    And user select valid Date of birth
    And user enter valid email address
    And user enter valid password
    And user enter again the same valid password
    And user clicks on register button
    Then success message is displayed



  Scenario: User register with email already exists
    Given user navigates to register page
    When user choose Gender
    And user enter valid first name
    And user enter valid last name
    And user select valid Date of birth
    And user enter exit email address
    And user enter valid password
    And user enter again the same valid password
    And user clicks on register button
    Then error message is displayed

