package getlandestate.stepDefinitions.ui_stepDefs;

import getlandestate.pages.Login_RegisterPage;
import getlandestate.utilities.ConfigReader;
import getlandestate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US03_StepDefinition {
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

    @When("Login linkini tıklar")
    public void loginLinkiniTıklar() {
        customer.loginAA.click();
    }

    @And("Email geçerli bilgi girilir")
    public void emailGeçerliBilgiGirilir() {
        customer.loginEmailAA.sendKeys(ConfigReader.getProperty("emailAyse"));
    }

    @And("Enter password gecerli bilgi girilir")
    public void enterPasswordGecerliBilgiGirilir() {
        customer.loginPasswordAA.sendKeys(ConfigReader.getProperty("passwordAyse"));
    }

    @And("LOGIN butonu tıklanır")
    public void logınButonuTıklanır() {
        customer.loginButtonAA.submit();
    }

    @And("Profil tıklanır")
    public void profilTıklanır() {
        customer.profileLogAA.click();
    }

    @And("My Profile tıklanır")
    public void myProfileTıklanır() {
        customer.myProfileAA.click();
    }

    @And("İsmini Aysegul olarak değiştirir")
    public void isminiAysegulOlarakDeğiştirir() {
        customer.firstNameAA.clear();
        customer.firstNameAA.sendKeys(ConfigReader.getProperty("firstNameAyse"));
    }

    @And("Soyismini Gull olarak değiştirir")
    public void soyisminiGullOlarakDeğiştirir() {
        customer.lastNameAA.clear();
        customer.lastNameAA.sendKeys(ConfigReader.getProperty("lastNameAyse"));
    }

    @And("Telefon numarasını {int} olarak değiştirir")
    public void telefonNumarasınıOlarakDeğiştirir(int arg0) {
        customer.phoneAA.clear();
        customer.phoneAA.sendKeys(ConfigReader.getProperty("phoneAyse"));
    }

    @And("Email adresini aysegul@gul.com olarak değiştirir")
    public void emailAdresiniAysegulGulComOlarakDeğiştirir() {
        customer.emailAA.clear();
        customer.emailAA.sendKeys(ConfigReader.getProperty("emailYeniAyse"));
    }

    @And("Update butonu tıklanır")
    public void updateButonuTıklanır() {
        customer.updateButtonAA.submit();
    }

    @Then("Customer olarak profil bilgilerini değiştirdiği test edilir")
    public void customerOlarakProfilBilgileriniDeğiştirdiğiTestEdilir() {
        String message=customer.updateProfileAA.getText();
        Assert.assertEquals("Profile updated successfully",message);
    }
    @And("Yeni email geçerli bilgi girilir")
    public void yeniEmailGeçerliBilgiGirilir() {
        customer.loginEmailAA.sendKeys(ConfigReader.getProperty("emailYeniAyse"));
    }
    @And("Chance Password tıklanır")
    public void chancePasswordTıklanır() {
        customer.changePasswordAA.click();
    }

    @And("Current Pasword kısmına mevcut şifre girilir")
    public void currentPaswordKısmınaMevcutŞifreGirilir() {
        customer.currentPasswordAA.click();
        customer.currentPasswordAA.sendKeys(ConfigReader.getProperty("passwordAyse"));
    }

    @And("New Password kısmına yeni şifre girilir")
    public void newPasswordKısmınaYeniŞifreGirilir() {
        customer.newPasswordAA.click();
        customer.newPasswordAA.sendKeys(ConfigReader.getProperty("passwordYeniAyse"));
    }

    @And("Confirm Password kısmına yeni şifre tekrar girilir")
    public void confirmPasswordKısmınaYeniŞifreTekrarGirilir() {
        customer.repeatNewPasswordAA.click();
        customer.repeatNewPasswordAA.sendKeys(ConfigReader.getProperty("passwordYeniAyse"));
    }

    @And("Change butonu tıklanır")
    public void changeButonuTıklanır() {
        customer.changeButtonAA.submit();
    }

    @Then("Customer olarak password bilgilerini değiştirdiği test edilir")
    public void customerOlarakPasswordBilgileriniDeğiştirdiğiTestEdilir() {
        Assert.assertTrue(customer.getLandEstateAccountAA.isDisplayed());
    }
    @And("Yeni Enter password gecerli bilgi girilir")
    public void yeniEnterPasswordGecerliBilgiGirilir() {
        customer.loginPasswordAA.sendKeys(ConfigReader.getProperty("passwordYeniAyse"));
    }

    @And("Profile Photo tıklanır")
    public void profilePhotoTıklanır() {
        customer.profilePhotoButtonAA.click();
    }

    @And("Select tıklanır")
    public void selectTıklanır() {
        customer.selectButtonAA.click();
    }

    @And("Photograf seçilir")
    public void photografSeçilir() {
    }

    @And("Done butonu tıklanır")
    public void doneButonuTıklanır() {
        customer.doneButtonAA.click();
    }

    @And("Save butonu tıklanır")
    public void saveButonuTıklanır() {
        customer.saveButtonAA.click();
    }

    @Then("Customer olarak profil resmi eklenebildiği test edilir")
    public void customerOlarakProfilResmiEklenebildiğiTestEdilir() {
      String message=customer.updatedPhotoMessageAA.getText();
      Assert.assertTrue(message.contains("You have updated your profile photo"));
    }

    @And("Delete Account tıklanır")
    public void deleteAccountTıklanır() {
        customer.deleteAccountButtonAA.click();
    }

    @And("Enter your password password bilgileri girilir")
    public void enterYourPasswordPaswordBilgileriGirilir() {
      customer.deleteEmailButtonAA.sendKeys(ConfigReader.getProperty("passwordYeniAyse"));
    }

    @And("Delete Account butonu tıklanır")
    public void deleteAccountButonuTıklanır() {
        customer.accountDeleteAA.click();
    }

    @And("Yes butonu tıklanır")
    public void yesButonuTıklanır() {
        customer.yesButtonAA.click();
    }

    @Then("Customer olarak hesabını silebildiği test edilir")
    public void customerOlarakHesabınıSilebildiğiTestEdilir() {
        String deleteMassage=customer.accountDeleteMessageAA.getText();
        Assert.assertTrue(deleteMassage.contains("Account deleted successfully"));
    }



}
