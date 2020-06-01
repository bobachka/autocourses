package hw7.Task6;

//Составить регулярное выражение, определяющее,
// является ли заданная строка IP адресом, записанным в десятичном виде.
//– пример правильных выражений: 127.0.0.1, 255.255.255.0.
//– пример неправильных выражений: 1300.6.7.8, abc.def.gha.bcd.

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the IP address you want to validate");
        String testIP = scanner.nextLine();
        if (Pattern.matches(
                "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$",
                testIP)) {
            System.out.println("The IP is valid");
        } else System.out.println("The IP is invalid");
    }
}
