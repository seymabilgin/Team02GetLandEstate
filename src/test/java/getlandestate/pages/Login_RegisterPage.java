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
@FindBy(xpath = "//a[text()='Login']") public WebElement loginButtonMT;
@FindBy(xpath = "//input[@placeholder='Email']") public WebElement emailBoxMT;











































































































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
    @FindBy(xpath = "//*[contains(text(),'Last name is required')]")
    public WebElement lastNameIsRequiredText;
    @FindBy(xpath = "//*[contains(text(),'Invalid phone number')]")
    public WebElement invalidPhoneNumberText;
    @FindBy(xpath = "//*[contains(text(),'Email is required')]")
    public WebElement emailIsRequiredText;
    @FindBy(xpath = "//*[contains(text(),'Invalid email')]")
    public WebElement invalidEmail;
    @FindBy(xpath = "//*[contains(text(),'Password is required')]")
    public WebElement passwordIsRequired;
    @FindBy(xpath = "//*[contains(text(),'At least 8 characters')]")
    public WebElement atLast8Characters;
    @FindBy(xpath = "//*[contains(text(),'One uppercase char')]")
    public WebElement oneUpperCaseChar;
    @FindBy(xpath = "//*[contains(text(),'One lowercase char')]")
    public WebElement oneLowerCaseChar;
    @FindBy(xpath = "//*[contains(text(),'One number')]")
    public WebElement oneNumber;
    @FindBy(xpath = "//*[contains(text(),'One special character')]")
    public WebElement oneSpecialCharacter;
    @FindBy(xpath = "//*[contains(text(),'Confirm password is required')]")
    public WebElement confirmPasswordIsRequire;
    @FindBy(xpath = "//span[@class='p-toast-summary']")
    public WebElement successPopUp;
    @FindBy(xpath = "//div[@class='p-toast-detail']")
    public WebElement popUpText;





















































    //325-425 SEVILAY UYANIK

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement homeLogin;
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@class='submit-button btn btn-secondary']")
    public WebElement login;
    @FindBy(xpath = "//a[@title='Tour Requests']")
    public WebElement tourRequests;
    @FindBy(xpath = "//input[@name='search']")
    public WebElement ilanSearch;
    @FindBy(xpath = "//button[@class='search-button btn btn-outline-secondary']")
    public WebElement searchButton;
    @FindBy(xpath = "(//div[@class='text'])[1]")
    public WebElement searchResult;
    @FindBy(xpath = "(//img[@class='user-pic'])[1]")
    public WebElement userPicture;
    @FindBy(xpath = "//p[text()='MY RESPONSES']")
    public WebElement myResponses;
    @FindBy(xpath = "(//button[@class='btn-link approve-button btn btn-primary'])[1]")
    public WebElement firstApprove;












































































//425-525 HANIFE OZTURK



































































































//525-625 AYSEGUL ARIK
    @FindBy(xpath = "//a[@href='/login']") public WebElement login;
    @FindBy(xpath = "//input[@name='email']") public WebElement loginEmail;
    @FindBy(xpath = "//input[@name='password']") public WebElement loginPassword;
    @FindBy(xpath = "//button[@type='submit']")  public WebElement loginButtona;
    @FindBy(xpath = "//div[@class='p-toast-detail']") public WebElement updatedPhoto;
    @FindBy(xpath = "//div[@class='p-toast-detail']")  public WebElement accountDelete;




































































































//625-725 FEYZI TUGCU
@FindBy(xpath = "//span[text()='Back to Site']")
public WebElement backToSiteButton;
@FindBy(xpath = "//input[@class='form-control']")
public WebElement searchBoxAnaSayfa;
@FindBy(xpath = "//img[@class='card-img-top property-card-img']")
public WebElement aramaSonucu;
@FindBy(xpath = "//input[@id='tourDate']")
public WebElement tourDate;
@FindBy(xpath = "//option[@value='01:30']")
public  WebElement tourTime;
@FindBy(xpath = "//button[@type='submit']")
public  WebElement submitButton;






















































































//725-825 ORHAN TANER



































































































//825-925 ILKNUR TUCCAR



































































































//925-1025 TUNCER OZGUR



































































































//1025-... YAKUP IBRAHIMBAS





}
