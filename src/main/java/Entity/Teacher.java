package main.java.Entity;

public class Teacher extends Person {
    public String clazz;
    public float salary;

    public Teacher(String name, int age) {
        super(name, age);
    }


    @Override
    public void rollUp() {
        System.out.println("Teacher Rolling");
    }

    public void teach() {
        System.out.println("Teacher Teaching");
    }
}
