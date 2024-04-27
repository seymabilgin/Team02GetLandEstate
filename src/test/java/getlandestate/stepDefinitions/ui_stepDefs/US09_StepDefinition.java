package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.pages.PropertiesPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
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
    @Given("Web sitesinin Ilanlarim bolümüne gidilir.")
    public void webSitesininIlanlarimBolümüneGidilir() {
        propertiesPage.getMyAdvertsText.click();
    }
    @And("Belirli kriterlere gore ilan aratilir.")
    public void belirliKriterlereGoreIlanAratilir() {
        propertiesPage.advertsTikla.click();
        propertiesPage.advertsSearch.sendKeys("titleData");
        propertiesPage.searchButton.click();
    }
    @Then("Adminin arama kriterleriyle eslesen ilanlarin listesini görüntüleyebildigi dogrulanir.")
    public void admininAramaKriterleriyleEslesenIlanlarinListesiniGörüntüleyebildigiDogrulanir() {
        Assert.assertTrue(propertiesPage.searchResult.isDisplayed());
    }

    @And("Pending olan ilanlar aratilir")
    public void pendingOlanIlanlarAratilir() {

        propertiesPage.advertsSearch.click();
        propertiesPage.advertsSearch.sendKeys("titleData");
        propertiesPage.selectStatus.click();
        propertiesPage.pendingSelect.click();
        propertiesPage.searchButton.click();
    }

    @And("Listeden herhangi bir ilan seçilir.")
    public void listedenHerhangiBirIlanSeçilir() {
        propertiesPage.advertUpdateikonforStatus.click();
    }
    @And("Secilen ilandaki  Pending butonuna tiklanir activated secilir.")
    public void secilenIlandakiPendingButonunaTiklanirActivatedSecilir() {
        ReusableMethods.ddmVisibleText(propertiesPage.pendingSelect, "Activated");
        propertiesPage.updatedButton.click();
    }
    @Then("Ilanin artık aktif olarak isaretlendigi dogrulanir.")
    public void ılaninArtıkAktifOlarakIsaretlendigiDogrulanir() {
        Assert.assertTrue(propertiesPage.selectActivatedVerify.isDisplayed());
    }


    @And("Belirlenen kriterlere gore ilan aratilir.")
    public void belirlenenKriterlereGoreIlanAratilir() {
        propertiesPage.advertsSearch.click();
        propertiesPage.advertsSearch.sendKeys("titleData");
        propertiesPage.selectStatus.click();
        propertiesPage.pendingSelect.click();
        propertiesPage.searchButton.click();
    }
    @And("Listeden herhangibir ilan seçilir.")
    public void listedenHerhangibirIlanSeçilir() {
        propertiesPage.advertUpdate_ikonforRejected.click();
    }
    @And("Listeden secilen ilan icin red islemi yapilir")
    public void listedenSecilenIlanIcinRedIslemiYapilir() {
        ReusableMethods.ddmVisibleText(propertiesPage.pendingSelect, "Rejected");
        propertiesPage.updatedButton.click();
    }
    @Then("Ilanin artık reddedildi olarak isaretlendigi dogrulanir.")
    public void ılaninArtıkReddedildiOlarakIsaretlendigiDogrulanir() {
        Assert.assertTrue(propertiesPage.selectRejectedVerify.isDisplayed());
    }


    @And("Belirli kriterlere gore ilanlar aratilir.")
    public void belirliKriterlereGoreIlanlarAratilir() {
        propertiesPage.advertsSearch.click();
        propertiesPage.advertsSearch.sendKeys("titleData");
        propertiesPage.searchButton.click();
    }
    @And("Çıkan listeden herhangi bir ilan seçilir.")
    public void çıkanListedenHerhangiBirIlanSeçilir() {
        propertiesPage.advertUpdateikonforStatus.click();
    }
    @And("Listeden secilen ilanin bazı bilgileri degistirilerek secili reklam guncellenir")
    public void listedenSecilenIlaninBazıBilgileriDegistirilerekSeciliReklamGuncellenir() {
        propertiesPage.ilan_EditPrice.clear();
        propertiesPage.ilan_EditPrice.sendKeys("priceData2");
        propertiesPage.ilan_EditTitle.clear();
        propertiesPage.ilan_EditTitle.sendKeys("titleData2");
    }
    @And("Yapilan degisiklikler kaydedilir")
    public void yapilanDegisikliklerKaydedilir() {
        propertiesPage.ilanUpdate_Button.click();
    }
    @Then("Degisikliklerin ilan ayrintilarina yansitildigi dogrulanir.")
    public void degisikliklerinIlanAyrintilarinaYansitildigiDogrulanir() {
        Assert.assertTrue(propertiesPage.adminAdvertVerify.isDisplayed());
        Driver.closeDriver();
    }




}