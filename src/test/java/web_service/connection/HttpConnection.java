package web_service.connection;

import web_service.items.SearchRequestData;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class HttpConnection {

    public static final String URI = "http://178.124.206.46:8001/app/ws/";

    public static String postRequestGetResponse(Gson gson, SearchRequestData searchRequestData) throws IOException, URISyntaxException {
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder(URI);
        HttpPost request = new HttpPost(builder.build());
        request.setEntity(new StringEntity(gson.toJson(searchRequestData)));
        HttpResponse response = client.execute(request);
        return EntityUtils.toString(response.getEntity());
    }

}
