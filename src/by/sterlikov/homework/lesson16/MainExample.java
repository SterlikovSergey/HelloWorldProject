package by.sterlikov.homework.lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MainExample {
    public static void main(String[] args) {
        List<Book> books = getBooks();

        printGroupingByYear(books);
        printGroupingByAuthorByYear(books);
        printCountingBooksByYear(books);
        numberBooksByAuthor(books);


    }

   private static void numberBooksByAuthor(List<Book> books) {
        Map<String,Long> numberBooksByAuthor = books
                .stream()
                .collect(groupingBy(Book::getAuthor,
                        counting()));
        System.out.println(numberBooksByAuthor);
    }

    private static void printCountingBooksByYear(List<Book> books) {
        Map<Integer, Long> printCountingBooksByYear = books
                .stream()
                .collect(groupingBy(Book::getYearPublishing
                ,counting()));
        System.out.println("Counting" + printCountingBooksByYear);
    }

    private static void printGroupingByYear(List<Book> books) {
        Map<Integer, List<Book>> printGroupingByYear = books
                .stream()
                .collect(groupingBy(Book::getYearPublishing));
        System.out.println("GroupingByYear" + printGroupingByYear);
    }

    private static void printGroupingByAuthorByYear(List<Book> books) {
        Map<String, Map<Integer, List<Book>>> bookByNameTitleByYear = books
                .stream()
                .collect(groupingBy(Book::getAuthor, groupingBy(Book::getYearPublishing)));
        System.out.println("GroupingBYTitle" + bookByNameTitleByYear);
    }

    private static List<Book> getBooks() {
        List<Book> books = Arrays.asList(new Book("George", "War", 2023),
                new Book("George", "Pepsi", 2022),
                new Book("Bon", "Life", 2022),
                new Book("Rudolf", "Barny", 2023),
                new Book("Piter", "Pan", 2020),
                new Book("Kristofer", "Terminator", 2020),
                new Book("Bon", "Dead", 2021),
                new Book("Mel", "Gibson", 2020));

        return books;
    }
}
