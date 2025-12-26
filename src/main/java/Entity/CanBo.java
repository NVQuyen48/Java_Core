package main.java.Entity;

public class CanBo {
    String name;
    int age;
    Gender gender;
    String address;

    public CanBo(String name, int age, Gender gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public CanBo() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
