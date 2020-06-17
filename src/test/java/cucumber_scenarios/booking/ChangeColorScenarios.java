package cucumber_scenarios.booking;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.GetDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.booking.SearchResultPage;
import settings.DriverConfig;
import steps.booking.ChangeColorSteps;
import steps.booking.CommonSteps;

import java.util.concurrent.TimeUnit;

public class ChangeColorScenarios {

    public static WebDriver driver;

    static SearchResultPage searchResultPage = new SearchResultPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    @When("I chose hotels with three and four stars")
    public void choseHotelsWithThreeAndFourStars() throws InterruptedException {
        CommonSteps.setThreeStarsHotel(driver);
        CommonSteps.setFourStarsHotel(driver);
        TimeUnit.SECONDS.sleep(5);
    }

    @Then("I scroll to tenth hotel")
    public void iScrollToTenthHotel() {
        ChangeColorSteps.scrollToThenthHotel(driver = GetDriver.getWebDriver(DriverConfig.CHROME));
    }

    @Then("I change hotel name to {string}")
    public void iChaneHotelNameColor(String string) {
        ChangeColorSteps.changeThenthHotelNameColor(driver = GetDriver.getWebDriver(DriverConfig.CHROME), string);
    }

    @Then("I check that hotel name changed to {string}")
    public void iCheckThatHotelNameChangedTo(String string) {
        Assert.assertEquals("Tenth hotel name color should be " + string + ".",
                "color: " + string + ";",
                searchResultPage.webElementTenthHotelName().getAttribute("style"));
    }


}
