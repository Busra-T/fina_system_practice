package com.fina.pages;

import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinaManufacturingPage {

    public FinaManufacturingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[contains(.,'Manufacturing')])[1]")
    public WebElement opt_Manufacturing;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement btn_Create;

    @FindBy(id = "o_field_input_274")
    public WebElement product;

    @FindBy(xpath = "//li[contains(.,\"iphone\")]")
    public WebElement drop_Iphone;

    @FindBy(name = "product_qty")
    public WebElement quantity;

    @FindBy(xpath = "//div[@name='bom_id']/div/input")
    public WebElement produceBill;

    @FindBy(id = "o_field_input_280")
    public WebElement datePicker;

    @FindBy(xpath = "//td[.=\"POSManager19\"]")
    public WebElement pos19;

    @FindBy(id = "o_field_input_282")
    public WebElement responsible;

    @FindBy(id = "o_field_input_283")
    public WebElement source;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement btn_save;

    @FindBy(xpath = "//span[contains(.,'Confirmed')]")
    public WebElement msg_confirmed;

    @FindBy(xpath = "//p[.='Manufacturing Order created']")
    public WebElement msg_orderCreated;




}
