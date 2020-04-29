package hw4.task3;

public class CelsiusConverter implements IConverter {

    public void convertToCelsius(double c) {
        System.out.printf("The temperature is %.2f degrees Celsius\n", c);
    }

    public void convertToFahrenheit(double c) {
        double f = 1.8 * c + 32;
        System.out.printf("The temperature is %.2f degrees Fahrenheit\n", f);
    }

    public void convertToKelvin(double c) {
        double k = c + 273.15;
        System.out.printf("The temperature is %.2f kelvins\n", k);

    }

}

