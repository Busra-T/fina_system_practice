
package com.fina.step_definitions;

        import com.fina.utilities.Driver;
        import io.cucumber.java.*;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before(order=1)
    public void setupMethod(){
        System.out.println("-->@Before: RUNNING BEFORE EACH SCENARIO");
    }
    @Before (value="@login",order=2)
    public void login_scenario_before(){
        System.out.println("-->@Before: RUNNING BEFORE EACH SCENARIO");
    }

    @After
    public void teardownMethod(Scenario scenario){

        if(scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("-->@After: RUNNING AFTER EACH SCENARIO");
        System.out.println();
        Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("-----> @BeforeStep: Running before each step!");
    }
    @AfterStep
    public void teardownStep(){
        System.out.println("-----> @AfterStep: Running after each step!");
    }


}
