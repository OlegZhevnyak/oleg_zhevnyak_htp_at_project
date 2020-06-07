package steps.booking;

import driver.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.booking.AccountCreatePage;
import pages.booking.DashboardPage;
import pages.booking.HomePage;
import settings.DriverConfig;

public class CreateAccountSteps {

    public static WebElement element;



    static AccountCreatePage accountCreatePage = new AccountCreatePage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static HomePage homePage = new HomePage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static void registerButtonClick(WebDriver driver) {
        homePage.webElementRegisterLink(driver).click();
    }

    public static void emailSet(String email) {
        accountCreatePage.webElementEmailTextField().sendKeys(email);
        accountCreatePage.webElementGetStartedButton().click();
    }

//    public static void passwordSet(WebDriver driver, String password, String confirmPassword) {
//        AccountCreatePage.webElementCreatePasswordTextField(driver).sendKeys(password);
//        AccountCreatePage.webElementConfirmPasswordTextField(driver).sendKeys(confirmPassword);
//        AccountCreatePage.webElementCreateAccountButton(driver).click();
//    }
//
//    public static void dashboardOpen(WebDriver driver) {
//        HomePage.webElementYourAccountLink(driver).click();
//        HomePage.webElementMyDashboardLink(driver).click();
//    }
//
//    public static WebElement webElementEmailConfirmBanner(WebDriver driver){
//        element = DashboardPage.webElementEmailConfirmBanner(driver);
//        return element;
//    }

}
