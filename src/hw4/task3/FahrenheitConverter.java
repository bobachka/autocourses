package hw4.task3;

public class FahrenheitConverter implements IConverter {

    public void convertToCelsius(double f) {
        double c = 5f / 9f * (f - 32);
        System.out.printf("The temperature is %.2f degrees Celsius\n", c);
    }

    public void convertToFahrenheit(double f) {
        System.out.printf("The temperature is %.2f degrees Fahrenheit\n", f);
    }

    public void convertToKelvin(double f) {
        double k = (f + 459.67) * 5 / 9;
        System.out.printf("The temperature is %.2f kelvins\n", k);
    }

}
