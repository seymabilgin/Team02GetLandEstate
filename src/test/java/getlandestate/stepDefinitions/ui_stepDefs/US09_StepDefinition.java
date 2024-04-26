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

public class US09_StepDefinition {
    Login_RegisterPage registerPage =new Login_RegisterPage();
    PropertiesPage propertiesPage= new PropertiesPage();

    @Given("Admin Anasayfaya gider")
    public void adminAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }
    @When("Admin sistemde oturum acar")
    public void adminSistemdeOturumAcar() {
        registerPage.homeLogin.click();
        registerPage.loginEmail.sendKeys(ConfigReader.getProperty("AdminName"));
        registerPage.loginPassword.sendKeys(ConfigReader.getProperty("AdminPassword"));
        registerPage.loginButtonAA.click();
    }
    @And("Belirli kriterlere gore ilan aratilir.")
    public void belirliKriterlereGoreIlanAratilir() {
        propertiesPage.advertsTikla.click();
        propertiesPage.advertsSearch.sendKeys("Villan");
        propertiesPage.searchButton.click();
    }
    @Then("Adminin arama kriterleriyle eslesen ilanlarin listesini görüntüleyebildigi dogrulanir.")
    public void admininAramaKriterleriyleEslesenIlanlarinListesiniGörüntüleyebildigiDogrulanir() {
        Assert.assertTrue(propertiesPage.searchResult.isDisplayed());
    }

    @And("Pending olan ilanlar aratilir")
    public void pendingOlanIlanlarAratilir() {
        propertiesPage.selectStatus.click();
        propertiesPage.pendingSelect.click();
        propertiesPage.searchButton.click();
    }

    @And("Listeden herhangi bir ilan seçilir.")
    public void listedenHerhangiBirIlanSeçilir() {

    }

    @And("Listede herhangi bir ilandaki {string} butonuna tiklanir.")
    public void listedeHerhangiBirIlandakiButonunaTiklanir(String arg0) {
    }

    @Then("Ilanin artık aktif olarak isaretlendigi dogrulanir.")
    public void ılaninArtıkAktifOlarakIsaretlendigiDogrulanir() {
    }

    @And("Listeden secilen ilan icin red islemi yapilir")
    public void listedenSecilenIlanIcinRedIslemiYapilir() {
    }

    @Then("Ilanin artık reddedildi olarak isaretlendigi dogrulanir.")
    public void ılaninArtıkReddedildiOlarakIsaretlendigiDogrulanir() {
    }

    @And("Listeden secilen ilanin bazı bilgileri degistirilerek secili reklam guncellenir")
    public void listedenSecilenIlaninBazıBilgileriDegistirilerekSeciliReklamGuncellenir() {
    }

    @And("Yapilan degisiklikler kaydedilir")
    public void yapilanDegisikliklerKaydedilir() {
    }

    @Then("Degisikliklerin ilan ayrintilarina yansitildigi dogrulanir.")
    public void degisikliklerinIlanAyrintilarinaYansitildigiDogrulanir() {
    }
}