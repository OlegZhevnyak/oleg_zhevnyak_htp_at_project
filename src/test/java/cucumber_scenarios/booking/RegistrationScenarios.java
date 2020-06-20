package cucumber_scenarios.booking;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.GetDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.booking.DashboardPage;
import driver.settings.DriverConfig;
import steps.booking.CommonSteps;
import steps.booking.CreateAccountSteps;
import steps.booking.ExtendedSteps;
import steps.yandex_mail.RegistrationConfirmSteps;

public class RegistrationScenarios {

    public static final String DUMMY_EMAIL = "lynn92@0box.eu";
    public static final String DUMMY_EMAIL_1 = "ansley14@0box.eu";
    public static final String DUMMY_EMAIL_2 = "lilian_kutch54@0box.eu";
    public static final String DUMMY_EMAIL_3 = "candelario.upton98@0box.eu";
    public static final String DUMMY_EMAIL_4 = "everett81@0box.eu";
    public static final String BOOKING_PASSWORD = "test555456";
    public static final String BOOKING_CONFIRM_PASSWORD = "test555456";

    public static final String YANDEX_EMAIL = "test55545@yandex.by";
    public static final String YANDEX_PASSWORD = "55545678";
    public static final String YANDEX_SEARCH_DATA = "booking";

    public static WebDriver driver;

    @When("I register new account {string}")
    public void iRegisterNewAccount(String string) {
        CommonSteps.registerButtonClick(driver);
        CreateAccountSteps.emailSet(driver, string);
        CreateAccountSteps.passwordSet(driver, BOOKING_PASSWORD, BOOKING_CONFIRM_PASSWORD);
        CreateAccountSteps.welcomingAlertClose(driver);
    }

    @When("I confirm registration")
    public void iConfirmRegistration() throws InterruptedException {
        RegistrationConfirmSteps.RegistrationConfirm(driver = GetDriver.getWebDriver(DriverConfig.CHROME),
                YANDEX_EMAIL, YANDEX_PASSWORD, YANDEX_SEARCH_DATA);
    }

    @When("I open dashboard")
    public void iOpenDashboard() {
        CreateAccountSteps.dashboardOpen(driver);
    }

    @Then("I check that ConfirmBanner is not present")
    public void iCheckThatConfirmBannerIsNotPresent() {
        Assert.assertFalse("Registration wasn't confirmed. Check email: " + YANDEX_EMAIL + ".",
                ExtendedSteps.isElementExist(driver, DashboardPage.EMAIL_CONFIRM_BANNER_XPATH));
    }

}
