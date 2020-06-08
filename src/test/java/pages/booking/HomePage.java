package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static final String REGISTER_LINK_XPATH = "//li[@id='current_account_create']/a/div[@class='sign_in_wrapper']";
    public static final String YOUR_ACCOUNT_LINK_XPATH = "//span[@id='profile-menu-trigger--content']";
    public static final String SIGN_IN_XPATH = "//li[@id='current_account']//a[@id='b_tt_holder_1']";
    public static final String WELCOMING_ALERT_CLOSE_BUTTON_XPATH = "//button[@class='modal-mask-closeBtn']";
    public static final String MY_DASHBOARD_LINK_XPATH = "//div[@class='profile-menu__item profile_menu__item--mydashboard']/a";

    static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementRegisterLink() {
        return driver.findElement(By.xpath(REGISTER_LINK_XPATH));
    }

    public static WebElement webElementYourAccountLink() {
        return driver.findElement(By.xpath(YOUR_ACCOUNT_LINK_XPATH));
    }

    public static WebElement webElementSignInLink() {
        return driver.findElement(By.xpath(SIGN_IN_XPATH));
    }

    public static WebElement welcomingAlertCloseButton() {
        return driver.findElement(By.xpath(WELCOMING_ALERT_CLOSE_BUTTON_XPATH));
    }

    public static WebElement webElementMyDashboardLink() {
        return driver.findElement(By.xpath(MY_DASHBOARD_LINK_XPATH));
    }

}



