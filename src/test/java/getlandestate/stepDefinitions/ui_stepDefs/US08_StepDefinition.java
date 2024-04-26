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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US08_StepDefinition {
    Login_RegisterPage registerPage = new Login_RegisterPage();
    PropertiesPage propertiesPage = new PropertiesPage();

    @Given("Manager Anasayfaya gider")
    public void managerAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }

    @When("Manager sistemde oturum acar")
    public void managerSistemdeOturumAcar() {
        registerPage.homeLogin.click();
        registerPage.loginEmail.sendKeys(ConfigReader.getProperty("email8"));
        registerPage.loginPassword.sendKeys(ConfigReader.getProperty("password8"));
     //   registerPage.login.click();

    }

   /* @Given("Web sitesinin myAdverts bolümüne gidilir.")
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

    @And("Managerin verdigi ilanlar ile ilgili Date Published, Status ve View-Like-Tour dahil olmak üzere secilen ilanin ayrintilarini goruntuleyebildigi dogrulanir")
    public void managerinVerdigiIlanlarIleIlgiliDatePublishedStatusVeViewLikeTourDahilOlmakUzereSecilenIlaninAyrintilariniGoruntuleyebildigiDogrulanir() {
        Assert.assertTrue(propertiesPage.Date_Published.isDisplayed());
        Assert.assertTrue(propertiesPage.View_Like_Tour.isDisplayed());
        Assert.assertTrue(propertiesPage.Status.isDisplayed());
    }


    @And("Bazı bilgileri güncelleyerek ilanı düzenleyin.")
    public void bazıBilgileriGüncelleyerekIlanıDüzenleyin() {
        propertiesPage.ilan_Select1.click();
        propertiesPage.ilan_EditAdvert.click();
        propertiesPage.ilan_EditDescription.clear();
        propertiesPage.ilan_EditDescription.sendKeys("Denize Nazır Villa");
        propertiesPage.ilan_EditPrice.clear();
        propertiesPage.ilan_EditPrice.sendKeys("17000");
    }

    @And("Değişiklikleri kaydedin.")
    public void değişiklikleriKaydedin() {
        propertiesPage.ilanUpdate_Button.click();
    }
    @Then("Değişikliklerin ilan ayrıntılarına yansıtıldığını doğrulayın.")
    public void değişikliklerinIlanAyrıntılarınaYansıtıldığınıDoğrulayın() {
        Assert.assertTrue(propertiesPage.updatedDogrulama.isDisplayed());
        Driver.closeDriver();
    }
    @And("Bazı ilanlar silinir.")
    public void bazıIlanlarSilinir() {
        propertiesPage.ilanDeleteButton.click();
    }
    @Then("İlanin artik Managerin ilanlar listesinde görünmedigini dogrulayin.")
    public void ilaninArtikManagerinIlanlarListesindeGörünmediginiDogrulayin() {
        Assert.assertTrue(propertiesPage.ilanDeleteDogrulama.isDisplayed());
        Driver.closeDriver();
    }

}