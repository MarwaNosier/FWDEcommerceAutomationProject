@smoke
Feature: user could filter with color
  Scenario:user could filter products using color
    Given User redirects to Home page
    When User hover on main categories then click on sub categories
    And user select color option
    Then Only products have this color is appeared
