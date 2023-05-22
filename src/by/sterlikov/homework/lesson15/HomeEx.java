package by.sterlikov.homework.lesson15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class HomeEx {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("give the date");
        String date = scanner.nextLine();
        LocalDate localDate1 = LocalDate.parse(date,formatter);
        LocalDate  localDate = LocalDate.parse(date);
        System.out.println(localDate);


    }
}
