package main.java.Entity;

public class Employee extends User {
    public Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculatePay() {
        return salary * 420;
    }

    @Override
    public double setSalary(double salary) {
        return salary * 420;
    }

}
