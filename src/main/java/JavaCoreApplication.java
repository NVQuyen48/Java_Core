package main.java;

import main.java.Entity.*;

import java.time.LocalDate;

public class JavaCoreApplication {
    public static void main(String[] args) {
//        Đối tượng thông tin phòng ban
        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "Marketing");
        Department d3 = new Department(3, "HR");

//        System.out.println("Phòng ban 1:" + d1.getName());
//        System.out.println("Phòng ban 1:"+ d1.toString());


        Position p1 = new Position(1, "Dev");
        Position p2 = new Position(2, "Test");
        Position p3 = new Position(3, "PM");
//        System.out.println("Position:" + p1.getPositionName());

        Account a1 = new Account(1, "John", "IamQuyen", "NguyenQuyen", d1, p1, LocalDate.now());
        Account a2 = new Account(2, "a2@gmail.com", "user2", "Nguyen Van B", d2, p2, LocalDate.now());
        Account a3 = new Account(3, "a3@gmail.com", "user3", "Nguyen Van C", d3, p3, LocalDate.now());
//        System.out.println(a1);

        Group g1 = new Group(1, "Java Group", 1, LocalDate.now());
        Group g2 = new Group(2, "SQL Group", 2, LocalDate.now());
        Group g3 = new Group(3, "PM Group", 3, LocalDate.now());

        GroupAccount ga1 = new GroupAccount(g1.getGroupId(), a1.getAccountID(), LocalDate.now());
        GroupAccount ga2 = new GroupAccount(g2.getGroupId(), a2.getAccountID(), LocalDate.now());
        GroupAccount ga3 = new GroupAccount(g3.getGroupId(), a3.getAccountID(), LocalDate.now());

//        System.out.println("ga1" + ga1);

        TypeQuestion tq1 = new TypeQuestion(1, "Essay");
        TypeQuestion tq2 = new TypeQuestion(2, "Multiple-Choice");
        TypeQuestion tq3 = new TypeQuestion(3, "True/False");

        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
        CategoryQuestion cq2 = new CategoryQuestion(2, ".NET");
        CategoryQuestion cq3 = new CategoryQuestion(3, "SQL");

        Question q1 = new Question(1, "What is Java?", cq1.getCategoryId(), tq1.getTypeId(), 1, LocalDate.now());
        Question q2 = new Question(2, "Explain polymorphism?", cq1.getCategoryId(), tq2.getTypeId(), 2, LocalDate.now());
        Question q3 = new Question(3, "What is SQL?", cq3.getCategoryId(), tq1.getTypeId(), 3, LocalDate.now());

        Answer ans1 = new Answer(1, "Java is a programming language", q1.getQuestionId(), true);
        Answer ans2 = new Answer(2, "Polymorphism is OOP concept", q2.getQuestionId(), true);
        Answer ans3 = new Answer(3, "SQL is Structured Query Language", q3.getQuestionId(), true);

        Exam e1 = new Exam(1, "EX001", "Java Exam", cq1.getCategoryId(), 60, 1, LocalDate.now());
        Exam e2 = new Exam(2, "EX002", "SQL Exam", cq3.getCategoryId(), 90, 2, LocalDate.now());
        Exam e3 = new Exam(3, "EX003", ".NET Exam", cq2.getCategoryId(), 45, 3, LocalDate.now());

        ExamQuestion eq1 = new ExamQuestion(e1.getExamId(), q1.getQuestionId());
        ExamQuestion eq2 = new ExamQuestion(e2.getExamId(), q3.getQuestionId());
        ExamQuestion eq3 = new ExamQuestion(e3.getExamId(), q2.getQuestionId());

        System.out.println("Department: " + d1.getName());
        System.out.println("Position: " + p1.getPositionName());
        System.out.println("Account: " + a1.toString());
    }
}