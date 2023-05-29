package by.sterlikov.homework.lesson16;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainExample {
    public static void main(String[] args) {
        List<Book> books = getBooks();

/*        Map<Integer, List<Book>> booksByYear = books
                .stream()
                .collect(Collectors.groupingBy(Book::getYearPublishing));
        System.out.println(booksByYear);*/

        Map<String,List<Book>> bookByNameTitle = books
                .stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
        System.out.println(bookByNameTitle);


    }

    private static List<Book> getBooks() {
        List<Book> books = Arrays.asList(new Book("George", "War",2023),
                new Book("Bon", "Life",2022),
                new Book("Rudolf", "Barny", 2023),
                new Book("Piter", "Pan",2020),
                new Book("Kristofer","Terminator",2020),
                new Book("Mel","Gibson",2020));
        return books;
    }
}
