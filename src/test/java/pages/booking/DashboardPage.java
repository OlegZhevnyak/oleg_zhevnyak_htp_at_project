package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    public static final String EMAIL_CONFIRM_BANNER_XPATH = "//div[@class='email-confirm-banner']";

    public static WebDriver driver;

    public DashboardPage(WebDriver driver){
    }

    public static WebElement webElementEmailConfirmBanner() {
        return driver.findElement(By.xpath(EMAIL_CONFIRM_BANNER_XPATH));
    }

}
