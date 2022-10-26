package com.trycloud.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    //This method will accept int seconds and execute Thread.sleep for given duration

    public static void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public static void switchWindowAndVerify( String expectedUrl, String expectedTitle){
        Set<String> allWindowHandles =Driver.getDriver().getWindowHandles();
        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedUrl)){
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }
    public static void verifyUrlContains(String expectedTitle){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedTitle));
    }

    public static void waitForInvisibilityOf(WebElement webElement){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    /**
     * This method will accept a dropdown as a WebElement
     * and retunr all the options text in a list of string
     * @param dropdownElement
     * @return
     */

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){
        Select select = new Select(dropdownElement);
        //List of all Actual month<options> as a web element.
        List<WebElement> actualOptionsAsWebElement = select.getOptions();
        //List of all Actual month <options> as a string
        List<String> actualOptionsAsString = new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }
        return actualOptionsAsString;

    }

    public static void clickRadioButton( List<WebElement> radioButtons,String attributeValue){

        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }

        }
    }
}

