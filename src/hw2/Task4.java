package hw2;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int vector[] = new int[random.nextInt(10) + 5];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(200) - 100;
        }
        System.out.println("Мой массив: " + Arrays.toString(vector));
        negativeSum(vector);
        multiplication(vector);
    }

    private static void negativeSum(int[] vector2) {
        int sum = 0;
        for (int a : vector2) {
            if (a < 0) {
                sum += a;
            }
        }
        System.out.println("Сумма отрицательных элементов: " + sum);
    }

    private static void multiplication(int[] vector3) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < vector3.length; i++) {
            if (vector3[min] > vector3[i]) {
                min = i;
            }
            if (vector3[max] < vector3[i]) {
                max = i;
            }
        }
        int start;
        int stop;
        if (min < max) {
            start = min;
        } else {
            start = max;
        }
        if (min > max) {
            stop = min;
        } else {
            stop = max;
        }

        if (start == stop || stop - start == 1) {
            System.out.println("Произведения нет, но вы держитесь");
        } else{
            int multipl = 1;
            for (int i = start+1; i < stop; i++){
                multipl *= vector3[i];
            }
            System.out.println("Произведение элементов: " + multipl);
        }
    }
}