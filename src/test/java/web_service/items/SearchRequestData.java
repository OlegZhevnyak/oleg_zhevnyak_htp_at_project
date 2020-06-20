package web_service.items;

public class SearchRequestData {

    public String user;
    public boolean strict;

    public SearchRequestData(String user, boolean strict) {
        this.user = user;
        this.strict = strict;
    }

}
