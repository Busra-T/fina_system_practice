package com.fina.step_definitions;

import com.fina.pages.FinaChannelPage;
import com.fina.utilities.BrowserUtils;
import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FinaChannel_StepDefinitions {

    FinaChannelPage finaChannelPage=new FinaChannelPage();
    @Given("user goes to Discuss page")
    public void userGoesToDiscussPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlDiscuss"));
    }

    @Then("user clicks + sign of Channels")
    public void userClicksSignOfChannels() {
       finaChannelPage.btn_plus.click();
    }

    @Then("user writes {string} for the new channel")
    public void userWritesForTheNewChannel(String channelName) {
        BrowserUtils.waitForVisibilityOf(finaChannelPage.bx_channelName);
        finaChannelPage.bx_channelName.sendKeys(channelName);
    }

    @And("user clicks on #Create {string} to add the channel")
    public void userClicksOnToAddTheChannel(String channelName ) {
        finaChannelPage.create.click();
    }

    @Then("user should see the {string} under Channels")
    public void userShouldSeeTheUnderChannels(String arg0) {
        Assert.assertTrue( finaChannelPage.channel.isDisplayed());
    }
}
