package by.Sterlikov.homework.lesson3;

import java.util.Scanner;

public class ColorsOfRainbowClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input value between 1 and 7");
        int inputValue = scanner.nextInt();
        switch (inputValue) {
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("Blue");
            case 6 -> System.out.println("Dark blue");
            case 7 -> System.out.println("Purple");
        }
    }
}
