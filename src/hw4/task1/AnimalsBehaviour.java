package hw4.task1;

public class AnimalsBehaviour {
    public static void main(String[] args) {
        Cat cat = new Cat("Carnivore", "Felidae", "Meow");
        Mouse mouse = new Mouse("Herbivore", "Muridae", "Squeak");
        Dog dog = new Dog("Omnivore", "Canidae", "Woof");

        cat.move();
        cat.eat();
        cat.beEaten();
        mouse.move();
        mouse.beEaten();
        dog.move();
        dog.eat();
    }
}
