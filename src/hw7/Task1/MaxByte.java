package hw7.Task1;

//Найти максимальный байт в файле и вывести его на экран.
//Имя файла необходимо ввести с консоли.
//Закрыть поток ввода-вывода после выполнения
//(или использовать конструкцию try-with-resources).

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MaxByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла для вывода максимального байта: ");
        String fileName = scanner.next();

        File file = new File("src/hw7/Task1/", fileName);
        if (file.exists()) {
            try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {

                if (file.length() == 0) {
                    System.out.println("Файл пустой.");

                } else {
                    byte maxByte = Byte.MIN_VALUE;
                    while (dis.available() > 0) {
                        byte workByte = dis.readByte();
                        if (maxByte < workByte) {
                            maxByte = workByte;
                        }
                    }
                    System.out.printf("Максимальный байт равен %d", maxByte);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Данный файл не найден.");
        }

    }
}
