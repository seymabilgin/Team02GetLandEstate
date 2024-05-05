package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.DashBoardPage;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import static getlandestate.utilities.ReusableMethods.ddmVisibleText;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US09_StepDefinition {



        Login_RegisterPage registerPage = new Login_RegisterPage();
        PropertiesPage propertiesPage = new PropertiesPage();
        Login_RegisterPage login;
        DashBoardPage dashBoardPage;
    Actions actions=new Actions(Driver.getDriver());

        @Given("Admin Anasayfaya gider")
        public void admin_anasayfaya_gider() {
            Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
        }

        @When("Admin sistemde oturum acar")
        public void admin_sistemde_oturum_acar() {
            login = new Login_RegisterPage();
            login.loginAA.click();
            registerPage.loginEmail.sendKeys(ConfigReader.getProperty("AdminName"));
            registerPage.loginPassword.sendKeys(ConfigReader.getProperty("AdminPassword"));
            Login_RegisterPage.loginButtonAA.click();

        }
        @Given("Web sitesinin Ilanlarim bolümüne gidilir.")
        public void webSitesininIlanlarimBolümüneGidilir() {
            actions.click(propertiesPage.getAdvertsText).perform();
            ReusableMethods.bekle(3);
        }

    @And("Belirli kriterlere gore ilan aratilir.")
    public void belirliKriterlereGoreIlanAratilir() {
        actions.click(propertiesPage.getAdvertsText).perform();
        propertiesPage.advertsSearch.sendKeys("villa");
        ReusableMethods.ddmValue(propertiesPage.selectStatus,"1");

    }
        @Then("Adminin arama kriterleriyle eslesen ilanlarin listesini görüntüleyebildigi dogrulanir.")
        public void admininAramaKriterleriyleEslesenIlanlarinListesiniGörüntüleyebildigiDogrulanir() {
            ReusableMethods.click(propertiesPage.searchButtonn);
            ReusableMethods.bekle(2);
        }

        @And("Listeden herhangi bir ilan seçilir.")
        public void listedenHerhangiBirIlanSeçilir() {
            actions.click(propertiesPage.getAdvertsText).perform();
            propertiesPage.advertsSearch.sendKeys("villa");
            ReusableMethods.ddmValue(propertiesPage.selectStatus,"1");
            ReusableMethods.click(propertiesPage.searchButtonn);
            propertiesPage.advertUpdateikonforStatus.click();
            ReusableMethods.bekle(2);
            ddmVisibleText(propertiesPage.statusButonu,"Activated");
    }
        @Then("Ilanin artık aktif olarak isaretlendigi dogrulanir.")
        public void ılaninArtıkAktifOlarakIsaretlendigiDogrulanir() {
            ReusableMethods.bekle(2);
            System.out.println(new Select(propertiesPage.statusButonu).getFirstSelectedOption().getText()+" beklenen Activated");
            assertEquals("Activated",new Select(propertiesPage.statusButonu).getFirstSelectedOption().getText());
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
        System.out.println(new Select(propertiesPage.statusButonu).getFirstSelectedOption().getText()+" Rejected");

        assertEquals("Rejected",new Select(propertiesPage.statusButonu).getFirstSelectedOption().getText());
    }

    @And("Listeden secilen ilanin bazı bilgileri degistirilerek secili reklam guncellenir")
    public void listedenSecilenIlaninBazıBilgileriDegistirilerekSeciliReklamGuncellenir() {
        actions.click(propertiesPage.getAdvertsText).perform();
        propertiesPage.advertsSearch.sendKeys("villa");
        ReusableMethods.ddmValue(propertiesPage.selectStatus,"1");
        ReusableMethods.click(propertiesPage.searchButtonn);
        propertiesPage.advertUpdateikonforStatus.click();
        ReusableMethods.bekle(2);
        propertiesPage.ilan_EditTitle.sendKeys("HOUSE");

    }

    @And("Yapilan degisiklikler kaydedilir")
    public void yapilanDegisikliklerKaydedilir() {
        propertiesPage.advertsEditUpdateButon.click();
    }

    @Then("Degisikliklerin ilan ayrintilarina yansitildigi dogrulanir.")
    public void degisikliklerinIlanAyrintilarinaYansitildigiDogrulanir() {
        assertTrue(PropertiesPage.updateVerificationMessage.isDisplayed());
        Driver.closeDriver();

    }
}
