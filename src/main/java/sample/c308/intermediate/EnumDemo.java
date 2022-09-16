package sample.c308.intermediate;

enum Gender {
    MALE, FEMALE
}

enum MathsOperator {
    PLUS, MINUS, MULTIPLY, DIVIDE
}

enum Days {
    Monday(10), Tuesday(11), Wednesday(12), Thursday(13), Friday(14), Saturday(15), Sunday(16);

    int n;

    Days(int x) {
        n = x;
    }

    public int getValue() {
        return n;
    }
}

public class EnumDemo {

    public static int calculate(MathsOperator operator, int operand1, int operand2) {
        switch (operator) {
            case PLUS -> {
                return operand1 + operand2;
            }
            case MINUS -> {
                return operand1 - operand2;
            }
            case MULTIPLY -> {
                return operand1 * operand2;
            }
            case DIVIDE -> {
                return operand1 / operand2;
            }
            default -> throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {

        System.out.println(Gender.MALE);

        Days d = Days.Friday;
        switch (d) {
            case Monday:
                System.out.println("ohh..its a Monday");
                break;
            case Friday:
                System.out.println("its a Friday..weak End");
                break;
            case Sunday:
                System.out.println("its a Sunday, Sunday");
                break;
        }

        switch (d.getValue()) {
            case 10:
                System.out.println("its a Monday");
                break;
            case 14:
                System.out.println("its a Friday");
                break;
            case 16:
                System.out.println("its a Sunday");
                break;
        }

        System.out.println(calculate(MathsOperator.PLUS, 5, 3));
        System.out.println(calculate(MathsOperator.MINUS, 5, 3));
        System.out.println(calculate(MathsOperator.MULTIPLY, 5, 3));
        System.out.println(calculate(MathsOperator.DIVIDE, 5, 3));

    }
}
