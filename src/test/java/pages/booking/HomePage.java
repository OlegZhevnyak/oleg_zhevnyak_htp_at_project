package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static final String CITY_SEARCH_FIELD_XPATH = "//input[@id='ss']";
    public static final String CHECK_IN_FIELD_XPATH =
            "//div[@class='xp__dates-inner']/div[2]//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']";
    public static final String SUBMIT_BUTTON_XPATH = "//button[@data-sb-id='main']";

    public static final String REGISTER_LINK_XPATH =
            "//li[@id='current_account_create']/a/div[@class='sign_in_wrapper']";
    public static final String SIGN_IN_XPATH = "//li[@id='current_account']/a";
    public static final String YOUR_ACCOUNT_LINK_XPATH = "//span[@id='profile-menu-trigger--content']";

    //Dashboard pre-menu
    public static final String MY_DASHBOARD_LINK_XPATH =
            "//div[@class='profile-menu__item profile_menu__item--mydashboard']/a";
    public static final String WISH_LIST_LINK_XPATH = "//a[@data-acc-aa-db='menu_wishlist']";

    public static final String WELCOMING_ALERT_CLOSE_BUTTON_XPATH = "//button[@class='modal-mask-closeBtn']";

    static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementCitySearchLink() {
        return driver.findElement(By.xpath(CITY_SEARCH_FIELD_XPATH));
    }

    public static WebElement webElementCheckInField() {
        return driver.findElement(By.xpath(CHECK_IN_FIELD_XPATH));
    }

    public static WebElement webElementStartDate(String startDate) {
        return driver.findElement(By.xpath("//td[@data-date='" + startDate + "']"));
    }

    public static WebElement webElementEndDate(String endDate) {
        return driver.findElement(By.xpath("//td[@data-date='" + endDate + "']"));
    }

    public static WebElement webElementSubmitButton() {
        return driver.findElement(By.xpath(SUBMIT_BUTTON_XPATH));
    }

    public static WebElement webElementRegisterLink() {
        return driver.findElement(By.xpath(REGISTER_LINK_XPATH));
    }

    public static WebElement webElementSignInLink() {
        return driver.findElement(By.xpath(SIGN_IN_XPATH));
    }

    public static WebElement welcomingAlertCloseButton() {
        return driver.findElement(By.xpath(WELCOMING_ALERT_CLOSE_BUTTON_XPATH));
    }

    public static WebElement webElementYourAccountLink() {
        return driver.findElement(By.xpath(YOUR_ACCOUNT_LINK_XPATH));
    }

    public static WebElement webElementMyDashboardLink() {
        return driver.findElement(By.xpath(MY_DASHBOARD_LINK_XPATH));
    }

    public static WebElement webElementWishListLink() {
        return driver.findElement(By.xpath(WISH_LIST_LINK_XPATH));
    }

}



