package getlandestate.pages;

import getlandestate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class HomePage {
    public HomePage() {PageFactory.initElements(Driver.getDriver(),this);
    }


//15-115 M.FURKAN KARAIS



































































































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



































































































//1025-... TUNCER OZGUR
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
