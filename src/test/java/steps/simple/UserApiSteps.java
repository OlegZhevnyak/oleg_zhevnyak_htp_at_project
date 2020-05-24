package steps.simple;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class UserApiSteps {

    private static final Logger LOGGER = LogManager.getLogger(UserApiSteps.class);

    @Given("I start execution")
    public void iStartExecution() {
        //throw new cucumber.api.PendingException();
        //System.out.println("given");
        LOGGER.error("I start execution");
    }

    @When("I search user by \"(.*)\" name")
    public void testSearch(String string) {
        LOGGER.info("I search user by");
        //System.out.println("when");
        // throw new cucumber.api.PendingException();
    }

    @Then("I verify that I got {string}")
    public void iVerifyThatIGot(String string) {
        LOGGER.info("I verify that I got");
        //System.out.println("then");
        // throw new cucumber.api.PendingException();
    }

}
