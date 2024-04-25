package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import io.cucumber.java.en.*;

public class US19_ContactMessage {
    Login_RegisterPage loginRegisterPage=new Login_RegisterPage();
    @Given("Kullanici {string} sayfasina gidebilmeli")
    public void kullaniciSayfasinaGidebilmeli(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));

    }

    @When("login butonuna tiklayabilmeli")
    public void loginButonunaTiklayabilmeli() {
    }

    @And("email ve password bilgileri ile login olabilmeli")
    public void emailVePasswordBilgileriIleLoginOlabilmeli() {
    }

    @And("üst menüden Contact tıklanır")
    public void üstMenüdenContactTıklanır() {
    }

    @Then("Açılan sayfada Have a question? yazısının görüldüğü test edilir")
    public void açılanSayfadaHaveAQuestionYazısınınGörüldüğüTestEdilir() {
    }

    @And("First Name  girilir")
    public void firstNameGirilir() {
    }

    @And("Last Name girilir")
    public void lastNameGirilir() {
    }

    @And("Email Addres girilir")
    public void emailAddresGirilir() {
    }

    @And("Messsage girilir")
    public void messsageGirilir() {
    }

    @But("captcha geçilir")
    public void captchaGeçilir() {
    }
}
