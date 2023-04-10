package by.Sterlikov.classwork.lesson7;

public class Ball implements Flyable{
    @Override
    public void fly() {
        System.out.println("Ball is fly no sound");
    }

    @Override
    public void flyWithSound() {
        System.out.println("Ball is fly and sound Zzzzzzzzzzz");

    }

    @Override
    public void printMessage() {
        Flyable.super.printMessage();
    }
}
