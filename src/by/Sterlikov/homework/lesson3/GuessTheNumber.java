package by.Sterlikov.homework.lesson3;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to play this game? Y or N ?");
            String valueString = scanner.next();
            if (valueString.equalsIgnoreCase("y")) {
                int theNumber = (int) (Math.random() * 100 + 1);
                System.out.println("Set the number of attempts! ");
                int count = scanner.nextInt();
                System.out.println("Please input value  ");
                int value = scanner.nextInt();
                if (value != theNumber) {
                    //while (valueString.equalsIgnoreCase("y")) {
                        System.out.println("number of attempts - " + count);
                        if (count >= 1) {
                            if (value > theNumber) {
                                System.out.println("Computer want value: " + theNumber);
                                System.out.println("enter a number less than : " + value);
                                value = scanner.nextInt();
                            } else if (value < theNumber) {
                                System.out.println("Computer want value: " + theNumber);
                                System.out.println("enter more than: " + value);
                                value = scanner.nextInt();
                            } else {
                                System.out.println("You win!!!");
                                System.out.println(" Do you want to play again? Y or N");
                                valueString = scanner.next();
                            }
                            count--;
                        } else {
                            System.out.println("You lose !!! Number of attemptsYou lose !!! Number of attempts - " + count);
                            System.out.println(" Do you want to play again? Y or N");
                            valueString = scanner.next();
                        }
                    //}
                } else {
                    System.out.println("You win!!!");
                    System.out.println(" Do you want to play again? Y or N");
                    valueString = scanner.next();
                }

            } else {
                System.out.println(" Goodbye !!!");
                return;
            }
        }
    }
}


