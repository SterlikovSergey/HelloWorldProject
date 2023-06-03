package by.sterlikov.homework.lesson16;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class MainExample {
    public static void main(String[] args) {
        List<Book> books = getBooks();
        printGroupingByYear(books);
        printGroupingByAuthorByYear(books);
        printCountingBooksByYear(books);
        printNumberBooksByAuthor(books);
        printGroupByChar(books);
    }

    private static void printGroupByChar(List<Book> books) {
        List<String> withChar = books
                .stream()
                .map(Book::getBookTitle)
                .filter(bookTitle -> bookTitle.startsWith("A"))
                .toList();
        System.out.println("сгруппировать все книги по начальной букве " + withChar);
    }

    private static void printNumberBooksByAuthor(List<Book> books) {
        Map<String, Long> numberBooksByAuthor = books
                .stream()
                .collect(groupingBy(Book::getAuthor,
                        counting()));
        System.out.println("посчитать для каждого автора количество книг " + numberBooksByAuthor);
    }

    private static void printCountingBooksByYear(List<Book> books) {
        Map<Integer, Long> printCountingBooksByYear = books
                .stream()
                .collect(groupingBy(Book::getYearPublishing,
                        counting()));
        System.out.println("подсчитать  книги, по каждому году " + printCountingBooksByYear);
    }

    private static void printGroupingByYear(List<Book> books) {
        Map<Integer, List<Book>> printGroupingByYear = books
                .stream()
                .collect(groupingBy(Book::getYearPublishing));
        System.out.println("все книги по годам издания " + printGroupingByYear);
    }

    private static void printGroupingByAuthorByYear(List<Book> books) {
        Map<String, List<Integer>> bookByNameTitleByYear = books
                .stream()
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getYearPublishing,
                                Collectors.toList()))
                );
        System.out.println("собрать автора годы, в которые выходили его книги " + bookByNameTitleByYear);
    }

    private static List<Book> getBooks() {
        List<Book> books = Arrays.asList(
                new Book("George", "War", 2023),
                new Book("George", "Pepsi", 2022),
                new Book("Bon", "Life", 2022),
                new Book("Rudolf", "Barny", 2023),
                new Book("Piter", "Pan", 2020),
                new Book("Kristofer", "Terminator", 2020),
                new Book("Bon", "Dead", 2021),
                new Book("George", "Apple", 2023),
                new Book("Mul", "After", 2023),
                new Book("Mike", "Ariel", 2023),
                new Book("Mel", "Gibson", 2020)
        );
        return books;
    }
}
