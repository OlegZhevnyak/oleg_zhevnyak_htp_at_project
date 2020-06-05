package tests.booking;

import driver.GetDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.booking.StaysHomePage;
import settings.DriverConfig;
import settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.SimpleSteps;

import java.util.concurrent.TimeUnit;

public class HighestPriceTest {
    
    int startThrough = 3;
    int duration = 7;
    int adultNeed = 4;
    int roomNeed = 2;

    WebElement element;
    WebDriver driver;

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, "https://www.booking.com/", ScreenMode.MAXIMIZE);
    }

    @Test
    public void bookingHighestPriceTest() throws InterruptedException {
        StaysHomePage.setCityDateGuests(driver,
                "Paris", 3, 7, 2,0,2);
        TimeUnit.SECONDS.sleep(4);

        SimpleSteps.findElementClick(driver, "//*[contains(@class, \"sort_price\")]/a");
        SimpleSteps.findElementClick(driver, "//*[@id=\"filter_price\"]//a[last()]");
        TimeUnit.SECONDS.sleep(2);

        String highestPricePerDay = SimpleSteps.findElementGetText(driver,
                "//*[@id=\"filter_price\"]//a[last()]").replaceAll("\\D+", "");

        String firstPrice = SimpleSteps.findElementGetText(driver,
                "//*[contains(@class, \"bui-price-display\")]/div[2]/div").replaceAll("\\D+", "");
        int pricePerDay = Integer.parseInt(firstPrice) / duration;

        System.out.println("Highest price per day: " + highestPricePerDay + ". Price per day: " + pricePerDay + ".");
        Assert.assertTrue("highestPricePerDay should be >= then pricePerDay",
                Integer.parseInt(highestPricePerDay) >= pricePerDay);
    }

    @After
    public void postCondition() {
        GeneralSteps.destroyDriver(driver);
    }
}
