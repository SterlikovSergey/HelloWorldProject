package by.sterlikov.classwork.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays {
    public static void main(String[] args) {

        int[] array = {0, 1, 2};
        System.out.println(Arrays.toString(array));

        int[] arratTwo = new int[5];
        System.out.println(Arrays.toString(arratTwo));

        Scanner scanner = new Scanner(System.in);
        System.out.println("input array length value");
        int arrayLength = scanner.nextInt();
        int[] array3 = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i + 1;
            //array3[i] = random.nextInt(10);
            System.out.println("Input array value");
            array3[i] = scanner.nextInt();
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println("array [" + i + "]" + array3[i]);
        }
        for (int i : array3) {
            System.out.println(i);
        }
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
