package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreate {


    //final

    //'

    public static final String XPATHEMAILTEXTFIELD = "//input[@id=\"login_name_register\"]";
    public static final String xPathGetStartedButton = "//button[@class=\"bui-button bui-button--large bui-button--wide\"]";
    public static final String xPathCreatePasswordTextField = "//input[@id=\"password\"]";
    public static final String xPathConfirmPasswordTextField = "//input[@id=\"confirmed_password\"]";
    public static final String xPathCreateAccountButton = "//button[@class=\"bui-button bui-button--large bui-button--wide\"]";

    public static WebElement element;

    public static WebElement webElementEmailTextField(WebDriver driver) {
        element = driver.findElement(By.xpath(XPATHEMAILTEXTFIELD));
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
