package com.fina.pages;

import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinaChannelPage {

    public FinaChannelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='fa fa-plus o_add'])[1]")
    public WebElement btn_plus;

    @FindBy(xpath = "//input[@placeholder='Add a channel']")
    public WebElement bx_channelName;

    @FindBy(id = "ui-id-2")
    public WebElement create;

    @FindBy(xpath = "//span[contains(.,'Wednesday')]")
    public WebElement channel;

   @FindBy(xpath = "(//textarea[@placeholder='Write something...'])[1]")
    public WebElement bx_message;

   @FindBy(xpath = "(//button[.=\"Send\"])[1]")
    public WebElement btn_send;




}
