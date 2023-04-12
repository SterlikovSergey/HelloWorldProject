package by.sterlikov.classwork.lesson7;

public class Lesson7Main {
    public static void main(String[] args) {

        AirPlane airPlane = new AirPlane();
        Duck duck = new Duck();
        Ball ball = new Ball();
        Apple apple = new Apple();

        airPlane.fly();
        airPlane.flyWithSound();
        airPlane.printMessage();

        duck.fly();
        duck.flyWithSound();
        duck.printMessage();

        ball.fly();;
        ball.flyWithSound();
        ball.printMessage();

        apple.fly();
        apple.flyWithSound();
        apple.printMessage();

        Flyable[] flyableItems = getFlyableItems();
        for (Flyable flyable: flyableItems){
            flyable.flyWithSound();
        }
    }
    private static Flyable[] getFlyableItems() {      //select and -  command option M !
        Flyable[] flyableItems = new Flyable[6];
        flyableItems[0] = new Duck();
        flyableItems[1] = new AirPlane();
        flyableItems[2] = new Duck();
        flyableItems[3] = new AirPlane();
        flyableItems[4] = new Ball();
        flyableItems[5] = new Apple();
        return flyableItems;
    }
}
