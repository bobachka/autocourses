package hw6.Task4;

public class IncorrectYearException extends Exception {

    public IncorrectYearException(String message) {
        super(message);
        System.err.println(message);
    }

}
