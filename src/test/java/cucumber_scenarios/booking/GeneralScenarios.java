package cucumber_scenarios.booking;

import cucumber.api.java.en.When;
import driver.GetDriver;
import org.openqa.selenium.WebDriver;
import driver.settings.DriverConfig;
import driver.settings.ScreenMode;
import steps.GeneralSteps;
import steps.booking.CommonSteps;
import steps.booking.ExtendedSteps;

import java.util.concurrent.TimeUnit;

public class GeneralScenarios {

    public static final String BOOKING_URL = "https://www.booking.com/";
    public static final String EMAIL = "test55545@trashmail.com";
    public static final String PASSWORD = "test55545";

    public static WebDriver driver;

    @When("I open booking.com")
    public void iOpenBookingCom() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, BOOKING_URL, ScreenMode.MAXIMIZE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I LogIn as a existing user")
    public void iLogInAsAExistingUser()throws InterruptedException {
        CommonSteps.logIn(driver, EMAIL, PASSWORD);
        TimeUnit.SECONDS.sleep(3);
    }

    @When("I find hotels in {string} after {int} days for {int} days")
    public void iFindHotelsInAfterDaysForDays(String string, Integer int1, Integer int2) {
        CommonSteps.setCityDate(driver, string, ExtendedSteps.setDate(int1), ExtendedSteps.setDate(int1+int2));
    }

    @When("I find hotels for {int} adults, {int} children and {int} room")
    public void iFindHotelsForAdultsChildrenAndRoom(Integer int1, Integer int2, Integer int3) throws InterruptedException{
        CommonSteps.setGuests(driver, int1, int2, int3);
        CommonSteps.submitButtonClick(driver);
        TimeUnit.SECONDS.sleep(1);
    }

    @When("I close driver")
    public void iCloseDriver() {
        GeneralSteps.destroyDriver(driver);
    }

}
