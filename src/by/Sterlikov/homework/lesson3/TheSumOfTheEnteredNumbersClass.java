package by.Sterlikov.homework.lesson3;

import java.util.Scanner;

public class TheSumOfTheEnteredNumbersClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int samInputValue = 0;
        while (samInputValue < 1000) {
            System.out.println("The sum of input value =  " + samInputValue);
            System.out.println("Please input value between 1 and 100");
            int inputValue = scanner.nextInt();
            if (inputValue <= 0 || inputValue > 100 ){
                System.out.println("Excuse me, you need input value between 1 and 100");
            }  else {
                samInputValue = inputValue + samInputValue;
            }
        }
    }
}
