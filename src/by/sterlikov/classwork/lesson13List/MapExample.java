package by.sterlikov.classwork.lesson13List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        String[] arr = {"first", "second", "third"};

        List<String> arrList = Arrays.asList(arr); //лист в массив
        List<String> nextArr  = new ArrayList<>(); //
        nextArr.addAll(arrList); // обьеденение

    }
}
