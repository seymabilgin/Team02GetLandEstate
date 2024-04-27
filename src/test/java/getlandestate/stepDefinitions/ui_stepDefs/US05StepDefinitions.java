package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.HomePage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US05StepDefinitions {
    HomePage homePage=new HomePage();
    @And("Kullanıcılar Kısmına tıklanır")
    public void kullanıcılarKısmınaTıklanır() {
    homePage.kullanicilar.click();
    }

    @Then("Daha önce belirlemiş olduğımuz Customer kullanıcsı arama kutusunda aratılır")
    public void dahaOnceBelirlemisOldugımuzCustomerKullanıcsıAramaKutusundaAratılır() {
        homePage.kullaniciKontrol.sendKeys("adnan");
        homePage.buyutec.click();
        ReusableMethods.bekle(3);
    }

    @And("Düzenle seçeneğine tıklanır ve Customer kullanıcısının bilgileri görülür")
    public void duzenleSecenegineTıklanırVeCustomerKullanıcısınınBilgileriGorulur() {
        homePage.kullaniciDuzenle.click();
    }

    @And("Roller kısmından Customer olan kişi rolü admin olarak güncellenir")
    public void rollerKısmındanCustomerOlanKisiRoluAdminOlarakGuncellenir() {
    homePage.kullaniciRolDuzenleme.click();
    homePage.kullaniciRolDuzenleme.sendKeys("MANAGER");
   // homePage.kullaniciMANAGER.click();
   //  homePage.kullaniciEmailDuzenleme.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
   //  homePage.kullaniciEmailDuzenleme.sendKeys(ConfigReader.getProperty("getlandcustomermail3"));
   //  homePage.nameVerify.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
   //  homePage.nameVerify.sendKeys("yalan");
   //  homePage.lastNameVerify.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
   //  homePage.lastNameVerify.sendKeys("dunya");
   //  homePage.telefonVerify.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
   //  homePage.telefonVerify.sendKeys("(111) 322-3344");
    }

    @And("Güncelle butonuna tıklanır")
    public void guncelleButonunaTıklanır() {
        homePage.guncelleButton.submit();
    }

    @And("Kullanıcı türü başarıyla kaydedildi yazısı görülür")
    public void kullanıcıTuruBasarıylaKaydedildiYazısıGorulur() {
        Assert.assertEquals("User type save successfully",homePage.DogrulamaYazisi.getText());
    }

    @And("admin kullanici email ve password bilgileri ile login olur")
    public void adminKullaniciEmailVePasswordBilgileriIleLoginOlur() {
        homePage.emailTextBox.sendKeys(ConfigReader.getProperty("getlandadminmail"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("getlandadminpassword"));
        homePage.loginButton.click();
    }

    @Then("Daha önce belirlemiş olduğımuz Customer {int} kullanıcsı arama kutusunda aratılır")
    public void dahaOnceBelirlemisOldugımuzCustomerKullanıcsıAramaKutusundaAratılır(int arg0) throws InterruptedException {
        homePage.kullaniciKontrol.sendKeys(ConfigReader.getProperty("getlandcustomermail3"));
        homePage.buyutec.click();
        ReusableMethods.bekle(3);
        Thread.sleep(3000);
        homePage.kullaniciDuzenle.click();
    }

    @And("Sil seceneğine tıklanır ve Customer kullanıcı silinir")
    public void silSecenegineTıklanırVeCustomerKullanıcıSilinir() {
        homePage.silButton.click();
        homePage.silButtononayla.click();
    }

  //  @And("Kullanıcı türü başarıyla silindi yazısı görülür")
  //  public void kullanıcıTuruBasarıylaSilindiYazısıGorulur() {
  //
  //  }
}
