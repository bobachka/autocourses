package hw5.Task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer implements PrintableTime {

    @Override
    public void printTime() {
        Date currentDateTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM HH:mm:ss");
        System.out.println("Прошло 10 секунд. Текущая дата и время " + formatter.format(currentDateTime));
    }
}
