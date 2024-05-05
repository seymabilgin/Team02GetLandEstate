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
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

public class US08_StepDefinitions {
    Login_RegisterPage registerPage = new Login_RegisterPage();
    PropertiesPage propertiesPage = new PropertiesPage();

    Actions actions = new Actions(Driver.getDriver());

    @Given("Manager Anasayfaya gider")
    public void managerAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }

    @When("Manager sistemde oturum acar")
    public void managerSistemdeOturumAcar() {
        registerPage.homeLogin.click();
        registerPage.loginEmail.sendKeys(ConfigReader.getProperty("email8"));
        registerPage.loginPassword.sendKeys(ConfigReader.getProperty("password8"));
        Login_RegisterPage.loginButtonAA.click();
    }

@When("Adverts  butonuna tiklanir")
public void advertsButonunaTiklanir() {
actions.click(propertiesPage.getAdvertsText).perform();
       ReusableMethods.bekle(3);
    }

   @Then("Manager olarak ilanlarin goruntulendigi dogrulanir")
    public void managerOlarakIlanlarinGoruntulendigiDogrulanir() {
        ReusableMethods.bekle(2);
        assertTrue(PropertiesPage.searchSonucu.isDisplayed());
    }

    @Then("Manager ilanlarda Date Published bilgisi goruntulendigi dogrulanir")
    public void managerIlanlardaDatePublishedBilgisiGoruntulendigiDogrulanir() {
        ReusableMethods.bekle(2);
        assertTrue(propertiesPage.publishedDate.isDisplayed());
    }

    @Then("Manager ilanlarda Status bilgisi goruntulendigi dogrulanir")
    public void managerIlanlardaStatusBilgisiGoruntulendigiDogrulanir() {
        ReusableMethods.bekle(2);
        assertTrue(propertiesPage.viewLikeTour.isDisplayed());
    }

    @Then("Manager ilanlarda View-Like-Tour bilgisi goruntulendigi dogrulanir")
    public void managerIlanlardaViewLikeTourBilgisiGoruntulendigiDogrulanir() {
        ReusableMethods.bekle(2);
        assertTrue(propertiesPage.statusBilgisi.isDisplayed());
    }


    @Then("Ilanin delete edilebildigi dogrulanir")
    public void ilaninDeleteEdilebildigiDogrulanir() {
        ReusableMethods.bekle(2);

        assertTrue(propertiesPage.advertDeletedButton.isDisplayed());
    }



    @And("Silinecek ilan search yapilir")
    public void silinecekIlanSearchYapilir() {
        ReusableMethods.bekle(2);
        propertiesPage.advertsTypeSomethingButton.sendKeys("nuriye");
        propertiesPage.advertsSearchButton.click();

    }

    @And("Ilan uzerindeki cop kutusu butonuna tiklanir")
    public void ilanUzerindekiCopKutusuButonunaTiklanir() {
        ReusableMethods.bekle(2);
        PropertiesPage.copKutusuButton.click();
    }

    @And("Yes butonuna tiklanir")
    public void yesButonunaTiklanir() {
        ReusableMethods.bekle(2);
        propertiesPage.deleteYesButonu.click();
    }

    @And("kullanici kalem ikonuna tiklanir")
    public void kullaniciKalemIkonunaTiklanir() {
        propertiesPage.kalemIcon.click();
    }

    @And("Acilan Edit sayfasinda Title ve sluq a datalar girilir")
    public void acilanEditSayfasindaTitleVeSluqADatalarGirilir() {
        propertiesPage.titleInput.sendKeys("House");
        propertiesPage.sluqInput.sendKeys("userFace");
    }

    @And("Update butonuna tiklanir")
    public void updateButonunaTiklanir() {
        propertiesPage.updateButton.click();
    }

    @Then("Advert update successfully goruntulendigi dogrulanir")
    public void advertUpdateSuccessfullyGoruntulendigiDogrulanir() {
        assertTrue(PropertiesPage.updateVerificationMessage.isDisplayed());
    }
}








