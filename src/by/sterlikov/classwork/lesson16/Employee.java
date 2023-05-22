package by.sterlikov.classwork.lesson16;

public class Employee {
    private String category;
    private int salary;

    public Employee(String category, int salary) {
        this.category = category;
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "category='" + category + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
