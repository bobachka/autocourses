package hw4.task1;

public class Mouse extends Animal implements IPrey {

    public Mouse(String consumption, String family, String voice) {
        super(consumption, family, voice);
    }

    @Override
    public void move() {
        System.out.println("Mouse moves fast");
    }

    @Override
    public void beEaten() {
        System.out.println("Mouse is eaten by cat or dog");
    }
}
