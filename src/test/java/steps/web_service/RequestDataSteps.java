package steps.web_service;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import application.items.SearchRequestData;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RequestDataSteps {

    public static SearchRequestData sendRequestData(Gson gson, String jsonFilePath) throws FileNotFoundException {
        SearchRequestData[] searchRequestData = gson.fromJson(new JsonReader(new FileReader(jsonFilePath)), SearchRequestData[].class);
        return searchRequestData[0];
    }

}
