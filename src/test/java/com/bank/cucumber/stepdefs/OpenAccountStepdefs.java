package com.bank.cucumber.stepdefs;

import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class OpenAccountStepdefs {
    @When("^I click on open account tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountTab();
    }

    @And("^I click on customer drop down$")
    public void iClickOnCustomerDropDown() {
        new OpenAccountPage().clickOnCustomerDropDown();
    }

    @And("^I search and select previous customer \"([^\"]*)\"$")
    public void iSearchAndSelectPreviousCustomer(String customerName)  {
        new OpenAccountPage().searchAndSelectPreviousCustomer(customerName);
    }

    @And("^I click on currency drop down$")
    public void iClickOnCurrencyDropDown() {
        new OpenAccountPage().clickOnCurrencyDropDown();
    }

    @And("^I select \"([^\"]*)\" currency from currency drop down$")
    public void iSelectCurrencyFromCurrencyDropDown(String currency)  {
        new OpenAccountPage().selectCurrencyFromDropDown(currency);
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().ClickOnProcessButton();
    }
}
