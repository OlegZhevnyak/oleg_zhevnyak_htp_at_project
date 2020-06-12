package steps.booking;

import driver.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.booking.SearchResultPage;
import settings.DriverConfig;

public class PriceSteps {

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static int getPrice(WebElement element) {
        String priceString = element.getText();
        priceString = priceString.replaceAll("[^0-9]+", "");
        int priceInt = Integer.parseInt(priceString);
        return priceInt;
    }

    public static int getLowestPrice(WebDriver driver) {
        return getPrice(searchResultPage.webElementHotelsWithLowestPriceCkeckbox());
    }

    public static int getHighestPrice(WebDriver driver) {
        return getPrice(searchResultPage.webElementHotelsWithHighestPriceCkeckbox());
    }

    public static int getLowestFromSearchedPrice(WebDriver driver) {
        return getPrice(searchResultPage.webElementLowestFromSearchedPrice());
    }
}
