package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US19_StepDefinitions {
    Actions actions=new Actions(Driver.getDriver());
    Login_RegisterPage registerPage =new Login_RegisterPage();

    @Given("Kullanici sayfasina gidebilmeli")
    public void kullaniciSayfasinaGidebilmeli() {
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
        //actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
        //ReusableMethods.click(registerPage.contactButton);

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
                "virgilio.bohan@foodfarms.net",Keys.TAB,"Hello World!");

    }
    @And("email kısmına bir deger girer")
    public void emailKısmınaBirDegerGirer() {

    }

    @And("mesaj kısmına bir deger girer")
    public void mesajKısmınaBirDegerGirer() {
    }

    @And("im not a robot checkbox'ını işaretler")
    public void imNotARobotCheckboxInıIşaretler() {
        // ReusableMethods.click(registerPage.capctha);
    }

    @And("sent butonun aktif oldugunu dogrular")
    public void sentButonunAktifOldugunuDogrular() {
    }

    //US19_TC03
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
    // @US19_TC04
    @And("email kısmına bir deger girerrr\\(abc@abccom)")
    public void emailKısmınaBirDegerGirerAbcAbccom() {
        registerPage.emailBox.sendKeys("abc@abccom");    }

    @And("sayfayı kapatır")
    public void sayfayıKapatır() {
        Driver.closeDriver();
    }

    @And("Last Name girilirrrr\\(bohem)")
    public void lastNameGirilirrrrBohem() {
        ReusableMethods.bekle(5);
        registerPage.registerLastName.sendKeys("a",Keys.TAB,
                "virgilio.bohan@foodfarms.net",Keys.TAB,"Hello World!",Keys.TAB,Keys.ENTER);

    }
}
