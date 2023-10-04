package by.sterlikov.classwork.lesson15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {

        List<Integer> values = Arrays.asList(1, 2, 10, 50, 3, 4, 5, 10, 50, 3);

        List<Integer> values2 = List.of(1, 2, 3);                                        //лист  фиксироавнного размера
        List<Integer> emptyList = Collections.emptyList();                              //лист  фиксироавнного размера
        List<Integer> singleElement = Collections.singletonList(1);                    //лист  фиксироавнного размера
        Stream<List<Integer>> listStream = Stream.of(values, values, values2);        // поток листов

        Stream<Integer> valueStream = values.parallelStream();                      // задать стим
        Stream<String> stream = Stream.of("A", "b", "C");               // второй способ
        Stream<String> myRows = Files.lines(Paths.get("abc.doc"));        // третий с файла поток

        Stream<Integer> firstStream = Stream.iterate(0, n -> n + 1);     // от 0 до бесконечности поток
        Stream<Integer> secondStream =
                Stream.generate(() -> new Random().nextInt(100));   // пока не остановлю поток






        // терминальные операции

      List<Integer> result = valueStream                      // собери мне это в лист в потоке
                .distinct()                                    // оставить только уникальные значения
                .peek(System.out::println)                    //.peek(x -> System.out.println(x)) // выведет все на текущий момент
                .sorted()                                    // сортировка
                .skip(2)                                // первые 2 пропусти
                .limit(3)                         // возьми три значения
                .sorted(((o1, o2) -> o2.compareTo(o1)))  // сортировка по убыванию при  помощи компоратора
                .filter(val -> val % 2 == 0)            // вернуть  четные
                .map(x -> x * x)                       // выведи квадраты
                .filter(StreamMain::isaBoolean)       // .filter(x -> isaBoolean(x)) выбери что бы х меньше 1000
                .toList();
        System.out.println(result);


        List<Integer> secondResult = listStream
                .flatMap(Collection::stream)
                .toList();


 Set<Integer> resultSet = valueStream
                .collect(Collectors.toSet());   // так нельзя, поток собирается только один раз

        System.out.println(result);

        System.out.println("second" + secondResult);

        System.out.println(listStream.flatMap(Collection::stream)
                .count());

        System.out.println(listStream.flatMap(Collection::stream)
                .max((o1, o2) -> o1.compareTo(o2))
                .orElseThrow());

        System.out.println(listStream.flatMap(Collection::stream)
                .min((o1, o2) -> o1.compareTo(o2))
                .orElseThrow());

        System.out.println(listStream.flatMap(Collection::stream)
                .findFirst()
                .orElseThrow());

        System.out.println(listStream.flatMap(Collection::stream)
                .filter(x -> x < 3)
                .findAny()
                .orElseThrow());

        System.out.println(listStream.flatMap(Collection::stream)
                .filter(x -> x < 3)
                .noneMatch(x -> x % 3 == 0));
                  //.allMatch(x -> x < 1)
                 //.collect(Collectors.toSet())
                //.toList();

    }
    private static boolean isaBoolean(Integer x) {
        return x < 1000;
    }
}
