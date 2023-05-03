package by.sterlikov.classwork.lesson12File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarReaderExample {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("car.doc");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            while (true) {
                Car mCcar = (Car) objectInputStream.readObject();
                System.out.println(mCcar);
            }
        } catch (IOException e) {
            // throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }
}
