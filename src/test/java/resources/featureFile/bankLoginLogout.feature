Feature: Login and Logout Test

  As a user I want customer able to Login and log out on xyz bank web site successfully

  @Regression
  Scenario: Verify that customer should log in and logout successfully
    Given I am on home page
    When I click on Bank manager login tab
    And I click on add customer tab
    And I enter first name "Jenna"in first name field and last name "Salvator"in last name field and post code "LE43NJ"in post code field
    And I click on add customer button
    Then I should get the alert message "Customer added successfully"
    When I click on home button
    And I click on customer login link
    And I search and select previous customer "Jenna Salvator"
    And I click on login button
    Then I should navigate to account page successfully with text"Logout"
    And I am able to see customer name"Jenna Salvator" on account page