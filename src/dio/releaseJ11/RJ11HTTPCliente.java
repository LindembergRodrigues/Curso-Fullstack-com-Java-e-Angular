package dio.releaseJ11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RJ11HTTPCliente {
    public static void main(String[] args) throws IOException, InterruptedException {
       HttpRequest request = HttpRequest.newBuilder()
               .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
               .build();

       HttpClient client = HttpClient.newHttpClient();
       HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code" + response.statusCode());
        System.out.println("Header " + response.headers());
        System.out.println("Body " + response.body());

    }
}
