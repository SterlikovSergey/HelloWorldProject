package by.sterlikov.homework.lesson6.AdditionalTask1;

public class HDD {
    private String name;
    private int volume;
    boolean type = false;

    public HDD() {
    }

    public HDD(String name, int volume, boolean type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type=" + type +
                '}';
    }
}
