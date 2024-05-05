package getlandestate.pages;

import getlandestate.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PropertiesPage {
    public PropertiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//15-115 M.FURKAN KARAIS



































































































//115-225 MEHMET TURAN
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//225-325 ORHAN TANER

    @FindBy(css = "#body > div:nth-child(2) > div:nth-child(1) > nav:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > img:nth-child(1)")
    public WebElement accountIconButton;

    @FindBy(xpath = "//span[normalize-space()='My Adverts']")
    public WebElement myAdvertsIcon;
    @FindBy(xpath = "//div[@class='advert-container container']")
    public WebElement ilan_Listesi;

    @FindBy(xpath = "//p[contains(text(),'Denize Yakın Kiralık Devremülk')]")
    public WebElement ilan_Select1;

    @FindBy(xpath = "//div[@class='advert-container container']")
    public WebElement ilan_Select2;

    @FindBy(xpath = "//div[@class='row-cols-1 row-cols-md-2 row-cols-lg-3 row-cols-xl-4 row']")
    public WebElement ilan_Details;
    
    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]")
    public WebElement Date_Published;

    @FindBy(xpath = "//tr[@draggable='false']//span[@class='p-tag-value'][normalize-space()='ACTIVATED']")
    public WebElement Status;
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]")
    public WebElement View_Like_Tour;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/div[1]/button[2]//*[name()='svg']")
    public WebElement ilan_Update_GirisButton;

    @FindBy(xpath = "//h1[normalize-space()='EDIT ADVERT']")
    public WebElement ilan_EditAdvert;

    @FindBy(xpath = "//input[@id='price']")//input[@id='price']
    public WebElement ilan_EditPrice;

    @FindBy(xpath = "//input[@id='title']")
    public WebElement ilan_EditTitle;
    @FindBy(id = "price_start")
    public WebElement advertsPriceStart1Button;
    @FindBy(id = "title")
    public WebElement advertEditTitleButon;
    @FindBy(xpath = "//button[normalize-space()='Update']")
    public WebElement ilanUpdate_Button;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement advertsEditUpdateButon;



    @FindBy(xpath = "/tr[1]/td[5]/div[1]/div[1]/button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M19 6v14a2')]")
    public WebElement ilanDeleteButton;

    @FindBy(xpath = "//span[normalize-space()='Yes']")
    public WebElement ilanDeleteYesSelect;

    @FindBy(xpath = "//div[@class='p-toast-detail']")
    public WebElement ilanDeleteDogrulama;
    @FindBy(xpath = "//div[contains(text(),'Advert updated successfully')]")
    public WebElement updatedDogrulama;

    @FindBy(xpath = "//textarea[@id='desc']")
    public WebElement ilan_EditDescription;
    @FindBy(css = "#q")
    public WebElement advertsTypeSomethingButton;

    @FindBy(xpath = "//span[normalize-space()='Adverts']")
    public WebElement advertsTikla;
//@FindBy(css = "#q")
//    public WebElement advertsTypeSomethingButton;
    @FindBy(xpath ="//input[@id='q']")
    public WebElement advertsSearch;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButtonn;
    @FindBy(id = "statusForAdvert")
    public WebElement statusButonu;
    @FindBy(xpath = "(//*[@class=\"btn-link btn btn-primary\"])[1]")
    public static WebElement copKutusuButton;

    @FindBy(xpath = "//button[@aria-label='Yes']")
    public WebElement deleteYesButonu;

    @FindBy(xpath = "//*[.='Advert deleted']")
    public WebElement advertDeletedButton;
    @FindBy(xpath = "//tr[@draggable='false']//span[@class='p-tag-value'][normalize-space()='PENDING']")
    public WebElement pendingVerify;
    @FindBy(id=("kalemIconId"))
    public WebElement kalemIcon;
    @FindBy(id=("titleInputId"))
    public WebElement titleInput;

    @FindBy(id=("sluqInputId"))
    public WebElement sluqInput;

    @FindBy(id=("updateButtonId"))
    public WebElement updateButton;



    @FindBy(xpath = "//tbody//button[2]")
    public WebElement kalemIkonu2;

    @FindBy(xpath = "//a[@title='Adverts']")
    public WebElement getAdvertsText;

    @FindBy(xpath = "//select[@id='status']") ////select[@id='status']
    public WebElement selectStatus;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/div[1]/button[2]//*[name()='svg']")
    public WebElement advertUpdateikonforStatus;
    @FindBy(xpath = "//select[@id='statusForAdvert']")
    public WebElement pendingSelect;
    @FindBy(xpath = "//div[.='Advert updated successfully']")
    public static WebElement updateVerificationMessage;
    @FindBy(xpath = "//select[@id='statusForAdvert']//option[contains(text(),'Activated')]")
    public WebElement selectActivated;
    @FindBy(xpath = "//select[@id='statusForAdvert']//option[contains(text(),'Activated')]")
    public WebElement selectActivatedVerify;
    @FindBy(xpath = "//select[@id='statusForAdvert']//option[contains(text(),'Rejected')]")
    public WebElement selectRejected;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement updatedButton;
    @FindBy(xpath = "//tbody/tr[2]/td[5]/div[1]/div[1]/button[2]//*[name()='svg']//*[name()='path' and contains(@d,'M17 3a2.85')]")
    public WebElement advertUpdate_ikonforRejected;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement advertsSearchButton;


    @FindBy(xpath = "//div[@data-pc-name='paginator']")
    public static WebElement searchSonucu;





    @FindBy(id = "Size")
    public WebElement advertsEditSizeButon;



    @FindBy(xpath = "//span[.='Published']")
    public WebElement publishedDate;

    @FindBy(xpath = "//span[.='Status']")
    public WebElement statusBilgisi;

    @FindBy(xpath = "//span[.='View-Like-Tour']")
    public WebElement viewLikeTour;


















































    // 350-425 hanife

    @FindBy(xpath = "//div[@class='page-header container']")
    public WebElement propertiesTitle;
    @FindBy(id = "ps")
    public WebElement minPrice;
    @FindBy(id = "pe")
    public WebElement maxPrice;
    @FindBy(id = "at")
    public WebElement advertType;
    @FindBy(id = "c")
    public WebElement category;

    @FindBy(id = "ctry")
    public WebElement country;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "dist")
    public WebElement district;




    @FindBy(xpath = "//span[@class='d-none d-sm-inline']")
    public WebElement totalFound;

    @FindBy(xpath = "//a[@href='/advert/1713619965130-villa']")
    public WebElement choiseRent;










}
