package com.fina.pages;

import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinaLoginPage {

    public FinaLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement input_email;

    @FindBy(id = "password")
    public WebElement input_password;

    @FindBy(xpath = "//button[.=\"Log in\"]")
    public WebElement btn_login;

    public void logIn(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLogin"));
        input_email.sendKeys(ConfigurationReader.getProperty("email"));
        input_password.sendKeys(ConfigurationReader.getProperty("password"));
        btn_login.click();
    }

    @FindBy(xpath = "//p[contains(.,\"Wrong login/password\")]")
    public WebElement invalidMessage;

}
