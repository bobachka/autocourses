package hw4.task2;

public class Ball extends SolidOfRevolution {

    public Ball(double r) {
        setRadius(r);
    }

    @Override
    public double getVolume() {
        return 4f / 3f * Math.PI * Math.pow(getRadius(), 3);
    }
}
