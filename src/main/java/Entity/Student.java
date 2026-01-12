package main.java.Entity;

public class Student {
    public final int studentID;
    private static int studentCount = 0;
    private String name;
    private String homeTown;
    private float diem;
    public static String college;


    public static double moneyGroup;

    public Student(int studentID, String name) {
        if (studentCount >= 7) {
            throw new IllegalArgumentException("Student max 7 ");
        }
        this.studentID = studentID;
        this.name = name;
        studentCount++;
    }

    public static void resetStudentCount() {
        studentCount = 0;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void nopQuy(int soTien) {
        moneyGroup += soTien;
    }

    public void layQuy(int soTien) {
        moneyGroup -= soTien;
    }

    public static void changeCollege(String college) {
        Student.college = college;
    }

    public static String getCollege() {
        return college;
    }

    public static void printQuy() {
        System.out.println("Quỹ hiện tại: " + moneyGroup);
    }


    public final void study() {
        System.out.println("đang học bài...");
    }


    public Student(int studentID, String name, String homeTown) {
        this(studentID, name);
        this.homeTown = homeTown;
        this.diem = 0;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void diemCong(float diemCong) {
        this.diem += diemCong;
    }

    public void print() {
        System.out.println(
                "ID: " + studentID +
                        ", Name: " + name +
                        ", College: " + college
        );
    }

    public void printInfo() {
        String hocLuc;

        if (diem < 4) {
            hocLuc = "Yếu";
        } else if (diem >= 4 && diem < 6) {
            hocLuc = "Trung bình";
        } else if (diem >= 6 && diem < 8) {
            hocLuc = "Khá";
        } else {
            hocLuc = "Giỏi";
        }

        System.out.println("Tên: " + name);
        System.out.println("Điểm: " + diem);
        System.out.println("Học lực: " + hocLuc);
    }
}
