package getlandestate.pages;

import getlandestate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
    public HomePage() {PageFactory.initElements(Driver.getDriver(),this);
    }


//15-115 M.FURKAN KARAIS
@FindBy(xpath="//div/a[@data-rr-ui-event-key='5']")
public WebElement loginButtonInHomePage;

































































































//115-225 MEHMET TURAN













































































































//225-325 SEYMA BILGIN



































































































//325-425 SEVILAY UYANIK



































































































//425-525 HANIFE OZTURK

    @FindBy(xpath = "//button[contains(@class, 'ad-type-button') and contains(text(), 'Rent')]")
    public WebElement rentButton;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement searchButton;


























































































//525-625 AYSEGUL ARIK



































































































//625-725 FEYZI TUGCU



































































































//725-825 ORHAN TANER



































































































//825-925 ILKNUR TUCCAR



































































































//925-1025 YAKUP IBRAHIMBAS
@FindBy(xpath = "//a[@href='/login']")
public WebElement loginbutton;

 @FindBy(css = "input[name='email']")
 public WebElement emailTextBox;

 @FindBy(xpath = "//input[@type='password']")
 public WebElement passwordTextBox;

 @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[1]/div[2]/form/div[4]/button")
 public WebElement loginButton;

 @FindBy(xpath = "//span[normalize-space()='Back to Site']")
 public WebElement backToSite;

 @FindBy(xpath = "//img[@class='flag-icon']")
 public WebElement flagIcon;

 @FindBy(xpath = "//a[.='Home']")
 public WebElement englishTextVerify;

 @FindBy(xpath = "//a[normalize-space()='Türkçe']")
 public WebElement trflagIconButton;

 @FindBy(xpath = "//a[normalize-space()='Anasayfa']")
 public WebElement turkishText;

 @FindBy(xpath = "//a[normalize-space()='Français']")
 public WebElement franchIconButton;

 @FindBy(xpath = "//a[.='Accueil']")
 public WebElement frTextVerify;
 @FindBy(xpath = "//a[normalize-space()='Deutsch']")
 public WebElement grIconButton;

 @FindBy(xpath = "//a[.='Zuhause']")
 public WebElement grTextVerify;

 @FindBy(xpath = "//a[normalize-space()='Español']")
 public WebElement spIconButton;

 @FindBy(xpath = "//a[.='Inicio']")
 public WebElement spTextVerify;

 @FindBy(xpath = "//*[@placeholder]")
 public WebElement anasayfaSearchKismi;


 @FindBy(xpath = "(//*[@stroke='currentColor'])[9]")
 public WebElement anasayfaSearchKismiBuyutec;

 @FindBy(xpath = "(//*[@class='card-img-top property-card-img'])[1]")
 public WebElement ilkCikanIlan;

 @FindBy(id = "tourDate")
 public WebElement ilanSonrasiTarih;
 @FindBy(id = "tourTime")
 public WebElement ilanSonrasiZaman;
 @FindBy(xpath = "//*[@type='submit']")
 public WebElement ilanRandevuButon;
 @FindBy(xpath = "(//*[@class='d-none d-sm-inline'])[5]")
 public WebElement kullanicilar;
  @FindBy(xpath = "//*[@placeholder='Type Something']")
 public WebElement kullaniciKontrol;

 @FindBy(xpath = "(//*[@stroke='currentColor'])[12]")
 public WebElement buyutec;
 @FindBy(xpath = "(//*[@stroke-linecap='round'])[2]")
 public WebElement kullaniciDuzenle;
 @FindBy(xpath = "//*[@name='role']")
 public WebElement kullaniciRolDuzenleme;
 @FindBy(xpath = "//*[@type='submit']")
 public WebElement guncelleButton;
 @FindBy(xpath = "//*[.='User type save successfully']")
 public WebElement DogrulamaYazisi;
 @FindBy(xpath = "//*[@class='delete-button btn btn-primary']")
 public WebElement silButton;
 @FindBy(xpath = "(//*[@class='p-button-label p-c'])[2]")
 public WebElement silButtononayla;


 @FindBy(xpath = "//div/a[@data-rr-ui-event-key='5'")
 public WebElement loginButtona;
 @FindBy(xpath = "//*[@placeholder='Email']")
 public WebElement emailGiris;
 @FindBy(xpath = "//*[@name='password']")
 public WebElement passwordGiris;
 @FindBy(xpath = "//*[@class='form-submit-button']")
 public WebElement loginButton2;
 @FindBy(xpath = "(//*[@src])[5]")
 public WebElement englishLanguage;
 @FindBy(xpath = "(//*[@src])[7]")
 public WebElement turkishLanguage;
 @FindBy(xpath = "(//*[@src])[8]")
 public WebElement franceLanguage;
 @FindBy(xpath = "(//*[@src])[9]")
 public WebElement almancaLanguage;
 @FindBy(xpath = "(//*[@src])[10]")
 public WebElement ispanyolcaLanguage;


































































































//1025-... TUNCER OZGUR
   @FindBy(xpath = "//button[normalize-space()='Rent']")
   public WebElement searchAreaRentButton;

    @FindBy(xpath = "//button[normalize-space()='Sale']")
    public WebElement searchAreaSaleButton;

    @FindBy(xpath = "//button[normalize-space()='APARTMENT']")
    public WebElement searchAreaApartmentButton;

    @FindBy(xpath ="//button[normalize-space()='HOUSE']")
    public WebElement searchAreaHouseButton;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchAreaTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement searchAreaSearchIcon;

    @FindBy(xpath = "//input[@placeholder='min']")
    public WebElement searchPropertyPriceRangeMin;

    @FindBy(xpath = "//input[@placeholder='max']")
    public WebElement searchPropertyPriceRangeMax;

    @FindBy(xpath = "//select[@id='at']")
    public WebElement searchPropertyAdvertType;

    @FindBy(xpath = "//select[@id='c']")
    public WebElement searchPropertyCategory;

    @FindBy(xpath = "//select[@id='ctry']")
    public WebElement searchPropertyCountry;

    @FindBy(xpath = "//select[@id='city']")
    public WebElement searchPropertyCity;

    @FindBy(xpath = "//select[@id='dist']")
    public WebElement searchPropertyDisctrit;

    @FindBy(xpath = "//button[@class='dynamic-button  btn btn-primary']")
    public WebElement searchPropertySearchButton;

    @FindBy(css = "img[alt='Comfortable house in Kusadasi']")
    public WebElement searchPropertySelectOneAdvert;

    @FindBy(xpath = "//img[@alt='Modern Apartment Living in Düzici s Thriving Community']")
    public WebElement searchPropertySelectOneAdvert2;

    @FindBy(xpath = "//img[@alt='Calm Family House in Batman Center']")
    public WebElement searchPropertySelectOneAdvert3;

    @FindBy(xpath = "//img[@alt='Stylish Apartment in Besiri']")
    public WebElement searchPropertySelectOneAdvert4;

    @FindBy(xpath = "//div[@class='p-image-preview-indicator']")
    public WebElement searchPropertyAdvertEyeIcon;

    @FindBy(xpath = "//div[@class='p-image-preview-indicator']")
    public WebElement searchPropertyAdvertImagePreview;

    @FindBy(xpath = "//button[@data-pc-section='closebutton']")
    public WebElement searchPropertyAdvertCloseImagePreview;

    @FindBy(xpath = "//div[@class='advert-description']")
    public WebElement searchPropertyAdvertDescriptionDetails;

    @FindBy(xpath = "(//span[@class='property-value'])[1]")
    public WebElement searchPropertyDetailSize;

    @FindBy(xpath = "(//span[@class='property-value'])[2]")
    public WebElement searchPropertyDetailBedrooms;

    @FindBy(xpath = "(//span[@class='property-value'])[3]")
    public WebElement searchPropertyDetailBathrooms;

    @FindBy(xpath = "(//span[@class='property-value'])[4]")
    public WebElement searchPropertyDetailGarage;

    @FindBy(xpath = "(//span[@class='property-value'])[5]")
    public WebElement searchPropertyDetailYearOfBuild;

    @FindBy(xpath = "(//span[@class='property-value'])[6]")
    public WebElement searchPropertyDetailFurniture;

    @FindBy(xpath = "(//span[@class='property-value'])[7]")
    public WebElement searchPropertyDetailMaintenanceFee;

    @FindBy(xpath = "(//span[@class='property-value'])[8]")
    public WebElement searchPropertyDetailTerrace;

    @FindBy(xpath = "//span[normalize-space()='Türkiye']")
    public WebElement searchPropertyLocationCountry;

    @FindBy(xpath = "(//span[@class='location-value'])[2]")
    public WebElement searchPropertyLocationCity;

    @FindBy(xpath = "(//span[@class='location-value'])[3]")
    public WebElement searchPropertyLocationDisctrict;

    @FindBy(xpath = "//span[@class='address-value']")
    public WebElement searchPropertyLocationAdress;

    @FindBy(xpath = "//h4[@class='description-title']")
    public WebElement searchPropertyDscScroll;

    @FindBy(xpath = "(//button[@class='show-toggle btn btn-danger'])[1]")
    public WebElement searchPropertyContactNumberEyeIcon;

    @FindBy(xpath = "(//button[@class='show-toggle btn btn-danger'])[2]")
    public WebElement searchPropertySendMailEyeIcon;

    @FindBy(css = ".register-link")
    public WebElement searchPropertyDontHaveAcccountCreateNow;

    @FindBy(xpath = "//div[@class='advert-type']")
    public WebElement searchPropertyScrollToTop;

    @FindBy(css = "button[class='close-button btn btn-primary']")
    public WebElement searchPropertyCloseMiniMenu;

    @FindBy(xpath = "//h3[normalize-space()='Schedule a tour']")
    public WebElement searchPropertyScrollToSchedulaTour;

    @FindBy(xpath = "//input[@name='tourDate']")
    public WebElement searchPropertyTourDate;

    @FindBy(xpath = "//select[@name='tourTime']")
    public WebElement searchPropertyTourTime;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchPropertySubmitTourRequest;

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            // Handle any exceptions or return false if element cannot be found or checked
            return false;
        }
    }



























































}
