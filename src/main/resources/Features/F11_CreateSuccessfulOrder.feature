@smoke
Feature: User could Create successful Order
  Scenario: Create successful Order
    Given user go to login page
    When user enter "test862000@gmail.com" and "password123"
    And user click on login button
    When User redirects to Home page
    When User click on add to cart button of HTC phone
    And User click on Shopping cart tab
    And User agree with the terms of service
    And user click on checkout
    And User fill Billing address form
    And User click on continue button in Billing
    And User click on continue button in Shipping method
    And User click on continue button in Payment method
    And User click on continue button in Payment information
    And User click on confirm
    Then Message is displayed


