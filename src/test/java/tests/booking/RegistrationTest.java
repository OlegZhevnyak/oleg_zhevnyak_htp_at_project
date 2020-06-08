package tests.booking;

import driver.GetDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import settings.DriverConfig;
import settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.CreateAccountSteps;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    public static final String BOOKING_URL = "https://www.booking.com/";
    public static final String YANDEX_URL = "https://yandex.by/";
    public static final String DUMMY_EMAIL = "laurine70@0box.eu.eu";
    public static final String DUMMY_EMAIL_4 = "rocio93@0box.eu.eu";
    public static final String DUMMY_EMAIL_5 = "diego_rippin68@0box.eu.eu";
    public static final String DUMMY_EMAIL_6 = "julien77@0box.eu";
    public static final String DUMMY_EMAIL_7 = "julien77@0box.eu";
    public static final String DUMMY_EMAIL_8 = "julien77@0box.eu";
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
        CreateAccountSteps.registerButtonClick(driver);
        CreateAccountSteps.emailSet(driver, DUMMY_EMAIL);
        CreateAccountSteps.passwordSet(driver, BOOKING_PASSWORD, BOOKING_CONFIRM_PASSWORD);

//        driver.get(YANDEX_EMAIL);
//        TimeUnit.SECONDS.sleep(4);

//        RegistrationConfirmSteps.RegistrationConfirm(driver, YANDEX_EMAIL, YANDEX_PASSWORD, YANDEX_SEARCH_DATA);

//        YandexPage.webElementLogInputButton(driver).click();
//        TimeUnit.SECONDS.sleep(8);

//        WebElement EmailTextField = driver.findElement(By.xpath("//*[@id='passp-field-login']"));
//        EmailTextField.sendKeys(TrueEmail);

//        YandexPage.webElementEmailTextField(driver).sendKeys(TrueEmail);
//        TimeUnit.SECONDS.sleep(4);
//        YandexPage.webElementSubmitEmailButton(driver).click();
//        TimeUnit.SECONDS.sleep(4);
//        YandexPage.webElementPasswordTextField(driver).sendKeys("55545678");
//        TimeUnit.SECONDS.sleep(4);
//        YandexPage.webElementSubmitPasswordButton(driver).click();
//        TimeUnit.SECONDS.sleep(4);
//        YandexPage.webElementSearchField(driver).sendKeys("Booking");
//        TimeUnit.SECONDS.sleep(4);
//        YandexPage.webElementSearchSubmitButton(driver).click();
//        TimeUnit.SECONDS.sleep(4);
//        YandexPage.webElementMailOpen(driver).click();
//        TimeUnit.SECONDS.sleep(4);
//        YandexPage.webElementAllowButton(driver).click();
//        TimeUnit.SECONDS.sleep(4);
//        YandexPage.webElementConfirmRegistrationButton(driver).click();

//        driver.get(BOOKING_URL);

//        TimeUnit.SECONDS.sleep(2);
//        WebElement SignIn = driver.findElement(By.xpath("//a[@id='b_tt_holder_1']"));
//        SignIn.click();

//        TimeUnit.SECONDS.sleep(2);
//        CreateAccountSteps.signIn(driver, DUMMY_EMAIL, BOOKING_PASSWORD);

        TimeUnit.SECONDS.sleep(2);
        CreateAccountSteps.welcomingAlertClose(driver);

        TimeUnit.SECONDS.sleep(2);
        CreateAccountSteps.dashboardOpen(driver);



        //Assert true
        Assert.assertNull("Registration wasn't confirmed. Check email: " + YANDEX_EMAIL + ".",
                CreateAccountSteps.webElementEmailConfirmBanner(driver));
    }

//    @After
//    public void postCondition() {
//    GeneralSteps.destroyDriver(driver);
//    }
}
