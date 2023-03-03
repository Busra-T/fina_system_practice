package com.fina.step_definitions;

import com.fina.pages.DocPage;
import com.fina.utilities.BrowserUtils;
import com.fina.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.junit.Assert;

import java.util.Set;

public class UserStory15_Documentation {
    DocPage docPage = new DocPage();

    @Given("user is logged in")
    public void user_is_logged_in() {
        docPage.LogIn();
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {
        docPage.ClickMenu(string);
    }

    @When("user clicks {string} option")
    public void user_clicks_option(String string) {
        String mainHandle = Driver.getDriver().getWindowHandle();
        BrowserUtils.sleep(4);
        docPage.ClickMenu(string);
        BrowserUtils.sleep(3);
        Set<String> windows = Driver.getDriver().getWindowHandles();


        for (String window : windows) {
            Driver.getDriver().switchTo().window(window);

        }
    }


    @Then("user sees  {string} in the url")
    public void user_sees_in_the_url(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }

    @Then("user sees {string} message is displayed")
    public void user_sees_message_is_displayed(String message) {
        Assert.assertTrue(docPage.message.isDisplayed());
    }

    @Then("there are {int} main documents topics are listed")
    public void there_are_main_documents_topics_are_listed(Integer int1) {
        Assert.assertTrue(docPage.headers.size() == int1);
    }
}
