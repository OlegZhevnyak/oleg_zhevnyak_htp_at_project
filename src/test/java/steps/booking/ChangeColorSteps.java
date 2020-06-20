package steps.booking;

import driver.GetDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.booking.SearchResultPage;
import driver.settings.DriverConfig;

public class ChangeColorSteps {

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static Logger logger = Logger.getLogger(ChangeColorSteps.class);

    public static void scrollToTenthHotel(WebDriver driver) {
        logger.debug("Scroll to the tenth hotel.\n " +
                "Tenth hotel xPath: //div[@id='hotellist_inner']/div[10]");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",
                searchResultPage.webElementTenthHotel());
    }

    public static void changeTenthHotelNameColor(WebDriver driver, String setColor) {
        logger.debug("Change color of the tenth hotel name.\n " +
                "Tenth hotel name xPath: //div[@id='hotellist_inner']/div[10]//h3/a/span[1]");
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = '" + setColor + "'",
                searchResultPage.webElementTenthHotelName());
    }
}
