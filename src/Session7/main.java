package Session7;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("today: " + localDate);

        System.out.println("Next day:" + localDate.plusDays(1));
        System.out.println("last day:" + localDate.minusDays(1));
        System.out.println("Next day:" + localDate.plusMonths(1));

        LocalDate birthday = localDate.of(1999, 2, 28);
        System.out.println("birthday" + birthday);

        LocalDate date = LocalDate.parse("1999-02-27");
        System.out.println("date:" + date);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("now" + localDateTime);
        System.out.println("time" + localDateTime.getHour());


        LocalDateTime timer = localDateTime.of(1999,12,4,30,23,0);


        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zoned);


-
    }


}