package by.Sterlikov.classwork.lesson7;

public class AirPlane implements Flyable{

    @Override
    public void fly() {
        System.out.println("AirPlane is fly no sound");
    }

    @Override
    public void flyWithSound() {
        System.out.println("AirPlane is fly  sound  zzzzzzzzzz");

    }
}
