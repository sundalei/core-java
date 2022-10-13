package sample.chapter20.exercise;

public class Square extends Shape {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return length * length;
    }

    @Override
    double getPerimeter() {
        return 4 * length;
    }
    
}
