package com.fina.step_definitions;

import com.fina.pages.FinaManufacturingPage;
import com.fina.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FinaManufacturing_StepDefinitions {

    FinaManufacturingPage finaManufacturingPage=new FinaManufacturingPage();

    @When("User goes to the Manufacturing page")
    public void userGoesToTheManufacturingPage() {
      finaManufacturingPage.opt_Manufacturing.click();
    }

    @Then("User clicks to Create")
    public void userClicksToCreate() {
        finaManufacturingPage.btn_Create.click();
    }

    @And("User fills in the fields")
    public void userFillsInTheFields() {
        finaManufacturingPage.product.click();
        finaManufacturingPage.drop_Iphone.click();
        finaManufacturingPage.quantity.clear();
        finaManufacturingPage.quantity.sendKeys("1");
        finaManufacturingPage.produceBill.click();
        //LocalDateTime.now().toString();
        finaManufacturingPage.datePicker.clear();
        String time= LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss")).toString();
        finaManufacturingPage.datePicker.sendKeys(time);
        BrowserUtils.sleep(4);
        finaManufacturingPage.source.sendKeys("cydeo");
    }

    @And("User clicks to Save")
    public void userClicksToSave() {
        finaManufacturingPage.btn_save.click();

    }

    @Then("User sees the order info and confirmation message.")
    public void userSeesTheOrderInfoAndConfirmationMessage() {

        Assert.assertTrue(finaManufacturingPage.msg_orderCreated.isDisplayed());
        Assert.assertTrue(finaManufacturingPage.msg_confirmed.isDisplayed());
    }
}
