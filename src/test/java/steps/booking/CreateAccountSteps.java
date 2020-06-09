package steps.booking;

import driver.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.booking.AccountCreatePage;
import pages.booking.DashboardPage;
import pages.booking.HomePage;
import settings.DriverConfig;

import java.util.ArrayList;

public class CreateAccountSteps {

    public static final String BOOKING_URL = "https://www.booking.com/";

    static AccountCreatePage accountCreatePage = new AccountCreatePage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static HomePage homePage = new HomePage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static DashboardPage dashboardPage = new DashboardPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static void registerButtonClick(WebDriver driver) {
        homePage.webElementRegisterLink().click();
    }

    public static void emailSet(WebDriver driver, String email) {
        accountCreatePage.webElementEmailTextField().sendKeys(email);
        accountCreatePage.webElementGetStartedButton().click();
    }

    public static void passwordSet(WebDriver driver, String password, String confirmPassword) {
        accountCreatePage.webElementCreatePasswordTextField().sendKeys(password);
        accountCreatePage.webElementConfirmPasswordTextField().sendKeys(confirmPassword);
        accountCreatePage.webElementCreateAccountButton().click();
    }

    public static void dashboardOpen(WebDriver driver) {
        //write 2 tabs
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));                     //switch to the first tab
        driver.close();                                             //close the first tab
        driver.switchTo().window(tabs2.get(1));                     //switch to the second tab
        driver.get(BOOKING_URL);
        homePage.webElementYourAccountLink().click();
        homePage.webElementMyDashboardLink().click();
    }

    public static void signIn(WebDriver driver, String email, String password) {
        driver.get(BOOKING_URL);
        homePage.webElementSignInLink().click();
        accountCreatePage.webElementEmailTextField().sendKeys(email);
        accountCreatePage.webElementGetStartedButton().click();
        accountCreatePage.webElementCreatePasswordTextField().sendKeys(password);
        accountCreatePage.webElementCreateAccountButton().click();
    }

    public static void welcomingAlertClose(WebDriver driver) {
        homePage.welcomingAlertCloseButton().click();
    }

    public static Boolean isConfirmBannerPresented(WebDriver driver) {
        Boolean elementCondition = false;
        try {
            elementCondition = driver.findElement(By.xpath(dashboardPage.EMAIL_CONFIRM_BANNER_XPATH)).isDisplayed();
        } catch (NoSuchElementException e) {
            return elementCondition;
        }
        return elementCondition;
    }

}
