package hw2;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int array[][] = new int[5][];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[random.nextInt(6)];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
            }
        }

        for (int[] line : array) {
            System.out.println(Arrays.toString(line));
        }
    }
}
