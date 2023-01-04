@smoke
Feature:User Reset Password

  Scenario: User could reset his password successfully
    Given user go to login page
    When user click on Forgot password
    And user enter his email
    And user click on Recover button
    Then Message Email with instructions has been sent to user is displayed

  Scenario: User could not reset his password successfully
   Given user go to login page
    When user click on Forgot password
    And user enter error email
    And user click on Recover button
    Then Red Message Email not found is displayed
