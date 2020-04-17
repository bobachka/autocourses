package hw2;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int vector[] = new int[random.nextInt(10) + 10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(200) - 100;
        }
        System.out.println("Массив: " + Arrays.toString(vector));
        System.out.println("Сортировка: " + Arrays.toString(bubble(vector)));
    }

    private static int[] bubble(int vector2[]) {
        for (int i = vector2.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (vector2[j] > vector2[j + 1]) {
                    int buffer = vector2[j];
                    vector2[j] = vector2[j + 1];
                    vector2[j + 1] = buffer;
                }
            }
        }
        return vector2;
    }
}