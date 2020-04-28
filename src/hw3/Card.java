package hw3;

public class Card {
    String cardNumber;
    String cardType;
    String cardHolderName;
    String expDate;
    String CVV;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public boolean validate() {
        Validator validator = new Validator();
        boolean v1 = validator.validateCardNumber();
        boolean v2 = validator.validateCardType();
        boolean v3 = validator.validateCardHolderName();
        boolean v4 = validator.validateExpDate();
        boolean v5 = validator.validateCVV();

        if (v1 && v2 && v3 && v4 && v5) {
            return true;
        } else {
            return false;
        }
    }

    public class Validator {

        public boolean validateCardNumber() {
            if (cardNumber.length() != 16) {
                System.out.println("Длина номера карты должна быть равна 16-ти символам");
                return false;
            } else {
                System.out.println("Номер карты верен");
                return true;
            }
        }

        public boolean validateCardType() {
            if (cardType.equalsIgnoreCase("Visa")) {
                System.out.println("Тип карты - Виза");
                return true;
            } else if (cardType.equalsIgnoreCase("MasterCard")) {
                System.out.println("Тип карты - МастерКард");
                return true;
            } else {
                System.out.println("Тип карты неверный");
                return false;
            }
        }

        public boolean validateCardHolderName() {
            if (cardHolderName != null && cardHolderName.length() != 0 && cardHolderName.equals(" ")) {
                System.out.println("Имя владельца не введено");
                return false;
            } else {
                System.out.println("Имя владельца введено");
                return true;
            }
        }

        public boolean validateExpDate() {
            if (expDate != null && expDate.length() != 0 && expDate.equals(" ")) {
                System.out.println("Дата не введена");
                return false;
            } else {
                System.out.println("Дата введена");
                return true;
            }
        }

        public boolean validateCVV() {
            if (CVV.length() != 3) {
                System.out.println("Длина проверочного кода должна быть равна 3-м символам");
                return false;
            } else {
                System.out.println("Проверочный код верен");
                return true;
            }
        }

    }
}