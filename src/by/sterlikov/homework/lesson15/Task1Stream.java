package by.sterlikov.homework.lesson15;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task1Stream {
    public static void main(String[] args) {
        Random random = new Random();
//        //List<Integer> valuesList = new ArrayList<>();
//        for (int i = 0; i <= 50; i++) {
//            valuesList.add(random.nextInt(20));
//        }
//      Stream<Integer> parallelStream = valuesList.parallelStream();
//      Stream<Integer> valueStream = valuesList.stream();
        List<Integer> valuesList = newRandomList(1, 50, 110);

        String stringValues = valuesList.toString();
        System.out.println(stringValues);

        Stream<Integer> valueStream = valuesList.stream();

        System.out.println(valueStream
                .distinct()
                .collect(Collectors.toList()));

        System.out.println(valueStream
                .skip(7)
                .limit(10)
                .filter(vS -> vS % 2 == 0)
                .collect(Collectors.toList()));

        System.out.println(valueStream
                .map(vS -> vS * 2)
                .collect(Collectors.toList()));

        System.out.println(valueStream
                .distinct()
                .sorted()
                .limit(4)
                .collect(Collectors.toList()));

        System.out.println(valueStream
                .count()
        );

        System.out.println(valueStream
                .mapToInt((vS) -> Integer.parseInt(String.valueOf(vS))).average());
    }

    public static List<Integer> newRandomList(int min, int max, int count) {
        return new Random()
                .ints(min, max + 1)
                .limit(count)
                .boxed().toList();
    }
}


