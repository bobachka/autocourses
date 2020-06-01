package hw7.Task2;

//Найти минимальный байт в файле и вывести его на экран.
//Имя файла необходимо ввести с консоли.
//Закрыть поток ввода-вывода после выполнения
//(или использовать конструкцию try-with-resources).

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MinByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла для вывода минимального байта: ");
        String fileName = scanner.next();

        File file = new File("src/hw7/Task2/", fileName);

        if (file.exists()) {
            DataInputStream dis = null;
            try {
                dis = new DataInputStream(new FileInputStream(file));

                if (file.length() > 0) {
                    byte minByte = Byte.MAX_VALUE;
                    while (dis.available() > 0) {
                        byte workByte = dis.readByte();
                        if (minByte > workByte) {
                            minByte = workByte;
                        }
                    }
                    System.out.printf("Минимальный байт равен %d", minByte);
                } else {
                    System.out.println("Файл пустой.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (dis != null)
                        dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } else {
            System.out.println("Файл не найден.");
        }
    }
}
