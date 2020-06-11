package tests.booking;

import driver.GetDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.booking.SearchResultPage;
import settings.DriverConfig;
import settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.ChangeColorSteps;
import steps.booking.CommonSteps;
import steps.booking.ExtendedSteps;

import java.util.concurrent.TimeUnit;

public class ChangeColorTest {

    public static final String BOOKING_URL = "https://www.booking.com/";
    public static final String START_DATE = ExtendedSteps.setDate(1);   //Start in 1 days
    public static final String END_DATE = ExtendedSteps.setDate(2);     //Hotel reservation for 1 nights (2-1=1)

    public static WebDriver driver;

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, BOOKING_URL, ScreenMode.MAXIMIZE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void changeColorTest() throws InterruptedException {

        CommonSteps.setCityDate(driver, "Oslo", START_DATE, END_DATE);
        CommonSteps.setGuests(driver, 2, 1, 1);
        CommonSteps.submitButtonClick(driver);
        TimeUnit.SECONDS.sleep(1);

        CommonSteps.setThreeStarsHotel(driver);
        CommonSteps.setFourStarsHotel(driver);
        TimeUnit.SECONDS.sleep(4);

        ChangeColorSteps.scrollToThenthHotel(driver);
        ChangeColorSteps.changeThenthHotelNameColor(driver, "red");
        Assert.assertEquals("Tenth hotel name color should be red.",
                "color: red;", searchResultPage.webElementTenthHotelName().getAttribute("style"));

        ChangeColorSteps.changeThenthHotelNameColor(driver, "green");
        Assert.assertEquals("Tenth hotel name color should be green.",
                "color: green;", searchResultPage.webElementTenthHotelName().getAttribute("style"));
    }

    @After
    public void postCondition() {
        GeneralSteps.destroyDriver(driver);
    }
}
