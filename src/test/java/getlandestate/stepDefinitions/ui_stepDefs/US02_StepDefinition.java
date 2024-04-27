/*package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US02_StepDefinition {
    Login_RegisterPage customer= new Login_RegisterPage();


    @Given("Web sitesine gidilir")
    public void webSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));
    }
    @And("Profile tıklanır")
    public void profileTıklanır() {
        customer.profileLogAA.click();
    }
    @And("Logout tiklanir")
    public void logoutTiklanir() {
        customer.logoutAA.submit();
    }

    @When("Login linkini tiklar")
    public void loginLinkiniTiklar() {
        customer.loginButtonMT.click();
    }

    @And("Email gecerli bilgi girilir")
    public void emailGecerliBilgiGirilir() {
        customer.loginEmail.sendKeys(ConfigReader.getProperty("emailAyse"));
    }

    @And("Enter password geçerli bilgi girilir")
    public void enterPasswordGeçerliBilgiGirilir() {
        customer.loginPassword.sendKeys(ConfigReader.getProperty("passwordAyse"));
    }

    @And("LOGIN butonu tiklanir")
    public void logınButonuTiklanir() {
        ReusableMethods.click(customer.loginButtonAA);
    }

    @Then("Customer olarak sayfaya giris yapildigi test edilir")
    public void customerOlarakSayfayaGirisYapildigiTestEdilir() {
        customer.profileLogAA.click();
        Assert.assertTrue(customer.logoutAA.isDisplayed());
    }

    @And("Emaila gecerli olmayan bilgi girilir")
    public void emailaGecerliOlmayanBilgiGirilir() {
        customer.loginEmailAA.sendKeys(ConfigReader.getProperty("gecerliolmayanEmail1"));
    }

   /* @And("Enter password gecerli bilgi girilir")
    public void enterPasswordGecerliBilgiGirilir() {
        customer.loginPasswordAA.sendKeys(ConfigReader.getProperty("passwordAyse"));
    }

    @Then("Customera olarak sayfaya giris yapilamadigi test edilir")
    public void customeraOlarakSayfayaGirisYapilamadigiTestEdilir() {
        String fail=customer.invalidEmailAA.getText();
        Assert.assertEquals("Invalid email",fail);
    }
    @And("Emailb gecerli olmayan bilgi girilir")
    public void emailbGecerliOlmayanBilgiGirilir() {
        customer.loginEmailAA.sendKeys(ConfigReader.getProperty("gecerliolmayanemail2"));
    }
    @Then("Customerb olarak sayfaya giris yapilamadigi test edilir")
    public void customerbOlarakSayfayaGirisYapilamadigiTestEdilir() {
        String fail1=customer.invalidEmailorPasswordAA.getText();

        Assert.assertTrue(fail1.contains("Invalid email or password. Please check your credentials and try again."));

    }

   @And("Enter password alani bos birakilir")
    public void enterPasswordAlaniBosBirakilir() {
        customer.loginPasswordAA.click();

    }
    @Then("Customerc olarak sayfaya giris yapilamadigi test edilir")
    public void customercOlarakSayfayaGirisYapilamadigiTestEdilir() {
        String fail2=customer.passwordIsRequiredAA.getText();
        Assert.assertEquals("Password is required",fail2);
    }

    @And("Email alani bos birakilir")
    public void emailAlaniBosBirakilir() {
        customer.loginEmailAA.clear();
    }


    @And("Enter password alanı bos birakilir")
    public void enterPasswordAlanıBosBirakilir() {
        customer.loginPasswordAA.clear();
    }
    @Then("Customerd olarak sayfaya giris yapilamadigi test edilir")
    public void customerdOlarakSayfayaGirisYapilamadigiTestEdilir() {
        String fail2=customer.passwordIsRequiredAA.getText();
        Assert.assertEquals("Password is required",fail2);

       String fail3=customer.emailIsRequiredAA.getText();
       Assert.assertEquals("Email is required",fail3);

    }

    /*
     And Profile tıklanır
    And Logout tiklanir
    }

     */

