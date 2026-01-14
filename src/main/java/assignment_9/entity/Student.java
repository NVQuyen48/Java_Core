package main.java.assignment_9.entity;

import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public static int autoID = 1;

    public Student(String name) {
        this.id = autoID++;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void printStudent() {
        System.out.println("Id:" + this.id + " Name:" + this.name);
    }
}
