package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.HomePage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US04StepDefinitions {
    HomePage homePage=new HomePage();

    @Given("kullanici {string} gider")
    public void kullaniciGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        homePage.loginbutton.click();
    }

    @And("kullanici email ve password bilgileri ile login olur")
    public void kullaniciEmailVePasswordBilgileriIleLoginOlur() {
        homePage.emailTextBox.sendKeys(ConfigReader.getProperty("getlandadminmail"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("getlandadminpassword"));
        homePage.loginButton.click();
    }

    @And("Back To Site butonuna tiklar")
    public void backToSiteButonunaTiklar() {
        homePage.backToSite.click();
    }

 @But("kullanici sayfada {int} saniye bekler")
   public void kullaniciSayfadaSaniyeBekler(int saniye) {
        kullaniciSayfadaSaniyeBekler(saniye);
    }

    @Then("sayfa dilinin default olarak ingilizce oldugunu dogrular")
    public void sayfaDilininDefaultOlarakIngilizceOldugunuDogrular() {
        Assert.assertEquals("Home", homePage.englishTextVerify.getText());
    }

    @And("Turkce dil secenegini secer ve sayfa dilinin Turkce oldugunu dogrular")
    public void turkceDilSeceneginiSecerVeSayfaDilininTurkceOldugunuDogrular() {
        homePage.flagIcon.click();
        homePage.trflagIconButton.click();
        Assert.assertEquals("Anasayfa", homePage.turkishText.getText());
    }

    @And("Francais dil secenegini secer ve sayfa dilinin Francais oldugunu dogrular")
    public void francaisDilSeceneginiSecerVeSayfaDilininFrancaisOldugunuDogrular() {
        homePage.flagIcon.click();
        homePage.franchIconButton.click();
        Assert.assertEquals("Accueil", homePage.frTextVerify.getText());
    }

    @And("Deutsch dil secenegini secer ve sayfa dilinin Deutsch oldugunu dogrular")
    public void deutschDilSeceneginiSecerVeSayfaDilininDeutschOldugunuDogrular() {
        homePage.flagIcon.click();
        homePage.grIconButton.click();
        Assert.assertEquals("Zuhause", homePage.grTextVerify.getText());
    }

    @And("Espanol dil secenegini secer ve sayfa dilinin Espanol oldugunu dogrular")
    public void espanolDilSeceneginiSecerVeSayfaDilininEspanolOldugunuDogrular() {
        homePage.flagIcon.click();
        homePage.spIconButton.click();
        Assert.assertEquals("Inicio", homePage.spTextVerify.getText());
    }

    @And("kullanici email ve password bilgileri ile manager olarak login olur")
    public void kullaniciEmailVePasswordBilgileriIleManagerOlarakLoginOlur() {
        homePage.emailTextBox.sendKeys(ConfigReader.getProperty("getlandmanagermail"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("getlandmanagerpassword"));
        homePage.loginButton.click();
    }

    @And("kullanici email ve password bilgileri ile customer olarak login olur")
    public void kullaniciEmailVePasswordBilgileriIleCustomerOlarakLoginOlur() {
        homePage.emailTextBox.sendKeys(ConfigReader.getProperty("getlandcustomermail"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("getlandcustomerpassword"));
        homePage.loginButton.click();
 //   }
 //   @And("sayfayi kapatir") public void sayfayiKapatir() {
  //      Driver.closeDriver();
    }
}
