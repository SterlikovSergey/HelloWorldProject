package by.sterlikov.homework.lesson15;

public class Students {
    private String name;

    public Students(String name) {
        this.name = name;
    }

    public Students() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }
}

