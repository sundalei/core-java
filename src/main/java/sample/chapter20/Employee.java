package sample.chapter20;

public class Employee {

    protected String firstName;
    protected String lastName;

    Employee() {
        System.out.println("Employee Constructor");
    }

    public void doWork() {
        System.out.println("In Employee doWork");
    }

    public void createYearlyObjectives() {
        System.out.println("In Employee createYearlyObjectives");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
