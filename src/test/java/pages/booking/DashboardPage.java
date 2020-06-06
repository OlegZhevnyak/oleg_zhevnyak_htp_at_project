package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    public static String xPathEmailConfirmBanner = "//div[@class=\"email-confirm-banner\"]";

    public static WebElement element;

    public static WebElement webElementEmailConfirmBanner(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathEmailConfirmBanner));
        return element;
    }

}
