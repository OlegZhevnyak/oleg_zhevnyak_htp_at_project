package steps.booking;

import driver.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.booking.SearchResultPage;
import settings.DriverConfig;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExtendedSteps {

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static String setDate(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, days);
        Date tenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datePlusTreeDays = dateFormat.format(tenDays);
        return datePlusTreeDays;
    }

    public static Boolean isElementExist(WebDriver driver, String xPath) {
        Boolean elementCondition = false;
        try {
            elementCondition = driver.findElement(By.xpath(xPath)).isDisplayed();
        } catch (NoSuchElementException e) {
            return elementCondition;
        }
        return elementCondition;
    }

    public static Boolean colorVerify(WebDriver driver, WebElement element, String expectedColor) {
        Boolean colorsEqual = false;
        if (element.getAttribute("fill") == expectedColor)
            colorsEqual = true;
        return colorsEqual;
    }

    public static Boolean colorsVerify(WebDriver driver, String expectedColor) {
        Boolean colorsEqual = false;
        for (int i = 0; i < searchResultPage.webElementsHotelOnSvg().size(); i++) {
            if (searchResultPage.webElementsHotelOnSvg().get(i).getAttribute("fill") == expectedColor) {
                colorsEqual = true;
            } else {
                colorsEqual = false;
                break;
            }
        }
        return colorsEqual;
    }

}
