package main.java.assignment_4;

import main.java.Entity.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Question 1:
//        Tạo constructor cho department:
//        a) Không có parameters
//        b) Có 1 parameter là nameDepartment và default id của Department = 0
//        Khởi tạo 1 Object với mỗi constructor ở trên
        Department department1 = new Department();

        Department department = new Department("Department 1");
        System.out.println(department);

//        Question 2:Tạo constructor cho Account:
//        a) Không có parameters
//        b) Có các parameter là id, Email, Username, FirstName, LastName (với FullName =
//                FirstName + LastName)
//        c) Có các parameter là id, Email, Username, FirstName, LastName (với FullName =
//                FirstName + LastName) và Position của User, default createDate = now
//        d) Có các parameter là id, Email, Username, FirstName, LastName (với FullName =
//                FirstName + LastName) và Position của User, createDate.
//        Khởi tạo 1 Object với mỗi constructor ở trên.
        Account account1 = new Account();
        Account account2 = new Account(
                1, "a@gmail.com", "user1", "Nguyen", "Quyen"
        );

        Position position1 = new Position("dev");
        Account account3 = new Account(2, "a@gmail.com", "user1", "Nguyen", "Quyen", position1, LocalDate.now());


//        Question 3:Tạo constructor cho Group:
//        a) Không có parameters
//        b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
//        c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
//        Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin
//                còn lại = null).
//                Khởi tạo 1 Object với mỗi constructor ở trên.
        Group group = new Group();
        Account[] accounts = {account1, account2};
        Group group1 = new Group("Group1", 1, accounts, LocalDate.now());
        String[] userNames = {"user1", "user2"};
        Group group2 = new Group("Group2", 2, userNames, LocalDate.now());


//        Exercise 4 : Encapsulation
//        Question 1Tạo Object Student có các property id, name, hometown, điểm học lực
//        Student student = new Student("Quyền", "Hà Nội");
//        student.printInfo();
//        student.setDiem(5.0f);
//        student.diemCong(2.0f);
//        student.printInfo();
        QLCB();
//        QLUser();
//        QLTV();
    }
//    Question 2: Tiếp tục Question 1
//    Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng
//    sau:
//    a) Thêm mới cán bộ.
//    b) Tìm kiếm theo họ tên.
//            c) Hiện thị thông tin về danh sách các cán bộ.
//    d) Nhập vào tên của cán bộ và delete cán bộ đó
//    e) Thoát khỏi chương trình.

    public static void QLCB() {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        int choice;
        do {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    qlcb.themCanBo();
                    break;
                case 2:
                    System.out.println("Nhập tên cán bộ cần tìm");
                    String ten = sc.nextLine();
                    qlcb.timKiem(ten);
                    break;
                case 3:
                    qlcb.hienThiDanhSach();
                    break;
                case 4:
                    System.out.println("Nhập tên cán bộ cần delete");
                    String ten2 = sc.nextLine();
                    qlcb.xoaCanBo(ten2);
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
            }

        } while (choice != 5);
    }


    //    Question 2 :
//    Hãy xây dựng 1 class User với các thuộc tính name kiểu String và salary ratio kiểu double.
//    a) Viết các hàm cho phép nhập và trả về name, salary ratio.
//            b) Viết hàm calculatePay() dạng abstract trả về thu nhập của nhân viên, kiểu double.
//    c) Viết hàm displayInfor()
//
//    Question 3 : Tiếp tục Question 2
//    Viết class Employee, Manager, Waiter kế thừa User như sau:
//    Implement method calculatePay() như sau:
//    Đối với Employee sẽ được tính = salary ratio * 420
//    Đối với Manager sẽ được tính = salary ratio * 520
//    Đối với Waiter sẽ được tính = salary ratio * 220
    public static void QLUser() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Chọn loại nhân viên:");
            System.out.println("1. Employee");
            System.out.println("2. Manager");
            System.out.println("3. Waiter");

            choice = sc.nextInt();
            sc.nextLine();

            System.out.println("Nhập tên:");
            String name = sc.nextLine();

            System.out.println("Nhập hệ số lương:");
            double salary = sc.nextDouble();

            User user = null;
            switch (choice) {
                case 1:
                    user = new Employee(name, salary);
                    break;
                case 2:
                    user = new Manager(name, salary);
                    break;
                case 3:
                    user = new Waiter(name, salary);
                    break;
                default:
                    System.out.println("Lựa chọn k hợp lệ");
            }
            user.displayInfo();
        } while (choice != 4);

    }

//    Question 4 :
//    Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. Mỗi tài liệu gồm có
//    các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất), Tên nhà xuất bản, số bản phát
//    hành.
//    Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
//    Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
//    Các báo cần quản lý thêm: Ngày phát hành.
//    Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một cách hiệu quả. Xây
//    dựng lớp QuanLySach có các chức năng sau:
//    a) Thêm mới tài liêu: Sách, tạp chí, báo.
//    b) Xoá tài liệu theo mã tài liệu.
//            c) Hiện thị thông tin về tài liệu.
//            d) Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
//    e) Thoát khỏi chương trình.

    public static void QLTV() {
        Scanner sc = new Scanner(System.in);
        QLTV qltv = new QLTV();
        int choice;

        do {
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Xóa theo mã");
            System.out.println("3. Hiển thị");
            System.out.println("4. Tìm theo loại");
            System.out.println("0. Thoát");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    qltv.themTaiLieu();
                    break;
                case 2:
                    System.out.println("Nhập mã:");
                    String maDelete = sc.nextLine();
                    qltv.xoaTaiLieu(maDelete);
                    break;
                case 3:
                    qltv.hienThi();
                    break;
                case 4:
                    System.out.println("Nhập mã tìm");
                    String maTim = sc.nextLine();
                    qltv.timTheoLoai(maTim);
                    break;

            }
        } while (choice != 4);

    }
}
