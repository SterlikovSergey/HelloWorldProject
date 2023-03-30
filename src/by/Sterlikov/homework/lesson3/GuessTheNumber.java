package by.Sterlikov.homework.lesson3;
import java.util.Scanner;

public class GuessTheNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true){
                int theNumber = (int) (Math.random() * 200 + 1);
                int value = 0;
                System.out.println("Write any value BETWEEN 0 AND 200");
                int count = 0;
                while (value != theNumber) {
                    System.out.println("number of attempts - " + count);
                    System.out.println("Please input value  ");
                    value = scanner.nextInt();
                    if (value > theNumber) {
                        System.out.println("Computer want value: " + theNumber);
                        System.out.println("enter a number less than : " + value);
                    } else if (value < theNumber) {
                        System.out.println("Computer want value: " + theNumber);
                        System.out.println("enter more than: " + value);
                    } else {
                        System.out.println("you win!!!");
                        return;
                    }
                    count ++;
                }
            }
        }
}


