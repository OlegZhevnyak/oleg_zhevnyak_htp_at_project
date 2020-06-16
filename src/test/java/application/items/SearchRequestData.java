package application.items;

public class SearchRequestData {

    public String user;
    public boolean strict;

    SearchRequestData(String user, boolean strict) {
        this.user = user;
        this.strict = strict;
    }

}
