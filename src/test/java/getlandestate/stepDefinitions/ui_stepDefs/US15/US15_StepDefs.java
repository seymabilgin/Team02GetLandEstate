package getlandestate.stepDefinitions.ui_stepDefs.US15;

import com.github.javafaker.Faker;
import getlandestate.pages.DashBoardPage;
import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US15_StepDefs {
    Login_RegisterPage login;
    DashBoardPage dashBoardPage;
    Faker faker;
    String createdAdvertTypeName;
    String createdCategoryName;
    String customerName;
    Actions actions;

    static class UpdateButtonUnexpectedlyActiveException extends Exception {
        public UpdateButtonUnexpectedlyActiveException(String errorMessage) {
            super(errorMessage);
        }
    }

    @When("Login butonuna tiklar")
    public void loginButonunaTiklar() {
        login = new Login_RegisterPage();
        login.loginAA.click();
        faker = new Faker();
    }

    @And("Email kismini doldurur")
    public void emailKisminiDoldurur() {
        login.loginEmail.sendKeys(ConfigReader.getProperty("tuncerAdminEmail"));
    }

    @And("Password kismini doldurur")
    public void passwordKisminiDoldurur() {
        login.loginPassword.sendKeys(ConfigReader.getProperty("tuncerAdminPassword"));
        login.loginButtona.click();
        ReusableMethods.bekle(1);
    }

    @And("Categories kismina tiklar")
    public void categoriesKisminaTiklar() {
        dashBoardPage = new DashBoardPage();
        ReusableMethods.bekle(4);
        dashBoardPage.dashboardCategories.click();
    }

    @And("Add new butonuna tiklar")
    public void addNewButonunaTiklar() {
        dashBoardPage.dashboardCategoriesAddNewButton.click();
    }

    @And("Title kismini doldurur")
    public void titleKisminiDoldurur() {
        createdCategoryName = faker.name().firstName();
        dashBoardPage.dashboardCategoriesTitle.sendKeys(createdCategoryName);
    }

    @And("Sequence kismini doldurur")
    public void sequenceKisminiDoldurur() {
        dashBoardPage.dashboardCategoriesSequence.sendKeys("12");
    }

    @And("Icon kismini doldurur")
    public void iconKisminiDoldurur() {
        dashBoardPage.dashboardCategoriesIconArea.sendKeys("warehouse");
    }

    @And("Active kismini isaretler")
    public void activeKisminiIsaretler() {
        dashBoardPage.dashboardCategoriesActiveSwitch.click();
    }

    @And("Create butonuna basar")
    public void createButonunaBasar() {
        dashBoardPage.dashboardCategoriesCreateButton.click();
    }

    @And("Category Created alertini gorur ve kapatir")
    public void categoryCreatedAlertiniGorurVeKapatir() {
        // Assert.assertTrue(dashBoardPage.dashboardCategoriesCategoryCreatedText.isDisplayed());
        dashBoardPage.dashboardCategoriesCategoryCreatedTextCloseButton.click();
        ReusableMethods.bekle(3);
    }

    @And("Dashboarddaki advert typesa tiklar")
    public void dashboarddakiAdvertTypesaTiklar() {
        dashBoardPage = new DashBoardPage();
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardAdvertTypes.click();
        ReusableMethods.bekle(2);
    }

    @And("Add new butonuna tiklar1")
    public void createButonunaTiklar1() {
        dashBoardPage.dashboardCategoriesAddNewButton.click();
        ReusableMethods.bekle(1);
    }

    @And("Title kismini doldurur2")
    public void titleKisminiDoldurur2() {
        createdAdvertTypeName = faker.name().firstName();
        dashBoardPage.dashboardAdvertTypeTitle.sendKeys(createdAdvertTypeName);
    }

    @And("Create butonuna tiklar2")
    public void createButonunaTiklar2() {
        dashBoardPage.dashboardAdvertTypeCreateButton.click();
    }

    @And("Advert type created successfully mesajini gorur")
    public void advertTypeCreatedSuccessfullyMesajiniGorur() {
        Assert.assertTrue(dashBoardPage.dashboardCategoriesCategoryCreatedText.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @And("Dashboarddaki Usersa tiklar")
    public void dashboarddakiUsersaTiklar() {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.dashboardUsers.click();
    }

    @And("Arama kismini istenilen kisinin adıyla doldurur")
    public void aramaKisminiIstenilenKisininAdiylaDoldurur() {
        dashBoardPage.dashboardUsersTypeSomething.sendKeys(ConfigReader.getProperty("customerTuncer"));
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardUsersSearchIcon.click();
        ReusableMethods.bekle(1);
    }

    @And("Ilgili kisinin kalem butonuna basar")
    public void ilgiliKisininKalemButonunaBasar() {
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardUsersPenIcon.click();
    }

    @And("Telefon numarasinda bir degisiklik yapar")
    public void telefonNumarasindaBirDegisiklikYapar() {

        int randomFourDigitNumber = faker.number().numberBetween(1245, 10000);
        String numberAsString = String.valueOf(randomFourDigitNumber);

        actions = new Actions(Driver.getDriver());
        actions.doubleClick(dashBoardPage.dashboardUsersUserPhone).sendKeys(numberAsString).perform();
        ReusableMethods.bekle(2);
    }

    @And("Roles kismindan manager secer")
    public void rolesKismindanManagerSecer() {
        dashBoardPage.dashboardUsersUserRole.sendKeys("MANAGER");
    }

    @And("Update butonuna tiklar")
    public void updateButonunaTiklar() {
        dashBoardPage.dashboardUsersUserUpdateButton.click();
    }

    @And("User type save successfully mesajini gorur")
    public void userTypeSaveSuccessfullyMesajiniGorur() {
        Assert.assertTrue(dashBoardPage.dashboardCategoriesCategoryCreatedText.isDisplayed());
    }

    @And("Categories Kismina tiklar2")
    public void categoriesKisminaTiklar2() {
        dashBoardPage.dashboardbackToSite.click();
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardbackToDashboard.click();
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardbackToDashboard2.click();
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardCategories.click();
        ReusableMethods.bekle(1);
    }

    @And("Arama kismini doldurur")
    public void aramaKisminiDoldurur() {
        dashBoardPage.dashboardUsersTypeSomething.sendKeys(createdCategoryName);
        ReusableMethods.bekle(1);
    }

    @And("Buyutec ikonuna tiklar ve aratir.")
    public void buyutecIkonunaTiklarVeAratir() {
        dashBoardPage.dashboardUsersSearchIcon.click();
        ReusableMethods.bekle(1);
    }

    @And("Ilgili Category'nin kalem ikonuna tiklar")
    public void ilgiliCategoryNinKalemIkonunaTiklar() {
        dashBoardPage.dashboardUsersPenIcon.click();
        ReusableMethods.bekle(1);
    }

    @And("Sequence kismini gunceller")
    public void sequenceKisminiGunceller() {
        dashBoardPage.dashboardCategoriesSequence.sendKeys("1");
    }

    @And("Category updated successfully mesajini gorur")
    public void categoryUpdatedSuccessfullyMesajiniGorur() {
        dashBoardPage.dashboardCategoryUpdate.click();
        dashBoardPage.dashboardCategoriesCategoryCreatedTextCloseButton.click();
       // Assert.assertTrue(dashBoardPage.dashboardCategoriesCategoryCreatedText.isDisplayed());
    }

    @And("Categories Kismina tiklar3")
    public void categoriesKisminaTiklar3() {
        dashBoardPage.dashboardCategories.click();
        ReusableMethods.bekle(2);
    }

    @And("Ilgili Category'nin cop kutusu ikonuna tiklar")
    public void ilgiliCategoryNinCopKutusuIkonunaTiklar() {
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardUsersSearchIcon.click();
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardCategoryDelete.click();
        ReusableMethods.bekle(1);
    }

    @And("Are you sure you want to delete the category? yazisini gorur")
    public void areYouSureYouWantToDeleteTheCategoryYazisiniGorur() {
        Assert.assertTrue(dashBoardPage.dashboardCategoryAreYouSureText.isDisplayed());
    }

    @And("YES butonuna tiklar")
    public void yesButonunaTiklar() {
        dashBoardPage.dashboardCategoryYESbutton.click();
        ReusableMethods.bekle(1);
    }

    @And("Category deleted successfully mesajini gorur")
    public void categoryDeletedSuccessfullyMesajiniGorur() {
        Assert.assertTrue(dashBoardPage.dashboardCategoriesCategoryCreatedText.isDisplayed());
    }

    @And("Dashboarddaki Tour Requestse tiklar")
    public void dashboarddakiTourRequestseTiklar() {
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardTourRequests.click();
        ReusableMethods.bekle(1);
    }

    @And("Sayfadaki tur isteklerini gorur")
    public void sayfadakiTurIstekleriniGorur() {
        Assert.assertTrue(dashBoardPage.dashboardTourRequestsImage.isDisplayed());
    }

    @And("Olusturmus oldugu ilanı silme butonuna tiklar")
    public void olusturmusOlduguIlanıSilmeButonunaTiklar() {
        dashBoardPage.dashboardUsersTypeSomething.sendKeys("Test Rent");
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardUsersSearchIcon.click();
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardAdvertTypeDelete.click();
        ReusableMethods.bekle(1);
        WebElement editButton = dashBoardPage.dashboardAdvertTypeEdit;
        try {
            if (editButton.isEnabled()) {
                throw new AssertionError("EDIT BUTONU AKTIF, ISTENILEN ADVERT TYPE SILINEMEDI, " +
                        "UNAUTHOZIZED");
            } else {
                editButton.click();
            }
        } finally {
            Driver.closeDriver();
        }
    }

    @Then("Butonun aktif olmadigini dogrular")
    public void butonunAktifOlmadiginiDogrular() {
        ReusableMethods.bekle(2);
        Assert.assertFalse(dashBoardPage.dashboardCategoriesCreateButton.isEnabled());
    }

    @And("Arama kismini istenilen kisinin adiyla doldurur2")
    public void aramaKisminiIstenilenKisininAdiylaDoldurur2() {
        customerName = "Tuncer";
        dashBoardPage.dashboardUsersTypeSomething.sendKeys(customerName);
        ReusableMethods.bekle(2);
        dashBoardPage.dashboardUsersSearchIcon.click();
    }

    @And("Kisiyi gordugunu dogrular")
    public void kisiyiGordugunuDogrular() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(dashBoardPage.dashboardUsersPenIcon.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(dashBoardPage.dashboardUsersPenIcon.isEnabled());
        ReusableMethods.bekle(1);
    }

    @And("Email kismindaki veriyi degistirir")
    public void emailKismindakiVeriyiDegistirir() {
        try {
            // Email input elementine odaklan
            WebElement emailInput = dashBoardPage.dashboardUserEmail;
            ReusableMethods.bekle(2); // 2 saniye bekle
            emailInput.click(); // Email inputuna tıkla
            ReusableMethods.bekle(1); // 1 saniye bekle
            emailInput.sendKeys(Keys.END); // Input alanının sonuna git

            // 26 kez backspace tuşuna basarak içeriği sil
            for (int i = 0; i < 26; i++) {
                emailInput.sendKeys(Keys.BACK_SPACE);
            }

            ReusableMethods.bekle(1); // 1 saniye bekle
            emailInput.sendKeys("a@c"); // Yeni email adresini gir

            // Update butonunun durumunu kontrol et
            WebElement updateButton = dashBoardPage.dashboardUsersUserUpdateButton;

            if (updateButton.isEnabled()) {
                // Beklenmedik şekilde aktif ise AssertionError fırlat
                throw new AssertionError("HATA: UPDATE BUTONU BEKLENMEDIK SEKILDE AKTIF GOZUKUYOR.!!!!! BU GIRILEN FORMATA IZIN VERILMEMELI!!");
            } else {
                // Test başarıyla geçirildi
                System.out.println("TEST BASARIYLA GECIRILDI: UPDATE BUTONU BEKLENEN SEKILDE AKTIF DEGIL.");
            }
        } finally {
            Driver.closeDriver();
        }
    }
    @Then("Tarayiciyi kapatir")
    public void tarayiciyiKapatir() {
        ReusableMethods.bekle(1);
        dashBoardPage.dashboardLogOutButtonTncr.click();
        dashBoardPage.dashboardLogOutButtonYes.click();
        Driver.closeDriver();
    }

}