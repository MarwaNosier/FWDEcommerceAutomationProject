@smoke
Feature: User could switch between currencies US-Euro


  Scenario:  User changes the currency from USD to Euro
    Given User redirects to Home page
    When User select Euro from drop down list
    Then Currency of product is changed into Euro