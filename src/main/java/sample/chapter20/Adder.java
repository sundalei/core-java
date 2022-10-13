package sample.chapter20;

public class Adder {
    public int add(int a, int b) {
        System.out.println("Adder add with int");
        return a + b;
    }

    public float add(float a, float b) {
        System.out.println("Adder add with float");
        return a + b;
    }

    public float add(float a, float b, int c) {
        System.out.println("Adder add with float and int");
        return a + b + c;
    }
}