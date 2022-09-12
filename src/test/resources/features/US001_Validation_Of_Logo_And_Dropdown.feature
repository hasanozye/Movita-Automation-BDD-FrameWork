@tc01
Feature: US001 Validation Of Logo And Dropdown

  Scenario:TC01 <--> User Validates Movita Logo
    Given  Go to "movita" page
    When Hover the Movita Logo with mouse
    And Click with mouse
    And Hover the Dropdown Section
    When Click to Dropdown and select “Türkçe” option
    Then Click to Dropdown and select “English” option