package pages.trash_mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    public static String xPathNewUserTab = "//a[@href=\"#tab-mob-register\"]";
    public static String xPathUsernameTextField = "//div[@id=\"tab-mob-register\"]//input[@ng-model=\"user.name\"]";
    public static String xPathPasswordTextField = "//div[@id=\"tab-mob-register\"]//input[@ng-model=\"user.password\"]";
    public static String xPathPasswordConfirmTextField =
            "//div[@id=\"tab-mob-register\"]//input[@ng-model=\"user.passwordRepeat\"]";
    public static String xPathRealEmailTextField = "//div[@id=\"tab-mob-register\"]//input[@ng-model=\"user.email\"]";
    public static String xPathRegisterButton = "//button[@ng-click=\"registerAccount(true);\"]";
    public static String xPathResultAlert = "//span[@ng-bind-html=\"content\"]";

    public static WebElement element;

    public static WebElement webElementNewUserTab(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathNewUserTab));
        return element;
    }

    public static WebElement webElementUsernameTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathUsernameTextField));
        return element;
    }

    public static WebElement webElementPasswordTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathPasswordTextField));
        return element;
    }

    public static WebElement webElementPasswordConfirmTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathPasswordConfirmTextField));
        return element;
    }

    public static WebElement webElementRealEmailTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathRealEmailTextField));
        return element;
    }

    public static WebElement webElementRegisterButton(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathRegisterButton));
        return element;
    }

    public static WebElement ResultAlert(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathResultAlert));
        return element;
    }

}
