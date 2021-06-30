package com.bank.cucumber;

import com.bank.basePage.BasePage;
import com.bank.propertyReader.PropertyReader;
import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends BasePage {

    @Before
    public void openBrowser(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Prime Testing","Nidhi Lathiya");
    }

    @After
    public void tearDown(Scenario scenario){

        // this method take screen shot of every executed test
            String screenShotPath= Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        closeBrowser();
    }

}
