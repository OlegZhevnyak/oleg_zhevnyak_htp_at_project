package steps.booking;

import driver.GetDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.booking.SearchResultPage;
import settings.DriverConfig;

public class ChangeColorSteps {

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static void scrollToThenthHotel(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",
                searchResultPage.webElementTenthHotel());
    }

    public static void changeThenthHotelNameColor(WebDriver driver, String setColor) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = '" + setColor + "'",
                searchResultPage.webElementTenthHotelName());
    }
}
