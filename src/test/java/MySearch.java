//в пакет утилиты



import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import parsers.MyJsonParser;

import java.io.IOException;
import java.net.URISyntaxException;

public class MySearch {



    public static void main(String[] args) throws IOException, URISyntaxException {
        Search search = new Search("albert", true);
        userSearch(search);
    }


    public static void userSearch(Search search) throws IOException, URISyntaxException {
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder("http://178.124.206.46:8081/app/ws/");
        HttpPost request = new HttpPost(builder.build());
        request.setEntity(new StringEntity(Search.fromGSON(search)));
        HttpResponse response = client.execute(request);
        System.out.println(EntityUtils.toString(response.getEntity()));
    }
}
