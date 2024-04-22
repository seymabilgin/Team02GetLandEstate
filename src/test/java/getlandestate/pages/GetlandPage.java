package getlandestate.pages;

import getlandestate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GetlandPage {

        public GetlandPage(){
            PageFactory.initElements(Driver.getDriver(),this);

        }

        @FindBy(xpath = "//a[@data-rr-ui-event-key='5']")
        public WebElement girisButonu;

        @FindBy(xpath = "//input[@name='email']")
        public WebElement emailKutusu;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement passwordKutusu;

        @FindBy(xpath = "//*[@title='ContactMessages']")
        public WebElement contactMassagesButonu;

        @FindBy(xpath = "//*[.='mkircay954@gmail.com']")
        public WebElement mesajlarinOldugunuDogrular;

        @FindBy(xpath = "//*[.='mkircay954@gmail.com']")
        public WebElement mesajaTiklar;

        @FindBy(xpath = "(//button[@class='message-delete-btn message-button btn btn-primary'])[6]")
        public WebElement butonDogrulama;

        @FindBy(xpath = "//input[@placeholder='Type Something']")
        public WebElement aramaCubugu;

        @FindBy(xpath = "//button[@class='search-button btn btn-primary']")
        public WebElement aramaButonu;

        @FindBy(xpath = "//button[@class='filter-button btn btn-primary']")
        public WebElement filtrelemeButonu;

        @FindBy(xpath = "//input[@id='startDate']")
        public WebElement startDateBlogu;

        @FindBy(xpath = "//input[@id='endDate']")
        public WebElement endDateBlogu;

        @FindBy(xpath = "//button[@class='done-button modal-button btn btn-primary']")
        public WebElement onayButonuKucuk;

}