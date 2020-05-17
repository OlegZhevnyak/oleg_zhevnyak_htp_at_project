package parsers;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MyJacksonParser {

    private final static String Jackson = "recipe.json";

    File file = new File(Jackson);

    public void parseJackson() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        Recipe recipe = mapper.readValue(file, Recipe.class);
        System.out.println(recipe.recipename);
    }

}
