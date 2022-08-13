package sample.chapter7;

public class DayOfWeek {

    public static void main(String[] args) {

        int day = 4;
        String dayName = "";

        // if (day == 1) {
        // dayName = "Monday";
        // }
        // if (day == 2) {
        // dayName = "Tuesday";
        // }
        // if (day == 3) {
        // dayName = "Wednesday";
        // }
        // if (day == 4) {
        // dayName = "Thursday";
        // }
        // if (day == 5) {
        // dayName = "Friday";
        // }
        // if (day == 6) {
        // dayName = "Saturday";
        // }
        // if (day == 7) {
        // dayName = "Sunday";
        // }

        // if (day == 1) {
        // dayName = "Monday";
        // } else if (day == 2) {
        // dayName = "Tuesday";
        // } else if (day == 3) {
        // dayName = "Wednesday";
        // } else if (day == 4) {
        // dayName = "Thursday";
        // } else if (day == 5) {
        // dayName = "Friday";
        // } else if (day == 6) {
        // dayName = "Saturday";
        // } else if (day == 7) {
        // dayName = "Sunday";
        // } else {
        // dayName = "Oops!";
        // }

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is " + dayName);

        if (dayName.equals("Saturday") || dayName.equals("Sunday")) {
            System.out.println("It is the weekend!");
        } else {
            System.out.println("It is a weekday");
        }
    }

}
