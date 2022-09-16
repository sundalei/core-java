package sample.c308.intermediate;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface Greetable {
    String greet(String name);
}

interface Calculator {
    int add (int num1, int num2);
}

class GreetableImpl implements Greetable {

    @Override
    public String greet(String name) {
        return "Welcome " + name;
    }
}

class CalculatorImpl implements Calculator {

    @Override
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is spawn from normal class");
    }
}

public class LambdaDemo {

    public void doBehaviourPassing() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //System.out.println(sumAll(numbers));
        //System.out.println(sumAllEven(numbers));
        System.out.println(sum(numbers, num -> true));
        System.out.println(sum(numbers, num -> num % 2 == 0));
        System.out.println(sum(numbers, num -> num > 3));
    }

    public void doBinaryOperation() {
        List<Integer> numbers = Arrays.asList(20, 10);
        System.out.println(performBinaryOp(numbers, (t, u) -> t + u));
        System.out.println(performBinaryOp(numbers, (t, u) -> t - u));
        System.out.println(performBinaryOp(numbers, (t, u) -> t * u));
        System.out.println(performBinaryOp(numbers, (t, u) -> t / u));
    }

    private int performBinaryOp(List<Integer> nums, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(nums.get(0), nums.get(1));
    }

    private int sumAll(List<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    private int sumAllEven(List<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    private int sum(List<Integer> nums, Predicate<Integer> p) {
        int sum = 0;
        for (int num : nums) {
            if (p.test(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Greetable gt1 = new GreetableImpl();
        System.out.println(gt1.greet("Yan Hao"));

        Greetable gt2 = new Greetable() {

            @Override
            public String greet(String name) {
                return "Welcome " + name + " from anonymous inner class";
            }
        };
        System.out.println(gt2.greet("Yan Hao"));

        Greetable gt3 = (String name) -> {
            return "Welcome " + name + " from expression v1";
        };

        Greetable g4 = name -> "Welcome " + name + " from lambda expression v2";
        System.out.println(g4.greet("Yan Hao"));

        System.out.println("--------------------------------------------");

        Calculator calc = new CalculatorImpl();
        System.out.println(calc.add(5, 8));

        Calculator calc2 = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println(calc2.add(6, 13));

        Calculator calc3 = (num1, num2) -> num1 + num2;
        System.out.println(calc3.add(2, 7));

        System.out.println("------------------------------");

        Runnable r1 = new RunnableImpl();
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is spawn from anonymous inner class");
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();

        Runnable r3 = () -> {
            System.out.println("Thread is spawn from lambda expression");
        };
        Thread t3 = new Thread(r3);
        t3.start();

        System.out.println("------------------------------");

        List<String> list = new ArrayList<>();
        list.add("HY");
        list.add("Tim");
        list.add("Will");
        list.add("Charlie");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("------------------------------");

        list.forEach(s -> System.out.println(s));

        System.out.println("------------------------------");

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "HY"));
        students.add(new Student(2, "Tim"));
        students.add(new Student(3, "Will"));
        students.add(new Student(4, "Charlie"));

        Comparator<Student> c1 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Student> c2 = (s1, s2) -> s1.getName().compareTo(s2.getName());
        Collections.sort(students, c2.reversed());
        students.forEach(s -> System.out.println(s));
        Comparator<Student> c3 = Comparator.reverseOrder();

        System.out.println("------------------------------");

        Collections.sort(students, c3);
        students.forEach(student -> System.out.println(student));

        System.out.println("------------------------------");

        LambdaDemo demo = new LambdaDemo();
        demo.doBehaviourPassing();

        System.out.println("------------------------------");
        demo.doBinaryOperation();
    }
}
