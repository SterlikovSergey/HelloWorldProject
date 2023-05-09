package by.sterlikov.homework.lesson12files;

import java.io.File;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class WriterFileForLesson12 {
    public static void main(String[] args) {
        File file = new File("/Users/sergeysterlikov/Desktop/FileForLesson12.txt");

        try (FileWriter fileWriter = new FileWriter("/Users/sergeysterlikov/Desktop/FileForLesson12.txt", true)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of document");
            StringBuilder stringBuilder = new StringBuilder("docnum");
            String infoDoc = String.valueOf(stringBuilder.append(scanner.nextLine()) + "\n");
            fileWriter.write(infoDoc);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
