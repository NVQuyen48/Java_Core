package main.java.assignment_9.entity;

public class MyMath<T extends Number> {

    public double sum(T... numbers) {
        double total = 0;
        for (T number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    public double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public double power(T a, T b) {
        return Math.pow(a.doubleValue(), b.doubleValue());
    }
}
