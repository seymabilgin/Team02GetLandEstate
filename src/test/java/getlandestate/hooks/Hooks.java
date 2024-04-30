package getlandestate.hooks;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static getlandestate.base_url.Base_Url.setUp;


public class Hooks {
    @Before("@APIAdmin")
    public void apiAdmin(){
        setUp(ConfigReader.getProperty("Email"),ConfigReader.getProperty("password"));
    }
    @Before("@APIManager")
    public void apiManager(){
        setUp(ConfigReader.getProperty(""),ConfigReader.getProperty(""));
    }
    @Before("@APICustomer")
    public void uiCustomer(){
        setUp(ConfigReader.getProperty(""),ConfigReader.getProperty(""));
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
