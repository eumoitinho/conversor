package com.example.currencyconverter;

public class Main {
    public static void main(String[] args) {
        try {
            String fromCurrency = "USD";
            String toCurrency = "EUR";
            double amount = 100.0;

            double convertedAmount = CurrencyConverter.convert(fromCurrency, toCurrency, amount);
            System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
