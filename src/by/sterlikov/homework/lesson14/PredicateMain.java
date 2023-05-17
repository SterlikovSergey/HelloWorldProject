package by.sterlikov.homework.lesson14;

import java.util.*;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 100; i ++){
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);


    }
//    private static List<Integer> fil(Set<Integer> numbers, Predicate predicate){
//
//        return false;
//    }
}


