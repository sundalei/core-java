package sample.chapter7;

public class AboutYou {

    public static void main(String[] args) {
        int age = 19;
        boolean registered = true;

        // See if a person can vote!
        if (age >= 18 && registered == true) {
            System.out.println("You can vote!");
        }

        // See if they are not allowed to vote!
        if (age < 18 || registered != true) {
            System.out.println("You not eligible to vote!");
        }
    }
    
}
