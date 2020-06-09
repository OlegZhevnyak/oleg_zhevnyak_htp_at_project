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
import steps.booking.CreateAccountSteps;
import steps.yandex_mail.RegistrationConfirmSteps;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    public static final String BOOKING_URL = "https://www.booking.com/";
    public static final String DUMMY_EMAIL = "korey_jaskolski@0box.eu";
    public static final String DUMMY_EMAIL_1 = "kitty_borer68@0box.eu";
    public static final String BOOKING_PASSWORD = "test555456";
    public static final String BOOKING_CONFIRM_PASSWORD = "test555456";

    public static final String YANDEX_EMAIL = "test55545@yandex.by";
    public static final String YANDEX_PASSWORD = "55545678";
    public static final String YANDEX_SEARCH_DATA = "booking";

    public static WebDriver driver;

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, BOOKING_URL, ScreenMode.MAXIMIZE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void registrationConfirmTest() throws InterruptedException {
        //Create account on booking.com
        CreateAccountSteps.registerButtonClick(driver);
        CreateAccountSteps.emailSet(driver, DUMMY_EMAIL);
        CreateAccountSteps.passwordSet(driver, BOOKING_PASSWORD, BOOKING_CONFIRM_PASSWORD);
        CreateAccountSteps.welcomingAlertClose(driver);
        //Open Yandex email & confirm registration
        RegistrationConfirmSteps.RegistrationConfirm(driver, YANDEX_EMAIL, YANDEX_PASSWORD, YANDEX_SEARCH_DATA);
        //Open account on booking.com
        CreateAccountSteps.dashboardOpen(driver);
        //Check, that ConfirmBanner isn't present = registration is confirmed
        Assert.assertFalse("Registration wasn't confirmed. Check email: " + YANDEX_EMAIL + ".",
                CreateAccountSteps.isConfirmBannerPresented(driver));
    }

    @After
    public void postCondition() {
    GeneralSteps.destroyDriver(driver);
    }
}
