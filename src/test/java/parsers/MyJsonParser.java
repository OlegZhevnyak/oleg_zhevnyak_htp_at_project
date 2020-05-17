package parsers;

import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyJsonParser {

    private final static String JSON = "recipe.json";

    File file = new File(JSON);

    public static void parseJSON() throws IOException{
        String input = new String(Files.readAllBytes(Paths.get(JSON)));
        JSONObject obj = new JSONObject(input);
        System.out.println(obj.getString("recipename"));
    }
}

