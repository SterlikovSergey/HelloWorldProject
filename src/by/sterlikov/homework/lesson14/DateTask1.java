package by.sterlikov.homework.lesson14;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class DateTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();
        dayOfWeek(year, month, day);
    }

    private static void dayOfWeek(int year, int month, int day) {
        LocalDate myDate;
        myDate = LocalDate.of(year, month, day);
        System.out.println("Day of the week your date:  " + myDate.getDayOfWeek().toString().toUpperCase(Locale.ROOT));
    }
}
