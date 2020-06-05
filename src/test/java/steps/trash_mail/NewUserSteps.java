package steps.trash_mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.trash_mail.MainPage;

public class NewUserSteps {

    public static void newUserTabClick(WebDriver driver) {
        MainPage.webElementNewUserTab(driver).click();
    }

    public static void usernameType(WebDriver driver, String username) {
        MainPage.webElementUsernameTextField(driver).sendKeys(username);
    }

    public static void passwordType(WebDriver driver, String password) {
        MainPage.webElementPasswordTextField(driver).sendKeys(password);
    }

    public static void confirmPasswordType(WebDriver driver, String confirmPassword) {
        MainPage.webElementPasswordConfirmTextField(driver).sendKeys(confirmPassword);
    }

    public static void realEmailType(WebDriver driver, String realEmail) {
        MainPage.webElementRealEmailTextField(driver).sendKeys(realEmail);
    }

    public static void registerButtonClick(WebDriver driver) {
        MainPage.webElementRegisterButton(driver).click();
    }

    public static void printResult(WebDriver driver){
        String resultAlertString = MainPage.ResultAlert(driver).getText();
        System.out.println("Result is: " + resultAlertString);
    }

    public static String actualResult(WebDriver driver){
        String resultAlertString = MainPage.ResultAlert(driver).getText();
        return resultAlertString;
    }

}
