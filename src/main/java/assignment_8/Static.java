package main.java.assignment_8;

import main.java.Entity.PrimaryStudent;
import main.java.Entity.SecondaryStudent;
import main.java.Entity.Student;
import main.java.util.MyMath;

public class Static {
    //        Question 1: static variable
//        Khai báo 1 class student có các thuộc tính id, name, college
//                Với college là static variable.


    public static void main(String[] args) {
        Student.college = "Đại học bách khoa";

        Student student1 = new Student(1, "Nguyễn văn a");
        Student student2 = new Student(2, "Nguyễn văn b");
        Student student3 = new Student(3, "Nguyễn văn c");

        Student[] students = {student1, student2, student3};
        for (Student student : students) {
            student.print();
        }

        Student.college = "Đại học công nghệ";
        for (Student student : students) {
            student.print();
        }
        //    Question 2: Tiếp tục question 1
//    Bổ sung thuộc tính moneyGroup cho Student (moneyGroup là tiền quỹ lớp - dùng chung
//            cho tất cả các student).
        for (Student student : students) {
            student.nopQuy(100);
            Student.printQuy();
        }

        student1.layQuy(50);
        Student.printQuy();

        student2.layQuy(20);
        Student.printQuy();

        student3.layQuy(150);
        Student.printQuy();

        for (Student student : students) {
            student.nopQuy(50);
        }
        Student.printQuy();

//        Question 4: tiếp tục Question 1
//        Trong class Student
//a) Viết method cho phép thay đổi college
//        b) Viết method cho phép lấy giá trị của college
        Student.changeCollege("Hi");
        for (Student student : students) {
            student.print();
        }
        System.out.println("College hiện tại: " + Student.getCollege());


//        Question 3: static method
//        a) Viết class MyMath để thay thế cho class Math của java.
//        b) Viết thêm method min(), sum vào class MyMath
        System.out.println("Min: " + MyMath.min(1, 2));
        System.out.println("Max: " + MyMath.max(1, 2, 3, 4, 5));
        System.out.println("Sum: " + MyMath.sum(1, 2, 3, 4, 5));


        countStudent();
    }

    //    Question 6: tiếp tục Question 5
//    Tạo class PrimaryStudent, SecondaryStudent, hãy viết chương trình đếm số lượng
//            PrimaryStudent được sinh ra, SecondaryStudent được sinh ra.
//
//    Question 7: tiếp tục Question 6
//    Chỉ cho phép user tạo được tối đa 7 học sinh
    public static void countStudent() {
        Student.resetStudentCount();
        PrimaryStudent.resetPrimaryStudentCount();
        SecondaryStudent.resetSecondaryStudentCount();

        Student student = new PrimaryStudent(1, "a");
        Student student_1 = new PrimaryStudent(2, "a");
        Student s3 = new SecondaryStudent(4, "C");
        Student s4 = new SecondaryStudent(5, "D");
        Student s5 = new SecondaryStudent(6, "E");
        new SecondaryStudent(7, "F");
        new SecondaryStudent(8, "G");
        System.out.println("Tổng số Student: " + Student.getStudentCount());
        System.out.println("Số PrimaryStudent: " + PrimaryStudent.getPrimaryStudent());
        System.out.println("Số SecondaryStudent: " + SecondaryStudent.getSecondaryStudent());
    }


}
