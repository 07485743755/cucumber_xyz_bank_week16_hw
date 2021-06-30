Feature: Bank Test

  As a User I want to test that bank manager should add customer successfully.

  @Smoke @Sanity @Regression
  Scenario: Verify Bank manager should able to add customer successfully
    Given I am on home page
    When I click on Bank manager login tab
    And I click on add customer tab
    And I enter first name "Jenna"in first name field and last name "Salvator"in last name field and post code "LE43NJ"in post code field
    And I click on add customer button
    Then I should get the alert message "Customer added successfully"

