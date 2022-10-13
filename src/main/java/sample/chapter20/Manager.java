package sample.chapter20;

public class Manager extends Employee {

    Manager() {
        super();
        System.out.println("Manager Contructor");
    }

    Manager(int aValue) {
        System.out.println("Manager Constructor with argument");
    }

    public void hire() {
        System.out.println("In Manager hire");
    }

    public void fire() {
        System.out.println("In Manager fire");
    }

    public void givePerformanceReview() {
        System.out.println("In Manager givePerformanceReview");
    }

    @Override
    public void createYearlyObjectives() {
        super.createYearlyObjectives();
        System.out.println("In Manager createYearlyObjectives");
    }
}