package cucumber_scenarios.booking;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.GetDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import settings.DriverConfig;
import steps.GeneralSteps;
import steps.booking.CommonSteps;
import steps.booking.ExtendedSteps;
import steps.booking.PriceSteps;

import java.util.concurrent.TimeUnit;

public class LowestPriceScenarios {

    public static  WebDriver driver;

    @When("I set guests by actions")
    public void iSetGuestsByActions() throws InterruptedException {
        CommonSteps.setGuestsByActions(driver = GetDriver.getWebDriver(DriverConfig.CHROME));
        CommonSteps.submitButtonClick(driver);
    }

    @When("I chose hotels with lowest price")
    public void iChoseHotelsWithLowestPrice() throws InterruptedException{
        CommonSteps.setHotelsWithLowestPrice(driver);;
        TimeUnit.SECONDS.sleep(3);
    }

    @Then("I compare lowest prices")
    public void iCompareLowestPrices() {
        int highestPricePerDay = PriceSteps.getLowestPrice(driver);
        int pricePerDay = PriceSteps.getLowestFromSearchedPrice(driver) / 5;

        System.out.println("highestPricePerDay :" + highestPricePerDay);
        System.out.println("pricePerDay :" + pricePerDay);

        Assert.assertTrue("highestPricePerDay should be >= then pricePerDay",
                highestPricePerDay >= pricePerDay);
    }

}
