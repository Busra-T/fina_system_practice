package com.fina.pages;

import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.print.Doc;
import java.util.List;

public class DocPage {
    public DocPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(tagName = "h1")
    public WebElement message;

    @FindBy(tagName = "h2")
    public List<WebElement> headers;

}
