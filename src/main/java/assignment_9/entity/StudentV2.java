package main.java.assignment_9.entity;

public class StudentV2<T> {
    private T id;
    private String name;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentV2(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printStudentV2() {
        System.out.println("Id:" + this.id + " Name:" + this.name);
    }

    @Override
    public String toString() {
        return "StudentV2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
