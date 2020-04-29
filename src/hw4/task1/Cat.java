package hw4.task1;

public class Cat extends Animal implements IPredator, IPrey {

    public Cat(String consumption, String family, String voice) {
        super(consumption, family, voice);
    }

    @Override
    public void move() {
        System.out.println("Cat moves tail a lot");
    }

    public void eat() {
        System.out.println("Cat eats mouse");
    }

    public void beEaten() {
        System.out.println("Cat is eaten by dog");
    }
}
