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
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

public class US18_managerStepDefinition {

    Login_RegisterPage registerPage =new Login_RegisterPage();

    @Given("Kullanici sayfasina gidilir")
    public void kullaniciSayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }

    @When("login butonuna tiklanır")
    public void loginButonunaTiklanır() {
        registerPage.loginButtonMT.click();
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
        registerPage.tourDate.sendKeys("24052024");
        ReusableMethods.bekle(2);
        registerPage.tourTime.sendKeys("2",Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @And("Submit a tour request butonuna tiklayarak randevu talebinde bulunulur")
    public void submitATourRequestButonunaTiklayarakRandevuTalebindeBulunulur() {
    registerPage.submitButton.click();
    }

  @Then("{string} mesaji goruntulendigi dogrulanmalır")
   public void mesajiGoruntulendigiDogrulanmalır(String arg0) {
      // Alert alert=registerPage.
      String succesText= ReusableMethods.alertGetTextJS(registerPage.succesText);
       Assert.assertTrue(succesText.contains("Success"));

   }


  //  @And("Dashboard yazdıgı dogrulanır")
  //  public void dashboardYazdıgıDogrulanır() {
  //      Assert.assertTrue(registerPage.dashboardText.getText().contains("Dashboard"));
//
  //  }

    @And("profil üzerinden MY TOUR REQUEST'e tıklanır")
    public void profilÜzerindenMYTOURREQUESTETıklanır() {

        registerPage.userPicture.click();
        registerPage.requestMy.click();

    }

    @And("MY RESPONSES'e tıklanır")
    public void myRESPONSESETıklanır() {
        registerPage.myResponses.click();
    }

    @And("çıkan ekranda  doğru ilan olduğu doğrulanır")
    public void çıkanEkrandaDoğruIlanOlduğuDoğrulanır() {
        Assert.assertTrue(registerPage.verifyIlan.getText().contains("Special home"));
    }

    @And("birincisini kabul edebilir")
    public void birincisiniKabulEdebilir() {
        ReusableMethods.click(registerPage.acceptDavet);
        registerPage.getYes.click();
    }

    @Then("ikincisini ret edebilir")
    public void ikincisiniRetEdebilir() {
        ReusableMethods.click(registerPage.declineDavet);
        registerPage.declineDavet.click();
        registerPage.getYes.click();
    }

    @And("Dashboard yazdıgı dogrulanır")
    public void dashboardYazdıgıDogrulanır() {
        Assert.assertTrue(registerPage.dashboard.getText().contains("Dashboard"));
    }
}
