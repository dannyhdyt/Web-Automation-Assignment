package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightPage extends BasePage{

    public FlightPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/p/span")
    WebElement txtBerhasilMasuk;

    @FindBy(xpath = "//*[@id=\"listing-id\"]/div/div[2]/div/div[1]/div[1]")
    WebElement columnTopPrice;

    public String getFlightText(){
        return getText(txtBerhasilMasuk);
    }

    public String getPrice(){
        return getText(columnTopPrice);
    }
}
