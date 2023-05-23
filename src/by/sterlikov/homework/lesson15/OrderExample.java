package by.sterlikov.homework.lesson15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OrderExample {
    public static void main(String[] args) {
        List<Order> orders = getOrders();
        var result = orders
                .stream()
                .filter(isOrderWithEggs())
                .toList();
        System.out.println(result);

        var products = orders
                .stream()
                .flatMap(order -> order
                        .getProducts()
                        .stream())
                .distinct()
                .map(Product::getProductName)
                .toList();
        System.out.println(products);
    }

    private static Predicate<Order> isOrderWithEggs() {
        return order -> order
                .getProducts()
                .stream()
                .anyMatch(containsEggs());
    }

    private static Predicate<Product> containsEggs() {
        return product -> product
                .getProductName()
                .equals("Eggs");
    }

    private static List<Order> getOrders() {
        List<Product> products = getFirstProductsList();
        List<Product> secondProducts = getSecondProducts();
        List<Product> thirdProducts = getThirdProducts();

        List<Order> orders = Arrays.asList(new Order(1, products),
                new Order(2, secondProducts),
                new Order(3, thirdProducts));
        return orders;
    }

    private static List<Product> getThirdProducts() {
        List<Product> thirdProducts = Arrays.asList(new Product("Milk", 20),
                new Product("CupCase", 4),
                new Product("Apple", 10),
                new Product("Sugar", 5));
        return thirdProducts;
    }

    private static List<Product> getSecondProducts() {
        List<Product> secondProducts = Arrays.asList(new Product("Milk", 20),
                new Product("Cola", 4),
                new Product("Meat", 18),
                new Product("Bread", 2));
        return secondProducts;
    }

    private static List<Product> getFirstProductsList() {
        List<Product> products = Arrays.asList(new Product("Milk", 20),
                new Product("Milk", 15),
                new Product("Eggs", 25),
                new Product("Sugar", 10));
        return products;
    }
}
