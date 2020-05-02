package hw4.task3;

public class KelvinConverter implements IConverter {

    @Override
    public void convert(double c) {
        double k = c + 273.15;
        System.out.printf("The temperature is %.2f kelvins\n", k);

    }
}