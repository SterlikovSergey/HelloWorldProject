package by.sterlikov.classwork.lesson14;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add((new Fruit("Banana", 20, "Yellow")));
        fruits.add((new Fruit("Apple", 10, "Red")));
        fruits.add((new Fruit("Plume", 5, "Violet")));
        fruits.add((new Fruit("Peach", 25, "Yellow")));
        fruits.add((new Fruit("Banana", 25, "Yellow")));
//        System.out.println(filterFruitsByColor(fruits));
//        System.out.println(filterFruitsByWeight(fruits));                  // Это много, плохо, неудобно
//        System.out.println(filterFruitsByName(fruits));
        Predicate<Fruit> colorPredicate = fruit -> fruit.getColor().equals("Yellow");
        Predicate<Fruit> weightPredicate = fruit -> fruit.getWeight() > 15;
        Predicate<Fruit> namePredicate = fruit -> fruit.getName().length() > 5;// а это база

        //  предикат - что то даём  , возвращает true или false
        // консьюмер что то даем ни чего не возращаем

        Consumer<Fruit> myStringConsumer = s -> System.out.println(s);
        printNeededFruits(fruits, myStringConsumer);

        Consumer<Fruit> bananaConsumer = fruit -> {
            System.out.println("print banana");
            if (fruit.getName().equals("Banana")) {
                System.out.println(fruit);
            }
        };
        printNeededFruits(fruits, bananaConsumer);

        System.out.println(filterFruits(fruits, colorPredicate));
        System.out.println(filterFruits(fruits, weightPredicate));
        System.out.println(filterFruits(fruits, namePredicate));
        System.out.println(filterFruits(fruits, fruit -> fruit.getWeight() > 20 && fruit.getColor().equals("Yellow")));
    }
    private static void printNeededFruits(List<Fruit> fruits, Consumer<Fruit> fruitConsumer) {
        for (Fruit fruit : fruits) {
            fruitConsumer.accept(fruit);
        }
    }
    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> Predicate) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (Predicate.test(fruit)) {              // а это база
                result.add(fruit);
            }
        }
        return result;
    }
}
