package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Login_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the  login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }

    @When("user enters the valid username")
    public void user_enters_the_valid_username() {
        loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters the valid password")
    public void user_enters_the_valid_password() {
       loginPage.inputPassword.sendKeys("password");
    }
    @When("user hits the enter")
    public void user_hits_the_enter() {
       loginPage.inputPassword.sendKeys(Keys.ENTER);
    }

    @Then("user should be on the login dashboard")
    public void user_should_be_on_the_login_dashboard() {
      Driver.getDriver().getTitle().contains("dashboard");
    }

    @When("user clicks to sign in button")
    public void user_clicks_to_sign_in_button() {
        loginPage.signButton.click();
    }
    @When("user enters the invalid username")
    public void user_enters_the_invalid_username() {
       loginPage.inputUserName.sendKeys("vfhsdhfsalk");
    }
    @When("user enters the invalid password")
    public void user_enters_the_invalid_password() {
       loginPage.inputPassword.sendKeys("fshfahoahsfonld");
    }


    @Then("user should see Wrong username or password error message")
    public void userShouldSeeWrongUsernameOrPasswordErrorMessage() {
        loginPage.wrongPasswordMsg.isDisplayed();
    }

    @Then("user should see Please fill out this field error message")
    public void userShouldSeePleaseFillOutThisFieldErrorMessage() {
        loginPage.requiredMessage.getText().contains("Please fill out this field");
    }
}
