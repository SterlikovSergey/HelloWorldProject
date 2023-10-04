package by.sterlikov.classwork.lesson12File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("abc.doc", true)) {
            //дописать в конец файла (true)
            fileWriter.write("this is my string\n");
            fileWriter.write("this is my second string\n");
            fileWriter.write("this is my three string");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
