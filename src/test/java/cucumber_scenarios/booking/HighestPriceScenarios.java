package cucumber_scenarios.booking;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import steps.booking.CommonSteps;
import steps.booking.PriceSteps;

import java.util.concurrent.TimeUnit;

public class HighestPriceScenarios {

    public static WebDriver driver;

    @When("I chose hotels with highest price")
    public void iChoseHotelsWithHighestPrice() throws InterruptedException {
        CommonSteps.setHotelsWithHighestPrice(driver);
        TimeUnit.SECONDS.sleep(4);
    }

    @When("I sort hotels by lowest price")
    public void iSortHotelsByLowestPrice() throws InterruptedException{
        CommonSteps.sortByLowestPrice(driver);
        TimeUnit.SECONDS.sleep(4);
    }

    @Then("I compare highest prices")
    public void iCompareHighestPrices() {
        int highestPricePerDay = PriceSteps.getHighestPrice(driver);
        int pricePerDay = PriceSteps.getLowestFromSearchedPrice(driver) / 7;
        System.out.println("highestPricePerDay :" + highestPricePerDay);
        System.out.println("pricePerDay :" + pricePerDay);

        Assert.assertTrue("highestPricePerDay should be >= then pricePerDay",
                highestPricePerDay >= pricePerDay);
    }

}
