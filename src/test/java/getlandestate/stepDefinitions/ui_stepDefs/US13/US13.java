package getlandestate.stepDefinitions.ui_stepDefs.US13;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US13 {

    Login_RegisterPage login =new Login_RegisterPage();
    @Given("Ana sayfaya gidilir")
    public void anaSayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }
/*
    @When("Login butonuna tiklanir")
    public void loginButonunaTiklanir() {

        login.homeLogin.click();

    }*/

    @And("E-mail ve password kismina gecerli veriler girilir ve login tiklanir")
    public void eMailVePasswordKisminaGecerliVerilerGirilirVeLoginTiklanir() {
        login.email.sendKeys(ConfigReader.getProperty("AdminName"));
        login.password.sendKeys(ConfigReader.getProperty("AdminPassword"));
        login.login.click();
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
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
    }

    @And("Dashboard kisminda {string} tiklar")
    public void dashboardKismindaTiklar(String arg0) {
    }

    @And("User kismindan {string} tiklar")
    public void userKismindanTiklar(String arg0) {
    }

    @And("Acilan menude {string} tiklar")
    public void acilanMenudeTiklar(String arg0) {
    }

    @And("Bekleyen taleplerden ilkini onay resmine tiklayarak kabul eder")
    public void bekleyenTaleplerdenIlkiniOnayResmineTiklayarakKabulEder() {
    }

    @Then("İlana ait status kisminin {string} olduğunu dogrular")
    public void ilanaAitStatusKismininOlduğunuDogrular(String arg0) {
    }

    @And("Bekleyen {int}.ilanı x kismina tiklayarak reddeder")
    public void bekleyenIlanıXKisminaTiklayarakReddeder(int arg0) {
    }

    @Then("Reddettigi ilanın status kısmının {string} oldugunu dogrular")
    public void reddettigiIlanınStatusKısmınınOldugunuDogrular(String arg0) {
    }
}
