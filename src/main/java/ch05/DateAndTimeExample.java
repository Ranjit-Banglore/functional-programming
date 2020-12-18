package ch05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        // creating LocalDate, LocalTime and LocalDateTime

        LocalDate localDate = LocalDate.of(2020, 11, 8);
        System.out.println(localDate);
        LocalTime localTime = LocalTime.of(22, 34, 12);
        System.out.println(localTime);
        LocalDateTime dt = LocalDateTime.of(localDate, localTime);
        System.out.println(dt);
        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        //using formatter
        var formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy 'at' HH:mm:ss");
        System.out.println(dt.format(formatter));
        //adding month to dateandtime
        System.out.println(dt.plusMonths(-33));
    }
}
