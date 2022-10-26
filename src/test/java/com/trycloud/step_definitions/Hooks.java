package com.trycloud.step_definitions;


import com.trycloud.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
    In the class we will be able to pass pre- &  post- conditions to each scenario and each stop
     */
public class Hooks {

    @After
    public void teardownScenario(Scenario scenario){
       //if scenario fails this method will return true boolean value
        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        //BrowserUtils.sleep(5);
       // Driver.closeDriver();
        //System.out.println("------Closing browser using cucumber @After");
        //System.out.println("------Scenario ended/take screenshot @");
    }

}
