package steps.booking;

import driver.GetDriver;
import org.apache.log4j.Logger;
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

    public static Logger logger = Logger.getLogger(CommonSteps.class);

    public static void logIn(WebDriver driver, String email, String password) {
        logger.debug("Click the sign in link.\n " +
                "Sign in link xPath: //li[@id='current_account']/a");
        headerPage.webElementSignInLink().click();
        logger.debug("Type " + email + " to the user text field.\n " +
                "User text field xPath: //input[@id='username']");
        logInPage.webElementUserTextField().sendKeys(email);
        logger.debug("Click the Next button.\n " +
                "Next button xPath: //button[@class='bui-button bui-button--large bui-button--wide']");
        logInPage.webElementNextButton().click();
        logger.debug("Type " + password + " to the Password text field.\n " +
                "Password text field xPath: //input[@id='username']");
        logInPage.webElementPasswordTextField().sendKeys(password);
        logger.debug("Click the Next button.\n " +
                "Next button xPath: //input[@id='password']");
        logInPage.webElementNextButton().click();
    }

    public static void setCityDate(WebDriver driver, String city, String startDate, String endDate) {
        logger.debug("Clear the City search field.\n " +
                "City search field xPath: //input[@id='ss']");
        homePage.webElementCitySearchField().clear();
        logger.debug("Type " + city + " to the City search field.\n " +
                "City search field xPath: //input[@id='ss']");
        homePage.webElementCitySearchField().sendKeys(city);
        logger.debug("Click the Check In button.\n " +
                "Check In button xPath: //div[@class='xp__dates-inner']/div[2]//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
        homePage.webElementCheckInButton().click();
        logger.debug("Choose and click the StartDate.\n " +
                "StartDate xPath: //td[@data-date='\" + startDate + \"']");
        homePage.webElementStartDate(startDate).click();
        logger.debug("Choose and click the EndDate.\n " +
                "EndDate xPath: //td[@data-date='\" + endDate + \"']");
        homePage.webElementEndDate(endDate).click();
    }

    public static void setAdults(WebDriver driver, int adultsAmount) {
        for (int i = 2; i < adultsAmount; i++) {
            logger.debug("Click Add adults button.\n " +
                    "Add adults button xPath: //button[@aria-describedby='group_adults_desc'][2]");
            homePage.webElementAdultsIncreaseButton().click();
        }
    }

    public static void setChildren(WebDriver driver, int childrenAmount) {
        for (int i = 0; i < childrenAmount; i++) {
            logger.debug("Click Add children button.\n " +
                    "Add children button xPath: //button[@aria-describedby='group_children_desc'][2]");
            homePage.webElementChildrenIncreaseButton().click();
        }
    }

    public static void setRooms(WebDriver driver, int roomsAmount) {
        for (int i = 1; i < roomsAmount; i++) {
            logger.debug("Click Add rooms button.\n " +
                    "Add rooms button xPath: //button[@aria-describedby='no_rooms_desc'][2]");
            homePage.webElementRoomsIncreaseButton().click();
        }
    }

    public static void setGuests(WebDriver driver, int adultsAmount, int childrenAmount, int roomsAmount) {
        logger.debug("Click Guests toggle.\n " +
                "Guests toggle xPath: //*[@class='xp__guests__count']");
        homePage.webElementGuestsToggle().click();
        logger.debug("Set adults amount = " + adultsAmount);
        CommonSteps.setAdults(driver, adultsAmount);
        logger.debug("Set children amount = " + childrenAmount);
        CommonSteps.setChildren(driver, childrenAmount);
        logger.debug("Set rooms amount = " + roomsAmount);
        CommonSteps.setRooms(driver, roomsAmount);
    }

    public static void setGuestsByActions(WebDriver driver) throws InterruptedException {
        Actions actions = new Actions(driver);
        logger.debug("Move to Guests toggle by actions and click it.\n " +
                "Guests toggle xPath: //*[@class='xp__guests__count']");
        actions.moveToElement(homePage.webElementGuestsToggle()).click().perform();
        logger.debug("Move to Add adults button by actions and click it one time.\n " +
                "Add adults button xPath: //button[@aria-describedby='group_adults_desc'][2]");
        actions.moveToElement(homePage.webElementAdultsIncreaseButton()).click().click().perform();
        logger.debug("Move to Add rooms button by actions and click it one time.\n " +
                "Add rooms button xPath: //button[@aria-describedby='no_rooms_desc'][2]");
        actions.moveToElement(homePage.webElementRoomsIncreaseButton()).click().perform();
    }

    public static void submitButtonClick(WebDriver driver) {
        logger.debug("Click Guests toggle.\n " +
                "Guests toggle xPath: //*[@class='xp__guests__count']");
        homePage.webElementSubmitButton().click();
    }

    public static void setThreeStarsHotel(WebDriver driver) {
        logger.debug("Click Three Stars checkbox.\n " +
                "Three Stars checkbox xPath: //a[@data-id='class-3']");
        searchResultPage.webElementThreeStarsCheckbox().click();
    }

    public static void setFourStarsHotel(WebDriver driver) {
        logger.debug("Click Four Stars checkbox.\n " +
                "Four Stars checkbox xPath: //a[@data-id='class-4']");
        searchResultPage.webElementFourStarsCheckbox().click();
    }

    public static void registerButtonClick(WebDriver driver) {
        logger.debug("Click Register link.\n " +
                "Register link xPath: //li[@id='current_account_create']/a/div[@class='sign_in_wrapper']");
        headerPage.webElementRegisterLink().click();
    }

    public static void setHotelsWithLowestPrice(WebDriver driver) {
        logger.debug("Click Hotels with lowest price ckeckbox.\n " +
                "Hotels with lowest price checkbox xPath: //a[@data-id='pri-1']");
        searchResultPage.webElementHotelsWithLowestPriceCheckbox().click();
    }

    public static void setHotelsWithHighestPrice(WebDriver driver) {
        logger.debug("Click Hotels with highest price checkbox.\n " +
                "Hotels with highest price checkbox xPath: //a[@data-id='pri-5']");
        searchResultPage.webElementHotelsWithHighestPriceCheckbox().click();
    }

    public static void sortByLowestPrice(WebDriver driver) {
        logger.debug("Click Lowest price filter.\n " +
                "Lowest price filter xPath: //a[@class='sort_option '][@role='button'][@data-category='price']");
        searchResultPage.webElementLowestPriceFilter().click();
    }

    public static void openWishList(WebDriver driver) {
        logger.debug("Click Your account link.\n " +
                "Your account link xPath: //span[@id='profile-menu-trigger--content']");
        headerPage.webElementYourAccountLink().click();
        logger.debug("Click Wish list link.\n " +
                "Wish list link xPath: //a[@data-acc-aa-db='menu_wishlist']");
        homePage.webElementWishListLink().click();
    }
}
