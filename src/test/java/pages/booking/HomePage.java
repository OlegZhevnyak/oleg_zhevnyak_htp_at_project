package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static String xPathRegisterLink = "//a[@id=\"b_tt_holder_1\"]//div[@class=\"sign_in_wrapper\"]";
    public static String xPathYourAccountLink = "//data-command=\"show-profile-menu\"]";
    public static String xPathMyDashboardLink = "//div[@class=\"profile-menu__item profile_menu__item--mydashboard\"]/a";

    public static WebElement element;

    public static WebElement webElementRegisterLink(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathRegisterLink));
        return element;
    }

    public static WebElement webElementYourAccountLink(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathYourAccountLink));
        return element;
    }

    public static WebElement webElementMyDashboardLink(WebDriver driver) {
        element = driver.findElement(By.xpath(xPathMyDashboardLink));
        return element;
    }

}



