package hw6.Task4;

import java.util.List;
import java.util.Scanner;

public class Menu3 {
    public static void menu3(List<Car> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите марку автомобиля: ");
        String maker = scanner.next();

        boolean isPresent = false;

        for (Car c : list) {
            if (c.getManufacturer().equalsIgnoreCase(maker)) {
                System.out.println(c.toString() + "\n");
                isPresent = true;
            }
        }

        if (!isPresent) {
            System.out.println("Данная марка не представлена в нашем салоне.\n");
        }

    }

}
