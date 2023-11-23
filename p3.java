import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

import java.net.http.HttpResponse;

import java.util.Scanner;


public class CurrencyConverter {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter base currency code (e.g., USD): ");
 
       String baseCurrency = scanner.next().toUpperCase();


        System.out.print("Enter target currency code (e.g., EUR): ");
  
      String targetCurrency = scanner.next().toUpperCase();

  
      System.out.print("Enter the amount to convert: ");

        double amount = scanner.nextDouble();


        // Replace "YOUR_API_KEY" with your actual API key from ExchangeRate-API
      
  String apiKey = "YOUR_API_KEY";
    
    String apiUrl = "https://open.er-api.com/v6/latest/" + baseCurrency + "?apikey=" + apiKey;

     
   try {
        
              HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
.uri(URI.create(apiUrl)).build();

 
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    
        String responseBody = response.body();

 
double exchangeRate = parseExchangeRate(responseBody, targetCurrency);

                     double convertedAmount = amount * exchangeRate;

     
       System.out.printf("%.2f %s is equal to %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);

       
 }
 catch (Exception e) {
     
       System.out.println("Error fetching or processing data: " + e.getMessage());
        }

    }


    private static double parseExchangeRate(String json, String targetCurrency) 
{
        // You need to implement JSON parsing based on the response structure
        // Extract the exchange rate for the target currency from the JSON
        // For simplicity, you may use a JSON parsing library like Jackson or Gson
        // Here, we assume a simple JSON structure for demonstration purposes
        // Replace this with actual JSON parsing code based on the API response structure
        // For example, if the response has a field like "rates": {"USD": 1.23, "EUR": 0.89}, you'd extract the rate for the targetCurrency
        return 1.0; // Placeholder value, replace it with actual parsed exchange rate
    }
