@smoke
Feature: Users can search for any product using product name or using SKU

  Scenario: User can search using product name
    Given User redirects to Home page
    When User search using product name "book"
    And User click on Search button
    Then Products that appears will be related to the product name "book"


 Scenario: User can search for product using sku
    Given User redirects to Home page
    When User search with product sku "SCI_FAITH"
    And User click on Search button
    Then Products that appears will be related to the product sku "SCI_FAITH"



#  suk: SCI_FAITH , APPLE_CAM , SF_PRO_11
# name: book ,nike ,laptop