package hw7.Task8;

//Проверить доменные имена для протоколов http и https на правильность.
//http://example.com/ - верный формат адреса.
//example.com – неверный.

import java.util.Scanner;
import java.util.regex.Pattern;

public class DomainNameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the domain name you want to validate");
        String testDN = scanner.nextLine();
        if (Pattern.matches(
                "^https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=])$",
                testDN)) {
            System.out.println("The domain name is valid");
        } else System.out.println("The domain name is invalid");
    }
}