package com.fina.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    /* This class will be storing only the utility methods that can be used across the project.
     */

    public static void sleep(int second){
        second *=1000;

        try{
            Thread.sleep(second);
        } catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle){

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }

        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains((expectedInTitle)));


    }


    public static void verifyTitle(String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    public static void verifyTitleContains( String expectedInTitle){

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }

    public static void waitForInvisibilityOf(WebElement target){

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(target));

    }
    public static void waitForVisibilityOf(WebElement target){

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(target));

    }

    public static void waitForTitleContains(String title){

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(title));

    }

   public static List<String> dropdownOptions_as_String(WebElement dropdownElement){


        Select m=new Select(dropdownElement);

        List<String>actual=new ArrayList<>();


        for (WebElement each : m.getOptions()) {
            actual.add(each.getText());
        }


    return actual;
    }


    public static void clickRadioElement(List<WebElement>radioButtons,String attributeValue){

        for (WebElement each : radioButtons) {
            if(each.getAttribute("value").equals(attributeValue)){
                each.click();
            }
        }
    }


}
