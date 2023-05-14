package by.sterlikov.homework.lesson10;

import java.io.*;
import java.util.Scanner;

public class FileReaderExampleTeach {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name for reading");
        String fileName = sc.nextLine();
        if(!new File(fileName).exists()){
            throw new FileNotFoundException("File " + fileName + " dont exist");
        }

        try (FileReader reader = new FileReader("abc.doc");
             Scanner scanner = new Scanner(reader)) {
            FileWriter correctWriter = new FileWriter("result.doc");
            FileWriter incorrectWriter = new FileWriter("incorrect.doc");

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (isaBoolean(line)){                  // выделить код правая конт меню refactoring
                    correctWriter.write(line + "\n");
                } else {
                    incorrectWriter.write(line + "is correct" + "\n");
                }

                //correctWriter.write(scanner.nextLine() + "\n");   //  пишем все строки что прочитали в файл
                //incorrectWriter.write(scanner.nextLine() + "\n");

                correctWriter.write(line + "\n"); // пишем по одной  прочитанной строке
                incorrectWriter.write(line + "\n");


            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }

    private static boolean isaBoolean(String line) {
        return (line.length() == 15) && (line.startsWith("docnum") || line.startsWith("contract"));
    }
}
