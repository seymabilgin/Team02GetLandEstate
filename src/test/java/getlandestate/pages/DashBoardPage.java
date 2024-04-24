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




























































































//225-325 SEYMA BILGIN



































































































//325-425 SEVILAY UYANIK



































































































//425-525 HANIFE OZTURK



































































































//525-625 AYSEGUL ARIK



































































































//625-725 FEYZI TUGCU



































































































//725-825 ORHAN TANER



































































































//825-925 ILKNUR TUCCAR



































































































//925-1025 TUNCER OZGUR
//Branch SetUp


































































































//1025-... YAKUP IBRAHIMBAS

}
