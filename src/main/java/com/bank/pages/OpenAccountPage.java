package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    private static final Logger log= LogManager.getLogger(OpenAccountPage.class.getName());

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDown;
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDown;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;


    public void clickOnCustomerDropDown(){

        clickOnElement(customerDropDown);
        log.info("Clicking on "+customerDropDown.toString());
    }
    public void searchAndSelectPreviousCustomer(String customerName){

        selectByVisibleTextFromDropDown(customerDropDown,customerName);
        log.info("Select previous customer from : "+ customerDropDown.toString());

    }

    public void clickOnCurrencyDropDown(){
        clickOnElement(currencyDropDown);
        log.info("Clicking on : "+currencyDropDown.toString());
    }
    public void selectCurrencyFromDropDown(String currency){

        selectByVisibleTextFromDropDown(currencyDropDown,currency);
        log.info("Select currency from : "+currencyDropDown.toString());
    }

    public void ClickOnProcessButton(){
        log.info("Clicking on : "+processButton.toString());
        clickOnElement(processButton);
    }

    public String getAccountCreatedSuccessfullyAlertMessage(){

        Alert alert=driver.switchTo().alert();
        return alert.getText();
    }

    public void closeTheAlertMessage(){

        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
}
