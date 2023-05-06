package by.sterlikov.classwork.lesson7;

public interface Flyable {
    //  int value = 0; // не может быть приватных методов  int value = 0;   только константы!

    void fly();

    void flyWithSound();

    default void printMessage() {
        System.out.println("This is not informative message");
    }

}
