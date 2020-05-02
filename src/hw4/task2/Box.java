package hw4.task2;

public class Box implements IShape {

    private double volume;
    private double currentVolume = 0;

    public Box(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public boolean addShape(IShape shape) {
        double newCurrentVolume;
        if (shape.getVolume() < volume - currentVolume) {
            currentVolume += shape.getVolume();
            System.out.println("Фигура " + shape.getClass() + " добавлена");
            return true;
        } else {
            System.out.println("Добавление новой фигуры невозможно");
            return false;
        }
    }
}