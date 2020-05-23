package tests;

import driver.GetDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.booking.StaysHomePage;
import settings.DriverConfig;
import settings.ScreenMode;
import steps.SimpleSteps;

import java.util.concurrent.TimeUnit;

public class LowestPriceTest {

    String date = null;
    int startThrough = 5;
    int duration = 10;
    WebElement element;
    WebDriver driver;

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        SimpleSteps.followTheLinkSetWindowMode(driver, "https://www.booking.com/", ScreenMode.MAXIMIZE);
    }

    @Test
    public void bookingLowestPriceTest() throws InterruptedException {
        StaysHomePage.setCityDateGuests(driver,
                "Moscow", 10, 5, 4,0,2);
        TimeUnit.SECONDS.sleep(3);

        Actions actions = new Actions(driver);
        element = driver.findElement(By.xpath("//*[@id=\"group_adults\"]"));
        actions.moveToElement(element).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();
        element = driver.findElement(By.xpath("//*[@id=\"no_rooms\"]"));
        actions.moveToElement(element).click().sendKeys(Keys.ARROW_DOWN).click().perform();

        SimpleSteps.findElementClick(driver, "//*[contains(@class, \"sort_price\")]/a");
        element = SimpleSteps.findElementClickReturn(driver, "//*[@id=\"filter_price\"]//a[1]");

        String highestPricePerDay = element.getText();
        highestPricePerDay = highestPricePerDay.replaceAll("([^1-9][^0-9]+)", "");
        TimeUnit.SECONDS.sleep(2);

        String firstPrice = SimpleSteps.findElementGetText(driver,
                "//*[contains(@class, \"bui-price-display\")]/div[2]/div");
        firstPrice = firstPrice.replaceAll("[^0-9]+", "");
        int pricePerDay = Integer.parseInt(firstPrice) / duration;

        System.out.println("Highest price per day: " + highestPricePerDay + ". Price per day: " + pricePerDay + ".");
        Assert.assertTrue("pricePerDay should be < then highestPricePerDay",
                pricePerDay <= Integer.parseInt(highestPricePerDay));
    }

    @After
    public void postCondition() {
        SimpleSteps.destroyDriver(driver);
    }

}
