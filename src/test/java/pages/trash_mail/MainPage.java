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

    private  static WebElement element;

    public static void webElementNewUserTab(WebDriver driver, String xPath) {
        element = driver.findElement(By.xpath(xPathNewUserTab));
    }

    public static void webElementUsernameTextField(WebDriver driver, String xPath) {
        element = driver.findElement(By.xpath(xPathUsernameTextField));
    }

    public static void webElementPasswordTextField(WebDriver driver, String xPath) {
        element = driver.findElement(By.xpath(xPathPasswordTextField));
    }

    public static void webElementPasswordRepeatTextField(WebDriver driver, String xPath) {
        element = driver.findElement(By.xpath(xPathPasswordRepeatTextField));
    }

    public static void webElementEmailTextField(WebDriver driver, String xPath) {
        element = driver.findElement(By.xpath(xPathEmailTextField));
    }

    public static void webElementRegisterButton(WebDriver driver, String xPath) {
        element = driver.findElement(By.xpath(xPathRegisterButton));
    }

}
