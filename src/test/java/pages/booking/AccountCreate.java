package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreate {

    public static String xPathEmailTextField = "//input[@id=\"login_name_register\"]"; //type email
    public static String xPathGetStartedButton = "//button[@class=\"bui-button bui-button--large bui-button--wide\"]"; //click
    public static String xPathCreatePasswordTextField = "//input[@id=\"password\"]"; //type password
    public static String xPathConfirmPasswordTextField = "//input[@id=\"confirmed_password\"]"; //type password
    public static String xPathCreateAccountButton = "//button[@class=\"bui-button bui-button--large bui-button--wide\"]"; //click

    public static WebElement element;

    public static WebElement webElementEmailTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathEmailTextField));
        return element;
    }

    public static WebElement webElementGetStartedButton(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathGetStartedButton));
        return element;
    }

    public static WebElement webElementCreatePasswordTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathCreatePasswordTextField));
        return element;
    }

    public static WebElement webElementConfirmPasswordTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathConfirmPasswordTextField));
        return element;
    }

    public static WebElement webElementCreateAccountButton(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathCreateAccountButton));
        return element;
    }

}
