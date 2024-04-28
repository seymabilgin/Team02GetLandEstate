package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.pages.PropertiesPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_StepDefinitions {
    Login_RegisterPage registerPage =new Login_RegisterPage();
    PropertiesPage propertiesPage= new PropertiesPage();

    @Given("Manager Anasayfaya gider")
    public void managerAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }

    @When("Manager sistemde oturum acar")
    public void managerSistemdeOturumAcar() {
        registerPage.homeLogin.click();
        registerPage.loginEmail.sendKeys(ConfigReader.getProperty("email8"));
        registerPage.loginPassword.sendKeys(ConfigReader.getProperty("password8"));
        //registerPage.login.click();
    }

  /*  @Given("Web sitesinin {myAdverts} bolümüne gidilir.")
    public void webSitesininBolümüneGidilir(String arg0) {
    registerPage.backToSiteButton.click();
    propertiesPage.accountIconButton.click();
    propertiesPage.myAdvertsIcon.click();
    }*/

    @Then("Managerin ilanlarinin listesini gorebildigi dogrulanir.")
    public void managerinIlanlarininListesiniGorebildigiDogrulanir() {
        Assert.assertTrue(propertiesPage.ilan_Listesi.isDisplayed());

    }

    @And("Listeden ilanlardan birini secer.")
    public void listedenIlanlardanBiriniSecer() {
        propertiesPage.ilan_Select1.click();
    }

    @Then("Managerin sectigi ilanin ayrintilarini goruntuleyebildigi dogrulanir")
    public void managerinSectigiIlaninAyrintilariniGoruntuleyebildigiDogrulanir() {
        Assert.assertTrue(propertiesPage.ilan_Details.isDisplayed());
        Driver.closeDriver();
    }

    @Then("Managerin ilanlarinin  listesini görebildigi dogrulanir.")
    public void managerinIlanlarininListesiniGörebildigiDogrulanir() {
        Assert.assertTrue(propertiesPage.ilan_Listesi.isDisplayed());
    }

    @And("Managerin verdigi ilanlar ile ilgili {string}, {string} ve {string} dahil olmak üzere secilen ilanin ayrintilarini goruntuleyebildigi dogrulanir")
    public void managerinVerdigiIlanlarIleIlgiliVeDahilOlmakÜzereSecilenIlaninAyrintilariniGoruntuleyebildigiDogrulanir(String arg0, String arg1, String arg2) {
    }

    @And("Bazı bilgileri ( başlık, açıklama, fiyat vb.) güncelleyerek ilanı düzenleyin.")
    public void bazıBilgileriBaşlıkAçıklamaFiyatVbGüncelleyerekIlanıDüzenleyin() {
    }

    @And("Değişiklikleri kaydedin.")
    public void değişiklikleriKaydedin() {
    }

    @Then("Değişikliklerin ilan ayrıntılarına yansıtıldığını doğrulayın.")
    public void değişikliklerinIlanAyrıntılarınaYansıtıldığınıDoğrulayın() {
    }

    @And("Bazı ilanlar silinir.")
    public void bazıIlanlarSilinir() {
    }

    @Then("İlanin artik Managerin ilanlar listesinde görünmedigini dogrulayin.")
    public void ilaninArtikManagerinIlanlarListesindeGörünmediginiDogrulayin() {
    }


}
