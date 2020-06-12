package steps.booking;

import driver.GetDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.booking.HeaderPage;
import pages.booking.HomePage;
import pages.booking.LogInPage;
import pages.booking.SearchResultPage;
import settings.DriverConfig;

public class CommonSteps {

    static HomePage homePage = new HomePage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static HeaderPage headerPage = new HeaderPage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static LogInPage logInPage = new LogInPage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static void logIn(WebDriver driver, String email, String password) {
        headerPage.webElementSignInLink().click();
        logInPage.webElementUserTextField().sendKeys(email);
        logInPage.webElementNextButton().click();
        logInPage.webElementPasswordTextField().sendKeys(password);
        logInPage.webElementNextButton().click();
    }

    public static void setCityDate(WebDriver driver, String city, String startDate, String endDate) {
        homePage.webElementCitySearchLink().clear();
        homePage.webElementCitySearchLink().sendKeys(city);
        homePage.webElementCheckInField().click();
        homePage.webElementStartDate(startDate).click();
        homePage.webElementEndDate(endDate).click();
    }

    public static void setAdults(WebDriver driver, int adultsAmount){
        for (int i = 2; i < adultsAmount; i++){
            homePage.webElementAdultsIncreaseButton().click();
        }
    }

    public static void setChildren(WebDriver driver, int adultsAmount){
        for (int i = 0; i < adultsAmount; i++){
            homePage.webElementChildrenIncreaseButton().click();
        }
    }

    public static void setRooms(WebDriver driver, int adultsAmount){
        for (int i = 1; i < adultsAmount; i++){
            homePage.webElementRoomsIncreaseButton().click();
        }
    }

    public static void setGuests(WebDriver driver, int adultsAmount, int childrenAmount, int roomsAmount) {
        homePage.webElementGuestsToggle().click();
        CommonSteps.setAdults(driver, adultsAmount);
        CommonSteps.setChildren(driver, childrenAmount);
        CommonSteps.setRooms(driver, roomsAmount);
    }

    public static void setGuestsByActions(WebDriver driver) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(homePage.webElementGuestsToggle()).click().perform();
        actions.moveToElement(homePage.webElementAdultsIncreaseButton()).click().click().perform();
        actions.moveToElement(homePage.webElementRoomsIncreaseButton()).click().perform();
    }

    public static void submitButtonClick(WebDriver driver) {
        homePage.webElementSubmitButton().click();
    }

    public static void setThreeStarsHotel(WebDriver driver) {
        searchResultPage.webElementThreeStarsCheckbox().click();
    }

    public static void setFourStarsHotel(WebDriver driver) {
        searchResultPage.webElementFourStarsCheckbox().click();
    }

    public static void registerButtonClick(WebDriver driver) {
        headerPage.webElementRegisterLink().click();
    }

    public static void setHotelsWithLowestPrice(WebDriver driver) {
        searchResultPage.webElementHotelsWithLowestPriceCkeckbox().click();
    }

    public static void setHotelsWithHighestPrice(WebDriver driver) {
        searchResultPage.webElementHotelsWithHighestPriceCkeckbox().click();
    }

    public static void sortByLowestPrice(WebDriver driver) {
        searchResultPage.webElementLowestPriceFilter().click();
    }

    public static void openWishList(WebDriver driver){
        headerPage.webElementYourAccountLink().click();
        homePage.webElementWishListLink().click();
    }

}
