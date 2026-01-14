package main.java.assignment_9.entity;

public class Salary<N extends Number> {
    private N salary;

    public Salary(N salary) {
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("salary: " + salary);
    }
}
