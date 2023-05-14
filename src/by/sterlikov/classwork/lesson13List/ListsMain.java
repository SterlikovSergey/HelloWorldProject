package by.sterlikov.classwork.lesson13List;

import java.util.*;

public class ListsMain {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();// если  хотим linkedList просто меняем ArrayList
        List<String> secondStrings = new ArrayList<>();

        strings.add("string");              // arrayList хранит  в том порядке как добавлено
        strings.add("is");
        strings.add("beautiful");

        secondStrings.add("Hello");
        secondStrings.add("World");

        strings.addAll(secondStrings); // сложили два листа

        strings.add(2, "insert"); // вставили по индексу

        System.out.println(strings);
        System.out.println(strings.contains("insert"));// есть или нет по значению "insert"
        System.out.println(strings.indexOf("insert")); // где лежит в листе (возвращает индекс)
        System.out.println(strings.isEmpty());//пустой или нет
        System.out.println(strings.get(4));
        System.out.println(strings.remove("insert"));//выкенет
        System.out.println(strings);
        strings.removeAll(secondStrings);
        System.out.println(strings);
        strings.addAll(secondStrings);
        System.out.println(strings.set(1, "it is"));
        System.out.println(strings);
        System.out.println("size strings " + strings.size());


        Collections.sort(secondStrings);
        System.out.println(secondStrings);
        Collections.reverse(secondStrings);
        System.out.println(secondStrings);
        Collections.shuffle(strings);
        System.out.println(strings);

        for (String str : strings) {
            System.out.println(str);
        }

    }
}
