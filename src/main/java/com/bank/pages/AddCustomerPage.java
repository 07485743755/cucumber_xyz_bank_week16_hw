package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {

    private static final Logger log= LogManager.getLogger(AddCustomerPage.class.getName());

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;

    @FindBy(css = "button.btn.btn-default")
    WebElement addCustomerButton;

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeBtn;


    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
        log.info("Send text "+firstName+" to field : "+firstNameField.toString());
    }

    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
        log.info("Send text "+lastName+" to field : "+lastNameField.toString());
    }

    public void enterPostCode(String postCode){
        log.info("Send text : "+postCode+" to field : "+postCodeField.toString());
        sendTextToElement(postCodeField,postCode);
    }

    public void clickOnAddCustomerButton(){
        waitUntilElementToBeClickable(addCustomerButton,60);
        log.info("Clicking on : "+addCustomerButton.toString());
        clickOnElement(addCustomerButton);
    }

    public String getAlertMessage() throws InterruptedException {

        Alert alert = driver.switchTo().alert();
        return alert.getText();

    }

    public void alertAccept(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clickOnHomeButton(){
        log.info("Clicking on : "+homeBtn.toString());
        clickOnElement(homeBtn);
    }
}
