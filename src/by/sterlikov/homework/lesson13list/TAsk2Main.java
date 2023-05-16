package by.sterlikov.homework.lesson13list;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TAsk2Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "abc.doc";
        List<Integer> numbers = new ArrayList<>();
        if(!new File(fileName).exists()){
            throw new FileNotFoundException("File " + fileName + " dont exist");
        }
        try (FileReader reader = new FileReader(fileName);
             Scanner scanner = new Scanner("123 548 6432 586 64 21")){
            while (scanner.hasNext()){
                int rez = scanner.nextInt();
                numbers.add(rez);
                System.out.println(scanner.nextInt());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
