package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.CreatePropertyPage;
import getlandestate.pages.HomePage;
import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static getlandestate.utilities.ReusableMethods.*;

public class CreatePropertyAsAManager_StepDefinition {
    Login_RegisterPage loginPage=new Login_RegisterPage();
    CreatePropertyPage createPropertyPage= new CreatePropertyPage();
    HomePage homePage=new HomePage();
    @And("Login butonuna tıklanır")
    public void loginButonunaTıklanır() {
        homePage.loginButtonInHomePage.click();
    }
    @And("Kullanıcı Manager olarak {string} ve {string} kısmına geçerli bir bir veri girer ve login butonuna tıklar")
    public void kullanıcıManagerOlarakVeKısmınaGeçerliBirBirVeriGirerVeLoginButonunaTıklar(String email, String password) {
        loginPage.email.sendKeys(ConfigReader.getProperty(email));
        loginPage.password.sendKeys(ConfigReader.getProperty(password),Keys.ENTER);

    }

    @And("Create Property butonuna tıklanır")
    public void createPropertyButonunaTıklanır() {
        createPropertyPage.createPropertyButton.click();
        Driver.getDriver().navigate().refresh();
    }

    @And("Title {string} ile doldurulur")
    public void titleIleDoldurulur(String title) {
        createPropertyPage.titleOfProperty.sendKeys(title);
    }

    @And("Description {string} ile doldurulur")
    public void descriptionIleDoldurulur(String description) {
        createPropertyPage.descrptionOfProperty.sendKeys(description);
    }

    @And("Kullanıcı ilana uygun Price'i {string} seçer")
    public void kullanıcıIlanaUygunPriceISeçer(String price) {
        createPropertyPage.priceOfProperty.click();
        createPropertyPage.priceOfProperty.clear();
        createPropertyPage.priceOfProperty.sendKeys(price);
    }

    @And("AdvertType'ı {string} secer")
    public void adverttypeISecer(String advertType) {
        createPropertyPage.advertTypeOfProperty.click();
        createPropertyPage.advertTypeOfProperty.sendKeys(advertType);
    }

    @And("Category'i {string} secer")
    public void categoryISecer(String category) {
        createPropertyPage.categoryOfProperty.click();
        createPropertyPage.categoryOfProperty.sendKeys(category);
    }

    @And("Country'i {string} secer")
    public void countryISecer(String country) {
        createPropertyPage.countryOfPropert.click();
        createPropertyPage.countryOfPropert.sendKeys(country);
    }

    @And("City'i {string} secer")
    public void cityISecer(String city) {
        createPropertyPage.cityOfPropert.click();
        bekle(2);
        createPropertyPage.cityOfPropert.sendKeys(city, Keys.ENTER);
        bekle(2);
    }

    @And("District'i {string} secer")
    public void districtISecer(String district) {
        createPropertyPage.districtOfPropert.click();
        createPropertyPage.districtOfPropert.sendKeys(district);
    }

    @And("Address'i {string} belirtir")
    public void addressIBelirtir(String address) {
        createPropertyPage.adressOfPropert.sendKeys(address);
        scroll(createPropertyPage.scrollToProperties);
    }

    @And("Size'ı {string} belirtir")
    public void sizeIBelirtir(String size) {
        createPropertyPage.sizeOfPropert.click();
        createPropertyPage.sizeOfPropert.sendKeys(size);
    }

    @And("Bedrooms'u {string} belirtir")
    public void bedroomsUBelirtir(String bedrooms) {
        createPropertyPage.bedroomsOfPropert.click();
        createPropertyPage.bedroomsOfPropert.sendKeys(bedrooms);
    }

    @And("Bathrooms'u {string} belirtir")
    public void bathroomsUBelirtir(String bathrooms) {
        createPropertyPage.bathroomsOfPropert.click();
        createPropertyPage.bathroomsOfPropert.sendKeys(bathrooms);
    }

    @And("Garage {string} secer")
    public void garageSecer(String garage) {
        createPropertyPage.garageOfPropert.click();
        createPropertyPage.garageOfPropert.sendKeys(garage);
    }

    @And("Year of Build {string} girer")
    public void yearOfBuildGirer(String year) {
        createPropertyPage.yearOfBuildOfPropert.click();
        createPropertyPage.yearOfBuildOfPropert.sendKeys(year);
    }

    @And("Furniture' {string} secer")
    public void furnitureSecer(String furniture) {
        createPropertyPage.furnitureOfPropert.click();
        createPropertyPage.furnitureOfPropert.sendKeys(furniture);
    }

    @And("Maintenance Fee'ı {string} belirtir")
    public void maintenanceFeeIBelirtir(String maintenanceFee) {
        createPropertyPage.maintenancefeeOfPropert.click();
        createPropertyPage.maintenancefeeOfPropert.sendKeys(maintenanceFee);
    }

    @And("Terrace {string} secer")
    public void terraceSecer(String terrace) {
        createPropertyPage.terraceOfPropert.click();
        createPropertyPage.terraceOfPropert.sendKeys(terrace);
    }

    @When("Drag and drop the images or click here alanına tıklanır ve gerekli resimler seçilip eklenir")
    public void dragAndDropTheImagesOrClickHereAlanınaTıklanırVeGerekliResimlerSeçilipEklenir() {
        createPropertyPage.dragAndDropImgOfPropert.click();
        String dosyaYolu= System.getProperty("user.home") + "\\Downloads\\evv.jpg";
        uploadFilePath(dosyaYolu);
    }

    @Then("Kullanıcı  ilanla ilgili resim eklendiği doğrulanır")
    public void kullanıcıIlanlaIlgiliResimEklendiğiDoğrulanır() {
        Assert.assertTrue(createPropertyPage.imageOfPropert.isDisplayed());
    }

    @Then("Create butonuna tıklayarak ilan oluşturulur ve {string} mesajı çıktıgı dogrulanır")
    public void createButonunaTıklayarakIlanOluşturulurVeMesajıÇıktıgıDogrulanır(String createdAlert) {
        createPropertyPage.createButtonOfPropert.click();
        visibleWait(createPropertyPage.advertCreatedVeriflyTextOfPropert,15);
        Assert.assertEquals(createPropertyPage.advertCreatedVeriflyTextOfPropert.getText(),createdAlert);
    }

    @And("Title ve description alanları boş bırakılır")
    public void titleVeDescriptionAlanlarıBoşBırakılır() {
        //Bu alan boş bırakılmak istendiği icin kod yazılmadı
    }

    @And("Title icin {string} , description alanı icin {string} uyarı metni geldiği doğrulanır")
    public void titleIcinDescriptionAlanıIcinUyarıMetniGeldiğiDoğrulanır(String titleErorMsg, String descriptionErrorMsg) {
        createPropertyPage.titleOfProperty.click();
        bekle(2);
        createPropertyPage.descrptionOfProperty.click();
        Assert.assertEquals(createPropertyPage.titleErrorMsgOfPropert.getText(),titleErorMsg);
        createPropertyPage.titleOfProperty.click();
        Assert.assertEquals(createPropertyPage.descrptionErrorMsgOfPropert.getText(),descriptionErrorMsg);
    }

    @Then("Create butonu aktif olmaz ve ilan oluşturulamadığı doğrulanır")
    public void createButonuAktifOlmazVeIlanOluşturulamadığıDoğrulanır() {
        scrollEnd();
        Assert.assertFalse(createPropertyPage.createButtonOfPropert.isEnabled());
    }

    @And("Address alanı boş bırakılır ve {string} uyarı metni geldiği doğrulanır")
    public void addressAlanıBoşBırakılırVeUyarıMetniGeldiğiDoğrulanır(String addressErrorTxt) {
        createPropertyPage.adressOfPropert.sendKeys("",Keys.TAB);
        Assert.assertEquals(createPropertyPage.adressErrorTextOfPropert.getText(),addressErrorTxt);
    }

    @When("Drag and drop the images or click here alanına tıklanır ve 3 mb dan büyük resim seçilir")
    public void dragAndDropTheImagesOrClickHereAlanınaTıklanırVeMbDanBüyükResimSeçilir() {
        createPropertyPage.dragAndDropImgOfPropert.click();
        String dosyaYolu= System.getProperty("user.home") + "\\Downloads\\Müstakilev";
        uploadFilePath(dosyaYolu);
    }

    @Then("{string} uyarı metni geldiği doğrulanır")
    public void uyarıMetniGeldiğiDoğrulanır(String errorText) {
        Assert.assertEquals(createPropertyPage.imageErrorTextOfPropert.getText(),errorText);
    }

    @Then("Create butonu aktifleşmez ve ilanın oluşturulamadığı doğrulanır")
    public void createButonuAktifleşmezVeIlanınOluşturulamadığıDoğrulanır() {
        scroll(createPropertyPage.createButtonOfPropert);
        //screenShot("US06-TC05-Bug");
        Assert.assertFalse(createPropertyPage.createButtonOfPropert.isDisplayed());
    }
}
