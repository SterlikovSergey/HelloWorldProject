package by.sterlikov.homework.lesson9;

public class IllegalCandidate {
    private int id;
    private String name;
    static int count;

    static {
        count = 0;
    }
    public IllegalCandidate() {
        count++;
    }
}
