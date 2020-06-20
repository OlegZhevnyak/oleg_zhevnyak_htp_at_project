package tests.trash_mail;

import driver.GetDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import driver.settings.DriverConfig;
import driver.settings.ScreenMode;
import steps.GeneralSteps;
import steps.trash_mail.NewUserSteps;

public class CreateNewUserTest {

    String URL = "https://trashmail.com/";
    String Username = "test5554500";
    String Password = "555457";
    String ConfirmPassword = "555457";
    String RealEmailAddress = "test55545@yandex.by";

    String ExpectedResult = "An email with a confirmation link has been sent to your email address "
            + RealEmailAddress + "\n" + "Please confirm the link to complete the registration.";

    WebDriver driver;

    @Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, URL, ScreenMode.MAXIMIZE);
    }

    @Test
    public void creatingNewUserTest() throws InterruptedException, Throwable {

        NewUserSteps.newUserTabClick(driver);
        NewUserSteps.usernameType(driver, Username);
        NewUserSteps.passwordType(driver, Password);
        NewUserSteps.confirmPasswordType(driver, ConfirmPassword);

        WebElement realEmailTextField = driver.findElement(By.xpath
                ("//div[@id=\"tab-mob-register\"]//input[@ng-model=\"user.email\"]"));
        realEmailTextField.sendKeys(RealEmailAddress);



//        NewUserSteps.realEmailType(driver, RealEmailAddress);
        NewUserSteps.registerButtonClick(driver);
        NewUserSteps.printResult(driver);
        Assert.assertEquals("A new user wasn't created. Check the Error alert: " + NewUserSteps.actualResult(driver) + " .",
                ExpectedResult, NewUserSteps.actualResult(driver));
    }

    @After
    public void postCondition() {
        GeneralSteps.destroyDriver(driver);
    }
}
