package by.sterlikov.homework.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the size of the array ");
        int sizeArray = scanner.nextInt();
        int array[] = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array created and filled random with value from 1 to 100");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
