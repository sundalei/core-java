package sample.chapter20;

public class App {
  public static void main(String[] args){
    Manager manager = new Manager();
    manager.createYearlyObjectives();

    System.out.println("---------------------");
    System.out.println();

    Adder adder = new Adder();
    System.out.println(adder.add(10,20));
    System.out.println(adder.add(10.2f, 12.0f));
    System.out.println(adder.add(12, 14, 15));

    System.out.println("---------------------");
    System.out.println();

    System.out.println("Create an employee: ");
    Employee employee = new Employee();
    System.out.println("Create a manager: ");
    Manager manager2 = new Manager();
    System.out.println("Done");
  }
}