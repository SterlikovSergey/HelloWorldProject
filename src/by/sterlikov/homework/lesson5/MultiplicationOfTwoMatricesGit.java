package by.sterlikov.homework.lesson5;

import java.util.Arrays;
import java.util.Random;

public class MultiplicationOfTwoMatricesGit {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] multiArrayOne = new int[3][3];
        int[][] multiArrayTwo = new int[3][3];
        int[][] multiArrayThree = new int[3][3];
        int[][] multiArrayFour = new int[3][3];

        for (int i = 0; i < multiArrayOne.length; i++) {
            for (int j = 0; j < multiArrayOne[i].length; j++) {
                multiArrayOne[i][j] = random.nextInt(5);
                multiArrayTwo[i][j] = random.nextInt(5);
                multiArrayThree[i][j] = multiArrayOne[i][j] * multiArrayTwo[i][j];
                multiArrayFour[i][j] = multiArrayOne[i][j] + multiArrayTwo[i][j];
            }
        }

        System.out.println(Arrays.deepToString(multiArrayOne));
        System.out.println(Arrays.deepToString(multiArrayTwo));
        System.out.println(Arrays.deepToString(multiArrayThree));
        System.out.println(Arrays.deepToString(multiArrayFour));
    }
}
