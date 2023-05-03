package by.sterlikov.classwork.lesson12File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner("sfgafbhasfbna");


        try (FileReader fileReader = new FileReader("abc.doc");
             Scanner scanner2 = new Scanner(fileReader)) {
            while (scanner2.hasNext()) ;
            System.out.println(scanner2.nextLine());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }
}
