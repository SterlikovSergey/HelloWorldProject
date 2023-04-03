package by.sterlikov.homework.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        float sumOfArrayOneValues = 0;
        float sumOfArrayTwoValues = 0;

        System.out.println("Enter the size of the array number one:");

        int sizeOfTheArrayOne = scanner.nextInt();
        int arrayOne [] = new int[sizeOfTheArrayOne];
        for(int i = 0; i < arrayOne.length; i++ ){
            arrayOne[i] = random.nextInt(100);
        }
        for(int i = 0; i < arrayOne.length; i++ ) {
            sumOfArrayOneValues += arrayOne[i];
        }
        System.out.println("Array ONE created and filled with random numbers from 1 to 100 ");
        System.out.println(Arrays.toString(arrayOne));

        System.out.println("Enter the size of the array number two:");

        int sizeOfTheArrayTwo = scanner.nextInt();
        int arrayTwo [] = new int[sizeOfTheArrayTwo];
        for(int i = 0; i < arrayTwo.length; i++ ){
            arrayTwo[i] = random.nextInt(100);
        }
        for(int i = 0; i < arrayTwo.length; i++ ) {
            sumOfArrayTwoValues += arrayTwo[i];
        }
        System.out.println("Array TWO created and filled with random numbers from 1 to 100 ");
        System.out.println(Arrays.toString(arrayTwo));

        float resultArrayOne = sumOfArrayOneValues / sizeOfTheArrayOne;
        float resultArrayTwo = sumOfArrayTwoValues / sizeOfTheArrayTwo;

        if (resultArrayOne > resultArrayTwo){
            System.out.println("Array mean one more " + resultArrayOne + " > " + resultArrayTwo);
        } else {
            System.out.println("Array mean one less " + resultArrayOne + " < " + resultArrayTwo);
        } if (resultArrayOne == resultArrayTwo){
            System.out.println("mean values are equal");
        }
    }
}
