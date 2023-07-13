package by.sterlikov.homework.lesson6.AdditionalTask1;

public class Computer {
    private int price;
    private String model;
    private HDD hdd;
    private RAM ram;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Computer() {
    }

    public Computer(int price, String model, HDD hdd, RAM ram) {
        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }
}
