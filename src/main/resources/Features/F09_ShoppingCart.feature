@smoke
Feature: user could add different products to Shopping cart

Scenario: User add HTC phone to Shopping cart
Given User redirects to Home page
When User click on add to cart button of HTC phone
Then A success message will be displayed


  Scenario: User remove HTC phone from Shopping cart after adding
    Given User redirects to Home page
    When User click on add to cart button of HTC phone
    And User click on Shopping cart tab
    And User remove product
    Then Verify that product remove successfully

