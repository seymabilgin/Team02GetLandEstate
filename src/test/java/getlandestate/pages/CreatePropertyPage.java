package getlandestate.pages;

import getlandestate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePropertyPage {
    public CreatePropertyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//span[@class='d-none d-lg-block']")
    public WebElement createPropertyButton;
    @FindBy(xpath="//input[@id='title']")
    public WebElement titleOfProperty;
    @FindBy(xpath="//textarea[@id='desc']")
    public WebElement descrptionOfProperty;
    @FindBy(xpath="//input[@id='price']")
    public WebElement priceOfProperty;
    @FindBy(id="advertTypeId")
    public WebElement advertTypeOfProperty;
    @FindBy(id="categoryId")
    public WebElement categoryOfProperty;
    @FindBy(id="countryId")
    public WebElement countryOfPropert;
    @FindBy(id="cityId")
    public WebElement cityOfPropert;
    @FindBy(id="districtId")
    public WebElement districtOfPropert;
    @FindBy(xpath="//input[@id='address']")
    public WebElement adressOfPropert;
    @FindBy(xpath="//div[@class='advert-properties  container']")
    public WebElement scrollToProperties;
    @FindBy(xpath="//input[@id='Size']")
    public WebElement sizeOfPropert;
    @FindBy(xpath="//input[@id='Bedrooms']")
    public WebElement bedroomsOfPropert;
    @FindBy(xpath="//input[@id='Bathrooms']")
    public WebElement bathroomsOfPropert;
    @FindBy(xpath="//select[@id='Garage']")
    public WebElement garageOfPropert;
    @FindBy(xpath = "//input[@id='Year of Build']")
    public WebElement yearOfBuildOfPropert;
    @FindBy(xpath="//select[@id='Furniture']")
    public WebElement furnitureOfPropert;
    @FindBy(xpath = "//input[@id='Maintenance Fee']")
    public WebElement maintenancefeeOfPropert;
    @FindBy(id="Terrace")
    public WebElement terraceOfPropert;
    @FindBy(xpath="//div[@class='advert-image container']")
    public WebElement dragAndDropImgOfPropert;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement createButtonOfPropert;
    @FindBy(xpath="//img[@src='/logos/logo-white-3.png']")
    public WebElement imageOfPropert;
    @FindBy(xpath="//*[.='Advert created successfully']")
    public WebElement advertCreatedVeriflyTextOfPropert;
    @FindBy(xpath="//div[.='Enter a title']")
    public WebElement titleErrorMsgOfPropert;
    @FindBy(xpath="//div[.='Enter a description']")
    public WebElement descrptionErrorMsgOfPropert;
    @FindBy(xpath="//div[@class='advert-properties  container']")
    public WebElement scrollToPropertiesOfPropert;
    @FindBy(xpath="//div[.='newAdvertPageTranslations.requiredAddress']")
    public WebElement adressErrorTextOfPropert;
    @FindBy(xpath="//div[.='Each image should be a maximum of 3 MB']")
    public WebElement imageErrorTextOfPropert;

}
