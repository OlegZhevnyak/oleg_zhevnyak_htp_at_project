package pages.trash_mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private static String xPathNewUserTab = "//a[@href=\"#tab-mob-register\"]";
    private static String xPathUsernameTextField = "//div[@id=\"tab-mob-manager\"]//input[@ng-model=\"user.name\"]";
    private static String xPathPasswordTextField = "//div[@id=\"tab-mob-manager\"]//input[@ng-model=\"user.password\"]";
    private static String xPathPasswordRepeatTextField =
            "//div[@id=\"tab-mob-manager\"]//input[@ng-model=\"user.passwordRepeat\"]";
    private static String xPathEmailTextField = "//div[@id=\"tab-mob-manager\"]//input[@ng-model=\"user.email\"]";
    private static String xPathRegisterButton = "//button[@ng-click=\"registerAccount(true);\"]";

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

    public static WebElement webElementPasswordRepeatTextField() {
        element = driver.findElement(By.xpath(xPathPasswordRepeatTextField));
        return element;
    }

    public static WebElement webElementEmailTextField() {
        element = driver.findElement(By.xpath(xPathEmailTextField));
        return element;
    }

    public static WebElement webElementRegisterButton() {
        element = driver.findElement(By.xpath(xPathRegisterButton));
        return element;
    }

}
