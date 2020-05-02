package hw4.task2;

public class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double r, double height) {
        setRadius(r);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (Math.PI * Math.sqrt(getRadius()) * height);

    }
}
