package hw4.task1;

public abstract class Animal {
    protected String consumption;
    protected String family;
    protected String voice;

    public Animal(String consumption, String family, String voice) {
        this.consumption = consumption;
        this.family = family;
        this.voice = voice;
    }

    public abstract void move();
}