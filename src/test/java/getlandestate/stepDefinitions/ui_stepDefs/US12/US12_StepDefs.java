package getlandestate.stepDefinitions.ui_stepDefs.US12;

import getlandestate.pages.HomePage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US12_StepDefs {
    HomePage homePage;

    @Given("Kullanici siteye gider")
    public void kullaniciSiteyeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));

    }

    @When("Arama kismindeki Rent secenegine tiklar")
    public void aramaKismindekiRentSecenegineTiklar() {
        homePage = new HomePage();
        homePage.searchAreaRentButton.click();
    }


    @And("Arama kismindeki House secenegine tiklar")
    public void aramaKismindekiHouseSecenegineTiklar() {
        homePage.searchAreaHouseButton.click();
    }


    @And("Arama alanina bir {string} girer")
    public void aramaAlaninaBirDegerGirer(String deger) {
        ReusableMethods.visibleWait(homePage.searchAreaTextBox, 5);
        homePage.searchAreaTextBox.sendKeys(deger);
    }

    @And("Arama icin buyutec ikonuna tiklar")
    public void aramaIcinBuyutecIkonunaTiklar() {
        homePage.searchAreaSearchIcon.click();
    }

    @And("Price Range kismina bir sayi girer")
    public void priceRangeKisminaBirSayiGirer() {
        homePage.searchPropertyPriceRangeMin.sendKeys("1000");
        homePage.searchPropertyPriceRangeMax.sendKeys("1000000");
        ReusableMethods.bekle(3);
    }

    @And("Advert {string} secer")
    public void advertTypeSecer(String type) {
        homePage.searchPropertyAdvertType.sendKeys(type);
        ReusableMethods.bekle(4);
    }

    @And("Category {string} secer")
    public void categorySecer(String category) {
        homePage.searchPropertyCategory.sendKeys(category);
        ReusableMethods.bekle(4);

    }

    @And("Country {string} secer")
    public void countrySecer(String country) {
        ReusableMethods.bekle(4);
        homePage.searchPropertyCountry.sendKeys(country);
        homePage.searchPropertyCountry.submit();
        ReusableMethods.bekle(4);

    }

    @And("City {string} secer")
    public void citySecer(String city) {
        homePage.searchPropertyCity.sendKeys(city);

    }

    @And("District {string} secer")
    public void districtSecer(String discrict) {
        homePage.searchPropertyDisctrit.sendKeys(discrict, Keys.ENTER);
    }

    @And("Search Button'a tiklar")
    public void searchButtonATiklar() {
        homePage.searchPropertySearchButton.click();
        ReusableMethods.bekle(4);
    }

    @And("Bir emlak secer ve resme tiklar")
    public void birEmlakSecerVeResmeTiklar() {
        homePage.searchPropertySelectOneAdvert.click();
    }

    @Then("Emlak resminin gorunurlugunu dogrular")
    public void emlakResmininGorunurlugunuDogrular() {
        homePage.searchPropertyAdvertEyeIcon.click();
        Assert.assertTrue(homePage.searchPropertyAdvertImagePreview.isDisplayed());
        homePage.searchPropertyAdvertCloseImagePreview.click();
    }

    @And("Description {string} bilgilerinin gorunurlugunu dogrular")
    public void descriptionBilgilerininGorunurlugunuDogrular(String description ) {
        String actualDetails = homePage.searchPropertyAdvertDescriptionDetails.getText();
        Assert.assertEquals(description, actualDetails);


    }

    @And("Details {string} {string} {string} {string} {string} {string} {string} {string} bilgilerinin gorunurlugunu dogrular")
    public void detailsBilgilerininGorunurlugunuDogrular(String detailSize, String bedroomSize, String bathroomSize,
                                                         String garageData, String yearOfBuild, String furniture,
                                                         String maintenanceFee, String terrace) {

        String actualDetailsize = homePage.searchPropertyDetailSize.getText();
        Assert.assertEquals(detailSize, actualDetailsize);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDetailSize));

        String actualBedroomSize = homePage.searchPropertyDetailBedrooms.getText();
        Assert.assertEquals(bedroomSize, actualBedroomSize);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDetailBedrooms));

        String actualBathroomSize = homePage.searchPropertyDetailBathrooms.getText();
        Assert.assertEquals(bathroomSize, actualBathroomSize);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDetailBathrooms));

        String actualGarageData = homePage.searchPropertyDetailGarage.getText();
        Assert.assertEquals(garageData, actualGarageData);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDetailGarage));

        String actualYearOfBuild = homePage.searchPropertyDetailYearOfBuild.getText();
        Assert.assertEquals(yearOfBuild, actualYearOfBuild);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDetailYearOfBuild));

        String actualFurniture = homePage.searchPropertyDetailFurniture.getText();
        Assert.assertEquals(furniture, actualFurniture);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDetailFurniture));

        String actualMaintenanceFee = homePage.searchPropertyDetailMaintenanceFee.getText();
        Assert.assertEquals(maintenanceFee, actualMaintenanceFee);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDetailMaintenanceFee));

        String actualTerrace = homePage.searchPropertyDetailTerrace.getText();
        Assert.assertEquals(terrace, actualTerrace);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDetailTerrace));
    }

    @And("Location {string} {string} {string} {string} bilgilerinin gorunurlugunu dogrular")
    public void locationBilgilerininGorunurlugunuDogrular(String locationCountry ,String locationCity , String locationDistrict, String locationAdress) {

        ReusableMethods.scroll(homePage.searchPropertyDscScroll);

        ReusableMethods.visibleWait(homePage.searchPropertyDscScroll, 5);

        String actualCountry = homePage.searchPropertyLocationCountry.getText();
        Assert.assertEquals(locationCountry, actualCountry);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyLocationCountry));

        String actualCity = homePage.searchPropertyLocationCity.getText();
        Assert.assertEquals(locationCity, actualCity);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyLocationCity));

        String actualDisctrit = homePage.searchPropertyLocationDisctrict.getText();
        Assert.assertEquals(locationDistrict, actualDisctrit);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyLocationDisctrict));

        String actualLocationAdress = homePage.searchPropertyLocationAdress.getText();
        Assert.assertEquals(locationAdress, actualLocationAdress);
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyLocationAdress));
    }

    @When("Ilan verenin numarasini gormek icin goz ikonuna tiklar")
    public void ilanVereninNumarasiniGormekIcinGozIkonunaTiklar() {
        ReusableMethods.scroll(homePage.searchPropertyScrollToTop);
        ReusableMethods.bekle(5);
        homePage.searchPropertyContactNumberEyeIcon.click();
    }

    @Then("Don't have an account? Create one now! Menusunun gorundugunu dogrular")
    public void menusununGorundugunuDogrular() {
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDontHaveAcccountCreateNow));
        homePage.searchPropertyCloseMiniMenu.click();
        ReusableMethods.bekle(3);
    }

    @When("Ilan verenin mailini gormek icin goz ikonuna tiklar")
    public void ilanVereninMailiniGormekIcinGozIkonunaTiklar() {
        ReusableMethods.bekle(5);
        homePage.searchPropertySendMailEyeIcon.click();
    }

    @Then("Don't have an account? Create one now! Menusunun gorundugunu dogrular2")
    public void menusununGorundugunuDogrular2() {
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDontHaveAcccountCreateNow));
        homePage.searchPropertyCloseMiniMenu.click();
        ReusableMethods.bekle(3);
    }

    @When("Schedule a tour kismindeki Tour Date'e {string} tarih girer")
    public void scheduleATourKismindekiTourDateEBirTarihGirer(String tarih) {

        ReusableMethods.scroll(homePage.searchPropertyScrollToSchedulaTour);
        homePage.searchPropertyTourDate.sendKeys(tarih);
        Assert.assertTrue("TOUR DATE UZUNLUGU 8 KARAKTERDEN FAZLA OLMAMALI,FORMATA AYKIRI GIRILEN KARAKTER SAYISI :"+ tarih.length(),tarih.length() <= 8);
    }

    @And("Schedule a tour kismindeki Tour Time'e {string} saat secer")
    public void scheduleATourKismindekiTourTimeEBirSaatSecer(String saat) {
        ReusableMethods.ddmVisibleText(homePage.searchPropertyTourTime,saat);
    }

    @And("Submit a tour request button'a tiklar")
    public void submitATourRequestButtonATiklar() {
        ReusableMethods.bekle(2);
        homePage.searchPropertySubmitTourRequest.click();
    }

    @Then("Don't have an account? Create one now! Menusunun gorundugunu dogrular3")
    public void menusununGorundugunuDogrular3() {
        Assert.assertTrue(homePage.isElementDisplayed(homePage.searchPropertyDontHaveAcccountCreateNow));
        ReusableMethods.bekle(3);
    }

    @When("Create one now! butonuna tiklar")
    public void butonunaTiklar() {
       ReusableMethods.click(homePage.searchPropertyDontHaveAcccountCreateNow);
    }

    @Then("Register sayfasinda oldugunu dogrular")
    public void registerSayfasindaOldugunuDogrular() {
        Assert.assertEquals("http://www.getlandestate.com/register", Driver.getDriver().getCurrentUrl());
    }

    @When("Arama kismindeki Sale secenegine tiklar")
    public void aramaKismindekiSaleSecenegineTiklar() {
        homePage = new HomePage();
        homePage.searchAreaSaleButton.click();
    }

    @And("Arama kismindeki Apartment secenegine tiklar")
    public void aramaKismindekiApartmentSecenegineTiklar() {
        homePage.searchAreaApartmentButton.click();
    }

    @And("Bir emlak secer ve resme tiklar2")
    public void birEmlakSecerVeResmeTiklar2() {
        homePage.searchPropertySelectOneAdvert2.click();
    }

    @And("Bir emlak secer ve resme tiklar3")
    public void birEmlakSecerVeResmeTiklar3() {
        homePage.searchPropertySelectOneAdvert3.click();
    }

    @And("Bir emlak secer ve resme tiklar4")
    public void birEmlakSecerVeResmeTiklar4() {
        homePage.searchPropertySelectOneAdvert4.click();
    }

    @And("Schedule a tour kismindeki Tour Date'e {string} tarih girer2")
    public void scheduleATourKismindekiTourDateETarihGirer(String tarih2) {
        ReusableMethods.scroll(homePage.searchPropertyScrollToSchedulaTour);
        homePage.searchPropertyTourDate.sendKeys(tarih2);

        if (tarih2.length() > 8) {
            Assert.assertFalse("SUBMIT BUTONU AKTIF OLMAMALIDIR", homePage.searchPropertySubmitTourRequest.isEnabled());
        }
    }

    }



