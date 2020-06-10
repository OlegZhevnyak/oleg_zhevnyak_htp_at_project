package steps.booking;

import driver.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.booking.*;
import settings.DriverConfig;

public class AddFavoriteHotelsSteps {

    public static final String BOOKING_URL = "https://www.booking.com/";

    static HomePage homePage = new HomePage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static LogInPage logInPage = new LogInPage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static DashboardPage dashboardPage = new DashboardPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static void logIn(WebDriver driver, String email, String password) {
        homePage.webElementSignInLink().click();
        logInPage.webElementUserTextField().sendKeys(email);
        logInPage.webElementNextButton().click();
        logInPage.webElementPasswordTextField().sendKeys(password);
        logInPage.webElementNextButton().click();
    }

    public static void setCityDatePersons(WebDriver driver, String city, String startDate, String endDate) {
        homePage.webElementCitySearchLink().clear();
        homePage.webElementCitySearchLink().sendKeys(city);
        homePage.webElementCheckInField().click();
        homePage.webElementStartDate(startDate).click();
        homePage.webElementEndDate(endDate).click();
        homePage.webElementSubmitButton().click();
    }

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

    public static void openWishList(WebDriver driver){
        homePage.webElementYourAccountLink().click();
        homePage.webElementWishListLink().click();
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


    public static Boolean colorVerify(WebDriver driver, WebElement element, String expectedColor) {
        Boolean colorsEqual = false;
        if (element.getAttribute("fill") == expectedColor)
            colorsEqual = true;
        System.out.println(element.getCssValue("fill"));
        System.out.println(colorsEqual);
        return colorsEqual;
    }

    public static Boolean colorsVerify(WebDriver driver, String expectedColor) {
        Boolean colorsEqual = false;
        for (int i = 0; i < searchResultPage.webElementsHotelOnSvg().size(); i++) {
            if (searchResultPage.webElementsHotelOnSvg().get(i).getAttribute("fill") == expectedColor) {
                colorsEqual = true;
                System.out.println(searchResultPage.webElementsHotelOnSvg().get(i).getAttribute("fill"));
            } else {
                System.out.println(searchResultPage.webElementsHotelOnSvg().get(i).getAttribute("fill"));
                colorsEqual = false;
                break;
            }
        }
        return colorsEqual;
    }

}
