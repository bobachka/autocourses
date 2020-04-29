package hw4.task2;

public abstract class SolidOfRevolution implements IShape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
