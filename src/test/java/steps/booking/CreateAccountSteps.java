package steps.booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.booking.AccountCreate;
import pages.booking.DashboardPage;
import pages.booking.HomePage;

public class CreateAccountSteps {

    public static WebElement element;

    public static void registerButtonClick(WebDriver driver) {
        HomePage.webElementRegisterLink(driver).click();
    }

   // AccountCreate accountCreate = new AccountCreate(driver);

    public static void emailSet(WebDriver driver, String email) {
        AccountCreate.webElementEmailTextField(driver).sendKeys(email);
        AccountCreate.webElementGetStartedButton(driver).click();
    }

    public static void passwordSet(WebDriver driver, String password, String confirmPassword) {
        AccountCreate.webElementCreatePasswordTextField(driver).sendKeys(password);
        AccountCreate.webElementConfirmPasswordTextField(driver).sendKeys(confirmPassword);
        AccountCreate.webElementCreateAccountButton(driver).click();
    }

    public static void dashboardOpen(WebDriver driver) {
        HomePage.webElementYourAccountLink(driver).click();
        HomePage.webElementMyDashboardLink(driver).click();
    }

    public static WebElement webElementEmailConfirmBanner(WebDriver driver){
        element = DashboardPage.webElementEmailConfirmBanner(driver);
        return element;
    }

}
