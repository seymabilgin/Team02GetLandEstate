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
    @FindBy(xpath = "//div[@class='p-toast-message-text']")
    public WebElement alertText;























































   //325-425 SEVILAY UYANIK


 @FindBy(xpath = "//a[text()='Login']")
 public WebElement homeLogin;
 @FindBy(xpath = "//input[@placeholder='Email']")
 public WebElement email;
 @FindBy(xpath = "//input[@name='password']")
 public WebElement password;
 @FindBy(xpath = "//a[@title='Tour Requests']")
 public WebElement tourRequests;
 @FindBy(xpath = "//input[@name='search']")
 public WebElement ilanSearch;
 @FindBy(xpath = "//button[@class='search-button btn btn-outline-secondary']")
 public WebElement searchButton;
 @FindBy(xpath = "//*[.='My Tour Requests']")
 public WebElement myTourRequests;
 @FindBy(xpath = "(//div[@class='text'])[1]")
 public WebElement searchResult;
 @FindBy(xpath = "(//img[@class='user-pic'])[1]")
 public WebElement userPicture;
 @FindBy(xpath = "//p[text()='MY RESPONSES']")
 public WebElement myResponses;
 @FindBy(xpath = "(//button[@class='btn-link approve-button btn btn-primary'])[1]")
 public WebElement firstApprove;

 @FindBy(xpath = "(//span[@class='p-button-label p-c'])[2]")
 public WebElement yes;

 @FindBy(xpath = "(//span[@class='p-button-label p-c'])[1]")
 public WebElement no;

 @FindBy(xpath = "(//button[@class='btn-link decline-button btn btn-primary'])[2]")
 public WebElement secondDecline;

 @FindBy(xpath = "(//span[@class='p-tag-value'])[1]")
 public WebElement firstApproveText;

 @FindBy(xpath = "(//span[@class='p-tag-value'])[2]")
 public WebElement secondDeclineText;
  
  
 











































































//425-525 HANIFE OZTURK



































































































//525-625 AYSEGUL ARIK
    @FindBy(xpath = "//a[@href='/login']") public WebElement loginAA;
    @FindBy(xpath = "//input[@name='email']") public WebElement loginEmailAA;
    @FindBy(xpath = "//input[@name='password']") public WebElement loginPasswordAA;
    @FindBy(xpath = "//button[@type='submit']")  public WebElement loginButtonAA;
    @FindBy(xpath = "//div[@class='user-logo-nav navbar-nav']") public WebElement profileLogAA;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]") public WebElement logoutAA;
    @FindBy(xpath = "//*[contains(text(),'Invalid email')]") public WebElement invalidEmailAA;
    @FindBy(xpath = "//div[@class='p-toast-message-text']") public WebElement invalidEmailorPasswordAA;
    @FindBy(xpath = "//*[contains(text(),'Password is required')]") public WebElement passwordIsRequiredAA;
    @FindBy(xpath = "//*[contains(text(),'Email is required')]")     public WebElement emailIsRequiredAA;
    @FindBy(xpath = "//*[contains(text(),'My Profile')]")     public WebElement myProfileAA;
    @FindBy(xpath = "//input[@name='firstName']")      public WebElement firstNameAA;
    @FindBy(xpath = "//input[@name='lastName']")      public WebElement lastNameAA;
    @FindBy(xpath = "//input[@name='phone']")      public WebElement phoneAA;
    @FindBy(xpath = "//input[@name='email']")      public WebElement emailAA;
    @FindBy(xpath = "(//button[@type='submit'])[1]") public WebElement updateButtonAA;
    @FindBy(xpath = "//div[@class='p-toast-detail']") public WebElement updateProfileAA;
    @FindBy(xpath = "//button[@id='react-aria9109298492-:r7:-tab-change-password']") public WebElement changePasswordAA;
    @FindBy(xpath = "//input[@name='currentPassword']")   public WebElement currentPasswordAA;
    @FindBy(xpath = "//input[@name='newPassword']")   public WebElement newPasswordAA;
    @FindBy(xpath = "//input[@name='repeatNewPassword']")   public WebElement repeatNewPasswordAA;
    @FindBy(xpath = "(//button[@class='submit-button btn btn-secondary'])[2]") public WebElement changeButtonAA;
    @FindBy(xpath = "//*[contains(text(),'You can login using your GetLandEstate account')]") public WebElement getLandEstateAccountAA;
    @FindBy(xpath = "//button[@id='react-aria9109298492-:rj:-tab-profile-photo']") public WebElement profilePhotoButtonAA;
    @FindBy(xpath = "//button[@class='select-button btn btn-primary']") public WebElement selectButtonAA;
    @FindBy(xpath = "//button[@class='done-button btn btn-primary']")  public WebElement doneButtonAA;
    @FindBy(xpath = "//button[@class='save-button btn btn-secondary']") public WebElement saveButtonAA;
    @FindBy(xpath = "//div[@class='p-toast-detail']") public WebElement updatedPhotoMessageAA;
    @FindBy(xpath = "//button[@id='react-aria9109298492-:rj:-tab-delete-account']") public WebElement deleteAccountButtonAA;
    @FindBy(xpath = "//input[@name='password']")  public WebElement deleteEmailButtonAA;
    @FindBy(xpath = "(//button[@class='submit-button btn btn-secondary'])[3]") public WebElement accountDeleteAA;
    @FindBy(xpath = "//button[@aria-label='Yes']") public WebElement yesButtonAA;
    @FindBy(xpath = "//div[@class='p-toast-detail']")  public WebElement accountDeleteMessageAA;
    public WebElement getMyprofilbutonu() {
        return myProfileAA;
    }

    public void setMyprofilbutonu(WebElement myprofilbutonu) {
        this.myProfileAA = myprofilbutonu;
    }




   


















































    @FindBy(xpath = "//a[@href='/login']") public WebElement logina;
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
@FindBy(xpath = "//div[@class='top-label']")
 public  WebElement dashboardText;
@FindBy(xpath = "//a[@href=\"/contact\"]")
 public  WebElement contactButton;
@FindBy(xpath = "//h5[text()=\"Have a question? Get in touch!\"]")
public WebElement verifyQuestion;












































































  
  
  
  
  
  //725-825 ORHAN TANER























































































  
  
  
  
  
  
  
  
  
  
  
  
  //825-925 ILKNUR TUCCAR



































































































//925-1025 TUNCER OZGUR



































































































//1025-... YAKUP IBRAHIMBAS





}
