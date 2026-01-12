package main.java.util;

public class MyMath {
    public static final double PI = 3.14;

    public static double sum2(int a) {
        return a + PI;
    }

    public static int min(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new ArithmeticException("Phải truyền ít nhất 1 số");
        }
        int min = numbers[0];
        for (int m : numbers) {
            if (m < min) {
                min = m;
            }
        }
        return min;
    }

    public static int max(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new ArithmeticException("Phải truyền ít nhất 1 số");
        }
        int max = numbers[0];
        for (int m : numbers) {
            if (m > max) {
                max = m;
            }
        }
        return max;
    }

    public static int sum(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new ArithmeticException("Phải truyền ít nhất 1 số");
        }
        int sum = 0;
        for (int m : numbers) {
            sum += m;
        }
        return sum;
    }
}
