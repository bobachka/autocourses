package hw4.task3;

public class KelvinConverter implements IConverter {


    public void convertToCelsius(double k) {
        double c = k - 273.15;
        System.out.printf("The temperature is %.2f degrees Celsius\n", c);
    }

    public void convertToFahrenheit(double k) {
        double f = 1.8 * (k - 273.15) + 32;
        System.out.printf("The temperature is %.2f degrees Fahrenheit\n", f);
    }

    public void convertToKelvin(double k) {
        System.out.printf("The temperature is %.2f kelvins\n", k);
    }
}
