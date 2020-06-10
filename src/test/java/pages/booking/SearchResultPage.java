package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {

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


    public static WebElement webElementFirstHotelFavoriteButton() {
        return driver.findElement(By.xpath(FIRST_HOTEL_FAVORITE_BUTTON_XPATH));
    }

    public static WebElement webElementLastHotelFavoriteButton() {
        return driver.findElement(By.xpath(LAST_HOTEL_FAVORITE_BUTTON_XPATH));
    }

    public static WebElement webElementFirstHotelSvg(){
        return driver.findElement(By.xpath(FIRST_HOTEL_FAVORITE_SVG_XPATH));
    }

    public static WebElement webElementLastHotelSvg(){
        return driver.findElement(By.xpath(LAST_HOTEL_FAVORITE_SVG_XPATH));
    }

    public static WebElement webElementFirstHotelName(){
        return driver.findElement(By.xpath(FIRST_HOTEL_NAME_XPATH));
    }

    public static WebElement webElementLastHotelName(){
        return driver.findElement(By.xpath(LAST_HOTEL_NAME_XPATH));
    }

    public static List<WebElement> webElementsHotelOnSvg(){
        return driver.findElements(By.cssSelector(HOTEL_FAVORITE_ON_SVG_CSS_SELECTOR));
    }

}
