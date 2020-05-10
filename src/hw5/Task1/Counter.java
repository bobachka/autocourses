package hw5.Task1;

public class Counter {
    private PrintableTime time;

    public Counter(PrintableTime time) {
        this.time = time;
    }

    void countDown() {
        time.printTime();
    }


}
