package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static final String REGISTER_LINK_XPATH = "//li[@id='current_account_create']/a/div[@class='sign_in_wrapper']";
    public static final String YOUR_ACCOUNT_LINK_XPATH = "//data-command='show-profile-menu']";
    public static final String MY_DASHBOARD_LINK_XPATH = "//div[@class='profile-menu__item profile_menu__item--mydashboard']/a";

    static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementRegisterLink(WebDriver driver) {
        return driver.findElement(By.xpath(REGISTER_LINK_XPATH));
    }

//    public static WebElement webElementYourAccountLink(WebDriver driver) {
//        element = driver.findElement(By.xpath(YOUR_ACCOUNT_LINK_XPATH));
//        return element;
//    }
//
//    public static WebElement webElementMyDashboardLink(WebDriver driver) {
//        element = driver.findElement(By.xpath(MY_DASHBOARD_LINK_XPATH));
//        return element;
//    }

}



