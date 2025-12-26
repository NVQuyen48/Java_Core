package main.java.Entity;

import java.util.Scanner;

public abstract class User {
    String name;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculatePay();

    ;

    public abstract double setSalary(double salary);

    public User(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public void displayInfo() {
        System.out.println(
                "Tên: " + name +
                        ", Hệ số lương: " + salary +
                        ", Thu nhập: " + calculatePay()
        );
    }
}
