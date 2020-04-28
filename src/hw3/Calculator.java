package hw3;


public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 2);
        calculator.addition();
        calculator.multiplication();
        calculator.mod();
        calculator.division();
    }

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void addition() {
        System.out.println(a + b);
    }

    public void multiplication() {
        System.out.println(a * b);
    }

    public void mod() {
        System.out.println(a % b);
    }

    public void division() {
        System.out.println((double) a / b);
    }
}