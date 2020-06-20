package steps.booking;

import driver.GetDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.booking.*;
import driver.settings.DriverConfig;

public class AddFavoriteHotelsSteps {

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static DashboardPage dashboardPage = new DashboardPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static Logger logger = Logger.getLogger(AddFavoriteHotelsSteps.class);

    public static void addFavoriteHotels(WebDriver driver){
        logger.debug("Click the favorite button of the first hotel from the hotels list.\n " +
                "Button xPath: //div[@id='hotellist_inner']/div[1]//div[@class='wl-entry-container']/button");
        searchResultPage.webElementFirstHotelFavoriteButton().click();
        logger.debug("Click the favorite button of the last hotel from the hotels list.\n " +
                "Button xPath: //div[@id='hotellist_inner']/div[last()-1]//div[@class='wl-entry-container']/button");
        searchResultPage.webElementLastHotelFavoriteButton().click();
    }

    public static String getFirstHotelFavoriteButtonColor(WebDriver driver){
        logger.debug("Get css value \"fill\" of the favorite button of the first hotel from the hotels list.\n " +
                "Svg of the favorite button xPath: //*[@id='hotellist_inner']/div[1]//button/*[1]");
        return searchResultPage.webElementFirstHotelSvg().getCssValue("fill");
    }

    public static String getLastHotelFavoriteButtonColor(WebDriver driver){
        logger.debug("Get css value \"fill\" of the favorite button of the last hotel from the hotels list.\n " +
                "Svg of the favorite button xPath: //*[@id='hotellist_inner']/div[last()-1]//button/*[1]");
        return searchResultPage.webElementLastHotelSvg().getCssValue("fill");
    }

    public static String getFirstHotelName(WebDriver driver){
        logger.debug("Get name of the first hotel from the hotels list.\n " +
                "Name of the first hotel xPath: //*[@id='hotellist_inner']/div[1]//a[@class='hotel_name_link url']/*[1]");
        return searchResultPage.webElementFirstHotelName().getText();
    }

    public static String getLastHotelName(WebDriver driver){
        logger.debug("Get name of the last hotel from the hotels list.\n " +
                "Name of the last hotel xPath: //*[@id='hotellist_inner']/div[last()-1]//a[@class='hotel_name_link url']/*[1]");
        return searchResultPage.webElementLastHotelName().getText();
    }

    public static String getFirstHotelNameFromWishList(WebDriver driver){
        logger.debug("Get name of the first hotel from the wish list.\n " +
                "Name of the first hotel xPath: //li[1][@class='bui-carousel__item']//*[@class='bui-card__header']//a");
        return dashboardPage.webElementFirstHotelName().getText();
    }

    public static String getSecondHotelNameFromWishList(WebDriver driver){
        logger.debug("Get name of the second hotel from the wish list.\n " +
                "Name of the second hotel xPath: //li[2][@class='bui-carousel__item']//*[@class='bui-card__header']//a");
        return dashboardPage.webElementSecondHotelName().getText();
    }
}
