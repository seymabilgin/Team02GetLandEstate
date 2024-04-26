package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.HomePage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
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
        homePage.kullaniciKontrol.sendKeys(ConfigReader.getProperty("getlandcustomermail2"));
    }

    @And("Düzenle seçeneğine tıklanır ve Customer kullanıcısının bilgileri görülür")
    public void duzenleSecenegineTıklanırVeCustomerKullanıcısınınBilgileriGorulur() {
        homePage.kullaniciDuzenle.click();
    }

    @And("Roller kısmından Customer olan kişi rolü admin olarak güncellenir")
    public void rollerKısmındanCustomerOlanKisiRoluAdminOlarakGuncellenir() {
    // homePage.kullaniciRolDuzenleme.click();
     homePage.kullaniciMANAGER.click();
     homePage.kullaniciEmailDuzenleme.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
     homePage.kullaniciEmailDuzenleme.sendKeys(ConfigReader.getProperty("getlandcustomermail3"));
     homePage.nameVerify.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
     homePage.nameVerify.sendKeys("yalan");
     homePage.lastNameVerify.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
     homePage.lastNameVerify.sendKeys("dunya");
     homePage.telefonVerify.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
     homePage.telefonVerify.sendKeys("(111) 322-3344");
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
}
