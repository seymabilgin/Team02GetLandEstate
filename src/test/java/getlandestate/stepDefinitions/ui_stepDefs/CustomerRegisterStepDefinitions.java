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

    @When("First Name kısmına gecerli bir isim girilir.")
    public void firstNameKısmınaGecerliBirIsimGirilir() {
        registerPage.registerFirstName.sendKeys(faker.name().firstName());
    }

    @And("Last Name kısmmı bos bırakılır.")
    public void lastNameKısmmıBosBırakılır() {
        registerPage.registerLastName.click();
    }

    @Then("Last Name bos bırakıldıgında Last name is required uyarı metni cıktıgı dogrulanır.")
    public void lastNameBosBırakıldıgındaLastNameIsRequiredUyarıMetniCıktıgıDogrulanır() {
        Assert.assertEquals("Invalid phone number", registerPage.lastNameIsRequiredText.getText());
    }

    @And("Phone Number kısmı bos bırakılır.")
    public void phoneNumberKısmıBosBırakılır() {
        registerPage.registerPhone.click();
        registerPage.registerEmailBox.click();
    }

    @Then("Phone Number kısmı bos bırakıldıgında Invalid phone number uyarı metni cıktıgı dogrulanır.")
    public void phoneNumberKısmıBosBırakıldıgındaInvalidPhoneNumberUyarıMetniCıktıgıDogrulanır() {
        Assert.assertEquals("Invalid phone number", registerPage.invalidPhoneNumberText.getText());
    }

    @And("Email kısmı bos bırakılır.")
    public void emailKısmıBosBırakılır() {
        registerPage.registerEmailBox.click();
        registerPage.registerEnterPassword.click();
    }

    @Then("Email kısmı bos bırakıldıgında Email is required uyarı metni cıktıgı dogrulanır.")
    public void emailKısmıBosBırakıldıgındaEmailIsRequiredUyarıMetniCıktıgıDogrulanır() {
        Assert.assertTrue(registerPage.emailIsRequiredText.getText().contains("Email is required"));
    }


    @When("Email kısmına @ ve . olmadan mail yazılır.")
    public void emailKısmınaVeOlmadanMailYazılır() {
        registerPage.registerEmailBox.sendKeys(ConfigReader.getProperty("invalidMail01"));
        registerPage.registerEnterPassword.click();
    }

    @Then("Email kısmına gecersiz formatda email yazıldıgında Invalid email uyarı  metni cıktıgı dogrulanır.")
    public void emailKısmınaGecersizFormatdaEmailYazıldıgındaInvalidEmailUyarıMetniCıktıgıDogrulanır() {
        Assert.assertEquals("Invalid email", registerPage.invalidEmail.getText());
    }

    @When("Email kısmına . olmadan mail yazılır.")
    public void emailKısmınaOlmadanMailYazılır() {
        registerPage.registerEmailBox.sendKeys(ConfigReader.getProperty("invalidMail02"));
        registerPage.registerEnterPassword.click();
    }

    @When("Enter Password kısmı bos bırakılır.")
    public void enterPasswordKısmıBosBırakılır() {
        registerPage.registerEnterPassword.click();
        registerPage.registerConfirmPassword.click();
    }

    @Then("Enter Password kısmı bos bırakıldıgında  Password is required uyarı metni cıktıgı dogrulanır.")
    public void enterPasswordKısmıBosBırakıldıgındaPasswordIsRequiredUyarıMetniCıktıgıDogrulanır() {
        Assert.assertEquals("Password is required", registerPage.passwordIsRequired.getText());
    }


    @When("Enter Password kısmına {int} karakterden az karakter girilir.")
    public void enterPasswordKısmınaKarakterdenAzKarakterGirilir(int num) {
        registerPage.registerEnterPassword.sendKeys(ConfigReader.getProperty("invalidPasswordAtLast8Characters"));
        registerPage.registerConfirmPassword.click();
    }

    @Then("At least {int} characters uyarı metni cıktıgı dogrulanır.")
    public void atLeastCharactersUyarıMetniCıktıgıDogrulanır(int num) {
        Assert.assertTrue(registerPage.atLast8Characters.getText().contains("At least 8 characters"));
    }

    @When("Enter Password kısmına  büyük harf kullanmadan  karakter girilir")
    public void enterPasswordKısmınaBüyükHarfKullanmadanKarakterGirilir() {
        registerPage.registerEnterPassword.sendKeys(ConfigReader.getProperty("invalidPasswordOneUpperCaseChar"));
        registerPage.registerConfirmPassword.click();
    }

    @Then("One uppercase char uyarı metni cıktıgı dogrulanır.")
    public void oneUppercaseCharUyarıMetniCıktıgıDogrulanır() {
        Assert.assertEquals("One uppercase char", registerPage.oneUpperCaseChar.getText());
    }

    @When("Enter Password kısmına  kucuk harf kullanmadan  karakter girilir")
    public void enterPasswordKısmınaKucukHarfKullanmadanKarakterGirilir() {
        registerPage.registerEnterPassword.sendKeys(ConfigReader.getProperty("invalidPasswordOneLowerCaseChar"));
        registerPage.registerConfirmPassword.click();
    }
    @Then("One lowercase char uyarı metni cıktıgı dogrulanır.")
    public void oneLowercaseCharUyarıMetniCıktıgıDogrulanır() {
        Assert.assertTrue(registerPage.oneLowerCaseChar.getText().contains("One lowercase char"));
    }

    @When("Enter Password kısmına rakam kullanmadan  karakter girilir")
    public void enterPasswordKısmınaRakamKullanmadanKarakterGirilir() {
        registerPage.registerEnterPassword.sendKeys(ConfigReader.getProperty("invalidPasswordOneNumber"));
        registerPage.registerConfirmPassword.click();
    }

    @Then("One  number uyarı metni cıktıgı dogrulanır.")
    public void oneNumberUyarıMetniCıktıgıDogrulanır() {
        Assert.assertEquals("One number", registerPage.oneNumber.getText());
    }

    @When("Enter Password kısmına özel karakter kullanmadan  karakter girilir")
    public void enterPasswordKısmınaÖzelKarakterKullanmadanKarakterGirilir() {
        registerPage.registerEnterPassword.sendKeys(ConfigReader.getProperty("invalidPasswordOneSpecialCharacter"));
        registerPage.registerConfirmPassword.click();
    }

    @Then("One special character uyarı metni cıktıgı dogrulanır.")
    public void oneSpecialCharacterUyarıMetniCıktıgıDogrulanır() {
        Assert.assertTrue(registerPage.oneSpecialCharacter.getText().contains("One special character"));
    }

    @When("Confirm Password kısmı bos bırakılır.")
    public void confirmPasswordKısmıBosBırakılır() {
        registerPage.registerConfirmPassword.click();
        registerPage.registerCheckbox.click();
    }


    @Then("Confirm Password kısmı bos bırakıldıgında Confirm password is required uyarı metni cıktıgı dogrulanır.")
    public void confirmPasswordKısmıBosBırakıldıgındaConfirmPasswordIsRequiredUyarıMetniCıktıgıDogrulanır() {
        Assert.assertEquals("Confirm password is required", registerPage.confirmPasswordIsRequire.getText());
    }


    @When("I understand and agree to GetLandEstate' Terms of Use and Privacy Policy kutucugu bos bırakılır.")
    public void ıUnderstandAndAgreeToGetLandEstateTermsOfUseAndPrivacyPolicyKutucuguBosBırakılır() {
        registerPage.registerFirstName.sendKeys(faker.name().firstName());
        registerPage.registerLastName.sendKeys(faker.name().lastName());
        registerPage.registerPhone.click();
        registerPage.registerPhone.sendKeys(ConfigReader.getProperty("phoneNumber"));
        registerPage.registerEmailBox.sendKeys(faker.internet().emailAddress());
        registerPage.registerEnterPassword.sendKeys(ConfigReader.getProperty("enterPassword"));
        registerPage.registerConfirmPassword.sendKeys(ConfigReader.getProperty("enterPassword"));
    }

    @Then("I understand and agree to PrettierHomes' Terms of Use and Privacy Policy checkbox tıklanmadan Register butonu tıklanabilir olmadıgı dogrulanır.")
    public void ıUnderstandAndAgreeToPrettierHomesTermsOfUseAndPrivacyPolicyCheckboxTıklanmadanRegisterButonuTıklanabilirOlmadıgıDogrulanır() {
        Assert.assertFalse(registerPage.registerButton.isSelected());
    }


    @Then("Success yazısının görüldügü dogrulanır.")
    public void successYazısınınGörüldügüDogrulanır(){


    }





}



