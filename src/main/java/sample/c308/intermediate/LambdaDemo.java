package sample.c308.intermediate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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
    }
}
