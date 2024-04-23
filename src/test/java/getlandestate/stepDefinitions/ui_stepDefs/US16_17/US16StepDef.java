package getlandestate.stepDefinitions.ui_stepDefs.US16_17;

import getlandestate.pages.DashBoardPage;
import getlandestate.pages.GetlandPage;
import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class US16StepDef {
    Login_RegisterPage registerPage = new Login_RegisterPage();
    DashBoardPage dashBoardPage = new DashBoardPage();

    @Given("Url'e gidilir")
    public void urlGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }

    @When("Login butonuna tiklanir")
    public void loginButonunaTiklanir() {
        registerPage.loginButtonMT.click();
    }

    @And("Admin olarak login olunur")
    public void adminOlarakLoginOlunur() {
        registerPage.emailBoxMT.sendKeys(ConfigReader.getProperty("us16AdminMail"), Keys.TAB, Keys.TAB, ConfigReader.getProperty("us16AdminPassword"), Keys.ENTER);
    }

    @And("Reports butonuna tiklanir")
    public void reportsButonunaTiklanir() {
        //dashBoardPage.dashboardReportsButton.click();
        ReusableMethods.click(dashBoardPage.dashboardReportsButton);

    }

    @When("Adverts kismindaki secimler yapilir ve raporlama butonuna tiklanir")
    public void advertsKismindakiSecimlerYapilirVeRaporlamaButonunaTiklanir() {
        dashBoardPage.advertsStartDate.sendKeys("04/01/24");
    }

    @Then("Download dogrulamasi yapilir")
    public void downloadDogrulamasiYapilir() {
    }

    @When("Most Popular Properties kismindaki Amount kısmına deger girilir ve raporlama butonuna tiklanir")
    public void mostPopularPropertiesKismindakiAmountKısmınaDegerGirilirVeRaporlamaButonunaTiklanir() {
    }

    @When("Users kisminda Admin rolu secili iken raporlama butonuna tiklanir")
    public void usersKismindaAdminRoluSeciliIkenRaporlamaButonunaTiklanir() {
    }

    @When("Tour Requests kismindaki secimler yapilir ve raporlama butonuna tiklanir")
    public void tourRequestsKismindakiSecimlerYapilirVeRaporlamaButonunaTiklanir() {
    }
}
