package hw3;

import java.util.Scanner;

public class BankValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер карты: ");
        String cardNumber = scanner.next();
        System.out.print("Введите тип карты: ");
        String cardType = scanner.next();
        System.out.print("Введите имя владельца карты: ");
        String cardHolderName = scanner.next();
        System.out.print("Введите срок действия карты: ");
        String expDate = scanner.next();
        System.out.print("Введите CVV код: ");
        String CVV = scanner.next();

        Card card = new Card();

        card.setCardNumber(cardNumber);
        card.setCardType(cardType);
        card.setCardHolderName(cardHolderName);
        card.setExpDate(expDate);
        card.setCVV(CVV);

        boolean result = card.validate();
        System.out.println(result);

    }

}