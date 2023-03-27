package by.Sterlikov.lesson3;

import java.util.Scanner;

public class ThirdLessonClasswork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int theNumber = (int) (Math.random() * 200 + 1);
            System.out.println("Do you want to play?");
            String exit = scanner.nextLine();
            System.out.println(theNumber);

            while (exit.equalsIgnoreCase("y")) {
                System.out.println("Enter your value ");
                int inside = scanner.nextInt();

                String resault = (inside == theNumber) ? "great ! your win !" : (inside < theNumber) ? "value < theNumber"
                        : "value > theNumber";
                System.out.println(resault);

                if (inside == theNumber) {
                    System.out.println("great ! your win !");
                    break;
                }
                if (inside < theNumber) {
                    System.out.println("value < theNumber");
                } else {
                    System.out.println("value > theNumber");
                }
            }
            System.out.println("Do you want repeat?");
        }
    }
}
