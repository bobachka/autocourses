package hw7.Task4;

//Считать из файла строку и вывести ее на консоль,
//чтобы слова в этой строке шли в обратном порядке.
//Например: Hello this is Java!
//Результат: Java! Is this Hello

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReversedWords {
    public static void main(String[] args) {
        ReversedWords words = new ReversedWords();
        String sourceLine = words.readFile();
        if (sourceLine != null) {
            System.out.printf("The read line is '%s'\n", sourceLine);
            System.out.printf("The reversed line is '%s'", words.reverseWords(sourceLine));
        } else {
            System.out.println("Failed to read the line");
        }
    }

    private String readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/hw7/Task4/sourceFile.txt"))) {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String reverseWords(String str) {
        String[] strArray = str.split(" ");
        StringBuilder builder = new StringBuilder("");
        for (int index = strArray.length - 1; index >= 0; index--) {
            builder.append(strArray[index]);
            if (index != 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
