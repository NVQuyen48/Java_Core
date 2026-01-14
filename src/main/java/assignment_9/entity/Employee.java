package main.java.assignment_9.entity;

public class Employee<E> {
    private int id;
    private String name;
    private E[] salaries;

    public Employee(int id, String name, E[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public void printInfo() {
        System.out.println("Id:" + this.id + " Name:" + this.name);
        System.out.println("Salary:");
        for (E salary : salaries) {
            System.out.println(salary);
        }
    }

    public void printLastSalary() {
        if (salaries == null || salaries.length == 0) {
            System.out.println("No Salary");
            return;
        }
        System.out.println("Salary:" + salaries[salaries.length - 1]);
    }
}
