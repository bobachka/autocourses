package hw4.task2;

public class Pyramid implements IShape {

    private double square;
    private double height;

    public Pyramid(double square, double height) {
        this.square = square;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return 1f / 3f * square * height;
    }
}
