package tests.web_service;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import steps.web_service.RequestDataSteps;
import web_service.connection.HttpConnection;
import web_service.items.SearchRequestData;
import web_service.items.UserData;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class SearchUserByPartialShortNameTest {

    private static final String PARTIAL_SHORT_NAME_REQUEST_JSON =
            "src/test/resources/test_data/web_service/requests/search_by_partial_short_name_request.json";
    private static final String PARTIAL_SHORT_NAME_EXPECTED_JSON =
            "src/test/resources/test_data/web_service/expected/search_by_partial_short_name_expected.json";

    Gson gson = new Gson();

    @Test
    public void searchUserByPartialShortNameTest() throws IOException, URISyntaxException {
        SearchRequestData searchRequestData = RequestDataSteps.sendRequestData(gson, PARTIAL_SHORT_NAME_REQUEST_JSON);
        String response = HttpConnection.postRequestGetResponse(gson, searchRequestData);
        UserData responseUserData = gson.fromJson(response, UserData.class);
        UserData expectedUserData = gson.fromJson(new JsonReader(new FileReader(PARTIAL_SHORT_NAME_EXPECTED_JSON)),
                UserData.class);
        System.out.println("Actual result: " + responseUserData.toString());
        System.out.println("Expected result: " + expectedUserData.toString());
        Assert.assertEquals("Received response isn't equal to expected result.", expectedUserData,
                responseUserData);
    }

}
