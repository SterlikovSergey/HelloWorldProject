package by.sterlikov.classwork.lesson13List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        String[] arr = {"first", "second", "third"};

        List<String> arrList = Arrays.asList(arr); //лист в массив
        List<String> nextArr  = new ArrayList<>(arrList); // обьеденение
        System.out.println(nextArr.stream()
                .map(str -> str.toUpperCase(Locale.ROOT))
                .toList());
    }
}
