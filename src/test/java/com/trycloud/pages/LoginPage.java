package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement inputUserName;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id = "submit-form")
    public WebElement signButton;

    @FindBy(className = "toggle-password")
    public WebElement seePassword;

    @FindBy (id = "lost-password")
    public WebElement forgotPassword;

    @FindBy(xpath = "//p[@class = 'warning wrongPasswordMsg']")
    public WebElement wrongPasswordMsg;

    @FindBy(xpath = "//input[@required ='required']")
    public WebElement requiredMessage;
}
