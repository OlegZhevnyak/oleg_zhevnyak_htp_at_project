package tests.booking;

import driver.GetDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.booking.StaysHomePage;
import pages.booking.StaysSearchResultsPage;
import settings.DriverConfig;
import settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.SimpleSteps;

import java.util.concurrent.TimeUnit;

public class ChangeColorTest {

    int startThrough = 1;
    int duration = 1;
    int adultNeed = 2;
    int roomNeed = 1;
    int childNeed = 1;
    WebElement element;
    WebDriver driver;

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, "https://www.booking.com/", ScreenMode.MAXIMIZE);
    }

    @Test
    public void booking3Test() throws InterruptedException {
        StaysHomePage.setCityDateGuests(driver,
                "Oslo", 1, 1, 2,0,1);
        TimeUnit.SECONDS.sleep(4);

        SimpleSteps.findElementClick(driver, "//*[@data-id=\"class-3\"]");
        SimpleSteps.findElementClick(driver, "//*[@data-id=\"class-4\"]");
        TimeUnit.SECONDS.sleep(4);
        element = driver.findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[11]"));
        TimeUnit.SECONDS.sleep(2);

        Actions actions = new Actions(driver);
        element = StaysSearchResultsPage.executorSetBackgroundTitleColor(element,driver,actions);

        String textColor = element.getAttribute("style");
        if (textColor.equals("color: red;"))
            System.out.println("hotelName changed to Red color");
        Assert.assertEquals("hotelName color should be red","color: red;", textColor);
    }

    @After
    public void postCondition() {
        GeneralSteps.destroyDriver(driver);
    }

}
