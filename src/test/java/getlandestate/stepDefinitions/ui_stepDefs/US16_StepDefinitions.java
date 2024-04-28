package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.DashBoardPage;
import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class US16_StepDefinitions {
    Login_RegisterPage registerPage = new Login_RegisterPage();
    DashBoardPage dashBoardPage = new DashBoardPage();

    @Given("Url'e gidilir")
    public void urlGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }

    @When("Login butona tiklanir")
    public void loginButonaTiklanir() {
        registerPage.loginButtonMT.click();
    }

    @And("Admin olarak login olunur")
    public void adminOlarakLoginOlunur() {
        registerPage.emailBoxMT.sendKeys(ConfigReader.getProperty("us16AdminMail"), Keys.TAB, Keys.TAB, ConfigReader.getProperty("us16AdminPassword"), Keys.ENTER);
    }

    @And("Reports butonuna tiklanir")
    public void reportsButonunaTiklanir() {
        ReusableMethods.click(dashBoardPage.dashboardReportsButton);
    }

    @When("Adverts kismindaki secimler yapilir ve raporlama butonuna tiklanir")
    public void advertsKismindakiSecimlerYapilirVeRaporlamaButonunaTiklanir() {
        dashBoardPage.advertsStartDate.sendKeys("01042024");
        dashBoardPage.advertsEndDate.sendKeys("18042024");
        Select selectCategory = new Select(dashBoardPage.advertsCategory);
        selectCategory.selectByIndex(1);
        dashBoardPage.advertsType.sendKeys("Rent");
        dashBoardPage.advertsStatus.sendKeys("Activated");
        //Dosya daha önce indirilmişse silinir
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\filtered-adverts.xlsx";
        try {
            Files.delete(Paths.get(dosyaYolu));
        } catch (IOException e) {
            System.err.println("Dosya Silinemedi!");
        }
        dashBoardPage.advertsDownload.click();
        //Robot class ı ile download keep e tiklanir
        ReusableMethods.robotDownloadKeep();
    }

    @Then("Adverts Download dogrulamasi yapilir")
    public void advertsDownloadDogrulamasiYapilir() {
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\filtered-adverts.xlsx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }

    @When("Most Popular Properties kismindaki Amount kısmına deger girilir ve raporlama butonuna tiklanir")
    public void mostPopularPropertiesKismindakiAmountKısmınaDegerGirilirVeRaporlamaButonunaTiklanir() {
        dashBoardPage.popularAmount.click();
        dashBoardPage.popularAmount.sendKeys(Keys.BACK_SPACE, "3");
        ReusableMethods.bekle(1);
        //Dosya daha önce indirilmişse silinir
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\most-popular-3-adverts.xlsx";
        try {
            Files.delete(Paths.get(dosyaYolu));
        } catch (IOException e) {
            System.err.println("Dosya Silinemedi!");
        }
        dashBoardPage.popularDownload.click();
        //Robot class ı ile download keep e tiklanir
        ReusableMethods.robotDownloadKeep();
    }

    @Then("Most Popular Download dogrulamasi yapilir")
    public void mostPopularDownloadDogrulamasiYapilir() {
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\most-popular-3-adverts.xlsx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }

    @When("Users kisminda Admin rolu secili iken raporlama butonuna tiklanir")
    public void usersKismindaAdminRoluSeciliIkenRaporlamaButonunaTiklanir() {
        Select selectRole = new Select(dashBoardPage.usersRole);
        selectRole.selectByValue("ADMIN");
        dashBoardPage.usersDownload.click();
        ReusableMethods.bekle(2);
    }

    @Then("Users Admin Download dogrulamasi yapilir")
    public void usersAdminDownloadDogrulamasiYapilir() {
        try {
            assert !dashBoardPage.errorMessage.isDisplayed() : "USERS ADMIN RAPOR ALINAMADI, FULL AUTHENTICATION HATASI!!!";
            // If AssertionError doesn't occur, continue with the test steps here
            ReusableMethods.bekle(1);
            // Additional test steps...
            // Close the driver after completing the test
            Driver.closeDriver();
        } catch (AssertionError e) {
            // If AssertionError occurs (assertion fails), handle it here
            System.out.println("USERS ADMIN RAPOR ALINAMADI, FULL AUTHENTICATION HATASI!!! " + e.getMessage());
            // Close the driver
            Driver.closeDriver();
            // Throw the caught AssertionError again to mark the test as failed but continue with subsequent steps
            throw e;
        }
    }

    @When("Tour Requests kismindaki secimler yapilir ve raporlama butonuna tiklanir")
    public void tourRequestsKismindakiSecimlerYapilirVeRaporlamaButonunaTiklanir() {
        dashBoardPage.tourStartDate.sendKeys("01042024");
        dashBoardPage.tourEndDate.sendKeys("18042024");
        dashBoardPage.tourStatus.sendKeys("Approved");
        //Dosya daha önce indirilmişse silinir
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\filtered-tour-requests.xlsx";
        try {
            Files.delete(Paths.get(dosyaYolu));
        } catch (IOException e) {
            System.err.println("Dosya Silinemedi!");
        }
        dashBoardPage.tourDownload.click();
        //Robot class ı ile download keep e tiklanir
        ReusableMethods.robotDownloadKeep();
    }

    @Then("Tour Request Download dogrulamasi yapilir")
    public void tourRequestDownloadDogrulamasiYapilir() {
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\filtered-tour-requests.xlsx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }

    @And("Sayfa kapanir")
    public void sayfaKapanir() {
        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

    @When("Adverts kisminda yalniz Category kismi bos birakilarak raporlama butonuna tiklanır")
    public void advertsKismindaYalnizCategoryKismiBosBirakilarakRaporlamaButonunaTiklanır() {
        dashBoardPage.advertsStartDate.sendKeys("01042024");
        dashBoardPage.advertsEndDate.sendKeys("18042024");
        dashBoardPage.advertsCategory.sendKeys("All");
        dashBoardPage.advertsType.sendKeys("Rent");
        dashBoardPage.advertsStatus.sendKeys("Activated");
        dashBoardPage.advertsDownload.click();
        ReusableMethods.bekle(1);
    }

    @Then("Adverts bos Catergory ile No Download dogrulamasi yapilir")
    public void advertsBosCatergoryIleNoDownloadDogrulamasiYapilir() {
        Assert.assertTrue(dashBoardPage.errorMessage.isDisplayed());
    }

    @When("Adverts kisminda yalniz Advert Type kismi bos birakilarak raporlama butonuna tiklanır")
    public void advertsKismindaYalnizAdvertTypeKismiBosBirakilarakRaporlamaButonunaTiklanır() {
        dashBoardPage.advertsStartDate.sendKeys("01042024");
        dashBoardPage.advertsEndDate.sendKeys("18042024");
        Select selectCategory = new Select(dashBoardPage.advertsCategory);
        selectCategory.selectByIndex(1);
        dashBoardPage.advertsType.sendKeys("All");
        dashBoardPage.advertsStatus.sendKeys("Activated");
        dashBoardPage.advertsDownload.click();
        ReusableMethods.bekle(1);
    }

    @Then("Adverts bos Advert Type ile No Download dogrulamasi yapilir")
    public void advertsBosAdvertTypeIleNoDownloadDogrulamasiYapilir() {
        Assert.assertTrue(dashBoardPage.errorMessage.isDisplayed());
    }

    @When("Most Popular Properties kismindaki Amount a negatif deger girilir ve raporlama butonuna tiklanir")
    public void mostPopularPropertiesKismindakiAmountANegatifDegerGirilirVeRaporlamaButonunaTiklanir() {
        dashBoardPage.popularAmount.click();
        dashBoardPage.popularAmount.sendKeys(Keys.BACK_SPACE, "-2");
        dashBoardPage.popularDownload.click();
    }

    @Then("Most Popular No Download dogrulamasi yapilir")
    public void mostPopularNoDownloadDogrulamasiYapilir() {
        Assert.assertEquals("Amount must be a positive number", dashBoardPage.amountMessage.getText());
    }

    @When("Tour Request kisminda yalniz Status kismi bos birakilarak raporlama butonuna tiklanır")
    public void tourRequestKismindaYalnizStatusKismiBosBirakilarakRaporlamaButonunaTiklanır() {
        dashBoardPage.tourStartDate.sendKeys("01042024");
        dashBoardPage.tourEndDate.sendKeys("18042024");
        dashBoardPage.tourStatus.sendKeys("All");
        dashBoardPage.tourDownload.click();
        ReusableMethods.bekle(1);
    }

    @Then("Tour Request bos Status ile No Download dogrulamasi yapilir")
    public void tourRequestBosStatusIleNoDownloadDogrulamasiYapilir() {
        Assert.assertTrue(dashBoardPage.errorMessage.isDisplayed());
    }


}