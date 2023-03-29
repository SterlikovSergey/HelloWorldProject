package by.Sterlikov.classwork.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input length array : ");
        int inputLength = scanner.nextInt();
        int array [] = new int[inputLength];
        int maxArray = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(20);
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxArray){
                maxArray = array[i];
            }
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("max value of array: " + maxArray);
    }
}
