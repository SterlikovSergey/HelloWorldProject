package by.sterlikov.classwork.lesson15;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReTaskOneHomeworkLesson4 {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 7, 8, 9, 3);
        int x = 3;
        List<Integer> result = arrays.stream()
                .map(val -> val == x ? 0 : val)
                .toList();
        System.out.println(result);

        /*IntStream array = IntStream.of(1,2,3,4,5,6,3,7,8,9,3).min().getAsInt()*/

        System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 3, 7, 8, 9, 3)// task 2,3 lesson 4
                .summaryStatistics());

        arrays.stream()
                .filter(z -> z % 2 == 0)
                .forEach(z -> System.out.println(z)); // task 4
    }
}
