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
    public static final String SPAM_LINK_XPATH = "//a[@href='#spam']";
    public static final String SEARCH_FIELD_XPATH = "//input[@placeholder='Поиск']";
    public static final String SEARCH_SUBMIT_BUTTON_XPATH = "//Button[@type='submit']";
    public static final String MAIL_OPEN_XPATH = "//*[contains(@class,'ns-view-messages-item-wrap')][1]//span[@title='Booking.com']";
    public static final String ALLOW_BUTTON_XPATH = "//button[@class=' nb-button _nb-small-pseudo-button js-show-content']/span";
    public static final String CONFIRM_REGISTRATION_BUTTON_XPATH = "//td[@bgcolor='#0071C2']/a";

    public static WebDriver driver;

    public YandexPage(WebDriver driver){
        this.driver=driver;
    }

    public static WebElement webElementLogInputButton() {
        return driver.findElement(By.xpath(LOGIN_INPUT_BUTTON_XPATH));
    }

    public static WebElement webElementEmailTextField() {
        return driver.findElement(By.xpath(EMAIL_TEXT_FIELD_XPATH));
    }

    public static WebElement webElementSubmitEmailButton() {
        return driver.findElement(By.xpath(SUBMIT_EMAIL_BUTTON_XPATH));
    }

    public static WebElement webElementPasswordTextField() {
        return driver.findElement(By.xpath(PASSWORD_TEXT_FIELD_XPATH));
    }

    public static WebElement webElementSubmitPasswordButton() {
        return driver.findElement(By.xpath(SUBMIT_PASSWORD_BUTTON_XPATH));
    }

    public static WebElement webElementSpamLink() {
        return driver.findElement(By.xpath(SPAM_LINK_XPATH));
    }

    public static WebElement webElementSearchField() {
        return driver.findElement(By.xpath(SEARCH_FIELD_XPATH));
    }

    public static WebElement webElementSearchSubmitButton() {
        return driver.findElement(By.xpath(SEARCH_SUBMIT_BUTTON_XPATH));
    }

    public static WebElement webElementMailOpen() {
        return driver.findElement(By.xpath(MAIL_OPEN_XPATH));
    }

    public static WebElement webElementAllowButton() {
        return driver.findElement(By.xpath(ALLOW_BUTTON_XPATH));
    }

    public static WebElement webElementConfirmRegistrationButton() {
        return driver.findElement(By.xpath(CONFIRM_REGISTRATION_BUTTON_XPATH));
    }

}
