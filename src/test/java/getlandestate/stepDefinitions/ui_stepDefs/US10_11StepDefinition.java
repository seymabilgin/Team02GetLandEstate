package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.*;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US10_11StepDefinition {

    GetlandPage getlandPage = new GetlandPage();
    HomePage homePage = new HomePage();
    PropertiesPage propertiesPage = new PropertiesPage();
     MyTourRequestPage requestPage = new MyTourRequestPage();
    AdvertPage advertPage = new AdvertPage();

    Login_RegisterPage registerPage = new Login_RegisterPage();

    @Given("kullanici sayfaya gider")
    public void kullanici_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }

    @When("login butonuna tiklar")
    public void login_butonuna_tiklar() {
        getlandPage.girisButonu.click();
    }

    @When("email ve password bilgileri ile login olur")
    public void email_ve_password_bilgileri_ile_login_olur() {
        getlandPage.emailKutusu.sendKeys(ConfigReader.getProperty("costumerMail"));
        getlandPage.passwordKutusu.sendKeys(ConfigReader.getProperty("costumerPassword"), Keys.ENTER);
    }

    @When("Rent butonu tiklanir")
    public void rent_butonu_tiklanir() {
        homePage.rentButton.click();
    }

    @And("Arama kismina aradigimiz {string} aratilir")
    public void aramaKisminaAradigimizAratilir(String str) {
        homePage.searchInput.sendKeys(str);
        homePage.searchButton.click();
    }

    @Then("Aranan emlak turleri goruntulendigi dogrulanir")
    public void aranan_emlak_turleri_goruntulendigi_dogrulanir() {
        Assert.assertTrue(propertiesPage.propertiesTitle.getText().contains("PROPERTIES"));
    }


    @When("Price Range kismina istenilen fiyat araligi secilir")
    public void price_range_kismina_istenilen_fiyat_araligi_secilir() {
        propertiesPage.minPrice.sendKeys("100");
        propertiesPage.maxPrice.sendKeys("3000");
    }

    @When("Advert Type kismina rent kismi secilir")
    public void advert_type_kismina_rent_kismi_secilir() {

        propertiesPage.advertType.sendKeys("r",Keys.ENTER);
    }

    @When("Category butonundan istenilen emlak turu secilir")
    public void category_butonundan_istenilen_emlak_turu_secilir() {
        propertiesPage.category.sendKeys("v",Keys.ENTER);
    }

    @And("Country butonundan istenilen ulke secilir")
    public void countryButonundanIstenilenUlkeSecilir() {

        propertiesPage.country.sendKeys("t",Keys.ENTER);

    }

    @And("City butonunda istenilen sehir secilir")
    public void cityButonundaIstenilenSehirSecilir() {

        propertiesPage.city.sendKeys("m","m","m","m","m",Keys.ENTER);

    }

    @When("District butonuyla mahalle secilir")
    public void district_butonuyla_mahalle_secilir() {

        propertiesPage.district.sendKeys("b",Keys.ENTER);
    }

    @Then("Search butonuna tiklayarak ozel aranan emlak turleri goruntulendigi dogrulanir")
    public void search_butonuna_tiklayarak_ozel_aranan_emlak_turleri_goruntulendigi_dogrulanir() {

        propertiesPage.searchButton.click();
        Assert.assertTrue(propertiesPage.totalFound.getText().contains("Total found"));

    }

    @And("Filtrelenen emlaklardan bir emlak secilir")
    public void filtrelenenEmlaklardanBirEmlakSecilir() {
        propertiesPage.searchButton.click();
        propertiesPage.choiseRent.click();
    }

    @Then("Emlak turunun resmi goruntulendigi dorgulanmali")
    public void emlak_turunun_resmi_goruntulendigi_dorgulanmali() {
        Assert.assertTrue(advertPage.image.isDisplayed());
    }

    @Then("Emlak turunun Description bilgileri goruntulendigi dorgulanmali")
    public void emlak_turunun_description_bilgileri_goruntulendigi_dorgulanmali() {
        Assert.assertNotNull(advertPage.description.getText());
    }

    @Then("Emlak turunun Details bilgileri goruntulendigi dorgulanmali")
    public void emlak_turunun_details_bilgileri_goruntulendigi_dorgulanmali() {
        Assert.assertNotNull(advertPage.details.getText());
    }

    @Then("Emlak turunun Location bilgileri goruntulendigi dorgulanmali")
    public void emlak_turunun_location_bilgileri_goruntulendigi_dorgulanmali() {
        Assert.assertNotNull(advertPage.location.getText());
    }

    @Then("Ilan veren kisinin iletisim bilgileri goruntulendigi dorgulanmali")
    public void ilan_veren_kisinin_iletisim_bilgileri_goruntulendigi_dorgulanmali() {
        Assert.assertNotNull(advertPage.ownerName.getText());
    }

    @Then("Gorunurluk butonuna tiklayarak telefon bilgileri goruntulendigi dorgulanmali")
    public void gorunurluk_butonuna_tiklayarak_telefon_bilgileri_goruntulendigi_dorgulanmali() {
        advertPage.gorunurlukButton.click();
        Assert.assertNotNull(advertPage.telNumberBox.getText());
    }

    @Then("Gorunurluk butonuna tiklayarak mail bilgileri goruntulendigi dorgulanmali")
    public void gorunurluk_butonuna_tiklayarak_mail_bilgileri_goruntulendigi_dorgulanmali() {
        ReusableMethods.visibleWait(advertPage.gorunurlukButton,10);
        advertPage.gorunurlukButton.click();
        Assert.assertNotNull(advertPage.mailBox.getText());
    }

    @When("Takvim butonunu tiklayarak tarih secilir")
    public void takvim_butonunu_tiklayarak_tarih_secilir() {
      advertPage.tourDate.sendKeys("29/04/2024");
    }

    @When("Saat butonunu tiklayarak saat secilir")
    public void saat_butonunu_tiklayarak_saat_secilir() {
        advertPage.tourTime.sendKeys("13:30");
    }

    @When("\"Submit a tour request\"butonuna tiklayarak randevu talebinde bulunur")
    public void submit_a_tour_request_butonuna_tiklayarak_randevu_talebinde_bulunur() {
        advertPage.submit.click();
    }

    @Then("{string} mesaji goruntulendigi dogrulanmali")
    public void mesaji_goruntulendigi_dogrulanmali(String string) {
        Assert.assertTrue(advertPage.succesMessage.isDisplayed());
        ReusableMethods.InvisibleWait(advertPage.succesMessage,15);
    }

    @When("Kullanici profilinden My tour request  e tiklayarak randevu sayfasina ulasir")
    public void kullanici_profilinden_e_tiklayarak_randevu_sayfasina_ulasir( ) {
        registerPage.profileLogAA.click();
        registerPage.myRequestsButton.click();
    }

    @Then("Kullanici istekte bulundugu randevulari goruntulendigi dogrulanir")
    public void kullanici_istekte_bulundugu_randevulari_goruntulendigi_dogrulanir() {

        Assert.assertTrue(requestPage.ownerName.isDisplayed());

    }

    @Then("Kullanicinin randevu sayfasindan randevu isteginin onaylandigi dogrulanir")
    public void kullanicinin_randevu_sayfasindan_randevu_isteginin_onaylandigi_dogrulanir() {

        boolean approvedVarMi = false;

        for (WebElement randevuStatusElementi : requestPage.randevuStatus) {
            String randevuDurumu = randevuStatusElementi.getText();
            if (randevuDurumu.equals("APPROVED")) {
                approvedVarMi = true;
                break; // 'approved' bulunduysa döngüyü sonlandırın
            }


        }
        Assert.assertTrue( approvedVarMi);

    }

    @Then("Kullanicinin randevu sayfasindan randevu isteginin reddedildigi dogrulanir")
    public void kullanicinin_randevu_sayfasindan_randevu_isteginin_reddedildigi_dogrulanir() {
        boolean approvedVarMi = false;

        for (WebElement randevuStatusElementi : requestPage.randevuStatus) {
            String randevuDurumu = randevuStatusElementi.getText();
            if (randevuDurumu.equals("DECLINED")) {
                approvedVarMi = true;
                break; // 'approved' bulunduysa döngüyü sonlandırın
            }


        }
        Assert.assertTrue( approvedVarMi);
    }

    @Then("Sayfa kapatilir")
    public void sayfa_kapatilir() {
        Driver.closeDriver();
    }


    @When("Sale butonu tiklanir")
    public void saleButonuTiklanir() {
        homePage.searchAreaSaleButton.click();
    }

    @And("Advert Type kismina sale kismi secilir")
    public void advertTypeKisminaSaleKismiSecilir() {
        propertiesPage.advertType.sendKeys("s",Keys.ENTER);
    }

    @When("Price Range kismina istenilen  fiyat araligi secilir")
    public void priceRangeKisminaIstenilenFiyatAraligiSecilir() {
        propertiesPage.minPrice.sendKeys("600000");
        propertiesPage.maxPrice.sendKeys("650000");
    }
}
