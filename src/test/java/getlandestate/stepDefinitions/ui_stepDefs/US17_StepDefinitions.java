package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.DashBoardPage;
import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class US17_StepDefinitions {

    Login_RegisterPage registerPage = new Login_RegisterPage();
    DashBoardPage dashBoardPage = new DashBoardPage();

    @And("Manager olarak login olunur")
    public void managerOlarakLoginOlunur() {
        registerPage.emailBoxMT.sendKeys(ConfigReader.getProperty("us17ManagerMail"), Keys.TAB, Keys.TAB, ConfigReader.getProperty("us17ManagerPassword"), Keys.ENTER);
    }

    @When("Users kisminda Manager rolu secili iken raporlama butonuna tiklanir")
    public void usersKismindaManagerRoluSeciliIkenRaporlamaButonunaTiklanir() {
            Select selectRole = new Select(dashBoardPage.usersRole);
            selectRole.selectByValue("MANAGER");
            dashBoardPage.usersDownload.click();
            ReusableMethods.bekle(2);
    }

    @Then("Users Manager Download dogrulamasi yapilir")
    public void usersManagerDownloadDogrulamasiYapilir() {
        try {
            assert !dashBoardPage.errorMessage.isDisplayed() : "USERS MANAGER RAPOR ALINAMADI, FULL AUTHENTICATION HATASI!!!";
            // If AssertionError doesn't occur, continue with the test steps here
            ReusableMethods.bekle(1);
            // Additional test steps...
            // Close the driver after completing the test
            Driver.closeDriver();
        } catch (AssertionError e) {
            // If AssertionError occurs (assertion fails), handle it here
            System.out.println("USERS MANAGER RAPOR ALINAMADI, FULL AUTHENTICATION HATASI!!! " + e.getMessage());
            // Close the driver
            Driver.closeDriver();
            // Throw the caught AssertionError again to mark the test as failed but continue with subsequent steps
            throw e;
        }
    }
}
