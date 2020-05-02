package hw4.task3;

public class TempConvertation {
    public static void main(String[] args) {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();

        double celsius = 5.7;

        fahrenheitConverter.convert(celsius);
        kelvinConverter.convert(celsius);

    }
}