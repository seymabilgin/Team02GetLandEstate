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

import static org.junit.Assert.assertEquals;

public class US09_StepDefinition {
    Login_RegisterPage registerPage =new Login_RegisterPage();
    PropertiesPage propertiesPage= new PropertiesPage();

    @Given("Admin Anasayfaya gider")
    public void admin_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));

    }
    @When("Admin sistemde oturum acar")
    public void admin_sistemde_oturum_acar() {
        registerPage.homeLogin.click();
        registerPage.loginEmail.sendKeys(ConfigReader.getProperty("AdminName"));
        registerPage.loginPassword.sendKeys(ConfigReader.getProperty("AdminPassword"));
        registerPage.loginButtonAA.click();

    }
    @Given("Web sitesinin Ilanlarim bolümüne gidilir.")
    public void webSitesinin_Ilanlarim_Bolümüne_Gidilir() {
        ReusableMethods.bekle(3);
        propertiesPage.getAdvertsText.click();
    }

    @When("Belirli kriterlere gore ilan aratilir.")
    public void belirli_kriterlere_gore_ilan_aratilir() {
        propertiesPage.advertsTikla.click();
        propertiesPage.advertsSearch.sendKeys("Villan");
        propertiesPage.searchButtonn.click();
    }

    @Then("Adminin arama kriterleriyle eslesen ilanlarin listesini görüntüleyebildigi dogrulanir.")
    public void adminin_arama_kriterleriyle_eslesen_ilanlarin_listesini_görüntüleyebildigi_dogrulanir() {
        //Assert.assertTrue(propertiesPage.searchResult.isDisplayed());
        assertEquals("Villan",propertiesPage.searchResultt.getText());

    }
    /*@Then("admin sayfayi kapatir.")
    public void admin_sayfayi_kapatir() {
        Driver.closeDriver();

    }*/


    @And("Pending olan ilanlar aratilir")
    public void pendingOlanIlanlarAratilir() {
        propertiesPage.getAdvertsText.click();
        propertiesPage.advertsSearch.click();
        propertiesPage.advertsSearch.sendKeys("Villan");
        ReusableMethods.bekle(3);
        ReusableMethods.ddmValue(propertiesPage.selectStatus,"1");
        ReusableMethods.bekle(3);
        propertiesPage.searchButton.click();
    }

    @And("Listeden herhangi bir ilan seçilir.")
    public void listedenHerhangiBirIlanSeçilir() {
        ReusableMethods.scrollEnd();ReusableMethods.bekle(2);
        propertiesPage.advertUpdateikonforStatus.click();
    }
    @And("Listede herhangi bir ilandaki Pending butonuna tiklanir.")
    public void listedeHerhangiBirIlandakiPendingButonunaTiklanir() {
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
        propertiesPage.searchButtonn.click();
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
        propertiesPage.searchButtonn.click();
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