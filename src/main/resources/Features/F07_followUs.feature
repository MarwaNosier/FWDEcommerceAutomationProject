@smoke
Feature: User could open followUs links

  Scenario: User opens facebook link
    Given User redirects to Home page
    When User click on Facebook icon
    Then New tab will be opened with this URL "https://www.facebook.com/nopCommerce"

  Scenario: User opens twitter link
    Given User redirects to Home page
    When User click on Twitter icon
    Then New tab will be opened with this URL "https://twitter.com/nopCommerce"

  Scenario: User opens RSS link
    Given User redirects to Home page
    When User click on RSS icon
    Then New tab will be opened with this URL "https://demo.nopcommerce.com/news/rss/1"

  Scenario: User opens youtube link
    Given User redirects to Home page
    When User click on Youtube icon
    Then New tab will be opened with this URL "https://www.youtube.com/user/nopCommerce"