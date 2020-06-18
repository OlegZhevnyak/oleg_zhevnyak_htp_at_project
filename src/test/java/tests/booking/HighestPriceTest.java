package tests.booking;

import driver.GetDriver;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import settings.DriverConfig;
import settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.AddFavoriteHotelsSteps;
import steps.booking.CommonSteps;
import steps.booking.ExtendedSteps;
import steps.booking.PriceSteps;

import java.util.concurrent.TimeUnit;

public class HighestPriceTest {

    public static final String BOOKING_URL = "https://www.booking.com/";
    public static final String START_DATE = ExtendedSteps.setDate(3);   //Start in 3 days
    public static final String END_DATE = ExtendedSteps.setDate(10);    //Hotel reservation for 7 nights (10-3=7)
    public static final int DURATION_DATE = 7;                          //Duration = 7 nights (10-3=7)

    public static WebDriver driver;

    public static Logger logger = Logger.getLogger(HighestPriceTest.class);

    @Before
    public void preCondition() {
        logger.info("HighestPriceTest started execution");
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, BOOKING_URL, ScreenMode.MAXIMIZE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void bookingHighestPriceTest() throws InterruptedException {

        CommonSteps.setCityDate(driver, "Paris", START_DATE, END_DATE);
        CommonSteps.setGuests(driver, 4, 0, 2);
        CommonSteps.submitButtonClick(driver);

        CommonSteps.setHotelsWithHighestPrice(driver);
        TimeUnit.SECONDS.sleep(4);
        CommonSteps.sortByLowestPrice(driver);
        TimeUnit.SECONDS.sleep(4);

        int highestPricePerDay = PriceSteps.getHighestPrice(driver);
        int pricePerDay = PriceSteps.getLowestFromSearchedPrice(driver) / DURATION_DATE;

        System.out.println("highestPricePerDay :" + highestPricePerDay);
        System.out.println("pricePerDay :" + pricePerDay);

        Assert.assertTrue("highestPricePerDay should be >= then pricePerDay",
                highestPricePerDay >= pricePerDay);
    }

    @After
    public void postCondition() {
        logger.info("HighestPriceTest finished execution");
        GeneralSteps.destroyDriver(driver);
    }
}
