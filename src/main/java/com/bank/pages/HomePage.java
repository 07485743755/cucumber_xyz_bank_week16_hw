package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log= LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginTab;
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginTab;



    public void clickOnBankManagerLoginTab(){

        log.info("Clicking on : "+bankManagerLoginTab.toString());
        clickOnElement(bankManagerLoginTab);
    }

    public void clickOnCustomerLoginTab(){

        log.info("Clicking on : "+customerLoginTab.toString());
        clickOnElement(customerLoginTab);
    }


}
