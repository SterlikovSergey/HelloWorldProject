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

        int maxArray = Integer.MIN_VALUE;
        int minArray = Integer.MAX_VALUE;
        int counterTwo = 0;
        int even = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxArray){
                maxArray = array[i];
            } if (array[i] < minArray) {
                minArray = array[i];
            } if (array[i] == 2){
                counterTwo ++;
            } if (array[i] % 2 == 0){
                even++;
            }
        }
        System.out.println("Sours array");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
        System.out.println("max value of array: = " + maxArray + " min value of array = " + minArray);
        System.out.println("Number of numbers 2 in array: = " + counterTwo);
        System.out.println("Number of evens of value =  " + even);
    }
}
