package by.sterlikov.homework.lesson7.task2;

public class lesson7Task2Main {
    public static void main(String[] args) {


        Printed[] company = {new Accountant("Accountant"),
                            new Director("Director"),
                            new Worker("Worker")};

        for(Printed comp : company) {
            comp.printedNameClass();
        }

    }
}
