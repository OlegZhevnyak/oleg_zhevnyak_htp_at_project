package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreatePage {

    public static final String MAIL_TEXT_FIELD_XPATH = "//input[@id='login_name_register']";
    public static final String GET_STARTED_BUTTON_XPATH = "//button[@class='bui-button bui-button--large bui-button--wide']";
    public static final String CREATE_PASSWORD_TEXT_FIELD_XPATH = "//input[@id='password']";
    public static final String CONFIRM_PASSWORD_TEXT_FIELD_XPATH = "//input[@id='confirmed_password']";
    public static final String CREATE_ACCOUNT_BUTTON_XPATH = "//button[@class='bui-button bui-button--large bui-button--wide']";

    static WebDriver driver;

    public AccountCreatePage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementEmailTextField() {
        return driver.findElement(By.xpath(MAIL_TEXT_FIELD_XPATH));
    }

    public static WebElement webElementGetStartedButton() {
        return driver.findElement(By.xpath(GET_STARTED_BUTTON_XPATH));
    }

    public static WebElement webElementCreatePasswordTextField() {
        return driver.findElement(By.xpath(CREATE_PASSWORD_TEXT_FIELD_XPATH));
    }

    public static WebElement webElementConfirmPasswordTextField() {
        return driver.findElement(By.xpath(CONFIRM_PASSWORD_TEXT_FIELD_XPATH));
    }

    public static WebElement webElementCreateAccountButton() {
        return driver.findElement(By.xpath(CREATE_ACCOUNT_BUTTON_XPATH));
    }

}
