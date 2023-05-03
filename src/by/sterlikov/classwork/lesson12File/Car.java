package by.sterlikov.classwork.lesson12File;

import java.io.Serializable;

public class Car implements Serializable {
    private int price;
    private String name;
    private transient int unneededValue;

    public int getUnneededValue() {
        return unneededValue;
    }

    public void setUnneededValue(int unneededValue) {
        this.unneededValue = unneededValue;
    }

    private static final long serialVersionUID = 42L;

    public Car(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", unneededValue=" + unneededValue +
                '}';
    }
}
