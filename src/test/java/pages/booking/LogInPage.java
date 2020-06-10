package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    public static final String USERNAME_TEXT_FIELD_XPATH = "//input[@id='username']";
    public static final String NEXT_BUTTON = "//button[@class='bui-button bui-button--large bui-button--wide']";
    public static final String PASSWORD_TEXT_FIELD_XPATH = "//input[@id='password']";

    static WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementUserTextField() {
        return driver.findElement(By.xpath(USERNAME_TEXT_FIELD_XPATH));
    }

    public static WebElement webElementNextButton() {
        return driver.findElement(By.xpath(NEXT_BUTTON));
    }

    public static WebElement webElementPasswordTextField() {
        return driver.findElement(By.xpath(PASSWORD_TEXT_FIELD_XPATH));
    }

}
