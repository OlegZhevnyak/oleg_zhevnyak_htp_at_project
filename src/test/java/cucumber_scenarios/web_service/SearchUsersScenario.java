package cucumber_scenarios.web_service;

import web_service.items.SearchRequestData;
import web_service.items.UserData;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import web_service.connection.HttpConnection;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import steps.web_service.RequestDataSteps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class SearchUsersScenario {

    public SearchRequestData searchRequestData;
    public String response;
    public UserData responseUserData;
    public UserData expectedUserData;

    private static final String PARTIAL_SHORT_NAME_REQUEST_JSON =
            "src/test/resources/test_data/web_service/requests/search_by_partial_short_name_request.json";
    private static final String PARTIAL_SHORT_NAME_EXPECTED_JSON =
            "src/test/resources/test_data/web_service/expected/search_by_partial_short_name_expected.json";

    @When("I send request {string}")
    public SearchRequestData iSendRequest(String string) throws FileNotFoundException {
        Gson gson = new Gson();
        searchRequestData = RequestDataSteps.sendRequestData(gson, string);
        return searchRequestData;
    }

    @When("I get response")
    public String iGetResponse() throws IOException, URISyntaxException {
        Gson gson = new Gson();
        response = HttpConnection.postRequestGetResponse(gson, searchRequestData);
        return response;
    }

    @When("I parse response")
    public UserData iParseResponse() {
        Gson gson = new Gson();
        responseUserData = gson.fromJson(response, UserData.class);
        return responseUserData;
    }

    @When("I parse expected result {string}")
    public UserData iParseExpectedResult(String string) throws FileNotFoundException {
        Gson gson = new Gson();
        expectedUserData = gson.fromJson(new JsonReader(new FileReader(string)),
                UserData.class);
        return expectedUserData;
    }

    @Then("I compare expected result and response")
    public void iCompareExpectedResultAndResponse() {
        System.out.println("Actual result: " + responseUserData.toString());
        System.out.println("Expected result: " + expectedUserData.toString());
        System.out.println("Next test.");
        System.out.println(" ");
        Assert.assertEquals("Received response isn't equal to expected result.", expectedUserData,
                responseUserData);
    }

}
