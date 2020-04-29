package hw4.task1;

public class Dog extends Animal implements IPredator {

    public Dog(String consumption, String family, String voice) {
        super(consumption, family, voice);
    }

    @Override
    public void move() {
        System.out.println("Dog moves around");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats cat or mouse");
    }
}
