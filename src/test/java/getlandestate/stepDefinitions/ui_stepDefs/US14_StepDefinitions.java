package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class US14_StepDefinitions {

    Login_RegisterPage login =new Login_RegisterPage();

    @And("Dashboard kisminda back to site tiklarr")
    public void dashboardKismindaBackToSiteTiklarr() {
        login.backToSiteButton.click();
    }
    @And("SearchBoxta randevu olusturmak istedigi ilanin aramasini yapar")
    public void searchboxtaRandevuOlusturmakIstedigiIlaninAramasiniYapar() {
        login.searchSU.sendKeys("US14");
        login.searchbuttonSU.click();

    }
    @And("Sonuclardan ilkine tiklar")
    public void sonuclardanIlkineTiklar() {
        login.firstimageSU.click();
    }

    @And("Acilan sayfada Schedule a tour kisminda tarih girer")
    public void acilanSayfadaScheduleATourKismindaTarihGirer() {
        login.gunAyTarih.sendKeys("26052024", Keys.TAB, "1");
        ReusableMethods.bekle(2);
    }

    @And("Schedule a tour kisminda saat secer")
    public void scheduleATourKismindaSaatSecer() {
        login.saatSU.sendKeys("08:00");
    }

    @And("Submit a tour Request tiklar")
    public void submitATourRequestTiklar() {
        login.submitButonuSU.click();
    }

    @Then("{string} yazisinin ciktigini dogrular")
    public void yazisininCiktiginiDogrular(String arg0) {
        Assert.assertTrue(login.bilgiMesaji.isDisplayed());
    }

    @And("User menusunden My tour requests tiklar")
    public void userMenusundenMyTourRequestsTiklar() {
        login.userPicture.click();
        login.myTourRequests.click();
    }

    @And("Acilan menude My Requests tiklar")
    public void acilanMenudeMyRequestsTiklar() {
        login.MYREQUESTS.click();
    }

    @Then("Olusturdugu requestin sayfada goruldugunu dogrular")
    public void olusturduguRequestinSayfadaGoruldugunuDogrular() {
        Assert.assertTrue(login.ilanlistSU.getText().contains("US14"));
    }

    @Then("Olusturdugu requestin Declined oldugunu dogrular")
    public void olusturduguRequestinDeclinedOldugunuDogrular() {
    }

    @Then("Created TourRequest created successfully yazisinin ciktigini dogrular")
    public void createdTourRequestCreatedSuccessfullyYazisininCiktiginiDogrular() {

    }

    @Then("Olusturdugu requestin Approved oldugunu dogrular")
    public void olusturduguRequestinApprovedOldugunuDogrular() {
    }
}
