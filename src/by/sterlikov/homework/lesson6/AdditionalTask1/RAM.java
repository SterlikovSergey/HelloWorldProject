package by.sterlikov.homework.lesson6.AdditionalTask1;

public class RAM {
    private String name =  "";
    private int volume = 0;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
