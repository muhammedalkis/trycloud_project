package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "expand")
    public WebElement expandButton;
    @FindBy(xpath = "//li[@data-id ='logout']")
    public WebElement logOutButton;


}
