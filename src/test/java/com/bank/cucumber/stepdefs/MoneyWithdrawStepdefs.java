package com.bank.cucumber.stepdefs;

import com.bank.pages.AccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MoneyWithdrawStepdefs {
    @And("^I click on withdrawal tab$")
    public void iClickOnWithdrawalTab() throws InterruptedException {
        Thread.sleep(1000);
        new AccountPage().clickOnWithDrawlTab();
    }

    @And("^I click on withdraw button$")
    public void iClickOnWithdrawButton() throws InterruptedException {
        Thread.sleep(1000);
        new AccountPage().clickOnWithdrawButton();
    }

    @Then("^I am able to see transaction successful message\"([^\"]*)\"$")
    public void iAmAbleToSeeTransactionSuccessfulMessage(String expectedTranscactionSuccessMessage)  {

        Assert.assertEquals(expectedTranscactionSuccessMessage,new AccountPage().getTransactionSuccessfulText());
    }
}
