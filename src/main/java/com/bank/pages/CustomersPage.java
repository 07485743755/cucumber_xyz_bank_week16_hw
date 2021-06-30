package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility {

    private static final Logger log= LogManager.getLogger(CustomersPage.class.getName());

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourNameDropDown;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;



    public void selectCustomerWhichCreatedPreviously(String customerName){


        log.info("Clicking on : "+yourNameDropDown.toString());
        clickOnElement(yourNameDropDown);
        log.info("Select customer name from : "+yourNameDropDown.toString());
        selectByVisibleTextFromDropDown(yourNameDropDown,customerName);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Clicking on : "+loginButton.toString());
    }


}
