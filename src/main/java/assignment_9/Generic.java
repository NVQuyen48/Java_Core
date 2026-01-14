package main.java.assignment_9;

import main.java.assignment_9.entity.*;

public class Generic {
    public static void main(String[] args) {
        //    Question 1: T generic (class)
        StudentV2<Float> student1 = new StudentV2<Float>(0.1f, "A");
        StudentV2<Integer> student2 = new StudentV2<Integer>(2, "B");
        StudentV2<Double> student3 = new StudentV2<Double>(3.14, "C");
        System.out.println(student1);

        print(3);
        print("student2");
        print(student2.toString());


        printArray(new Integer[]{2, 2, 3, 4});
        printArray(new Double[]{3.14, 3.14, 3.14, 3.14});

//        Question 5: E generic
        Employee<Integer> empInt = new Employee<>(1, "A", new Integer[]{5200, 5000, 6100});
        Employee<Double> empDou = new Employee<>(2, "B", new Double[]{3.14, 3.14, 3.14});
        empInt.printInfo();
        empInt.printLastSalary();

//        Question 6: K &amp; V generic
        MyMap<Integer, String> studentMap = new MyMap<>(1, "A");
        System.out.println("Student Id: " + studentMap.getKey());
        System.out.println("Student Name: " + studentMap.getValue());

//       Question 7: K &amp; V generic
        Phone<String> phoneEmail = new Phone<>("email.com", "123456");
        System.out.println("email: " + phoneEmail.getKey());
        System.out.println("PhoneNumber: " + phoneEmail.getPhoneNumber());

//        Question 8: K &amp; V generic
        Staff<Double> staffDou = new Staff<>(1.2, "A");
        System.out.println("Staff id: " + staffDou.getKey());
        System.out.println("Staff name: " + staffDou.getValue());

    }


    //    Question 2: T generic (method)
    public static <T> void print(T t) {
        System.out.println(t);
    }

    //    Question 4: E generic
    public static <E> void printArray(E[] array) {
        for (E e : array) {
            System.out.println(e);
        }
    }
}
