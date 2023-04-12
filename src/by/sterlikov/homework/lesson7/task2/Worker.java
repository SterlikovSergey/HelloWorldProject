package by.sterlikov.homework.lesson7.task2;

public class Worker implements Printed{
    private String nameClass;

    public Worker() {
    }

    public Worker(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public void printedNameClass() {
        System.out.println(nameClass);
    }
}
