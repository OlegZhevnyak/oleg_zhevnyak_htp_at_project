package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    public static final String EMAIL_CONFIRM_BANNER_XPATH = "//div[@class='email-confirm-banner']";
    public static final String FIRST_HOTEL_NAME_XPATH = "//li[1][@class=\"bui-carousel__item\"]//*[@class=\"bui-card__header\"]//a";
    public static final String SECOND_HOTEL_NAME_XPATH = "//li[2][@class=\"bui-carousel__item\"]//*[@class=\"bui-card__header\"]//a";

    public static WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementFirstHotelName(){
        return driver.findElement(By.xpath(FIRST_HOTEL_NAME_XPATH));
    }

    public static WebElement webElementSecondHotelName(){
        return driver.findElement(By.xpath(SECOND_HOTEL_NAME_XPATH));
    }

}
