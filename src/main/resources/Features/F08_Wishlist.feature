@smoke
Feature:User can add products to Wishlist

  Scenario: User add HTC phone to Wishlist
    Given User redirects to Home page
    When User click on add to wishlist button of HTC phone
    Then Green success message will be displayed



  Scenario: User add HTC product to Wishlist and validate its quantity
    Given User redirects to Home page
    When User click on add to wishlist button of HTC phone
    And User click on Wishlist tab
    Then User will be navigated to wishlist page