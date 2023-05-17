package by.sterlikov.homework.lesson14;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        System.out.println("Enter the desired day of the week");
        String dayOfWeek = scanner.nextLine();
        dayOfWeek(date, dayOfWeek);
    }

    private static void dayOfWeek(LocalDate date, String dayOfWeek) {
        for (int i = 1; i <= 8; i++) {
            LocalDate newDate = date.plusDays(i);
            if (newDate.getDayOfWeek().toString().equalsIgnoreCase(dayOfWeek)) {
                System.out.println("next " + dayOfWeek + " will be " + newDate);
                break;
            }
        }
    }
}
