package by.sterlikov.classwork.lesson7;

public class Duck implements Flyable{
    @Override
    public void fly() {
        System.out.println("Duck fly is not sound");
    }

    @Override
    public void flyWithSound() {
        System.out.println("Duck fly and sound Zzzzzzzzz");

    }

    @Override
    public void printMessage() {
        Flyable.super.printMessage();
    }
}
