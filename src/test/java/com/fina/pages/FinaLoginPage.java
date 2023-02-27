package com.fina.pages;

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

}
