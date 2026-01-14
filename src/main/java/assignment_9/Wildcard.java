package main.java.assignment_9;

import main.java.assignment_9.entity.MyMath;
import main.java.assignment_9.entity.Salary;
import org.w3c.dom.ls.LSOutput;

public class Wildcard {
    public static void main(String[] args) {
        Salary<Integer> salaryInt = new Salary<>(1);
        salaryInt.printSalary();
        System.out.println(max(1, 2));

//        Question 4: T generic (method &amp; class)
        MyMath<Double> myMath = new MyMath<>();
        System.out.println("Sum 3 số" + myMath.sum(2.2, 3.2, 4.1));
        System.out.println("SubTract: " + myMath.subtract(2.2, 3.2));
        System.out.println("SubTract: " + myMath.power(2.2, 3.2));
    }

    //    Question 3: T generic (method)
//    Tạo method tính max của 2 số (số nhập vào có thể là float, double, int, long).
//    Demo chương trình
    public static <T extends Number> T max(T a, T b) {
        return (a.doubleValue() > b.doubleValue()) ? a : b;
    }

}
