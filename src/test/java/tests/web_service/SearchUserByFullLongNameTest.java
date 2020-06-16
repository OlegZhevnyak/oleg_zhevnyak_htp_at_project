package tests.web_service;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import steps.web_service.RequestDataSteps;
import connection.web_service.HttpConnection;
import application.items.SearchRequestData;
import application.items.UserData;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class SearchUserByFullLongNameTest {


    Gson gson = new Gson();

    private static final String FULL_LONG_NAME_REQUEST_JSON =
            "src/test/resources/test_data/web_service/requests/search_by_full_long_name_request.json";
    private static final String FULL_LONG_NAME_EXPECTED_JSON =
            "src/test/resources/test_data/web_service/expected/search_by_full_long_name_expected.json";
    @Test
    public void searchUserByFullLongNameTest() throws IOException, URISyntaxException {
        SearchRequestData searchRequestData = RequestDataSteps.sendRequestData(gson, FULL_LONG_NAME_REQUEST_JSON);
        String response = HttpConnection.postRequestGetResponse(gson, searchRequestData);
        UserData responseUserData = gson.fromJson(response, UserData.class);
        UserData expectedUserData = gson.fromJson(new JsonReader(new FileReader(FULL_LONG_NAME_EXPECTED_JSON)),
                UserData.class);
        System.out.println("Actual result: " + responseUserData.toString());
        System.out.println("Expected result: " + expectedUserData.toString());
        Assert.assertEquals("Received response isn't equal to expected result.", expectedUserData,
                responseUserData);
    }

}
