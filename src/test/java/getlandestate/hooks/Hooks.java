package getlandestate.hooks;

import getlandestate.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static getlandestate.base_url.Base_Url.setUp;


public class Hooks {
    @Before("@UIAdmin")
    public void uiAdmin(){
        setUp();
    }

    @Before("@UICustomer")
    public void uiCustomer(){
        setUp();
    }

    @After("@UICloseDriver")
    public void tearDown() throws Exception {
        Driver.closeDriver();
    }

    @After("@UITakesScreenShot")
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/png", "scenario" + scenario.getName());
            Driver.closeDriver();
        }


    }
}
