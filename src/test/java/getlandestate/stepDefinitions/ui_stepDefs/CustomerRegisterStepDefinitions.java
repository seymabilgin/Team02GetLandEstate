package getlandestate.stepDefinitions.ui_stepDefs;


import com.github.javafaker.Faker;
import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import getlandestate.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CustomerRegisterStepDefinitions {
    Login_RegisterPage registerPage =new Login_RegisterPage();
    Faker faker=new Faker();
    @Given("Ansayfaya gidilir.")
    public void ansayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandestateUrl"));

    }
    @When("Register  butonuna tıklanır.")
    public void registerButonunaTıklanır() {
        registerPage.registerButton.click();

    }
    @When("First Name kısmı bos bırakılır.")
    public void firstNameKısmıBosBırakılır() {
        registerPage.registerFirstName.click();
    }

    @When("Last Name kısmına gecerli bir lastName girilir.")
    public void lastNameKısmınaGecerliBirLastNameGirilir() {

        registerPage.registerLastName.sendKeys(ConfigReader.getProperty("lastName"));

    }

    @And("Phone Number kısmına geçerli bir phone number girilir.")
    public void phoneNumberKısmınaGeçerliBirPhoneNumberGirilir() {
        registerPage.registerPhone.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @And("Email kısmına geçerli bir email girilir.")
    public void emailKısmınaGeçerliBirEmailGirilir() {
        registerPage.registerEmailBox.sendKeys(faker.internet().emailAddress());

    }

    @And("Enter Password kısmına geçerli password girilir.")
    public void enterPasswordKısmınaGeçerliPasswordGirilir() {
        registerPage.registerEnterPassword.sendKeys(ConfigReader.getProperty("enterPassword"));

    }

    @And("Confirm Password kısmına password tekrar girilir.")
    public void confirmPasswordKısmınaPasswordTekrarGirilir() {
        registerPage.registerConfirmPassword.sendKeys(ConfigReader.getProperty("enterPassword"));
    }

    @And("I understand and agree to GetLandEstate' Terms of Use and Privacy Policy kutucugu tıklanır.")
    public void ıUnderstandAndAgreeToGetLandEstateTermsOfUseAndPrivacyPolicyKutucuguTıklanır() {
        registerPage.registerCheckbox.click();
    }

    @And("REGISTER  butonuna tıklanır.")
    public void regısterButonunaTıklanır() {
        ReusableMethods.click(registerPage.registerButton);
    }

    @Then("First Name bos bırakıldıgında First name is required uyarı metni cıktıgı dogrulanır.")
    public void firstNameBosBırakıldıgındaFirstNameIsRequiredUyarıMetniCıktıgıDogrulanır() {
        Assert.assertEquals("First name is required",registerPage.firstNameIsRequiresText.getText());
    }


    @And("sayfayi kapatir.")
    public void sayfayiKapatir() {
        Driver.closeDriver();

    }


    @But("kullanıcı {int} saniye bekler.")
    public void kullanıcıSaniyeBekler(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }







}



