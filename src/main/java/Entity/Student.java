package main.java.Entity;

public class Student {
    private int studentID;
    private String name;
    private String homeTown;
    private float diem;

    public Student(String name, String homeTown) {
        this.name = name;
        this.homeTown = homeTown;
        this.diem = 0;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void diemCong(float diemCong) {
        this.diem += diemCong;
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
