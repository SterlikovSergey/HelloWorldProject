package by.sterlikov.classwork.lesson6;

public class Car {
    // признаки
    // кол-во колёс, двигатель, кузов.
    // есть ли магнитола, коробка передач

    // действия - завестись, подать звуковой сигнал
    // повернуть (влево/вправо), ускориться, замедлится

    private String color;
    private int age = 2023;
    private String superBrand;
    int wheelNumber;
    boolean radio;
    private int currentSpeed  = 0;

    public Car(String color, int age, String superBrand, int wheelNumber, boolean radio) {
        this.color = color;
        this.age = age;
        this.superBrand = superBrand;
        this.wheelNumber = wheelNumber;
        this.radio = radio;
    }

    public Car() {                  // create  constructor command N
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) { // не обьявляй если не хочешь менять цвет
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSuperBrand() {
        return superBrand;
    }

    public void setSuperBrand(String superBrand) {
        this.superBrand = superBrand;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public void starterDriving(){
        System.out.println("woof-woof");
    }

    public void goDirectly(){
        System.out.println("my car is going");
    }

    public void goDirectly(int currentSpeed){
        System.out.println("my car is going" + currentSpeed + "currentSpeed"); // перезагрузка, используем тот же метод плюс параметр
    }

    public void switchDirection(boolean  isRightOne){
        if (currentSpeed > 30){
            System.out.println("don't turn !!! ");
            return;
        }
        if(isRightOne){
            System.out.println("going right");
        } else {
            System.out.println("going left");
        }
    }

    public void intSpeedChange(int speedChange){
        currentSpeed =  currentSpeed + speedChange;
        if(speedChange >  0){
            System.out.println("moving faster " + currentSpeed);
        } else {
            System.out.println("moving slower" + currentSpeed);
        } if(currentSpeed <= 0){
            System.out.println("your car stop");
        }
    }

    @Override
    public String toString() {   // generate toString
        return "Car{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", brand='" + superBrand + '\'' +
                ", wheelNumber=" + wheelNumber +
                ", radio=" + radio +
                '}';
    }
}
