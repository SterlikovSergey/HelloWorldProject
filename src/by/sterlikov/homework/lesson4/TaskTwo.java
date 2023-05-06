package by.sterlikov.homework.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the size of the array:");

        int sizeOfTheArray = scanner.nextInt();
        int array[] = new int[sizeOfTheArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array created and filled with random numbers from 1 to 100 ");
        System.out.println(Arrays.toString(array));

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        double sumOfArrayValues = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfArrayValues += array[i];
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        double result = sumOfArrayValues / sizeOfTheArray;

        System.out.println("MinValue - " + minValue);
        System.out.println("MaxValue - " + maxValue);
        System.out.println("Mean value - " + result);
    }
}
