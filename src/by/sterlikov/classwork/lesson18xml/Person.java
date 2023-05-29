package by.sterlikov.classwork.lesson18xml;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
public class Person {
    //@JsonIgnore             //спрячет поле для json
    private int age;
    private String name;
    private List<String> hobbies;
    private boolean isRich;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setRich(boolean rich) {
        isRich = rich;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public boolean isRich() {
        return isRich;
    }

    public Person() {
    }

    public Person(int age, String name, List<String> hobbies, boolean isRich) {
        this.age = age;
        this.name = name;
        this.hobbies = hobbies;
        this.isRich = isRich;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", isRich=" + isRich +
                '}';
    }
}
