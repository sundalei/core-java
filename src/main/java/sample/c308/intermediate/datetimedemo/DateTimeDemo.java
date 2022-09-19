package sample.c308.intermediate.datetimedemo;

import java.time.*;

public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(date);
        System.out.println(time);

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of( 1997, Month.MARCH, 3, 16, 17, 0 );

        // period - gap between 2 dates or years.
        // duration - gap between 2 time periods.
        Duration duration = Duration.between(birthday, today);
        System.out.println( "Duration in days: " + duration.toDays() );
        System.out.println( "Duration in hours: " + duration.toHours() );

        Period period = Period.between(birthday.toLocalDate(), date);
        System.out.println("Period in years: " + period.getYears());
        System.out.println("Period in days: " + period.getDays());
        System.out.println("date after 6 months " + today.plusMonths(6));
        System.out.println("date after 6 weeks " + today.plusWeeks(6));
        System.out.println("date after 6 years " + today.plusYears(6));

        System.out.println("date before 6 months " + today.minusMonths(6));
        System.out.println("date before 6 weeks " + today.minusWeeks(6));
        System.out.println("date before 6 years " + today.minusYears(6));
    }
}
