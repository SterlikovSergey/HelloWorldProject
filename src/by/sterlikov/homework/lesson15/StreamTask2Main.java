package by.sterlikov.homework.lesson15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask2Main {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(new Student("Sergey")                              // Почему не работает с ArrayList?
                , new Student("Nikolay"), new Student("Valentina"), new Student("Andrey")
                , new Student("Maksim"), new Student("Yulia"), new Student("Sergey"),
                new Student("Anton"));

        Stream<Student> studentsStream = students.stream();

        System.out.println(studentsStream
                .filter(sV -> sV.getName().equalsIgnoreCase("Sergey")).count());
//                .filter("Sergey"::equals).count());

        System.out.println(studentsStream
                .filter(vS -> vS.getName().startsWith("A"))
                .collect(Collectors.toList()));

        System.out.println(studentsStream
                .sorted());                                         // разобрать на уроке empty
    }
}
