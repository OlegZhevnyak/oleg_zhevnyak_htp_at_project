package steps.booking;

import driver.GetDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.booking.AccountCreatePage;
import pages.booking.HeaderPage;
import pages.booking.HomePage;
import settings.DriverConfig;

import java.util.ArrayList;

public class CreateAccountSteps {

    public static final String BOOKING_URL = "https://www.booking.com/";

    static AccountCreatePage accountCreatePage = new AccountCreatePage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static HomePage homePage = new HomePage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static HeaderPage headerPage = new HeaderPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static Logger logger = Logger.getLogger(CreateAccountSteps.class);

    public static void emailSet(WebDriver driver, String email) {
        logger.debug("Type " + email + " to Email text field.\n " +
                "Email text field xPath: //input[@id='login_name_register']");
        accountCreatePage.webElementEmailTextField().sendKeys(email);
        logger.debug("Click Get started button.\n " +
                "Get started button xPath: //button[@class='bui-button bui-button--large bui-button--wide']");
        accountCreatePage.webElementGetStartedButton().click();
    }

    public static void passwordSet(WebDriver driver, String password, String confirmPassword) {
        logger.debug("Type " + password + " Create password text field.\n " +
                "Create password text field xPath: //input[@id='password']");
        accountCreatePage.webElementCreatePasswordTextField().sendKeys(password);
        logger.debug("Type " + confirmPassword + " to Confirm password text field.\n " +
                "Confirm password text field xPath: //input[@id='confirmed_password']");
        accountCreatePage.webElementConfirmPasswordTextField().sendKeys(confirmPassword);
        logger.debug("Click Create account button.\n " +
                "Create account button xPath: //button[@class='bui-button bui-button--large bui-button--wide']");
        accountCreatePage.webElementCreateAccountButton().click();
    }

    public static void dashboardOpen(WebDriver driver) {
        logger.debug("Write two tabs");
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        logger.debug("Switch to the first tab");
        driver.switchTo().window(tabs2.get(0));
        logger.debug("Close the first tab");
        driver.close();
        logger.debug("Switch to the second tab");
        driver.switchTo().window(tabs2.get(1));
        logger.debug("Open booking.com");
        driver.get(BOOKING_URL);
        logger.debug("Click Your account link.\n " +
                "Your account link xPath: //span[@id='profile-menu-trigger--content']");
        headerPage.webElementYourAccountLink().click();
        logger.debug("Click My dashboard link.\n " +
                "My dashboard link xPath: //div[@class='profile-menu__item profile_menu__item--mydashboard']/a");
        homePage.webElementMyDashboardLink().click();
    }

    public static void welcomingAlertClose(WebDriver driver) {
        logger.debug("Close Welcoming alert.\n " +
                "Welcoming alert xPath: //button[@class='modal-mask-closeBtn']");
        homePage.welcomingAlertCloseButton().click();
    }
}
