package cucumber_scenarios.booking;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.GetDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import settings.DriverConfig;
import steps.booking.AddFavoriteHotelsSteps;
import steps.booking.CommonSteps;

import java.util.concurrent.TimeUnit;

public class AddFavoriteHotelsScenarios {

    public static final String RED_COLOR = "rgb(204, 0, 0)";

    public static String firstHotelName;
    public static String lastHotelName;

    public static WebDriver driver;

    @org.junit.Before
    public void preCondition() {
        driver = GetDriver.getWebDriver(DriverConfig.CHROME);
    }

    @When("I add first and last hotel to favorites from the appears list")
    public void iAddFirstAndLastHotelToFavoritesFromTheAppearsList() throws InterruptedException {
        AddFavoriteHotelsSteps.addFavoriteHotels(driver);
        TimeUnit.SECONDS.sleep(1);
    }

    @Then("I check that first and last hotel favorite buttons should be red")
    public void iCheckThatFirstAndLastHotelFavoriteButtonsShouldBeRed() {
        firstHotelName = AddFavoriteHotelsSteps.getFirstHotelName(driver);
        lastHotelName = AddFavoriteHotelsSteps.getLastHotelName(driver);

        Assert.assertEquals("The favorite button of the first hotel should be RED color.",
                RED_COLOR, AddFavoriteHotelsSteps.getFirstHotelFavoriteButtonColor(driver));
        Assert.assertEquals("The favorite button of the last hotel should be RED color.",
                RED_COLOR, AddFavoriteHotelsSteps.getLastHotelFavoriteButtonColor(driver));
    }

    @When("I Open my wish list")
    public void iOpenMyWishList() throws InterruptedException {
        CommonSteps.openWishList(driver);
        TimeUnit.SECONDS.sleep(3);
    }

    @Then("I check that two selected hotels should be added to wish list")
    public void iCheckThatTwoSelectedHotelsShouldBeAddedToWishList() {
        Assert.assertEquals("The first hotel name should be " + firstHotelName + " .",
                firstHotelName, AddFavoriteHotelsSteps.getFirstHotelNameFromWishList(driver));
        Assert.assertEquals("The second hotel name should be " + lastHotelName + " .",
                lastHotelName, AddFavoriteHotelsSteps.getSecondHotelNameFromWishList(driver));
    }

}
