package main.java.assignment_9;

import main.java.Entity.PrimaryStudent;
import main.java.assignment_9.entity.Student;

import java.util.*;

public class Collection {
    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        Student student1 = new Student("a");
        Student student2 = new Student("b");
        Student student3 = new Student("c");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students) {
            student.printStudent();
        }

        System.out.println("Lấy phần tử thứ 4");
        students.get(2).printStudent();

        System.out.println("Lấy phần tử đầu và cuối");
        students.get(0).printStudent();
        students.get(students.size() - 1).printStudent();

        System.out.println("Thêm phần tử vào đầu");
        students.add(0, new Student("d"));
        System.out.println("xóa student id = 5:");
//        students.remove(5);

        System.out.println("đảo ngược ví trí student");
        Collections.reverse(students);

        find_Student(1);
        find_Student_Name("a");

        System.out.println("Tạo 1 ArrayList tên là studentCopies và add tất cả students vào\n" + "studentCopies");
        ArrayList<Student> studentCopies = new ArrayList<>(students);
        for (Student student : studentCopies) {
            student.printStudent();
        }

        printEarlyToLateByStack();
        printLateToEarlyByQueue();

        setStudents();

        Set<Student> studentSet = new HashSet<>(students);
        printSortedUniqueStudentNames(studentSet);
    }

    public static void find_Student(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Kết quả tìm kiếm:");
                student.printStudent();
                return;
            }
        }
        System.out.println("Cannot find student with id " + id);
    }

    public static void find_Student_Name(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.printStudent();
                return;
            }
        }
        System.out.println("Cannot find student with name " + name);
    }

    public static void deleteStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(null);
                return;
            }
        }
        System.out.println("Cannot delete student with id " + id);
    }

    //    Question 2: Stack &amp; Queue
//    Khai báo 1 danh sách lưu các tên học sinh tới tham dự phỏng vấn, thứ tự tới của
//    các học sinh như sau:
    public static void printEarlyToLateByStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Nguyễn Văn Nam");
        stack.push("Nguyễn Văn Huyên");
        stack.push("Trần Văn Nam");
        stack.push("Nguyễn Văn A");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void printLateToEarlyByQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Nguyễn Văn Nam");
        queue.add("Nguyễn Văn Huyên");
        queue.add("Trần Văn Nam");
        queue.add("Nguyễn Văn A");

        Stack<String> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void setStudents() {
        Set<Student> students = new HashSet<>();
        students.add(new Student("a"));
        students.add(new Student("b"));
        students.add(new Student("c"));

        for (Student student : students) {
            student.printStudent();
        }
    }


    public static void printSortedUniqueStudentNames(Set<Student> students) {
        Set<String> sortedStudents = new TreeSet<>();
        for (Student student : students) {
            sortedStudents.add(student.getName());
        }

        for (String name : sortedStudents) {
            System.out.println(name);
        }
    }
}
