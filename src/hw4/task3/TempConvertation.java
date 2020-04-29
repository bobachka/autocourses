package hw4.task3;

public class TempConvertation {
    public static void main(String[] args) {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();

        double celsius = 5.7;
        double fahrenheit = 876.20;
        double kelvin = 376;

        celsiusConverter.convertToCelsius(celsius);
        celsiusConverter.convertToFahrenheit(celsius);
        celsiusConverter.convertToKelvin(celsius);

        fahrenheitConverter.convertToCelsius(fahrenheit);
        fahrenheitConverter.convertToFahrenheit(fahrenheit);
        fahrenheitConverter.convertToKelvin(fahrenheit);

        kelvinConverter.convertToCelsius(kelvin);
        kelvinConverter.convertToFahrenheit(kelvin);
        kelvinConverter.convertToKelvin(kelvin);

    }
}
