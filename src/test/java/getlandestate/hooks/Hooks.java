package getlandestate.hooks;

import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static getlandestate.base_url.Base_Url.setUp;


public class Hooks {

//-----------------------API------------------------------------------------------------------------//
    @Before("@APIAdmin")
    public void apiAdmin(){
        setUp(ConfigReader.getProperty("us16AdminMail"),ConfigReader.getProperty("us16AdminPassword"));
    }
    @Before("@APIManager")
    public void apiManager(){
        setUp(ConfigReader.getProperty(""),ConfigReader.getProperty(""));
    }
    @Before("@APICustomer")
    public void uiCustomer(){
        setUp(ConfigReader.getProperty(""),ConfigReader.getProperty(""));
    }

//--------------------------DB----------------------------------------------------------------------//
    public static Connection connection;
    public static Statement statement;

    @Before("@DB")
    public void connection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://64.227.123.49:5432/prettierhomes",
                "tech_pro_edu","testingIsFun");
        statement = connection.createStatement();
    }

    @After("@DB")
    public void closeConnection() throws SQLException {
        if (!(statement == null) && !statement.isClosed()) {
            statement.close();
            connection.close();
        }
    }
    
//---------------------------UI----------------------------------------------------------------------//
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
