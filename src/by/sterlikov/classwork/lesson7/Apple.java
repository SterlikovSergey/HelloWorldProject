package by.sterlikov.classwork.lesson7;

public class Apple implements Flyable {
    @Override
    public void fly() {
        System.out.println("Apple fly is not sound");
    }

    @Override
    public void flyWithSound() {
        System.out.println("Apple fly and sound Zzzzzzzzzzzz");
    }

    @Override
    public void printMessage() {
        Flyable.super.printMessage();
    }
}
