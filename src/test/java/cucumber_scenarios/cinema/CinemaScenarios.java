package cucumber_scenarios.cinema;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.GetDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import driver.settings.DriverConfig;
import driver.settings.ScreenMode;
import steps.GeneralSteps;
import steps.cinema.LogInSteps;
import steps.cinema.SearchMovieSteps;

import java.util.concurrent.TimeUnit;

public class CinemaScenarios {

    public static final String CINEMA_URL = "https://silverscreen.by/";
    public static final String EMAIL = "test55545@trashmail.com";
    public static final String PASSWORD = "test55545";

    public static WebDriver driver;

    @Given("I open an app")
    public void iOpenAnApp() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
        GeneralSteps.openPage(driver, CINEMA_URL, ScreenMode.MAXIMIZE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I search for {string} word")
    public void iSearchForSearchWordWord(String string) {
        SearchMovieSteps.searchMovie(driver, string);
    }

    @When("I login with {string} and {string}")
    public void iLoginWithAnd(String string, String string2) throws InterruptedException {
        LogInSteps.logIn(driver, string, string2);
    }

    @Then("I can see Red Carpet Club {string} in upper right corner")
    public void iCanSeeRedCarpetClubInUpperRightCorner(String string) {
        Assert.assertTrue("User level should be" + string + ".",
                LogInSteps.compareUserLevel(driver, string));
    }

    @Then("I see the list of movie items")
    public void iSeeTheListOfMovieItems() {
        SearchMovieSteps.getMoviesAmount(driver);
        Assert.assertTrue("There is no films list. Check searched data.",
                SearchMovieSteps.isFoundFilmsListPresent(driver));
    }

    @Then("Each item name or description contains {string}")
    public void eachItemNameOrDescriptionContainsSearchWord(String string) {
        Assert.assertTrue("There is no searched word in film description.",
                SearchMovieSteps.checkAllFoundMoviesDescriptions(driver, string));
    }

    @When("I left blank {string} field")
    public void iLeftBlankField(String string) throws InterruptedException {
        LogInSteps.logIn(driver, string, string);
    }

    @Then("I see {string} message")
    public void iSeeMessage(String string) {
        Assert.assertTrue("No such user message should be: " + string + ".",
                LogInSteps.checkNoSuchUserMessage(driver, string));
    }

    @Then("I see message {string}")
    public void iSeeFillBlanketFieldMessage(String string) {
        Assert.assertTrue("Fill blanket field message should be: " + string + ".",
                SearchMovieSteps.checkFillEmailFieldMessage(driver, string));
    }
}