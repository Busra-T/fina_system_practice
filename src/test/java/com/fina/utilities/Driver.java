package com.fina.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver  {


    private Driver(){

    }

   // private static WebDriver driver; // default value = null

    private static InheritableThreadLocal<WebDriver> driverPool =new InheritableThreadLocal<>();

    /*
    Create a re-usable utility method which will return the same driver instance once we call it.
    -If an instance doesn't exist, it will create first, and then it'll always return same instance.
    */

    public static WebDriver getDriver(){

        if(driverPool.get()==null){

            String browserType=ConfigurationReader.getProperty("browser");



            switch (browserType){
                case "chrome":
                 //   WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "firefox":
                 //   WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver()) ;
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

            }

        }
        return driverPool.get();

    }


    public static void closeDriver(){
        if(driverPool.get() !=null){

            driverPool.get().quit();

            driverPool.remove();
        }
    }
}


