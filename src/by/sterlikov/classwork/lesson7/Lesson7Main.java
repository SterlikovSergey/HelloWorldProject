package by.Sterlikov.classwork.lesson7;

public class Lesson7Main {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();
        airPlane.fly();
        airPlane.flyWithSound();
        airPlane.printMessage();


        Duck duck = new Duck();
        duck.fly();
        duck.flyWithSound();
        duck.printMessage();


        Ball ball = new Ball();


        Flyable[] flyablesItems = getFlyablesItems();
        for (Flyable flyable: flyablesItems){
            flyable.flyWithSound();
        }
    }

    private static Flyable[] getFlyablesItems() {      //select and -  command option M !
        Flyable[] flyablesItems = new Flyable[5];
        flyablesItems[0] = new Duck();
        flyablesItems[1] = new AirPlane();
        flyablesItems[2] = new Duck();
        flyablesItems[3] = new AirPlane();
        flyablesItems[4] = new Ball();
        return flyablesItems;
    }
}
