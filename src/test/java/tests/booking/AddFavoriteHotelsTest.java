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
import steps.booking.ExtendedSteps;
import steps.booking.AddFavoriteHotelsSteps;

import java.util.concurrent.TimeUnit;

public class AddFavoriteHotelsTest {

    public static final String BOOKING_URL = "https://www.booking.com/";
    public static final String EMAIL = "test55545@trashmail.com";
    public static final String PASSWORD = "test55545";
    public static final String START_DATE = ExtendedSteps.setDate(0);
    public static final String END_DATE = ExtendedSteps.setDate(30);

    public static final String RED_COLOR = "rgb(204, 0, 0)";
    public static final String RED_COLOR_1 = "#c00";

    public static String firstHotelName;
    public static String lastHotelName;

    public static WebDriver driver;

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, BOOKING_URL, ScreenMode.MAXIMIZE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void registrationConfirmTest() throws InterruptedException {

        AddFavoriteHotelsSteps.logIn(driver, EMAIL, PASSWORD);
        AddFavoriteHotelsSteps.setCityDatePersons(driver, "Madrid", START_DATE, END_DATE);
        //Add first and last hotels to favorite list.
        AddFavoriteHotelsSteps.addFavoriteHotels(driver);
        TimeUnit.SECONDS.sleep(1);
        //Remember favorite hotel's names.
        firstHotelName = AddFavoriteHotelsSteps.getFirstHotelName(driver);
        lastHotelName = AddFavoriteHotelsSteps.getLastHotelName(driver);

        //Verify, that clicked favorite buttons becomes RED.
        Assert.assertEquals("The favorite button of the first hotel should be RED color.",
                RED_COLOR, AddFavoriteHotelsSteps.getFirstHotelFavoriteButtonColor(driver));
        Assert.assertEquals("The favorite button of the last hotel should be RED color.",
                RED_COLOR, AddFavoriteHotelsSteps.getLastHotelFavoriteButtonColor(driver));

        AddFavoriteHotelsSteps.openWishList(driver);
        TimeUnit.SECONDS.sleep(3);

        //Verify, that particular hotels added to wish list.
        Assert.assertEquals("The first hotel name should be " + firstHotelName + " .",
                firstHotelName, AddFavoriteHotelsSteps.getFirstHotelNameFromWishList(driver));
        Assert.assertEquals("The second hotel name should be " + lastHotelName + " .",
                lastHotelName, AddFavoriteHotelsSteps.getSecondHotelNameFromWishList(driver));
    }

    @After
    public void postCondition() {
        GeneralSteps.destroyDriver(driver);
    }

}
