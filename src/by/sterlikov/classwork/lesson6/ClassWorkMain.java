package by.sterlikov.classwork.lesson6;

public class ClassWorkMain {
    public static void main(String[] args) {
        Car myBMW = new Car("green",2023, "BMW",4,true);    // command P
        System.out.println(myBMW.getColor());
        myBMW.setColor("black");
        System.out.println(myBMW.getColor());
        System.out.println(myBMW.toString());
        myBMW.starterDriving();
        myBMW.starterDriving();
        myBMW.intSpeedChange(4);
        myBMW.goDirectly();
        myBMW.switchDirection(true);
        myBMW.intSpeedChange(-5);
        myBMW.intSpeedChange(50);
        myBMW.intSpeedChange(-30);
        myBMW.intSpeedChange(20);
        myBMW.switchDirection(true);

        Car newMyCar = new Car();
        newMyCar.setColor("white");
        newMyCar.setAge(2010);
        newMyCar.setSuperBrand("audi");
        newMyCar.setRadio(true);
        newMyCar.setWheelNumber(3);

        System.out.println(newMyCar.toString());
    }
}
