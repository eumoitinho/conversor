# Currency Converter

This is a simple Java application to convert currency using the ExchangeRate-API.

## Prerequisites

- Java 11 or later
- Maven

## Setup

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:

   ```bash
   cd currencyconverter
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   mvn exec:java -Dexec.mainClass="com.example.currencyconverter.Main"
   ```

## Usage

The `CurrencyConverter` class provides a method to convert currency. You can modify the `Main` class to change the currencies and the amount to be converted.

```java
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
```

## Running Tests

To run the tests, use the following command:

```bash
mvn test
```

## License

This project is licensed under the MIT License.
