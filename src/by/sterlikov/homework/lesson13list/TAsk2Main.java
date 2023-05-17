package by.sterlikov.homework.lesson13list;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TAsk2Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "/Users/sergeysterlikov/Desktop/FileForLesson12.txt";
        if (!new File(fileName).exists()) {
            throw new FileNotFoundException("File " + fileName + " dont exist");
        }
        try (FileReader reader = new FileReader(fileName);
             Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) {
                String[] arrayString = scanner.nextLine().split(" ");
                Set<String> numbers = new TreeSet<>(List.of(arrayString));
                System.out.println(Arrays.toString(arrayString));
                System.out.println(numbers);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
