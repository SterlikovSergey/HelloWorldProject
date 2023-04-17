package by.sterlikov.homework.lesson8.task2teachmetod;

public class Patient {
    private String name;
    private int age;

    private int medicalPlan;    // это план лечения

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Patient() {
    }

    public int getMedicalPlan() {
        return medicalPlan;
    }

    public String getName() {
        return name;
    }

    public void setMedicalPlan(int medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
