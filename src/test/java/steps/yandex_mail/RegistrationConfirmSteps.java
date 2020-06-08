package steps.yandex_mail;

import driver.GetDriver;
import org.openqa.selenium.WebDriver;
import pages.yandex_mail.YandexPage;
import settings.DriverConfig;

public class RegistrationConfirmSteps {

    public static final String YANDEX_URL = "https://yandex.by/";

    public static YandexPage yandexPage = new YandexPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static void RegistrationConfirm(WebDriver driver, String yandexEmail, String yandexPassword, String yandexSearchData) {
        driver.get(YANDEX_URL);
        yandexPage.webElementLogInputButton().click();
        yandexPage.webElementEmailTextField().sendKeys(yandexEmail);
        yandexPage.webElementSubmitEmailButton().click();
        yandexPage.webElementPasswordTextField().sendKeys(yandexPassword);
        yandexPage.webElementSubmitPasswordButton().click();
        yandexPage.webElementSearchField().sendKeys(yandexSearchData);
        yandexPage.webElementSearchSubmitButton().click();
        yandexPage.webElementMailOpen().click();
        yandexPage.webElementAllowButton().click();
        yandexPage.webElementConfirmRegistrationButton().click();
    }

}
