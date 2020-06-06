package steps.yandex_mail;

import org.openqa.selenium.WebDriver;
import pages.booking.AccountCreate;
import pages.booking.HomePage;
import pages.yandex_mail.YandexPage;

public class RegistrationConfirmSteps {

    public static void RegistrationConfirm(WebDriver driver) {
        YandexPage.webElementLogInputButton(driver).click();
        YandexPage.webElementEmailTextField(driver).sendKeys("test55545@yandex.by");
        YandexPage.webElementSubmitEmailButton(driver).click();
        YandexPage.webElementPasswordTextField(driver).sendKeys("55545678");
        YandexPage.webElementSubmitPasswordButton(driver).click();
        YandexPage.webElementSearchField(driver).sendKeys("booking");
        YandexPage.webElementSearchSubmitButton(driver).click();
        YandexPage.webElementMailOpen(driver).click();
        YandexPage.webElementAllowButton(driver).click();
        YandexPage.webElementConfirmRegistrationButton(driver).click();
    }

}
