package sample.chapter7.exercise;

public class DisplayMonth {
    
    public static void main(String[] args) {
        int month = 4;
        String displayMonth = "";

        if (month == 1) {
            displayMonth = "January";
        } else if (month == 2) {
            displayMonth = "February";
        } else if (month == 3) {
            displayMonth = "March";
        } else if (month == 4) {
            displayMonth = "April"; 
        } else if (month == 5) {
            displayMonth = "May";
        } else if (month == 6) {
            displayMonth = "June";
        } else if (month == 7) {
            displayMonth = "July";
        } else if (month == 8) {
            displayMonth = "August";
        } else if (month == 9) {
            displayMonth = "September";
        } else if (month == 10) {
            displayMonth = "October";
        } else if (month == 11) {
            displayMonth = "November";
        } else if (month == 12) {
            displayMonth = "December";
        } else {
            displayMonth = "Invalid month number";
        }

        System.out.println(displayMonth);
    }
}
