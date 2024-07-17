package com.example.currencyconverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class CurrencyConverterTest {

    @Test
    public void testConversion() throws IOException, InterruptedException {
        String fromCurrency = "USD";
        String toCurrency = "EUR";
        double amount = 100.0;

        double convertedAmount = CurrencyConverter.convert(fromCurrency, toCurrency, amount);
        assertTrue(convertedAmount > 0);
    }
}
