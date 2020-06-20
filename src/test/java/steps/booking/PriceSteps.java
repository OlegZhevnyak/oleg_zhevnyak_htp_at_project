package steps.booking;

import driver.GetDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.booking.SearchResultPage;
import driver.settings.DriverConfig;

public class PriceSteps {

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static Logger logger = Logger.getLogger(PriceSteps.class);

    public static int getPrice(WebElement element) {
        logger.debug("Get text from element");
        String priceString = element.getText();
        logger.debug("Replace all symbols except numbers from text");
        priceString = priceString.replaceAll("[^0-9]+", "");
        logger.debug("Parse String text to int");
        int priceInt = Integer.parseInt(priceString);
        return priceInt;
    }

    public static int getLowestPrice(WebDriver driver) {
        logger.debug("Get lowest price from Hotels with lowest price checkbox.\n " +
                "Hotels with lowest price checkbox xPath: //a[@data-id='pri-1']");
        return getPrice(searchResultPage.webElementHotelsWithLowestPriceCheckbox());
    }

    public static int getHighestPrice(WebDriver driver) {
        logger.debug("Get highest price from Hotels with highest price checkbox.\n " +
                "Hotels with highest price checkbox xPath: //a[@data-id='pri-5']");
        return getPrice(searchResultPage.webElementHotelsWithHighestPriceCheckbox());
    }

    public static int getLowestFromSearchedPrice(WebDriver driver) {
        logger.debug("Get Lowest price from searched hotels.\n " +
                "Lowest price from searched hotels xPath: " +
                "//div[@id='hotellist_inner']/div[1]//div[@class='room_details ']//div[2][@class='prco-ltr-right-align-helper']/div");
        return getPrice(searchResultPage.webElementLowestFromSearchedPrice());
    }
}
