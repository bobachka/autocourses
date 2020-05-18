package hw6.Task4;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Menu4 {
    public static void menu4(List<Car> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите марку автомобиля, который вы хотите купить: ");
        String make = scanner.next();

        boolean isBought = false;
        ListIterator<Car> litr = list.listIterator();

        while (litr.hasNext()) {
            Car c = litr.next();

            if (c.getManufacturer().equalsIgnoreCase(make)) {
                System.out.printf("Вы купили ааааавтомобиль %s %s %d года выпуска за %d денег! Ура!\n\n",
                        c.getManufacturer(), c.getModel(), c.getYear(), c.getPrice());
                isBought = true;

                litr.remove();
            }
        }

        if (!isBought) {
            System.out.println("Данная марка не представлена в нашем салоне.\n");
        }

    }

}
