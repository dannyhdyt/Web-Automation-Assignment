package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage{
    public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(id = "second-img")
    WebElement columnCloseBanner;

    @FindBy(id = "fromCity")
    WebElement columnClickFromCity;

    @FindBy(xpath = "//input[@class='react-autosuggest__input react-autosuggest__input--open react-autosuggest__input--focused']")
    WebElement columnFromCity;

    @FindBy(xpath = "//p[@class='blackText makeFlex hrtlCenter']")
    WebElement columnListBoxFromCity;

    @FindBy(id = "webklipper-publisher-widget-container-notification-close-div")
    WebElement columnBanner;

    @FindBy(id = "toCity")
    WebElement columnClickToCity;

    @FindBy(xpath = "//input[@class='react-autosuggest__input react-autosuggest__input--open react-autosuggest__input--focused']")
    WebElement columnToCity;

    @FindBy(xpath = "//p[@class='blackText makeFlex hrtlCenter']")
    WebElement columnListBoxToCity;

    @FindBy(xpath = "//div[@class='DayPicker-Months']//div[4]//p[.='31']")
    WebElement columnDeparture;

    @FindBy(xpath = "//a[.='Search']")
    WebElement search;

    public void home (String iFrom, String iTo){
        clickAndWait(columnClickFromCity);
        setText(columnFromCity, iFrom);
        clickAndWait(columnListBoxFromCity);
        clickAndWait(columnClickToCity);
        setText(columnToCity, iTo);
        clickAndWait(columnListBoxToCity);
        clickAndWait(columnDeparture);
        clickAndWait(search);
    }
}
