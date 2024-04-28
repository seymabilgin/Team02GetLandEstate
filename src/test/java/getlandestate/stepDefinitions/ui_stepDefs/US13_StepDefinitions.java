package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US13_StepDefinitions {

    Login_RegisterPage login =new Login_RegisterPage();
    @Given("Ana sayfaya gidilir")
    public void anaSayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }

    @When("Login butonuna tiklanirSU")
    public void loginButonunaTiklanirSU() {

        login.homeLogin.click();

    }

    @And("E-mail ve password kismina gecerli veriler girilir ve login tiklanir")
    public void eMailVePasswordKisminaGecerliVerilerGirilirVeLoginTiklanir() {

        login.email.sendKeys(ConfigReader.getProperty("SevilayManagerName"));
        login.password.sendKeys(ConfigReader.getProperty("SevilayManagerPassword"));
        login.loginButtona.click();

        login.email.sendKeys(ConfigReader.getProperty("AdminName"));
        login.password.sendKeys(ConfigReader.getProperty("AdminPassword"));
        login.loginButtonMT.click();

    }
    @And("Dashboard kisminda Tour Requests tiklanir")
    public void dashboardKismindaTourRequestsTiklanir() {
        login.tourRequests.click();
    }
    @And("Search boxa verdigi ilanin ismini girerek aratir")
    public void searchBoxaVerdigiIlaninIsminiGirerekAratir() {
        login.ilanSearch.sendKeys("US13");
        login.searchButton.click();
    }
    @Then("Verdigi ilana ait tour requestlerin goruldugunu dogrular")
    public void verdigiIlanaAitTourRequestlerinGoruldugunuDogrular() {
        Assert.assertTrue(login.searchResult.getText().contains("US13"));

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {Driver.closeDriver();
    }

    //TC02

    @And("Dashboard kisminda back to site tiklar")
    public void dashboardKismindaBackToSiteTiklar() {
        login.backToSiteButton.click();
    }
    @And("User kismindan My Tour Requests tiklar")
    public void userKismindanMyTourRequestsTiklar() {
        login.userPicture.click();
        login.myTourRequests.click();
    }

    @And("Acilan menude My Responses tiklar")
    public void acilanMenudeMyResponsesTiklar() {
        login.myResponses.click();
    }


    @And("Bekleyen taleplerden ilkini onay resmine tiklayarak kabul eder")
    public void bekleyenTaleplerdenIlkiniOnayResmineTiklayarakKabulEder() {
        login.firstApprove.click();
        ReusableMethods.bekle(5);
        login.yes.click();
        ReusableMethods.bekle(3);

    }

    @Then("İlana ait status kisminin approved olduğunu dogrular")
    public void ilanaAitStatusKismininApprovedOlduğunuDogrular() {
        Assert.assertEquals(login.firstApproveText.getText(),"APPROVED");
        ReusableMethods.bekle(3);

    }

    @And("Bekleyen ikinci ilanı x kismina tiklayarak reddeder")
    public void bekleyenIkinciIlanıXKisminaTiklayarakReddeder() {
        login.secondDecline.click();
        ReusableMethods.bekle(5);
        login.yes.click();
        ReusableMethods.bekle(3);
    }

    @Then("Reddettigi ilanın status kisminin declined oldugunu dogrular")
    public void reddettigiIlanınStatusKismininDeclinedOldugunuDogrular() {
        Assert.assertEquals(login.secondDeclineText.getText(),"DECLINED");
    }
}
