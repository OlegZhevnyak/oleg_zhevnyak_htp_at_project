package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {

    public static final String THREE_STARS_CHECKBOX_XPATH = "//a[@data-id='class-3']";
    public static final String FOUR_STARS_CHECKBOX_XPATH = "//a[@data-id='class-4']";
    public static final String TENTH_HOTEL_XPATH = "//div[@id='hotellist_inner']/div[10]";
    public static final String TENTH_HOTEL_NAME_XPATH = "//div[@id='hotellist_inner']/div[10]//h3/a/span[1]";

    public static final String HOTELS_WITH_LOWEST_PRICE_CHECKBOX_XPATH =
            "//a[@data-id='pri-1']";
    public static final String HOTELS_WITH_HIGHEST_PRICE_CHECKBOX_XPATH =
            "//a[@data-id='pri-5']";
    public static final String LOWEST_PRICE_FIRST_PHILTER_XPATH =
            "//a[@class='sort_option '][@role='button'][@data-category='price']";
    public static final String LOWEST_FROM_SEARCHED_PRICE_XPATH =
            "//div[@id='hotellist_inner']/div[1]//div[@class='room_details ']//div[2][@class='prco-ltr-right-align-helper']/div";

    public static final String FIRST_HOTEL_FAVORITE_BUTTON_XPATH =
            "//div[@id='hotellist_inner']/div[1]//div[@class='wl-entry-container']/button";
    public static final String LAST_HOTEL_FAVORITE_BUTTON_XPATH =
            "//div[@id='hotellist_inner']/div[last()-1]//div[@class='wl-entry-container']/button";
    public static final String FIRST_HOTEL_FAVORITE_SVG_XPATH =
            "//*[@id='hotellist_inner']/div[1]//button/*[1]";
    public static final String LAST_HOTEL_FAVORITE_SVG_XPATH =
            "//*[@id='hotellist_inner']/div[last()-1]//button/*[1]";
    public static final String FIRST_HOTEL_NAME_XPATH =
            "//*[@id='hotellist_inner']/div[1]//a[@class='hotel_name_link url']/*[1]";
    public static final String LAST_HOTEL_NAME_XPATH =
            "//*[@id='hotellist_inner']/div[last()-1]//a[@class='hotel_name_link url']/*[1]";

    public static final String HOTEL_FAVORITE_ON_SVG_CSS_SELECTOR =
            ".lists-sr-dropdown-square-heart.saved_in_wl .sr-wl-entry-heart-svg>path";

    static WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementThreeStarsCheckbox() {
        return driver.findElement(By.xpath(THREE_STARS_CHECKBOX_XPATH));
    }

    public static WebElement webElementFourStarsCheckbox() {
        return driver.findElement(By.xpath(FOUR_STARS_CHECKBOX_XPATH));
    }

    public static WebElement webElementHotelsWithLowestPriceCheckbox() {
        return driver.findElement(By.xpath(HOTELS_WITH_LOWEST_PRICE_CHECKBOX_XPATH));
    }

    public static WebElement webElementHotelsWithHighestPriceCheckbox() {
        return driver.findElement(By.xpath(HOTELS_WITH_HIGHEST_PRICE_CHECKBOX_XPATH));
    }

    public static WebElement webElementLowestPriceFilter() {
        return driver.findElement(By.xpath(LOWEST_PRICE_FIRST_PHILTER_XPATH));
    }

    public static WebElement webElementLowestFromSearchedPrice() {
        return driver.findElement(By.xpath(LOWEST_FROM_SEARCHED_PRICE_XPATH));
    }

    public static WebElement webElementTenthHotel() {
        return driver.findElement(By.xpath(TENTH_HOTEL_XPATH));
    }

    public static WebElement webElementTenthHotelName() {
        return driver.findElement(By.xpath(TENTH_HOTEL_NAME_XPATH));
    }

    public static WebElement webElementFirstHotelFavoriteButton() {
        return driver.findElement(By.xpath(FIRST_HOTEL_FAVORITE_BUTTON_XPATH));
    }

    public static WebElement webElementLastHotelFavoriteButton() {
        return driver.findElement(By.xpath(LAST_HOTEL_FAVORITE_BUTTON_XPATH));
    }

    public static WebElement webElementFirstHotelSvg() {
        return driver.findElement(By.xpath(FIRST_HOTEL_FAVORITE_SVG_XPATH));
    }

    public static WebElement webElementLastHotelSvg() {
        return driver.findElement(By.xpath(LAST_HOTEL_FAVORITE_SVG_XPATH));
    }

    public static WebElement webElementFirstHotelName() {
        return driver.findElement(By.xpath(FIRST_HOTEL_NAME_XPATH));
    }

    public static WebElement webElementLastHotelName() {
        return driver.findElement(By.xpath(LAST_HOTEL_NAME_XPATH));
    }

    public static List<WebElement> webElementsHotelOnSvg() {
        return driver.findElements(By.cssSelector(HOTEL_FAVORITE_ON_SVG_CSS_SELECTOR));
    }
}
