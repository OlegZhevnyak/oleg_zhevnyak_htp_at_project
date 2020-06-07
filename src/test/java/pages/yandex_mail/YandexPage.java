package pages.yandex_mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YandexPage {

    public static final String LOGIN_INPUT_BUTTON_XPATH = "//a[contains(@class,'login-enter-expanded')]";
    public static final String EMAIL_TEXT_FIELD_XPATH = "//*[@id='passp-field-login']";
    public static final String SUBMIT_EMAIL_BUTTON_XPATH = "//button[@type='submit']";
    public static final String PASSWORD_TEXT_FIELD_XPATH = "//input[@type='password']";
    public static final String SUBMIT_PASSWORD_BUTTON_XPATH = "//button[@type='submit']";
    public static final String SEARCH_FIELD_XPATH = "//input[@placeholder='Поиск']";
    public static final String SEARCH_SUBMIT_BUTTON_XPATH = "//Button[@type='submit']";
    public static final String MAIL_OPEN_XPATH = "//*[contains(@class,'ns-view-messages-item-wrap')][1]//span[@title='Booking.com']";
    public static final String ALLOW_BUTTON_XPATH = "//button[@class=' nb-button _nb-small-pseudo-button js-show-content']/span";
    public static final String CONFIRM_REGISTRATION_BUTTON_XPATH = "//td[@bgcolor='#0071C2']/a";

    public static WebElement element;

    public static WebElement webElementLogInputButton(WebDriver driver) {
        element = driver.findElement(By.xpath(LOGIN_INPUT_BUTTON_XPATH));
        return element;
    }

    public static WebElement webElementEmailTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(EMAIL_TEXT_FIELD_XPATH));
        return element;
    }

    public static WebElement webElementSubmitEmailButton(WebDriver driver) {
        element = driver.findElement(By.xpath(SUBMIT_EMAIL_BUTTON_XPATH));
        return element;
    }

    public static WebElement webElementPasswordTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(PASSWORD_TEXT_FIELD_XPATH));
        return element;
    }

    public static WebElement webElementSubmitPasswordButton(WebDriver driver) {
        element = driver.findElement(By.xpath(SUBMIT_PASSWORD_BUTTON_XPATH));
        return element;
    }

    public static WebElement webElementSearchField(WebDriver driver) {
        element = driver.findElement(By.xpath(SEARCH_FIELD_XPATH));
        return element;
    }

    public static WebElement webElementSearchSubmitButton(WebDriver driver) {
        element = driver.findElement(By.xpath(SEARCH_SUBMIT_BUTTON_XPATH));
        return element;
    }

    public static WebElement webElementMailOpen(WebDriver driver) {
        element = driver.findElement(By.xpath(MAIL_OPEN_XPATH));
        return element;
    }

    public static WebElement webElementAllowButton(WebDriver driver) {
        element = driver.findElement(By.xpath(ALLOW_BUTTON_XPATH));
        return element;
    }

    public static WebElement webElementConfirmRegistrationButton(WebDriver driver) {
        element = driver.findElement(By.xpath(CONFIRM_REGISTRATION_BUTTON_XPATH));
        return element;
    }

}
