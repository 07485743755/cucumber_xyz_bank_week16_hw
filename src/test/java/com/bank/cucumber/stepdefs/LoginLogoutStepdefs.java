package com.bank.cucumber.stepdefs;

import com.bank.pages.AccountPage;
import com.bank.pages.AddCustomerPage;
import com.bank.pages.CustomersPage;
import com.bank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginLogoutStepdefs {
    @When("^I click on home button$")
    public void iClickOnHomeButton() {
        new AddCustomerPage().clickOnHomeButton();
    }

    @And("^I click on customer login link$")
    public void iClickOnCustomerLoginLink() {
        new HomePage().clickOnCustomerLoginTab();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new CustomersPage().clickOnLoginButton();
    }

    @Then("^I should navigate to account page successfully with text\"([^\"]*)\"$")
    public void iShouldNavigateToAccountPageSuccessfullyWithText(String expectedText) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(expectedText,new AccountPage().getTextFromLogOutTab());
    }

    @And("^I am able to see customer name\"([^\"]*)\" on account page$")
    public void iAmAbleToSeeCustomerNameOnAccountPage(String expectedName) throws InterruptedException {
        Thread.sleep(500);
       Assert.assertEquals(expectedName,new AccountPage().getTextOfYourName());
    }
}
