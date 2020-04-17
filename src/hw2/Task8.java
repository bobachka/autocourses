package hw2;

import java.util.Scanner;

public class Task8 {

    private static final int DIV = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int n = scanner.nextInt();
        boolean result = proverochka(n, DIV);

        if (result) {
            System.out.printf("Is number %d prime - YES", n);
        } else {
            System.out.printf("Is number %d prime - NO", n);
        }

    }

    private static boolean proverochka(int numb, int div) {
        if (numb < 2) {
            return false;
        } else if (numb == 2) {
            return true;
        } else if (numb % div == 0) {
            return false;
        } else if (div < numb / 2) {
            return proverochka(numb, div + 1);
        } else {
            return true;
        }
    }
}
