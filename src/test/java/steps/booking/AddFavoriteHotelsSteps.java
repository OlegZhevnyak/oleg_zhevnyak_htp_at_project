package steps.booking;

import driver.GetDriver;
import org.openqa.selenium.WebDriver;
import pages.booking.*;
import settings.DriverConfig;

public class AddFavoriteHotelsSteps {

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static DashboardPage dashboardPage = new DashboardPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static void addFavoriteHotels(WebDriver driver){
        searchResultPage.webElementFirstHotelFavoriteButton().click();
        searchResultPage.webElementLastHotelFavoriteButton().click();
    }

    public static String getFirstHotelFavoriteButtonColor(WebDriver driver){
        return searchResultPage.webElementFirstHotelSvg().getCssValue("fill");
    }

    public static String getLastHotelFavoriteButtonColor(WebDriver driver){
        return searchResultPage.webElementLastHotelSvg().getCssValue("fill");
    }

    public static String getFirstHotelName(WebDriver driver){
        return searchResultPage.webElementFirstHotelName().getText();
    }

    public static String getLastHotelName(WebDriver driver){
        return searchResultPage.webElementLastHotelName().getText();
    }

    public static String getFirstHotelNameFromWishList(WebDriver driver){
        return dashboardPage.webElementFirstHotelName().getText();
    }

    public static String getSecondHotelNameFromWishList(WebDriver driver){
        return dashboardPage.webElementSecondHotelName().getText();
    }

}
