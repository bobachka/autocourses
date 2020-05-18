package hw6.Task4;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu2 {
    public static void menu2(List<Car> list) {
        YearValidator yv = new YearValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите марку автомобиля: ");
        String manufacturer = scanner.next();
        System.out.print("Введите модель автомобиля: ");
        String model = scanner.next();

        System.out.print("Введите год выпуска автомобиля: ");
        int year = 0;
        try {
            year = scanner.nextInt();
            yv.validate(year);
        } catch (InputMismatchException e) {
            System.err.println("Год выпуска должен состоять из цифр. Давайте начнём сначала.\n");
            return;
        } catch (IncorrectYearException ie) {
            return;
        }

        System.out.print("Введите цену автомобиля: ");
        int price = 0;
        try {
            price = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Цена должна состоять из цифр. Давайте начнём сначала.\n");
            return;
        }

        Car newCar = new Car(manufacturer, model, year, price);
        list.add(newCar);

        System.out.printf("Автомобиль %s %s %d года стоимостью %d добавлен!\n\n",
                newCar.getManufacturer(), newCar.getModel(), newCar.getYear(), newCar.getPrice());
    }
}