package by.sterlikov.homework.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the size of the array:");

        int sizeOfTheArray = scanner.nextInt();
        int array [] = new int[sizeOfTheArray];
        for(int i = 0; i < array.length; i++ ){
            array[i] = random.nextInt(100);
        }
        System.out.println("Array created and filled with random numbers from 1 to 100 ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the desired value");
        int desiredValue = scanner.nextInt();
        boolean result = false;
        int count = 0;

        for(int  i = 0; i < array.length; i++){
            if (desiredValue == array[i]){
                count++;
                result = true;
            }
        }
        if (result){
            System.out.println("The desired value is present in the array and repeated - " + count +  " times");
        } else {
            System.out.println("The desired value is missing from the array");
        }
    }
}
