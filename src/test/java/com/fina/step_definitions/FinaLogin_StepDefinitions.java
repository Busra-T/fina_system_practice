package com.fina.step_definitions;

import com.fina.pages.FinaLoginPage;
import com.fina.utilities.BrowserUtils;
import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinaLogin_StepDefinitions {

    FinaLoginPage finaLoginPage=new FinaLoginPage();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLogin"));
    }

    @Then("user enters a valid e-mail")
    public void userEntersAValidEMail() {
    finaLoginPage.input_email.sendKeys(ConfigurationReader.getProperty("email"));

    }

    @And("user enters a valid password")
    public void userEntersAValidPassword() {
        finaLoginPage.input_password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @And("user clicks on the Log in button")
    public void userClicksOnTheLogInButton() {
        finaLoginPage.btn_login.click();
    }

    @Then("should see the #Inbox in the title")
    public void shouldSeeTheInboxInTheTitle() {
        String expectedInTitle="#Inbox";

        BrowserUtils.waitForTitleContains(expectedInTitle);
        BrowserUtils.verifyTitleContains(expectedInTitle);
    }

    @And("user enters invalid {string} and {string} combinations")
    public void userEntersInvalidAndCombinations(String email, String password) {
        finaLoginPage.input_email.sendKeys(email);
        finaLoginPage.input_password.sendKeys(password);
        finaLoginPage.btn_login.click();
    }

    @Then("user should see {string} message")
    public void userShouldSeeMessage(String message) {
        String actual=finaLoginPage.invalidMessage.getText();
        Assert.assertTrue(actual.contains(message));
    }
}
