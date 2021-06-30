package com.bank.cucumber.stepdefs;

import com.bank.pages.AccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class DepositMoneyStepdefs {


    @And("^I click on deposit tab$")
    public void iClickOnDepositTab() throws InterruptedException {

        Thread.sleep(1000);
        new AccountPage().clickOnDepositTab();
    }

    @And("^I enter amount \"([^\"]*)\" in amount field$")
    public void iEnterAmountInAmountField(String amount) throws InterruptedException {

        Thread.sleep(500);
        new AccountPage().enterAmount(amount);
    }

    @And("^I click on deposit button$")
    public void iClickOnDepositButton() throws InterruptedException {
        Thread.sleep(1000);
        new AccountPage().clickOnDepositButton();
    }

    @Then("^I am able to see deposit successful message\"([^\"]*)\"$")
    public void iAmAbleToSeeDepositSuccessfulMessage(String expectedMessage) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(expectedMessage,new AccountPage().getDepositSuccessfulMessage());
    }


}
