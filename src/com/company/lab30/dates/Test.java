package com.company.lab30.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Date d1 = new Date();
        long l = d1.getTime();
        System.out.println(l);

        LocalDate ld = LocalDate.now(); // 2018-12-18
        LocalTime lt = LocalTime.now(); // 19:07:35.113028
        LocalDateTime ldt = LocalDateTime.now();// 2018-12-18T19:07:35.113120

        LocalDate ld2 = LocalDate.of(2020, Month.SEPTEMBER, 23); // 2020-09-23
        LocalDate ld3 = LocalDate.of(2021, 1, 1); // 2021-01-01
        LocalDate ld4 = LocalDate.ofYearDay(2020, 361); // 2020-12-26

        test(ld4);
        test(LocalDate.now());

        LocalTime lt1 = LocalTime.of(12, 10); // 12:10
        LocalTime lt2 = LocalTime.of(18, 15, 10); // 18:15:10
        LocalTime lt3 = LocalTime.of(23, 59, 59, 700); // 23:59:59.000000700
        LocalTime lt4 = LocalTime.ofSecondOfDay(9_124); // 02:32:04
        LocalTime lt5 = LocalTime.ofNanoOfDay(100_000_000_000L); // 00:01:40

        test2(lt5);
        test2(LocalTime.now());

        LocalDateTime.of(1992, Month.AUGUST, 24, 12, 0); // 1992-08-24T12:00
        LocalDateTime.of(2004, Month.AUGUST, 23, 17, 15, 2); // 2004-08-23T17:15:02
        LocalDateTime.of(2018, 10, 14, 4, 20); // 2018-10-14T04:20
        LocalDateTime.of(LocalDate.now(), LocalTime.now()); // 2018-01-20T09:19:48.603054

        LocalDateTime ldt2 = LocalDateTime.now();
        System.out.println(ldt2);
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);
        OffsetDateTime odt2 = OffsetDateTime.parse("2020-05-28T00:29:19.258529300+06:00");
        System.out.println(odt2);
    }

    private static LocalDate test(LocalDate date) {
        return date.plusYears(2);
    }

    private static LocalTime test2(LocalTime date) {
        return date.plusHours(2);
    }
}
