package com.fina.pages;

import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InitialPage {
    public InitialPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "login")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInBtn;


    public void LogIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        emailInput.sendKeys(ConfigurationReader.getProperty("email"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        logInBtn.click();
    }


    public void ClickMenu(String linkText){
        WebElement element = Driver.getDriver().findElement(By.partialLinkText(linkText));
        element.click();
    }
}
