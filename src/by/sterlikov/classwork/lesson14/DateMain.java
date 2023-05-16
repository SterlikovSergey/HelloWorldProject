package by.sterlikov.classwork.lesson14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime time;// день и время
        LocalDate date; // день
        Date oldDate;
        Calendar calendar;

        date = LocalDate.now();
        time = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        //System.out.println(date.plusDays(1));
        //System.out.println(date.minusDays(1));
        //date = date.plusMonths(1)
        //      .plusWeeks(1)
        //    .plusYears(1);
        System.out.println(date);

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getYear());
        System.out.println(date.getMonth());

        LocalDate nextDate = LocalDate.now().plusDays(1);
        System.out.println(date.isAfter(nextDate));
        System.out.println(date.isBefore(nextDate));

        LocalDate exactDate = LocalDate.of(2020, Month.FEBRUARY, 15);
        System.out.println(exactDate);

        LocalDate exactDate2 = LocalDate.of(2020, 2, 15);
        System.out.println(exactDate2);

        SimpleDateFormat format = new SimpleDateFormat("yyyy   MM    dd");
        System.out.println(format.format(new Date()));

        SimpleDateFormat formatReverse = new SimpleDateFormat("yyyy   dd    MM");
        System.out.println("Your date format: " + formatReverse.format(new Date()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String stringDate = "20-03-2022";
        System.out.println(LocalDate.parse(stringDate,formatter));

        String secondStringDate  = "2022-03-20";
        System.out.println(LocalDate.parse(secondStringDate));
    }
}
