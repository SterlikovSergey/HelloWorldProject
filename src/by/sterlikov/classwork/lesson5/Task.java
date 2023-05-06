package by.sterlikov.classwork.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] result = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = random.nextInt(5);
                arr2[i][j] = random.nextInt(5);
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
/*        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = random.nextInt(5);
            }
        }
 */
/*        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; i++){
                for (int iarr2 = 0; iarr2 < arr2.length; iarr2++){
                    for (int jarr2 = 0; jarr2 < arr2[iarr2].length; jarr2++){
                        for (int iarr1 = 0; iarr1 < arr1.length; i++) {
                            for (int jarr1 = 0; jarr2 < arr1[iarr1].length; jarr1++) {
                                result[i][j] = arr1[iarr1][jarr1] * arr2[iarr2][jarr2];
                            }
                        }
                    }
                }
            }
        }
 */
        System.out.println(Arrays.deepToString(result));
    }
}
