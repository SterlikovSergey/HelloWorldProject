package by.sterlikov.homework.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiArrayGit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int [][][] multiArray = new int[3][3][3];

        for (int i = 0; i < multiArray.length; i++){
            for (int j = 0; j < multiArray[i].length; j++){
                for (int k = 0; k < multiArray[i][j].length; k++){
                    multiArray[i][j][k] = random.nextInt(5);
                }
            }
        }
        System.out.println("Source array: ");
        System.out.println(Arrays.deepToString(multiArray));
        System.out.println("Enter value - ");

        int count = scanner.nextInt();

        for (int i = 0; i < multiArray.length; i++){
            for (int j = 0; j < multiArray[i].length; j++){
                for (int k = 0; k < multiArray[i][j].length; k++){
                    multiArray[i][j][k] += count;
                }
            }
        }
        System.out.println("Resulting array: ");
        System.out.println(Arrays.deepToString(multiArray));
    }
}

