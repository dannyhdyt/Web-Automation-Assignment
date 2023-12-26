package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import java.util.Arrays;

public class BaseWebTest {
    public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

    @BeforeMethod
    public void openBrowser(){
        //openBrowser
        WebDriverManager.chromedriver();

        // Remove "Chrome is being controlled by automated software"
        ChromeOptions option = new ChromeOptions();
        option.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-popup-blocking"));

        option.addArguments();
        driver.set(new ChromeDriver(option));
        driver.get().manage().window().maximize();
        driver.get().get("https://www.makemytrip.com/");
        explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));

    }
}
