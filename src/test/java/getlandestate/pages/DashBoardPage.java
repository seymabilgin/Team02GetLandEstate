package getlandestate.pages;


import getlandestate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class DashBoardPage {
    public DashBoardPage() {PageFactory.initElements(Driver.getDriver(),this);
    }
    //15-115 M.FURKAN KARAIS



































































































//115-225 MEHMET TURAN
@FindBy(xpath = "//*[@title='Reports']") public WebElement dashboardReportsButton;
@FindBy(xpath = "(//input[@id=\"startDate\"])[1]") public WebElement advertsStartDate;
@FindBy(xpath = "(//input[@id=\"endDate\"])[1]") public WebElement advertsEndDate;
@FindBy(css = "#category") public WebElement advertsCategory;
@FindBy(css = "#type") public WebElement advertsType;
@FindBy(xpath = "(//select[@id='status'])[1]") public WebElement advertsStatus;
@FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[1]") public WebElement advertsDownload;
@FindBy(id = "amount") public WebElement popularAmount;
@FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[2]") public WebElement popularDownload;
@FindBy(xpath = "//select[@id=\"role\"]") public WebElement usersRole;
@FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[3]") public WebElement usersDownload;
@FindBy(xpath = "(//input[@id=\"startDate\"])[2]") public WebElement tourStartDate;
@FindBy(xpath = "(//input[@id=\"endDate\"])[2]") public WebElement tourEndDate;
@FindBy(xpath = "(//select[@id='status'])[2]") public WebElement tourStatus;
@FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[4]") public WebElement tourDownload;
@FindBy(css = ".p-toast-detail") public WebElement errorMessage;
@FindBy(css = ".formik-feedback.invalid-feedback") public WebElement amountMessage;
@FindBy(xpath = "//a[@title='Logout']") public WebElement dashboardLogout;
@FindBy(xpath = "//span[.='Yes']") public WebElement dashboardLogoutYes;


























































































//225-325 SEYMA BILGIN



































































































//325-425 SEVILAY UYANIK



































































































//425-525 HANIFE OZTURK



































































































//525-625 AYSEGUL ARIK



































































































//625-725 FEYZI TUGCU



































































































//725-825 ORHAN TANER



































































































//825-925 ILKNUR TUCCAR



































































































//925-1025 TUNCER OZGUR
@FindBy(css = "a[title='Categories'] span[class='d-none d-sm-inline']")
public WebElement dashboardCategories;

    @FindBy(xpath = "//button[@title='Add New']")
    public WebElement dashboardCategoriesAddNewButton;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement dashboardCategoriesTitle;

    @FindBy(xpath = "//input[@placeholder='sequence']")
    public WebElement dashboardCategoriesSequence;

    @FindBy(xpath = "//input[@id='icon']")
    public WebElement dashboardCategoriesIconArea;

    @FindBy(xpath = "//input[@id='category-switch']")
    public WebElement dashboardCategoriesActiveSwitch;

    @FindBy(xpath = "//button[@class='category-common-button create-button btn btn-primary']")
    public WebElement dashboardCategoriesCreateButton;

    @FindBy(xpath = "//span[@class='p-toast-summary']")
    public WebElement dashboardCategoriesCategoryCreatedText;

    @FindBy(xpath = "//button[@class='p-toast-icon-close p-link']")
    public WebElement dashboardCategoriesCategoryCreatedTextCloseButton;

    @FindBy(xpath = "//span[normalize-space()='Advert Types']")
    public WebElement dashboardAdvertTypes;

    @FindBy(xpath = "//button[@title='Add New']")
    public WebElement dashboardAdvertTypeAddNew;

    @FindBy(xpath = "//input[@id='title']")
    public WebElement dashboardAdvertTypeTitle;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement dashboardAdvertTypeCreateButton;

    @FindBy(xpath = "//span[normalize-space()='Users']")
    public WebElement dashboardUsers;

    @FindBy(xpath = "//input[@placeholder='Type Something']")
    public WebElement dashboardUsersTypeSomething;

    @FindBy(xpath = "//button[@class='search-button btn btn-outline-secondary']")
    public WebElement dashboardUsersSearchIcon;

    @FindBy(xpath = "//button[@class='btn-link btn btn-primary'][2]")
    public WebElement dashboardUsersPenIcon;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement dashboardUsersUserPhone;

    @FindBy(xpath = "//select[@id='role']")
    public WebElement dashboardUsersUserRole;

    @FindBy(xpath = "//button[normalize-space()='UPDATE']")
    public WebElement dashboardUsersUserUpdateButton;

    @FindBy(xpath = "//button[@class='category-common-button back-button btn btn-secondary']")
    public WebElement dashboardCategoryUpdate;

    @FindBy(xpath = "//span[@class='p-confirm-popup-message']")
    public WebElement dashboardCategoryAreYouSureText;

    @FindBy(xpath = "(//button[@class='btn-link btn btn-primary'])[1]")
    public WebElement dashboardCategoryDelete;

    @FindBy(xpath = "(//span[@class='p-button-label p-c'])[2]")
    public WebElement dashboardCategoryYESbutton;

    @FindBy(xpath = "//span[normalize-space()='Tour Requests']")
    public WebElement dashboardTourRequests;

    @FindBy(xpath = "(//img[@data-pc-section='image'])[1]")
    public WebElement dashboardTourRequestsImage;

    @FindBy(xpath = "//span[normalize-space()='Back to Site']")
    public WebElement dashboardbackToSite;

    @FindBy(xpath = "//div[@class='user-logo-nav navbar-nav']")
    public WebElement dashboardbackToDashboard;

    @FindBy(xpath = "//span[normalize-space()='Control Panel']")
    public WebElement dashboardbackToDashboard2;

    @FindBy(xpath = "//button[@title='Delete']")
    public WebElement dashboardAdvertTypeDelete;

    @FindBy(xpath = "//button[@title='Edit']")
    public WebElement dashboardAdvertTypeEdit;

    @FindBy(xpath = "//span[@class='p-column-title ']")
    public WebElement dashboardCategoriesCheckName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement dashboardUserEmail;

    static class UpdateButtonUnexpectedlyActiveException extends Exception {
        public UpdateButtonUnexpectedlyActiveException(String errorMessage) {
            super(errorMessage);
        }
    }

    @FindBy(xpath = "//span[normalize-space()='Logout']")
    public WebElement dashboardLogOutButtonTncr;

    @FindBy(xpath = "//span[normalize-space()='Yes']")
    public WebElement dashboardLogOutButtonYes;






























































































//1025-... YAKUP IBRAHIMBAS

}
