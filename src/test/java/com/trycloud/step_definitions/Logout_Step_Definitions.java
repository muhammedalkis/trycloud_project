package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.LogoutPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Logout_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();
    @Given("User should be logged in with valid credentials")
    public void user_should_be_logged_in_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.signButton.click();

    }
    @Given("user clicks to logout button")
    public void user_clicks_to_logout_button() {
        logoutPage.expandButton.click();
      logoutPage.logOutButton.click();
    }
    @Then("user should be back to login page")
    public void user_should_be_back_to_login_page() {
        loginPage.signButton.isDisplayed();
    }

    @Given("user clicks to back button")
    public void user_clicks_to_back_button() {
      Driver.getDriver().navigate().back();

    }
    @Then("user shouldn't be able to go to home page again")
    public void user_shouldn_t_be_able_to_go_to_home_page_again() {
        loginPage.inputUserName.isDisplayed();
    }


}
