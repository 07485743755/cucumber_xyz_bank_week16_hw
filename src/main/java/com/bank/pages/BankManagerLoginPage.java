package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {

    private static final Logger log= LogManager.getLogger(BankManagerLoginPage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement addCustomerTab;

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement openAccountTab;


    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomerTab);
        log.info(("Clicking on : "+addCustomerTab.toString()));
    }

    public void clickOnOpenAccountTab(){
        clickOnElement(openAccountTab);
        log.info(("Clicking on : "+openAccountTab.toString()));
    }


}
