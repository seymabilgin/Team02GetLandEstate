package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.GetlandPage;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;



public class GetLandStepDefinition20_21 {

GetlandPage getlandPage = new GetlandPage();

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        Driver.getDriver().get(url);

    }
    @When("Sayfanin sag ust bolumundeki Login butonuna tiklayarak giris ekranina ulasir.")
    public void sayfanin_sag_ust_bolumundeki_login_butonuna_tiklayarak_giris_ekranina_ulasir() {
getlandPage.girisButonu.click();
    }
    @When("Kullanici ilgili alanlara Email ve Enter password bilgisini yazar ve giris yapar.")
    public void kullanici_ilgili_alanlara_email_ve_enter_password_bilgisini_yazar_ve_giris_yapar() {
getlandPage.emailKutusu.sendKeys("winofik144@eryod.com");
getlandPage.passwordKutusu.sendKeys("Gozde23062021.", Keys.ENTER);

    }
    //US21 stepDefinitons

    @And("Acilan sayfada soldaki menuden ContactMessage'a tiklar.")//us21 başlangıç
    public void acilanSayfadaSoldakiMenudenContactMessageATiklar() {
        getlandPage.contactMassagesButonu.click();
    }

    @And("Liste halinde gelen mesajlarin oldugunu dogrular")
    public void listeHalindeGelenMesajlarinOldugunuDogrular() {
        Assert.assertTrue(getlandPage.mesajlarinOldugunuDogrular.isDisplayed());
    }

    @And("Listeden random olarak bir mesaj istegine tiklar;okundu olarak isaretle ve silme islemlerinin oldugunu dogrular")
    public void listedenRandomOlarakBirMesajIstegineTiklarOkunduOlarakIsaretleVeSilmeIslemlerininOldugunuDogrular() {
        ReusableMethods.click(getlandPage.mesajaTiklar);
        ReusableMethods.bekle(3);
        Assert.assertTrue( getlandPage.butonDogrulama.isDisplayed());
    }

    @And("Arama cubuguna filtrelemek istedigi sozcugu yazar ve sagdaki arama butonuna tiklayarak aramayi gerceklestirir")
    public void aramaCubugunaFiltrelemekIstedigiSozcuguYazarVeSagdakiAramaButonunaTiklayarakAramayiGerceklestirir() {
        getlandPage.aramaCubugu.sendKeys("mkircay");
        getlandPage.aramaButonu.click();
    }

    @And("Filtreleme butonuna tiklayarak ilgili ekrana ulasir")
    public void filtrelemeButonunaTiklayarakIlgiliEkranaUlasir() {
        getlandPage.filtrelemeButonu.click();


    }

    @And("Aratmak istedigi tarihleri girer ve sag usteki onay butonuna tiklar")//us21 bitiş
    public void aratmakIstedigiTarihleriGirerVeSagUstekiOnayButonunaTiklar() {
        getlandPage.startDateBlogu.sendKeys("17042024");
        getlandPage.endDateBlogu.sendKeys("19042024");
        getlandPage.onayButonuKucuk.click();

    }

    @But("Manager ilgili alanlara Email ve Enter password bilgisini yazar ve giris yapar.")
    public void managerIlgiliAlanlaraEmailVeEnterPasswordBilgisiniYazarVeGirisYapar() {
        getlandPage.emailKutusu.sendKeys("dreshon.zyus@foodfarms.net");
        getlandPage.passwordKutusu.sendKeys("Gozde23062021.", Keys.ENTER);

    }
}
