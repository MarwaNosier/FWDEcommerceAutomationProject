@smoke

Feature:  users should be able to login to the system


  Scenario:user login with valid email and password
    Given user go to login page
    When user enter "test862000@gmail.com" and "password123"
    And user click on login button
    Then user could login successfully and go to home Page



  Scenario:  user login with invalid username and password
    Given user go to login page
    When user enter "invalidemail" and "invaildpass!"
    And user click on login button
    Then user could not login successfully

