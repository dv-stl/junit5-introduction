import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Test008IT {

    @Test
    @DisplayName("First integration test, but how to run it against the app when it is not in bootable state")
    void firstIntegrationTest() {
        try {
            // Create HttpClient instance
            HttpClient client = HttpClient.newHttpClient();

            // Build GET request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://swapi.dev/api/starships/9"))
                    .GET()
                    .build();

            // Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // test it works
            assertTrue(response.body().contains("Death Star"));
            assertEquals(200, response.statusCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
