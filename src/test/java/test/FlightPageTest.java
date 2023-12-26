package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FlightPage;
import page.HomePage;


public class FlightPageTest extends BaseWebTest{

    @Test
    public void successFlightPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver, explicitWait);
        FlightPage flightPage = new FlightPage(driver, explicitWait);
        homePage.home("Jakarta", "New York");

        //wait processing request 18 second
        Thread.sleep(18000);
        //remove banner <Now Lock Prices & Pay Later!>
        driver.get().findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[3]/button")).click();

        String txtExpectedBerhasilMasuk =  "Flights from Jakarta to New York";
        Assert.assertEquals(txtExpectedBerhasilMasuk, flightPage.getFlightText());

        //value of top price
        Assert.assertTrue(flightPage.getPrice().contains("₹ 70,463"));
    }
}
