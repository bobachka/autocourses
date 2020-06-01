package hw7.Task7;

//Ввести дату из консоли и проверить, что она соответствует формату YYYY/MM/DD HH:MM:SS.
//Например: 2019/11/15 13:00:00.

import java.util.Scanner;
import java.util.regex.Pattern;

public class DateValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date you want to validate");
        String testDate = scanner.nextLine();
        if (Pattern.matches(
                "[0-9]{4}/(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1]) (2[0-3]|[01][0-9]):[0-5][0-9]:[0-5][0-9]",
                testDate)) {
            System.out.println("The date is valid");
        } else System.out.println("The date is invalid");
    }
}
