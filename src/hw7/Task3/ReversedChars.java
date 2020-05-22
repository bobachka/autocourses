package hw7.Task3;

//Ввести строку из консоли.
//Записать в файл перевернутую строку.
//Для работы со строкой можно использовать класс StringBuilder.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String testLine = scanner.nextLine();

        StringBuilder builder = new StringBuilder("");

        char[] array = testLine.toCharArray();

        for (int i = array.length - 1; i >= 0; i--) {
            builder.append(array[i]);
        }

        try (FileWriter fileWriter = new FileWriter("src/hw7/Task3/resultFile.txt")) {
            fileWriter.write(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}