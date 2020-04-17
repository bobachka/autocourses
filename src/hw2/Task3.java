package hw2;

import java.sql.SQLOutput;

public class Task3 {
    public static void main(String[] args) {
        line();

    }

    public static void star() {
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
    }

    public static void line() {
        for (int i = 0; i < 4; i++) {
            star();
            System.out.println();
        }
    }
}