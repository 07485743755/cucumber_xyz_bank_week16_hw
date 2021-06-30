Feature: Deposit money Test

  As a User I want customer should deposit money successfully

  @Regression
  Scenario: Customer should deposit money successfully
    Given I am on home page
    When I click on Bank manager login tab
    And I click on add customer tab
    And I enter first name "Jenna"in first name field and last name "Salvator"in last name field and post code "LE43NJ"in post code field
    And I click on add customer button
    Then I should get the alert message "Customer added successfully"
    When I click on open account tab
    And I click on customer drop down
    And I search and select previous customer "Jenna Salvator"
    And I click on currency drop down
    And I select "Pound" currency from currency drop down
    And I click on process button
    Then I should get the alert message "Account created successfully"
    When I click on home button
    And I click on customer login link
    And I search and select previous customer "Jenna Salvator"
    And I click on login button
    And I click on deposit tab
    And I enter amount "100" in amount field
    And I click on deposit button
    Then I am able to see deposit successful message"Deposit Successful"
