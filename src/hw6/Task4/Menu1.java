package hw6.Task4;

import java.util.List;

public class Menu1 {
    public static void menu1(List<Car> list) {
        for (
                Car c : list) {
            System.out.println(c.toString() + "\n");
        }
    }
}