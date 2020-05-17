import com.google.gson.Gson;

public class Search {

    public String user;
    boolean strict;

    public Search(String user, boolean strict) {
        this.user = user;
        this.strict = strict;
    }

    public static String fromGSON(Search search){
        Gson gson = new Gson();
        return gson.toJson(search);
    }

}
