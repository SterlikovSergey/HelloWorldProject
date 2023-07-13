package by.sterlikov.homework.lesson6.AdditionalTask1;

public class HDD {
    private String name;
    private int volume;
    private boolean type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

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
