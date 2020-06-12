package tests.booking;

import driver.GetDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import settings.DriverConfig;
import settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.CommonSteps;
import steps.booking.ExtendedSteps;
import steps.booking.PriceSteps;

import java.util.concurrent.TimeUnit;

public class LowestPriceTest {

    public static final String BOOKING_URL = "https://www.booking.com/";
    public static final String START_DATE = ExtendedSteps.setDate(10);  //Start in 10 days
    public static final String END_DATE = ExtendedSteps.setDate(15);    //Hotel reservation for 5 nights (15-10=5)
    public static final int DURATION_DATE = 5;                          //Duration = 5 nights (15-10=5)

    public static  WebDriver driver;

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, BOOKING_URL, ScreenMode.MAXIMIZE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void bookingLowestPriceTest() throws InterruptedException {

        CommonSteps.setCityDate(driver, "Moscow", START_DATE, END_DATE);
        CommonSteps.setGuestsByActions(driver);
        CommonSteps.submitButtonClick(driver);

        CommonSteps.setHotelsWithLowestPrice(driver);;
        TimeUnit.SECONDS.sleep(3);

        int highestPricePerDay = PriceSteps.getLowestPrice(driver);
        int pricePerDay = PriceSteps.getLowestFromSearchedPrice(driver) / DURATION_DATE;

        System.out.println("highestPricePerDay :" + highestPricePerDay);
        System.out.println("pricePerDay :" + pricePerDay);

        Assert.assertTrue("highestPricePerDay should be >= then pricePerDay",
                highestPricePerDay >= pricePerDay);
    }

    @After
    public void postCondition() {
        GeneralSteps.destroyDriver(driver);
    }
}
