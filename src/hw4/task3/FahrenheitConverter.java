package hw4.task3;

public class FahrenheitConverter implements IConverter {

    @Override
    public void convert(double c) {
        double f = 1.8 * c + 32;
        System.out.printf("The temperature is %.2f degrees Fahrenheit\n", f);
    }

}