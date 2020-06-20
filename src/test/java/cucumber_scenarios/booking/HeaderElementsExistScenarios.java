package cucumber_scenarios.booking;

import cucumber.api.java.en.Then;
import driver.GetDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.booking.HeaderPage;
import driver.settings.DriverConfig;
import steps.booking.ExtendedSteps;

public class HeaderElementsExistScenarios {

    public static WebDriver driver;

    @Then("I check that Booking logo exist")
    public void iCheckThatBookingLogoExist() {
        Assert.assertTrue("The Booking logo doesn't exist.",
                ExtendedSteps.isElementExist(driver = GetDriver.getWebDriver(DriverConfig.CHROME), HeaderPage.BOOKING_LOGO_XPATH));
    }

    @Then("I check that Currency link exist")
    public void iCheckThatCurrencyLinkExist() {
        Assert.assertTrue("The Currency link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.SET_CURRENCY_LINK_XPATH));
    }

    @Then("I check that Language link exist")
    public void iCheckThatLanguageLinkExist() {
        Assert.assertTrue("The Language link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.SET_LANGUAGE_LINK_XPATH));
    }

    @Then("I check that Help Centre link exist")
    public void iCheckThatHelpCentreLinkExist() {
        Assert.assertTrue("The Help Centre link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.HELP_CENTRE_LINK_XPATH));
    }

    @Then("I check that List Your Property link exist")
    public void iCheckThatListYourPropertyLinkExist() {
        Assert.assertTrue("The List Your Property link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.LIST_YOUR_PROPERTY_LINK_XPATH));
    }

    @Then("I check that Your Account link exist")
    public void iCheckThatYourAccountLinkExist() {
        Assert.assertTrue("The Your Account link doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.YOUR_ACCOUNT_LINK_XPATH));
    }

    @Then("I check that Stays tab exist")
    public void iCheckThatStaysTabExist() {
        Assert.assertTrue("The Stays tab doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.STAYS_TAB_XPATH));
    }

    @Then("I check that Flights tab exist")
    public void iCheckThatFlightsTabExist() {
        Assert.assertTrue("The Flights tab doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.FLIGHTS_TAB_XPATH));
    }

    @Then("I check that Car rentals tab exist")
    public void iCheckThatCarRentalsTabExist() {
        Assert.assertTrue("The Car rentals tab doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.CAR_RENTALS_TAB_XPATH));
    }

    @Then("I check that Attraction tab exist")
    public void iCheckThatAttractionTabExist() {
        Assert.assertTrue("The Attraction tab doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.ATTRACTIONS_TAB_XPATH));
    }

    @Then("I check that Airport tab exist")
    public void iCheckThatAirportTabExist() {
        Assert.assertTrue("The Airport tab doesn't exist.",
                ExtendedSteps.isElementExist(driver, HeaderPage.AIRPORT_TAXIS_TAB_XPATH));
    }

}

