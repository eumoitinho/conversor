package com.example.currencyconverter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class CurrencyConverter {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/079c5b912f7fc84bd7c162ae/pair/";

    public static double convert(String fromCurrency, String toCurrency, double amount) throws IOException, InterruptedException {
        String requestUrl = API_URL + fromCurrency + "/" + toCurrency + "/" + amount;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(requestUrl))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JSONObject jsonObject = new JSONObject(response.body());
            return jsonObject.getDouble("conversion_result");
        } else {
            throw new RuntimeException("Failed to get response from ExchangeRate-API");
        }
    }
}
