package com.fina.step_definitions;

import com.fina.pages.LoginPage;
import com.fina.utilities.BrowserUtils;
import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
LoginPage loginPage=new LoginPage();
    @Given("user is on  Login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(3);
    }
    @When("user enters correct email address{string}")
    public void userEntersCorrectEmailAddress(String emails) {
        loginPage.emailInput.sendKeys(emails);


    }
    @Then("user enters correct password {string}")
    public void userEntersCorrectPassword(String passwords) {
        loginPage.passwordInput.sendKeys(passwords);
        loginPage.loginButton.click();

    }


    @And("user should see the dashboard page")
    public void userShouldSeeTheDashboardPage() {
        String expectedTitle="Odoo";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @When("user enters invalid email address{string}")
    public void userEntersInvalidEmailAddress(String emails) {
        loginPage.emailInput.sendKeys(emails);

    }
    @Then("user enters invalid password{string}")
    public void userEntersInvalidPassword(String passwords) {
        loginPage.passwordInput.sendKeys(passwords);
        loginPage.loginButton.click();

    }
    @Then("user should see {string}")
    public void user_should_see(String expectedMessage) {
        Assert.assertTrue(expectedMessage.contains("Wrong login/password"));

    }



}
