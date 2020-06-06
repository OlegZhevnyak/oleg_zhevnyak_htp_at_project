package pages.yandex_mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YandexPage {

    public static String xPathLogInputButton = "//a[contains(@class,'login-enter-expanded')]";
    public static String xPathEmailTextField = "//*[@id='passp-field-login']";
    public static String xPathSubmitEmailButton = "//button[@type=\"submit\"]";
    public static String xPathPasswordTextField = "//input[@type=\"password\"]";
    public static String xPathSubmitPasswordButton = "//button[@type=\"submit\"]";
    public static String xPathSearchField = "//input[@placeholder=\"Поиск\"]";
    public static String xPathSearchSubmitButton = "//Button[@type=\"submit\"]";
    public static String xPathMailOpen = "//*[contains(@class,'ns-view-messages-item-wrap')][1]//span[@title=\"Booking.com\"]";
    public static String xPathAllowButton = "//button[@class=\" nb-button _nb-small-pseudo-button js-show-content\"]/span";
    public static String xPathConfirmRegistrationButton = "//td[@bgcolor=\"#0071C2\"]/a";

    public static WebElement element;

    public static WebElement webElementLogInputButton(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathLogInputButton));
        return element;
    }

    public static WebElement webElementEmailTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathEmailTextField));
        return element;
    }

    public static WebElement webElementSubmitEmailButton(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathSubmitEmailButton));
        return element;
    }

    public static WebElement webElementPasswordTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathPasswordTextField));
        return element;
    }

    public static WebElement webElementSubmitPasswordButton(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathSubmitPasswordButton));
        return element;
    }

    public static WebElement webElementSearchField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathSearchField));
        return element;
    }

    public static WebElement webElementSearchSubmitButton(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathSearchSubmitButton));
        return element;
    }

    public static WebElement webElementMailOpen(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathMailOpen));
        return element;
    }

    public static WebElement webElementAllowButton(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathAllowButton));
        return element;
    }

    public static WebElement webElementConfirmRegistrationButton(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathConfirmRegistrationButton));
        return element;
    }

}
