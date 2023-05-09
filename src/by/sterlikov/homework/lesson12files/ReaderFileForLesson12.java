package by.sterlikov.homework.lesson12files;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderFileForLesson12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathToFile = scanner.nextLine();
        File file = new File(pathToFile);
        try (FileReader fileReader = new FileReader(file);
             Scanner scanner2 = new Scanner(fileReader)) {
            StringBuilder builder = new StringBuilder();
            while (scanner2.hasNext()) {
                builder.append(scanner2.nextLine());
            }
            System.out.println(builder);
            String[] arLine = builder.toString().split("docnum");
            System.out.println(Arrays.toString(arLine));
            for (String i : arLine) {
                if (i.length() == 15) {
                    System.out.println(i);
                    File fileValid = new File("/Users/sergeysterlikov/Desktop/FileResultValid.txt");
                    try (FileWriter fileWriterValid = new FileWriter(fileValid, true)) {
                        StringBuilder stringBuilder = new StringBuilder("\ndocnum");
                        String infoString = String.valueOf(stringBuilder.append(i));
                        fileWriterValid.write(infoString);
                    } catch (IOException e) {
                        throw new RuntimeException();
                    }
                } else {
                    File failNoValid = new File("/Users/sergeysterlikov/Desktop/FileResultNoValid.txt");
                    try (FileWriter fileWriterNoValid = new FileWriter(failNoValid, true)) {
                        StringBuilder stringBuilder = new StringBuilder("\ndocnum");
                        String infoString = String.valueOf(stringBuilder.append(i + ": the length of the document number is greater than or less than 15 characters"));
                        fileWriterNoValid.write(infoString);
                    } catch (IOException e) {
                        throw new RuntimeException();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
