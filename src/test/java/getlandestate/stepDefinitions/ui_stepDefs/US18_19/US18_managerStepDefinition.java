package getlandestate.stepDefinitions.ui_stepDefs.US18_19;

import getlandestate.pages.GetlandPage;
import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US18_managerStepDefinition {

    Login_RegisterPage registerPage =new Login_RegisterPage();

    @Given("Kullanici sayfasina gidilir")
    public void kullaniciSayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }

    @When("login butonuna tiklanır")
    public void loginButonunaTiklanır() {
<<<<<<< HEAD:src/test/java/getlandestate/stepDefinitions/ui_stepDefs/US18_managerStepDefinition.java
        //registerPage.login.click();
=======
        registerPage.loginButtonMT.click();
>>>>>>> master:src/test/java/getlandestate/stepDefinitions/ui_stepDefs/US18_19/US18_managerStepDefinition.java
    }
    @And("email ve password bilgileri ile login olunur")
    public void emailVePasswordBilgileriIleLoginOlunur() {
    registerPage.loginEmail.sendKeys(ConfigReader.getProperty("email"));
    registerPage.loginPassword.sendKeys(ConfigReader.getProperty("password"));
    registerPage.registerButton.click();
    }

    @And("Back to Site butonuna tiklanir")
    public void backToSiteButonunaTiklanir() {
        registerPage.backToSiteButton.click();
    }

    @And("arama kutusuna istanbul yazılır ve aratılır")
    public void aramaKutusunaIstanbulYazılırVeAratılır() {
        registerPage.searchBoxAnaSayfa.sendKeys("istanbul", Keys.TAB,Keys.ENTER);
    }

    @And("çıkan sonucun üzerine tıklanır")
    public void çıkanSonucunÜzerineTıklanır() {
        registerPage.aramaSonucu.click();
    }

    @And("tour date ,tour time girilir")
    public void tourDateTourTimeGirilir() {
        registerPage.tourDate.sendKeys("24042024");
        registerPage.tourTime.sendKeys("2",Keys.ENTER);
    }

    @And("Submit a tour request butonuna tiklayarak randevu talebinde bulunulur")
    public void submitATourRequestButonunaTiklayarakRandevuTalebindeBulunulur() {
    registerPage.submitButton.click();
    }

    @Then("{string} mesaji goruntulendigi dogrulanmalır")
    public void mesajiGoruntulendigiDogrulanmalır(String arg0) {
        //ReusableMethods.alertGetTextJS();

    }


    @And("Dashboard yazdıgı dogrulanır")
    public void dashboardYazdıgıDogrulanır() {
        Assert.assertTrue(registerPage.dashboardText.getText().contains("Dashboard"));

    }

    @And("profil üzerinden MY TOUR REQUEST'e tıklanır")
    public void profilÜzerindenMYTOURREQUESTETıklanır() {
        registerPage.backToSiteButton.click();

    }

    @And("MY RESPONSES'e tıklanır")
    public void myRESPONSESETıklanır() {
    }

    @And("çıkan ekranda  doğru ilan olduğu doğrulanır")
    public void çıkanEkrandaDoğruIlanOlduğuDoğrulanır() {
    }

    @And("birincisini kabul edebilir")
    public void birincisiniKabulEdebilir() {
    }

    @Then("ikincisini ret edebilir")
    public void ikincisiniRetEdebilir() {
    }
}
