package hw5.Task1;

//Используя механизм обратного вызова Java (callback), напишите программу-таймер,
//которая каждые 10 секунд выводит на экран сообщение о прошедшем интервале времени.
//Для реализации логики 10-ти секундного ожидания можно использовать метод Thread.sleep(10 * 1000); и бесконечный цикл while(true).

public class App {
    public static void main(String[] args) {
        PrintableTime time = new Timer();
        Counter counter = new Counter(time);

        while (true) {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter.countDown();
        }
    }
}