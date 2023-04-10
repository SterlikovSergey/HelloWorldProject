package by.sterlikov.classwork.lesson5;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Random random = new Random();

        int [] arr = new int[10];
        int [] newArr = new int[10];
        arr[0] = 1;
        System.out.println(Arrays.equals(arr, newArr)); // !!!!!!!!!!!!!!!! important !!!!!!!!!!!!!!!!
        System.out.println(Arrays.compare(arr, newArr));

        int [] [] multiArray = new int[10][10];
        for (int i = 0; i < multiArray.length; i++){
           for (int j  = 0; j < multiArray[i].length; j++){
               multiArray[i][j] = i * j;
           }
        }
        System.out.println(Arrays.deepToString(multiArray));
        for (int i = 1; i < multiArray.length; i++){
            for (int j = 1; j < multiArray[i].length; j++){
                System.out.print("     " + multiArray[i][j]);
            }
            System.out.println(" ");
        }

        int [][] multiArrayOne = new int[4][];
        for (int i = 0; i < multiArrayOne.length; i++){
            multiArrayOne[i] = new int[i + 1];
            Arrays.fill(multiArrayOne[i],i + 1);               //!!!!!!!!!!!!!!!! important !!!!!!!!!!!!!!!!
        }
        System.out.println(Arrays.deepToString(multiArrayOne));  //!!!!!!!!!!!!!!!! important !!!!!!!!!!!!!!!! Only for Multi Arrays!

        int [][] multiArrayTwo = new int[5][5];

        for (int i = 0; i < multiArrayTwo.length; i++){
            for (int j = 0; j < multiArrayTwo[i].length; j++){
                multiArrayTwo[i][j] = random.nextInt(40);
            }
        }
        System.out.println(Arrays.deepToString(multiArrayTwo));

        int [] [] []  threeArray = new int[3][3][3];
        for (int i =  0; i < threeArray.length; i++){
            for (int j = 0; j < threeArray[i].length; j++){
                for (int k = 0; k < threeArray[i] [j].length; k++){
                    threeArray[i] [j] [k] = random.nextInt(10);
                }
            }
        }
        System.out.println("three Arrays" + Arrays.deepToString(threeArray));


    }
}


