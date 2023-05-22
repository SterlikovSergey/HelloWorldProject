package by.sterlikov.homework.lesson15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2Stream {
    public static void main(String[] args) {
        List<Students> students = Arrays.asList(new Students("Sergey")                              // Почему не работает с ArrayList?
                , new Students("Nikolay"), new Students("Valentina"), new Students("Andrey")
                , new Students("Maksim"), new Students("Yulia"), new Students("Sergey"),
                new Students("Anton"));

        Stream<Students> studentsStream = students.stream();

        System.out.println(studentsStream
                .filter(sV -> sV.getName().equalsIgnoreCase("Sergey")).count());
//                .filter("Sergey"::equals).count());

        System.out.println(studentsStream
                .filter(vS -> vS.getName().toLowerCase().startsWith("A"))
                .collect(Collectors.toList()));

        System.out.println(studentsStream
                .sorted());                                         // разобрать на уроке empty
    }
}