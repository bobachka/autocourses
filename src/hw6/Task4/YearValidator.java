package hw6.Task4;

import java.util.Calendar;

public class YearValidator {

    public void validate(Integer year) throws IncorrectYearException {
        if (year.toString().length() < 4 || year > Calendar.getInstance().get(Calendar.YEAR) || year < 1960) {
            throw new IncorrectYearException("Введён неверный год, он должен быть в промежутке с 1960 по текущий год." +
                    " Давайте попробуем сначала.\n");
        }
    }
}
