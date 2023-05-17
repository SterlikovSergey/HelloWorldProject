package by.sterlikov.classwork.lesson13List;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> firstMap = new HashMap<>();//ключ значение в ней очень быстро можно найти по ключу зачение
        Map<Integer, String> secondMap = new TreeMap<>();// делает ключи по возрастанию  либо в алфавитном порядке

        firstMap.put(1, "red");
        firstMap.put(2, "orange");
        firstMap.put(3, "yellow");
        System.out.println(firstMap.get(2));
        System.out.println(firstMap.get(4));

        System.out.println(firstMap.containsKey(3));// присусивует ключ 3
        System.out.println(firstMap.isEmpty());
        System.out.println(firstMap.size());// сколько ключкей
        System.out.println(firstMap.remove(3));
        System.out.println(firstMap);
        for (Integer key : firstMap.keySet()) {  // древний метод
            System.out.println(firstMap.get(key));
        }

        firstMap.forEach((k, v) -> System.out.println(k + " " + v)); // перебрать все ключи и значения

        List<Integer> integers;
        List<List<Integer>> integers2;

        Map<String, List<String>> map = new HashMap<>();
        // у меня есть computers - (lenovo asus )
        // phones (samsung iphone)

        List<String> computers = new ArrayList<>();
        computers.add("asus");
        computers.add("lenovo");
        List<String> phones = new ArrayList<>();
        phones.add("iphone");
        phones.add("samsung");

        map.put("computers", computers);
        map.put("phones", phones);

        map.get("phones").add("samsung2");// сохранится и в листе телефоны и в МАР

        System.out.println(map);
        System.out.println(phones);

        firstMap.put(3, "yellow");
        System.out.println(firstMap.keySet());// вернет ключи
        System.out.println(firstMap.values());// вернёт все значения

        secondMap.put(1, "red");
        secondMap.put(2, "orange");
        secondMap.put(3, "yellow");

        System.out.println(secondMap.get(2)); // возвращает по ключу
        System.out.println(secondMap.get(4)); // вернёт null т.к. нет значения
        System.out.println(secondMap);
    }
}
