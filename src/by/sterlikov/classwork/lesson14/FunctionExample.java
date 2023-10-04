package by.sterlikov.classwork.lesson14;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add((new Fruit("Banana", 20, "Yellow")));
        fruits.add((new Fruit("Apple", 10, "Red")));
        fruits.add((new Fruit("Plume", 5, "Violet")));
        fruits.add((new Fruit("Peach", 25, "Yellow")));
        fruits.add((new Fruit("Banana", 25, "Yellow")));

        /*fruits.sort(((o1, o2) -> o1.getName().length() - o2.getName().length()));*/
        fruits.sort((Comparator.comparingInt(o -> o.getName().length())));

        Supplier<Integer> myRandomSupplier = () -> new Random().nextInt(5);
        System.out.println(getOneFruit(fruits,myRandomSupplier));
        System.out.println(getOneFruit(fruits,() -> 0));
        System.out.println(getOneFruit(fruits,() -> fruits.size()-1));

        Supplier<Integer> myNotBananaSupplier = () -> {
            int position = new Random().nextInt(5);
            while (fruits.get(position).getName().equals("Banana")){
                position = new Random().nextInt(5);
            }
            return position;
        };

        System.out.println("Not bananas");
        System.out.println(getOneFruit(fruits, myNotBananaSupplier));


        Function<Fruit, String> getNameFunction = Fruit::getName;// Function < приходит, возвращается>
        Function<Fruit,String> getShortNameFunction = fruit -> fruit.getName().substring(0,2);
        Function<Fruit,String> getSizeFunction = fruit -> fruit.getWeight() < 10 ? "Small" : "Big";
    }
    private static Fruit getOneFruit(List<Fruit> fruits, Supplier<Integer> positionSupplier){
        return fruits.get(positionSupplier.get());
    }
    private static List<String> converterFruits(List<Fruit> fruits, Function<Fruit,String> convertor ){
        List<String> result =  new ArrayList<>();
        for(Fruit fruit : fruits){
            result.add(convertor.apply(fruit));
        }
        return result;
    }
}
