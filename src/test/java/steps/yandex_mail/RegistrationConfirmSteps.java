package steps.yandex_mail;

import driver.GetDriver;
import org.openqa.selenium.WebDriver;
import pages.yandex_mail.YandexPage;
import settings.DriverConfig;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class RegistrationConfirmSteps {

    public static final String YANDEX_URL = "https://yandex.by/";

    public static YandexPage yandexPage = new YandexPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static void RegistrationConfirm(WebDriver driver, String yandexEmail, String yandexPassword, String yandexSearchData) throws InterruptedException {
        driver.get(YANDEX_URL);
        yandexPage.webElementLogInputButton().click();
        //write 2 tabs
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));                     //switch to the first tab
        driver.close();                                             //close the first tab
        driver.switchTo().window(tabs2.get(1));                     //switch to the second tab
        yandexPage.webElementEmailTextField().sendKeys(yandexEmail);
        yandexPage.webElementSubmitEmailButton().click();
        TimeUnit.SECONDS.sleep(1);
        yandexPage.webElementPasswordTextField().sendKeys(yandexPassword);
        yandexPage.webElementSubmitPasswordButton().click();
        yandexPage.webElementSpamLink().click();
        yandexPage.webElementSearchField().sendKeys(yandexSearchData);
        yandexPage.webElementSearchSubmitButton().click();
        TimeUnit.SECONDS.sleep(1);
        yandexPage.webElementMailOpen().click();
        TimeUnit.SECONDS.sleep(1);
        yandexPage.webElementAllowButton().click();
        yandexPage.webElementConfirmRegistrationButton().click();
    }

}
