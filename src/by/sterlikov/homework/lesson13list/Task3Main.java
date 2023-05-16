package by.sterlikov.homework.lesson13list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3Main {
    public static void main(String[] args) {
        Map<String, List<String>> product = new HashMap<>();
        List<String> fruits = new ArrayList<>();
        String category = "fruits";
        product.put(category,fruits);
        product.put(category,  new ArrayList<>());

        extracted(product, category);

        if (category.equals("fruits")){
            fruits.add("Apple");
        }
    }

    private static void extracted(Map<String, List<String>> product, String category) {
        List<String> categoryProducts = product.get(category);
        if(categoryProducts == null){
            System.out.println("no this category");
        } else {
            categoryProducts.add("Apple");
        }
    }
}
