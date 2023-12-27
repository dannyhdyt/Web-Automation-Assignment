package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import page.FlightPage;
import page.HomePage;


public class FlightPageTest extends BaseWebTest{

    @Test
    public void successFlightPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver, explicitWait);
        FlightPage flightPage = new FlightPage(driver, explicitWait);
        homePage.home("Jakarta", "New York");

        //wait processing request 17 second
        Thread.sleep(17000);
        Reporter.log("wait processing request 17 second");
        //remove banner <Now Lock Prices & Pay Later!>
        driver.get().findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[3]/button")).click();
        Reporter.log("remove banner Now Lock Prices & Pay Later!");

        //success go to the next page
        String txtExpectedBerhasilMasuk =  "Flights from Jakarta to New York";
        Assert.assertEquals(txtExpectedBerhasilMasuk, flightPage.getFlightText());
        Reporter.log("Expected text Flights from Jakarta to New York");

        //value top price
        System.out.println(flightPage.getPrice());
        Assert.assertTrue(flightPage.getPrice().contains("Jakarta"));
    }
}
