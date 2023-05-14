package by.sterlikov.classwork.lesson13List;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> firstSet = new HashSet<>(); // использовать когда надо быстро найти
        Set<String>  secondSet = new TreeSet<>();// использоавть по возрастанию либо алфавитный порядок

        firstSet.add("first");
        secondSet.add("first");
        firstSet.add("second");
        secondSet.add("second");
        firstSet.add("next");
        secondSet.add("next");

        // повторно  не  вставится
        firstSet.add("first");
        secondSet.add("first");
        firstSet.add("first");
        secondSet.add("first");

        System.out.println(firstSet);
        System.out.println(secondSet);
        System.out.println(firstSet.isEmpty());
        System.out.println(firstSet.contains("second"));// есть ли значение
        System.out.println(firstSet.remove("first"));
        System.out.println(firstSet);

        System.out.println(firstSet.size());


        Set<Person> myPersonSet = new TreeSet<>();
        myPersonSet.add(new Person("Pasha", "Ivanov"));
        myPersonSet.add(new Person("Dima", "Ivanov"));
        myPersonSet.add(new Person("Pasha", "Tosk"));
        System.out.println(myPersonSet);



    }
}
