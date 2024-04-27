package getlandestate.stepDefinitions.ui_stepDefs.US18_19;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US_19_contactMessage {
    Actions actions=new Actions(Driver.getDriver());
    Login_RegisterPage registerPage=new Login_RegisterPage();
    @Given("Kullanici sayfasina gidebilmelie")
    public void kullaniciSayfasinaGidebilmelie() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));

    }

    @When("login butonuna tiklayabilmeli")
    public void loginButonunaTiklayabilmeli() {
        registerPage.loginButtonMT.click();
    }

    @And("email ve password bilgileri ile login olabilmeli")
    public void emailVePasswordBilgileriIleLoginOlabilmeli() {
        registerPage.loginEmail.sendKeys(ConfigReader.getProperty("email2"));
        registerPage.loginPassword.sendKeys(ConfigReader.getProperty("password"));
        registerPage.registerButton.click();
        ReusableMethods.bekle(5);
    }

    @And("üst menüden Contact tıklanır")
    public void üstMenüdenContactTıklanır() {
        actions.doubleClick(registerPage.contactButton).perform();
        ReusableMethods.bekle(3);
    }

    @Then("Açılan sayfada Have a question? yazısının görüldüğü test edilir")
    public void açılanSayfadaHaveAQuestionYazısınınGörüldüğüTestEdilir() {
        Assert.assertTrue(registerPage.verifyQuestion.getText().contains("Have a question?"));

    }

    @And("First Name  girilir")
    public void firstNameGirilir() {
        ReusableMethods.bekle(5);
        registerPage.firstNameContact.sendKeys("virgilio");
    }

    @And("Last Name girilir")
    public void lastNameGirilir() {
        registerPage.registerLastName.sendKeys("bohan");

    }

    @And("Email Addres girilir")
    public void emailAddresGirilir() {
        registerPage.emailBox.sendKeys("virgilio.bohan@foodfarms.net");

    }

    @And("Messsage girilir")
    public void messsageGirilir() {
        registerPage.messageBox.sendKeys("hello world!");

    }

    @But("captcha geçilir")
    public void captchaGeçilir() {

        ReusableMethods.visibleWait(registerPage.notRobotIframe,3);
        Driver.getDriver().switchTo().frame(1);
        registerPage.capctha.click();
        ReusableMethods.bekle(3);
        Driver.getDriver().switchTo().defaultContent();
    }

    @Given("kullanici sayfaya giderr")
    public void kullaniciSayfayaGiderr() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));

    }

    @And("Contact yazısına tıklanır")
    public void contactYazısınaTıklanır() {
        registerPage.contactButton.click();

    }

    @And("First Name  girilir\\(a)")
    public void firstNameGirilirA() {
        registerPage.firstNameContact.sendKeys("a");

    }

    @And("Last Name girilir\\(bohem)")
    public void lastNameGirilirBohem() {
        ReusableMethods.bekle(5);
        registerPage.registerLastName.sendKeys("bohan",Keys.TAB,
                "virgilio.bohan@foodfarms.net", Keys.TAB,"Hello World!");
    }

    @And("email kısmına bir deger girer")
    public void emailKısmınaBirDegerGirer() {
    }

    @And("mesaj kısmına bir deger girer")
    public void mesajKısmınaBirDegerGirer() {
    }



    @And("sent butonun aktif oldugunu dogrular")
    public void sentButonunAktifOldugunuDogrular() {
    }

    @And("First Name  girilir\\(virgilio)")
    public void firstNameGirilirVirgilio() {
        registerPage.firstNameContact.sendKeys("virgilio");

    }

    @And("Last Name girilir\\(a)")
    public void lastNameGirilirA() {
        ReusableMethods.bekle(5);
        registerPage.registerLastName.sendKeys("a",Keys.TAB,
                "virgilio.bohan@foodfarms.net",Keys.TAB,"Hello World!");

    }

 //   @And("sayfayı kapatır")
 //   public void sayfayıKapatır() {
 //       Driver.getDriver().close();
 //   }
//

    @And("email kısmına bir deger girerrr\\(abc@abccom)")
    public void emailKısmınaBirDegerGirerrrAbcAbccom() {
        registerPage.emailBox.sendKeys("abc@abccom");    }

    @And("Last Name girilirrrr\\(bohem)")
    public void lastNameGirilirrrrBohem() {

    }



    @And("sent tıklanır")
    public void sentTıklanır() {

        registerPage.SentButton.click();
    }


    @Then("succes mesaji goruntulendigi dogrulanmalır")
    public void mesajiGoruntulendigiDogrulanmalır() {
        // Alert alert=registerPage.
        String succesText= ReusableMethods.alertGetTextJS(registerPage.succesText);
        Assert.assertTrue(succesText.contains("Success"));

    }
}

