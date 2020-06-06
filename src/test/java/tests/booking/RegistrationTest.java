package tests.booking;

import driver.GetDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.yandex_mail.YandexPage;
import settings.DriverConfig;
import settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.CreateAccountSteps;
import steps.yandex_mail.RegistrationConfirmSteps;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    String BookingURL = "https://www.booking.com/";
    String YandexURL = "https://yandex.by/";
    String DummyEmail3 = "joshuah.hickle@0box.eu";
    String DummyEmail4 = "sandy_roob49@0box.eu";
    String DummyEmail5 = "theresia_hilpert@0box.eu";
    String DummyEmail6 = "ellsworth_dooley@0box.eu";
    String DummyEmail7 = "javon45@0box.eu";
    String Password = "test555456";
    String ConfirmPassword = "test555456";
    String TrueEmail = "test55545@yandex.by";
    String TrueEmailPassword = "55545678";
    String MailSearch = "Booking";

    WebDriver driver;

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, BookingURL, ScreenMode.MAXIMIZE);
    }

    @Test
    public void registrationConfirmTest() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(4);
//        CreateAccountSteps.registerButtonClick(driver);
//        TimeUnit.SECONDS.sleep(4);
//        CreateAccountSteps.emailSet(driver, DummyEmail3);
//        TimeUnit.SECONDS.sleep(4);
//        CreateAccountSteps.passwordSet(driver, Password, ConfirmPassword);
        driver.get(YandexURL);
        TimeUnit.SECONDS.sleep(4);

        YandexPage.webElementLogInputButton(driver).click();
        TimeUnit.SECONDS.sleep(8);

//        WebElement EmailTextField = driver.findElement(By.xpath("//*[@id='passp-field-login']"));
//        EmailTextField.sendKeys(TrueEmail);

        YandexPage.webElementEmailTextField(driver).sendKeys(TrueEmail);
        TimeUnit.SECONDS.sleep(4);
        YandexPage.webElementSubmitEmailButton(driver).click();
        TimeUnit.SECONDS.sleep(4);
        YandexPage.webElementPasswordTextField(driver).sendKeys("55545678");
        TimeUnit.SECONDS.sleep(4);
        YandexPage.webElementSubmitPasswordButton(driver).click();
        TimeUnit.SECONDS.sleep(4);
        YandexPage.webElementSearchField(driver).sendKeys("Booking");
        TimeUnit.SECONDS.sleep(4);
        YandexPage.webElementSearchSubmitButton(driver).click();
        TimeUnit.SECONDS.sleep(4);
        YandexPage.webElementMailOpen(driver).click();
        TimeUnit.SECONDS.sleep(4);
        YandexPage.webElementAllowButton(driver).click();
        TimeUnit.SECONDS.sleep(4);
        YandexPage.webElementConfirmRegistrationButton(driver).click();
        TimeUnit.SECONDS.sleep(4);

        driver.get(BookingURL);
        CreateAccountSteps.dashboardOpen(driver);

        //Assert true
        Assert.assertNull("Registration wasn't confirmed. Check email: " + TrueEmail + ".",
                CreateAccountSteps.webElementEmailConfirmBanner(driver));
    }

//    @After
//    public void postCondition() {
//    GeneralSteps.destroyDriver(driver);
//    }
}
