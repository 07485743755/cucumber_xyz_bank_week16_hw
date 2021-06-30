package com.bank.cucumber.stepdefs;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddCustomerStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }


    @When("^I click on Bank manager login tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @And("^I click on add customer tab$")
    public void iClickOnAddCustomerTab() throws InterruptedException {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^I enter first name \"([^\"]*)\"in first name field and last name \"([^\"]*)\"in last name field and post code \"([^\"]*)\"in post code field$")
    public void iEnterFirstNameInFirstNameFieldAndLastNameInLastNameFieldAndPostCodeInPostCodeField(String firstName, String lastName, String postCode) throws InterruptedException {
        Thread.sleep(1000);
        AddCustomerPage addCustomerPage=new AddCustomerPage();
        addCustomerPage.enterFirstName(firstName);
        addCustomerPage.enterLastName(lastName);
        addCustomerPage.enterPostCode(postCode);
    }

    @And("^I click on add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @Then("^I should get the alert message \"([^\"]*)\"$")
    public void iShouldGetTheAlertMessage(String expectedAlertMessage) throws InterruptedException {
       Thread.sleep(1000);
        Assert.assertTrue(new AddCustomerPage().getAlertMessage().contains(expectedAlertMessage));
        new AddCustomerPage().alertAccept();
    }
}
