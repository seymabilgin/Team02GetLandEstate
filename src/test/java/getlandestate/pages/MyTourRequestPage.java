package getlandestate.pages;

import getlandestate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyTourRequestPage {

    public MyTourRequestPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


// Hanife
    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public WebElement ownerName;
    @FindBy(xpath = "//button[@class='p-paginator-next p-paginator-element p-link']")
    public WebElement nextButton;

    @FindBy(xpath = "//span[@class='p-tag-value']")
    public List<WebElement> randevuStatus;





}
