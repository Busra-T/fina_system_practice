package com.fina.step_definitions;

import com.fina.pages.FinaChannelPage;
import com.fina.pages.FinaLoginPage;
import com.fina.utilities.BrowserUtils;
import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class FinaChannel_StepDefinitions {

    FinaChannelPage finaChannelPage=new FinaChannelPage();
    FinaLoginPage finaLoginPage=new FinaLoginPage();


    @Then("user clicks + sign of Channels")
    public void userClicksSignOfChannels() {
       finaChannelPage.btn_plus.click();
    }

    @Then("user writes channel name for the new channel")
    public void userWritesChannelNameForTheNewChannel(Map<String,String> channelName) {
        BrowserUtils.waitForVisibilityOf(finaChannelPage.bx_channelName);
        finaChannelPage.bx_channelName.sendKeys(channelName.get("channel name"));
    }

    @And("user clicks on #Create channel name to add the channel")
    public void userClicksOnToAddTheChannel() {
        finaChannelPage.create.click();
    }

    @Then("user should see the channel name under Channels")
    public void userShouldSeeTheChannelNameUnderChannels() {
        Assert.assertTrue( finaChannelPage.channel.isDisplayed());
    }


    @Given("user goes to the Discuss page")
    public void userGoesToTheDiscussPage() {
        finaLoginPage.logIn();
    }

    @Then("user clicks on #{string}")
    public void userClicksOn(String channelName) {
        finaChannelPage.channel.click();
    }

    @And("user writes a {string} in the message box")
    public void userWritesAInTheMessageBox(String message) {
        finaChannelPage.bx_message.sendKeys(message);
    }

    @Then("user clicks on Send button")
    public void userClicksOnSendButton() {
        finaChannelPage.btn_send.click();
    }


}
