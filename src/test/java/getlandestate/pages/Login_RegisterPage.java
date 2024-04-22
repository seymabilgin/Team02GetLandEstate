package getlandestate.pages;

import getlandestate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//#!!! Kendi alanımızda calısırken enter a bastıgımızda bir sonrakı kısının satırını kontrol edelim !!!
public class
Login_RegisterPage {
    public Login_RegisterPage() {PageFactory.initElements(Driver.getDriver(),this);
    }

//15-115 M.FURKAN KARAIS



































































































//115-225 MEHMET TURAN
@FindBy(xpath = "//a[text()='Login']") public WebElement loginButton;
@FindBy(xpath = "//input[@placeholder='Email']") public WebElement emailBox;











































































































//225-325 SEYMA BILGIN

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerEnterButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement registerFirstName;

   @FindBy(xpath = "//input[@name='lastName']")
   public WebElement registerLastName;

   @FindBy(xpath = "//input[@name='phone']")
    public WebElement registerPhone;

    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement registerEmailBox;
    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement registerEnterPassword;
    @FindBy(xpath = "//input[@name=\"confirmPassword\"]")
    public WebElement registerConfirmPassword;
    @FindBy(css = "#terms")
    public WebElement registerCheckbox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerButton;
    @FindBy(xpath = " //div[.='First name is required' and @class='form-feedback invalid-feedback']")
    public WebElement firstNameIsRequiresText;










































































 //325-425 SEVILAY UYANIK



































































































//425-525 HANIFE OZTURK



































































































//525-625 AYSEGUL ARIK
    @FindBy(xpath = "//a[@href='/login']") public WebElement login;
    @FindBy(xpath = "//input[@name='email']") public WebElement loginEmail;
    @FindBy(xpath = "//input[@name='password']") public WebElement loginPassword;
    @FindBy(xpath = "//button[@type='submit']")  public WebElement loginButton;































































































//625-725 FEYZI TUGCU



































































































//725-825 ORHAN TANER



































































































//825-925 ILKNUR TUCCAR



































































































//925-1025 TUNCER OZGUR



































































































//1025-... YAKUP IBRAHIMBAS





}
