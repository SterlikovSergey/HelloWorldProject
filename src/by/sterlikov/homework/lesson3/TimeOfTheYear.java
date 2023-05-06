package by.sterlikov.homework.lesson3;

import java.util.Scanner;

public class TimeOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is a Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is a Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is a Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is a Autumn");
                break;
            default:
                System.out.println("Between ");
        }
    }
}
