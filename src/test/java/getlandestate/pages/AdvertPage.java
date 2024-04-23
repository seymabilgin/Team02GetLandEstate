package getlandestate.pages;

import getlandestate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertPage {
    public AdvertPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    //15-115 HANIFE OZTURK

    @FindBy (xpath = "//span[@class='p-image p-component shown-image-wrapper p-image-preview-container']")
    public WebElement image;
    @FindBy (xpath = "//div[@class='advert-description']")
    public WebElement description;
    @FindBy (xpath = "//div[@class='row-cols-1 row-cols-md-2 row-cols-lg-3 row-cols-xl-4 row']")
    public WebElement details;
    @FindBy (xpath = "////div[@class='advert-details-location-container container']//h4/following-sibling::div[@class='row']")
    public WebElement location;
    @FindBy (xpath = "//button[@class='show-toggle btn btn-danger']")
    public WebElement gorunurlukButton;
    @FindBy (xpath = "//a[@class='advert-detail-phone-link']")
    public WebElement telNumberBox;
    @FindBy (xpath = "//a[@class='advert-detail-mail-link']")
    public WebElement mailBox;
    @FindBy (xpath = "//a[@class='advert-detail-phone-link']")
    public WebElement telNumber;
    @FindBy (id = "tourDate")
    public WebElement tourDate;
    @FindBy (id = "tourTime")
    public WebElement tourTime;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submit;
    @FindBy (xpath = "//div[@class='p-toast-message-content']")
    public WebElement succesMessage;
    //toast success message   (bu messajlara toast mesaj da denilebilir. Genelde xpath icerisinde toast kelimesi gecer)




































































    





}
