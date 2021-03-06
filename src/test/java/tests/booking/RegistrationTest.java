package tests.booking;

import driver.GetDriver;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.booking.DashboardPage;
import driver.settings.DriverConfig;
import driver.settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.CommonSteps;
import steps.booking.CreateAccountSteps;
import steps.booking.ExtendedSteps;
import steps.yandex_mail.RegistrationConfirmSteps;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    public static final String BOOKING_URL = "https://www.booking.com/";
    public static final String DUMMY_EMAIL = "jmaurine_rowe@0box.eu";           //since 17.06.20
    public static final String DUMMY_EMAIL_1 = "jacques_green14@0box.eu";
    public static final String BOOKING_PASSWORD = "test555456";
    public static final String BOOKING_CONFIRM_PASSWORD = "test555456";

    public static final String YANDEX_EMAIL = "test55545@yandex.by";
    public static final String YANDEX_PASSWORD = "55545678";
    public static final String YANDEX_SEARCH_DATA = "booking";

    public static WebDriver driver;

    public static Logger logger = Logger.getLogger(RegistrationTest.class);

    @Before
    public void preCondition() {
        logger.info("RegistrationTest started execution");
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, BOOKING_URL, ScreenMode.MAXIMIZE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void registrationConfirmTest() throws InterruptedException {
        //Create account on booking.com
        CommonSteps.registerButtonClick(driver);
        CreateAccountSteps.emailSet(driver, DUMMY_EMAIL);
        CreateAccountSteps.passwordSet(driver, BOOKING_PASSWORD, BOOKING_CONFIRM_PASSWORD);
        CreateAccountSteps.welcomingAlertClose(driver);
        //Open Yandex email & confirm registration
        RegistrationConfirmSteps.RegistrationConfirm(driver, YANDEX_EMAIL, YANDEX_PASSWORD, YANDEX_SEARCH_DATA);
        //Open account on booking.com
        CreateAccountSteps.dashboardOpen(driver);
        //Check, that ConfirmBanner isn't present = registration is confirmed
        Assert.assertFalse("Registration wasn't confirmed. Check email: " + YANDEX_EMAIL + ".",
                ExtendedSteps.isElementExist(driver, DashboardPage.EMAIL_CONFIRM_BANNER_XPATH));
    }

    @After
    public void postCondition() {
        logger.info("RegistrationTest finished execution");
        GeneralSteps.destroyDriver(driver);
    }
}
