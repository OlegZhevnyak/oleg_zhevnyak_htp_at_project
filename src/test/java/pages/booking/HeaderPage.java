package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {

    public static final String BOOKING_LOGO_XPATH =
            "//img[@id='logo_no_globe_new_logo']";
    public static final String SET_CURRENCY_LINK_XPATH =
            "//a[@class='popover_trigger long_currency_text']";
    public static final String SET_LANGUAGE_LINK_XPATH =
            "//a[@class='popover_trigger']";
    public static final String HELP_CENTRE_LINK_XPATH =
            "//a[@class='helpcenter_va_middle']";
    public static final String LIST_YOUR_PROPERTY_LINK_XPATH =
            "//a/div[@class='sign_in_wrapper sign_in_wrapper-add-property']";

public static final String STAYS_TAB_XPATH =
            "//span[@class='xpb__link selected']";
public static final String FLIGHTS_TAB_XPATH =
            "//a[@data-decider-header='flights']";
public static final String CAR_RENTALS_TAB_XPATH =
            "//*[contains(@href,'https://www.booking.com/cars')]";
public static final String ATTRACTIONS_TAB_XPATH =
            "//*[contains(@href,'https://experiences.booking.com/attractions')]";
public static final String AIRPORT_TAXIS_TAB_XPATH =
            "//*[contains(@href,'https://www.booking.com/taxi')]";

    public static final String REGISTER_LINK_XPATH =
            "//li[@id='current_account_create']/a/div[@class='sign_in_wrapper']";
    public static final String SIGN_IN_XPATH = "//li[@id='current_account']/a";
    public static final String YOUR_ACCOUNT_LINK_XPATH = "//span[@id='profile-menu-trigger--content']";

    public static WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementBookingLogoLink() {
        return driver.findElement(By.xpath(BOOKING_LOGO_XPATH));
    }

    public static WebElement webElementSetCurrencyLink() {
        return driver.findElement(By.xpath(SET_CURRENCY_LINK_XPATH));
    }

    public static WebElement webElementSetLanguageLink() {
        return driver.findElement(By.xpath(SET_LANGUAGE_LINK_XPATH));
    }

    public static WebElement webElementHelpCentreLink() {
        return driver.findElement(By.xpath(HELP_CENTRE_LINK_XPATH));
    }

    public static WebElement webElementListYourPropertyLink() {
        return driver.findElement(By.xpath(LIST_YOUR_PROPERTY_LINK_XPATH));
    }

    public static WebElement webElementStaysTab() {
        return driver.findElement(By.xpath(STAYS_TAB_XPATH));
    }

    public static WebElement webElementFlightsTab() {
        return driver.findElement(By.xpath(FLIGHTS_TAB_XPATH));
    }

    public static WebElement webElementCarRentalsTab() {
        return driver.findElement(By.xpath(CAR_RENTALS_TAB_XPATH));
    }

    public static WebElement webElementAttractionsTab() {
        return driver.findElement(By.xpath(ATTRACTIONS_TAB_XPATH));
    }

    public static WebElement webElementAirportTaxisTab() {
        return driver.findElement(By.xpath(AIRPORT_TAXIS_TAB_XPATH));
    }

    public static WebElement webElementRegisterLink() {
        return driver.findElement(By.xpath(REGISTER_LINK_XPATH));
    }

    public static WebElement webElementSignInLink() {
        return driver.findElement(By.xpath(SIGN_IN_XPATH));
    }

    public static WebElement webElementYourAccountLink() {
        return driver.findElement(By.xpath(YOUR_ACCOUNT_LINK_XPATH));
    }
}
