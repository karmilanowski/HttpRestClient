import com.google.gson.Gson;
import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.*;

public class HttpAPIClient {

    public static HttpResponse<String> sendRequest(String url, String login, String password) {
        HttpClient httpClient = HttpClient
                    .newBuilder()
                    .authenticator(new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(login, password.toCharArray());
                        }
                    })
                    .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .timeout(Duration.ofSeconds(10))
                .build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        return response;
    }

    public static HttpResponse<String> sendRequest(String url) {
        HttpClient httpClient = HttpClient
                .newBuilder()
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .timeout(Duration.ofSeconds(10))
                .build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        return response;
    }

    public static <T> T[] jsonToPojoConvert(HttpResponse<String> httpResponse, Class<T[]> type){
        Gson gson = new Gson();
        T[] objects=null;
        if(httpResponse!=null)
            objects = gson.fromJson(httpResponse.body(), type);

        return objects;
    }


}
