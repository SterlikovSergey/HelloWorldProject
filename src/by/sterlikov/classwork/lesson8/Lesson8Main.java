package by.sterlikov.classwork.lesson8;

public class Lesson8Main {
    public static void main(String[] args) {
        Parent badParent = new Children();
        final int myInt;

        badParent.setName("Tom");
        System.out.println(badParent.getName());
    }
}
