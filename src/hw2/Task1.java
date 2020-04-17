package hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину первой стороны прямоугольника: ");
        int a = scanner.nextInt();
        System.out.print("Введите длину второй стороны прямоугольника: ");
        int b = scanner.nextInt();
        System.out.print("Введите радиус круга: ");
        int r = scanner.nextInt();

        if (Math.sqrt(r * 2) >= a * a + b * b) {
            System.out.println("Всё отлично, прямоугольник закрыт");
        } else {
            System.out.println("К сожалению, круг слишком мал");
        }
    }

}
