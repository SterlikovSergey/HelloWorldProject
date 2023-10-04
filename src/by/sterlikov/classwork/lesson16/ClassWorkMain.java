package by.sterlikov.classwork.lesson16;

import by.sterlikov.classwork.lesson14.MyBestInterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ClassWorkMain {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();

        testMap.getOrDefault("a", "not found"); // исчем по значению ключа в мапке
        testMap.putIfAbsent("a", "abc");
        testMap.computeIfPresent("aa", (a0, a1) -> a0 + a1);

        MyBestInterface str = (st -> st.substring(0, 2));
        str.test("abc");


        List<Integer> testValues = Arrays.asList(1, 2, 3, 5, 3, 2, 1);

        Map<Integer, Long> result = testValues
                .stream()
                .collect(Collectors.groupingBy(  // сгрупировать
                        Function.identity(),    //
                        Collectors.counting()));
        System.out.println(result);

        List<User> users = getUsers();

        Map<Integer, List<User>> userByAge = users
                .stream()
                .collect(Collectors.groupingBy(User::getAge));
        System.out.println(userByAge);


        var employees = getEmployeeList();

        var averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()          // считаем среднею зарплату
                .getAsDouble();
        // Stream<Integer> -  поток чисел
        // IntStream   - числовой поток
        System.out.println(averageSalary);

        var employeesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory));
        System.out.println(employeesByCategory);


        var salariesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(salariesByCategory);

        var minSalariesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory
                        , Collectors.minBy(Comparator
                                .comparingDouble(Employee::getSalary))));
        System.out.println(minSalariesByCategory);

        Map<Employee, String> tests = employees.stream()//  <,> один ключ, одно  значение
                .collect(Collectors.toMap(
                        Function.identity(),// ключ обьекта
                        Employee::getCategory));

    }

    private static List<Employee> getEmployeeList() {
        return Arrays.asList(new Employee("Worker", 370),
                new Employee("Worker", 200),
                new Employee("Manager", 1200),
                new Employee("Worker", 560),
                new Employee("Manager", 2200));
    }

    private static List<User> getUsers() {

        return Arrays.asList(new User("Mike", 20),
                new User("Bill", 46),
                new User("Sonata", 23),
                new User("Sergey", 20),
                new User("Andrey", 20),
                new User("Valentina", 46));
    }
}
