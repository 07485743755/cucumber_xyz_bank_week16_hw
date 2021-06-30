package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log= LogManager.getLogger(AccountPage.class.getName());
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutTab;
    @FindBy(xpath = "//span[contains(text(),'Jenna Salvator')]")
    WebElement nameText;
    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement depositTab;
    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement withDrawlTab;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountField;
    @FindBy(xpath = "(//button[contains(text(),'Deposit')])[2]")
    WebElement depositButton;
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessfulMessage;
    @FindBy(xpath = "(//button[contains(text(),'Withdraw')])[2]")
    WebElement withdrawButton;
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement transactionSuccessful;

    public String getTextFromLogOutTab(){
        log.info("Getting text from : "+logoutTab.toString());
        return getTextFromElement(logoutTab);
    }

    public String getTextOfYourName(){
        log.info("Getting text from : "+nameText.toString());
        return getTextFromElement(nameText);
    }

    public void clickOnDepositTab(){
        clickOnElement(depositTab);
        log.info("Clicking on : "+depositTab.toString());
    }

    public void enterAmount(String amount){
        sendTextToElement(amountField,amount);
        log.info("Sent amount to : "+amountField.toString()+"<br>");
    }

    public void clickOnDepositButton(){
        clickOnElement(depositButton);
        log.info("Clicking on : "+depositButton.toString());
    }

    public String getDepositSuccessfulMessage(){
        log.info("Getting text from : "+depositSuccessfulMessage.toString());
        return getTextFromElement(depositSuccessfulMessage);
    }
    public void clickOnWithDrawlTab(){
        clickOnElement(withDrawlTab);
        log.info("Clicking on : "+withDrawlTab.toString());

    }

    public void clickOnWithdrawButton(){
        clickOnElement(withdrawButton);
        log.info("Clicking on : "+withdrawButton.toString());
    }

    public String getTransactionSuccessfulText(){
        log.info("Getting text from : "+transactionSuccessful.toString());
        return getTextFromElement(transactionSuccessful);
    }
}
