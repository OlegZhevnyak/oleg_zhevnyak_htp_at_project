package tests.booking;

import driver.GetDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.booking.HeaderPage;
import settings.DriverConfig;
import settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.CommonSteps;
import steps.booking.CreateAccountSteps;
import steps.booking.ExtendedSteps;

import java.util.concurrent.TimeUnit;

public class HeaderElementsExistTest {

    public static final String BOOKING_URL = "https://www.booking.com/";
    public static final String EMAIL = "test55545@trashmail.com";
    public static final String PASSWORD = "test55545";

    public static WebDriver driver;

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, BOOKING_URL, ScreenMode.MAXIMIZE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void headerElementsExistingTest() throws InterruptedException {

        CommonSteps.logIn(driver, EMAIL, PASSWORD);
        TimeUnit.SECONDS.sleep(5);

        //Does the Booking logo exist?
        Assert.assertTrue("The Booking logo doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.BOOKING_LOGO_XPATH));

        //Does the Currency link exist?
        Assert.assertTrue("The Currency link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.SET_CURRENCY_LINK_XPATH));

        //Does the Language link exist?
        Assert.assertTrue("The Language link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.SET_LANGUAGE_LINK_XPATH));

        //Does the Help Centre link exist?
        Assert.assertTrue("The Help Centre link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.HELP_CENTRE_LINK_XPATH));

        //Does the List Your Property link exist?
        Assert.assertTrue("The List Your Property link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.LIST_YOUR_PROPERTY_LINK_XPATH));

        //Does the Your Account link exist?
        Assert.assertTrue("The Your Account link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.YOUR_ACCOUNT_LINK_XPATH));

        //Does the Stays tab exist?
        Assert.assertTrue("The Stays tab doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.STAYS_TAB_XPATH));

        //Does the Flights tab exist?
        Assert.assertTrue("The Flights tab doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.FLIGHTS_TAB_XPATH));

        //Does the Car rentals tab exist?
        Assert.assertTrue("The Car rentals tab doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.CAR_RENTALS_TAB_XPATH));

        //Does the Attraction tab exist?
        Assert.assertTrue("The Attraction tab doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.ATTRACTIONS_TAB_XPATH));

        //Does the Airport tab exist?
        Assert.assertTrue("The Airport tab doesn't exist.",
                ExtendedSteps.isElementExist(driver,HeaderPage.AIRPORT_TAXIS_TAB_XPATH));
    }

//    @After
//    public void postCondition() {
//        GeneralSteps.destroyDriver(driver);
//    }
}
