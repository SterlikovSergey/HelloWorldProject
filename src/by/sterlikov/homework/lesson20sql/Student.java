package by.sterlikov.homework.lesson20sql;

public class Student {
    private int id;
    private String name;
    private int age;
    private int city_id;

    public Student() {
    }

    public Student(int id, String name, int age, int city_id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city_id = city_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city_id='" + city_id + '\'' +
                '}';
    }
}
