package main.actions;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class GetWeather {
    private final String city;

    public GetWeather(String input) {

        input = input.toLowerCase().trim();
        String cityName = input;
        this.city = cityName;
    }

    public void execute(){
//        System.out.println(city);
        String apiKey = "eee313006e118095a336d6394b39524b";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            // Send HTTP request
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlString))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String rawJson = response.body();
            //System.out.println("👉 Raw response:\n" + rawJson);

            // Try cleaning from first '{'
            String cleanedJson = rawJson.substring(rawJson.indexOf("{")).trim();
            JSONObject obj = new JSONObject(cleanedJson);

            String weather = obj.getJSONArray("weather").getJSONObject(0).getString("description");
            double temp = obj.getJSONObject("main").getDouble("temp");

            System.out.println("\n🌤️ Weather in " + city + ": " + weather);
            System.out.println("🌡️ Temperature: " + temp + "°C");

        } catch (Exception e) {
            System.err.println("⚠️ Unable to get weather info: " + e.getMessage());
        }


    }
}
