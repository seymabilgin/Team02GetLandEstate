package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.Login_RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US02_StepDefinition {
    Login_RegisterPage customer= new Login_RegisterPage();


    @Given("Web sitesine gidilir")
    public void webSitesineGidilir() {
    }

    @When("Login linkini tiklar")
    public void loginLinkiniTiklar() {
    }

    @And("Email gecerli bilgi girilir")
    public void emailGecerliBilgiGirilir() {
    }

    @And("Enter password geçerli bilgi girilir")
    public void enterPasswordGeçerliBilgiGirilir() {
    }

    @And("LOGIN butonu tiklanir")
    public void logınButonuTiklanir() {
    }

    @Then("Customer olarak sayfaya giris yapildigi test edilir")
    public void customerOlarakSayfayaGirisYapildigiTestEdilir() {
    }

    @And("Email gecerli olmayan bilgi girilir")
    public void emailGecerliOlmayanBilgiGirilir() {
    }

    @And("Enter password gecerli bilgi girilir")
    public void enterPasswordGecerliBilgiGirilir() {
    }

    @Then("Customer olarak sayfaya giris yapilamadigi test edilir")
    public void customerOlarakSayfayaGirisYapilamadigiTestEdilir() {
    }

    @And("Enter password alani bos birakilir")
    public void enterPasswordAlaniBosBirakilir() {
    }

    @And("Email alani bos birakilir")
    public void emailAlaniBosBirakilir() {
    }

    @And("Enter password alanı bos birakilir")
    public void enterPasswordAlanıBosBirakilir() {
    }
}
