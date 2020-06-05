package pages.trash_mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private static String xPathNewUserTab = "//a[@href=\"#tab-mob-register\"]";
    private static String xPathUsernameTextField = "//div[@id=\"tab-mob-manager\"]//input[@ng-model=\"user.name\"]";
    private static String xPathPasswordTextField = "//div[@id=\"tab-mob-manager\"]//input[@ng-model=\"user.password\"]";
    private static String xPathPasswordConfirmTextField =
            "//div[@id=\"tab-mob-manager\"]//input[@ng-model=\"user.passwordRepeat\"]";
    private static String xPathRealEmailTextField = "//div[@id=\"tab-mob-manager\"]//input[@ng-model=\"user.email\"]";
    private static String xPathRegisterButton = "//button[@ng-click=\"registerAccount(true);\"]";
    private static String xPathResultAlert = "//span[@ng-bind-html=\"content\"]";

    private static WebElement element;
    private static WebDriver driver;

    public static WebElement webElementNewUserTab() {
        element = driver.findElement(By.xpath(xPathNewUserTab));
        return element;
    }

    public static WebElement webElementUsernameTextField() {
        element = driver.findElement(By.xpath(xPathUsernameTextField));
        return element;
    }

    public static WebElement webElementPasswordTextField() {
        element = driver.findElement(By.xpath(xPathPasswordTextField));
        return element;
    }

    public static WebElement webElementPasswordConfirmTextField() {
        element = driver.findElement(By.xpath(xPathPasswordConfirmTextField));
        return element;
    }

    public static WebElement webElementRealEmailTextField() {
        element = driver.findElement(By.xpath(xPathRealEmailTextField));
        return element;
    }

    public static WebElement webElementRegisterButton() {
        element = driver.findElement(By.xpath(xPathRegisterButton));
        return element;
    }

    public static WebElement ResultAlert() {
        element = driver.findElement(By.xpath(xPathResultAlert));
        return element;
    }

}
