package main.java.Entity;

public abstract class Person implements IRollUp {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
