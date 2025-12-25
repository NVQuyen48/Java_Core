package main.java;


import main.java.Entity.*;


import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class JavaCoreApplication {
    public static void main(String[] args) {
//        Đối tượng thông tin phòng ban
        Department department1 = new Department("Sales");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("HR");

//        System.out.println("Phòng ban 1:" + d1.getName());
//        System.out.println("Phòng ban 1:"+ d1.toString());


        Position position1 = new Position(1, "Dev");
        Position position2 = new Position(2, "Test");
        Position position3 = new Position(3, "PM");
//        System.out.println("Position:" + p1.getPositionName());

        Account account1 = new Account(1, "John", "IamQuyen", "NguyenQuyen", department1, position1, LocalDate.now());
        Account account2 = new Account(2, "a2@gmail.com", "user2", "Nguyen Van B", department2, position2, LocalDate.now());
        Account account3 = new Account(3, "a3@gmail.com", "user3", "Nguyen Van C", department3, position3, LocalDate.now());

        Account account4 = new Account(4, "a4@gmail.com", "user4", "Nguyen Van D", department3, position3, LocalDate.now());
//        System.out.println(a1);

        Group group1 = new Group(1, "Java Group", account1.getAccountID(), LocalDate.now());
        Group group2 = new Group(2, "SQL Group", account2.getAccountID(), LocalDate.now());
        Group group3 = new Group(3, "PM Group", account3.getAccountID(), LocalDate.now());

        GroupAccount groupAccount1 = new GroupAccount(group1.getGroupId(), account1.getAccountID(), LocalDate.now());
        GroupAccount groupAccount2 = new GroupAccount(group2.getGroupId(), account2.getAccountID(), LocalDate.now());
        GroupAccount groupAccount3 = new GroupAccount(group3.getGroupId(), account1.getAccountID(), LocalDate.now());

//        System.out.println("ga1" + ga1);

        TypeQuestion typeQuestion1 = new TypeQuestion(1, "Essay");
        TypeQuestion typeQuestion2 = new TypeQuestion(2, "Multiple-Choice");
        TypeQuestion typeQuestion3 = new TypeQuestion(3, "True/False");

        CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, "Java");
        CategoryQuestion categoryQuestion2 = new CategoryQuestion(2, ".NET");
        CategoryQuestion categoryQuestion3 = new CategoryQuestion(3, "SQL");

        Question question1 = new Question(1, "What is Java?", categoryQuestion1.getCategoryId(), typeQuestion1.getTypeId(), 1, LocalDate.now());
        Question question2 = new Question(2, "Explain polymorphism?", categoryQuestion2.getCategoryId(), typeQuestion3.getTypeId(), 2, LocalDate.now());
        Question question3 = new Question(3, "What is SQL?", categoryQuestion3.getCategoryId(), typeQuestion1.getTypeId(), 3, LocalDate.now());

        Answer answer1 = new Answer(1, "Java is a programming language", question1.getQuestionId(), true);
        Answer answer2 = new Answer(2, "Polymorphism is OOP concept", question2.getQuestionId(), true);
        Answer answer3 = new Answer(3, "SQL is Structured Query Language", question3.getQuestionId(), true);

        Exam exam1 = new Exam(1, "EX001", "Java Exam", categoryQuestion1.getCategoryId(), 60, 1, LocalDate.now());
        Exam exam2 = new Exam(2, "EX002", "SQL Exam", categoryQuestion2.getCategoryId(), 90, 2, LocalDate.now());
        Exam exam3 = new Exam(3, "EX003", ".NET Exam", categoryQuestion3.getCategoryId(), 45, 3, LocalDate.now());

        ExamQuestion examQuestion1 = new ExamQuestion(exam1.getExamId(), question1.getQuestionId());
        ExamQuestion examQuestion2 = new ExamQuestion(exam2.getExamId(), question2.getQuestionId());
        ExamQuestion examQuestion3 = new ExamQuestion(exam3.getExamId(), question3.getQuestionId());

        Assignment assignment = new Assignment();
//        assignment.question1();
//        assignment.question2_and_question3();
//        assignment.question4();
//        assignment.question5();
//        assignment.question6();
//        assignment.question7();
//        assignment.question8();
//        assignment.question9();
//        assignment.question11("new", "wen");
//        assignment.question12("hello iamquyen");
//        System.out.println(assignment.question13("hag"));
        List<Group> groups = List.of(group1, group2, group3);

        System.out.println(Assignment.question14("VTI Academy", 'e', '*'));
//        assignment.question10(groups);
//        for_i();
//        for_each();
//        while_01();
//        question1(account2);
//        question3(account2);
//        question4(account1);
//        List<GroupAccount> groupAccounts = List.of(groupAccount1, groupAccount2, groupAccount3);
//        question5(group1, groupAccounts);
//       question7(account1);
        List<Account> accounts = List.of(account1, account2, account3);
//        question8(accounts);
        List<Department> departments = List.of(department1, department2, department3);
//        question9(departments);
//        question10(accounts);
//        question11(departments);
//        question12(departments);
//        question13(accounts);
//        question14(accounts);
//        question15();
//        question16(accounts);
//        question16a(accounts);
//        question16b(accounts);
//        question18();
//        question19(accounts);
//        question20();
//        question21();
//        System.out.println(accounts);
//        System.out.println(account1);
//        System.out.println(account1.equals(account2));
    }


    public static void for_i() {
        System.out.println("for i");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void for_each() {
        int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("for each");
        for (int point : points) {
            System.out.println(point);
        }
    }

    public static void while_01() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuỗi ngày tháng năm");
        String dateStr = scanner.next();

        String partern = "dd/MM/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(partern);
        Date date = format.parse(dateStr);
        System.out.println(date);
    }

    //    Question 1:
//    Kiểm tra account thứ 2
//    Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
//    Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
    public static void question1(Account account) {
        if (account.getDepartmentId() == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban này có nhân viên là:" + account.getUserName());
        }
    }

    //    Question 2:
//    Kiểm tra account thứ 2
//    Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//    Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
//    Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
//    Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
    public static void question2(List<Account> accounts, List<GroupAccount> groupAccounts) {

    }

    //    Question 3:Sử dụng toán tử ternary để làm Question 1
    public static void question3(Account account) {
        System.out.println(account.getDepartmentId() == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là:" + account.getUserName());
    }

    //    Question 4:
//    Sử dụng toán tử ternary để làm yêu cầu sau:
//    Kiểm tra Position của account thứ 1
//    Nếu Position = Dev thì in ra text "Đây là Developer"
//    Nếu không phải thì in ra text "Người này không phải là Developer"
    public static void question4(Account account) {
        System.out.println(account.getPositionID().getPositionName().equals("Dev") ? "Đây là developer" : "Người này không phải developer");
    }

    public static void question5(Group group, List<GroupAccount> groupAccounts) {
        int acc = 0;
        for (GroupAccount groupAccount : groupAccounts) {
            if (groupAccount.getGroupID() == group.getGroupId()) {
                acc++;
            }
        }

        switch (acc) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }

    }

    //    Question 6:Sử dụng switch case để làm lại Question 2
    public static void question6(CategoryQuestion categoryQuestion) {
    }


    //    Question 7:Sử dụng switch case để làm lại Question 4
    public static void question7(Account account) {
        String position = account.getPositionID().getPositionName();
        switch (position) {
            case "Dev":
                System.out.println("Đây là developer");
                break;
            default:
                System.out.println("Người này không phải developer");
        }
    }

    //    Question 8:In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
    public static void question8(List<Account> accounts) {
        for (Account acc : accounts) {
            System.out.println("Email: " + acc.getEmail() + ", FullName: " + acc.getFullName() + ", Department: " + acc.getDepartmentId().getDepartmentName());
        }
    }

    //    Question 9:In ra thông tin các phòng ban bao gồm: id và name
    public static void question9(List<Department> departments) {
        for (Department department : departments) {
            System.out.println("DepartmentID:" + department.getDepartmentId() + " DepartmentName:" + department.getDepartmentName());
        }
    }

    //Question10
    public static void question10(List<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            System.out.println("Thông tin account thứ:" + (i + 1));
            System.out.println("Email: " + account.getEmail());
            System.out.println("FullName: " + account.getFullName());
            System.out.println("Department: " + account.getDepartmentId().getDepartmentName());
        }
    }

    //    Question11
    public static void question11(List<Department> departments) {
        for (int i = 0; i < departments.size(); i++) {
            Department department = departments.get(i);
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("DepartmentID:" + department.getDepartmentId());
            System.out.println("DepartmentName:" + department.getDepartmentName());
        }
    }
    //    Question12

    public static void question12(List<Department> departments) {
        for (int i = 0; i < Math.min(2, departments.size()); i++) {
            Department department = departments.get(i);
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("DepartmentID:" + department.getDepartmentId());
            System.out.println("DepartmentName:" + department.getDepartmentName());
        }
    }

    //    Question13
    public static void question13(List<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            if (i == 1) {
                continue;
            }
            Account account = accounts.get(i);
            System.out.println("Thông tin account thứ:" + (i + 1));
            System.out.println("Email: " + account.getEmail());
            System.out.println("FullName: " + account.getFullName());
            System.out.println("Department: " + account.getDepartmentId().getDepartmentName());
        }
    }

    //    question14
    public static void question14(List<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getAccountID() < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + account.getEmail());
                System.out.println("Full name: " + account.getFullName());
                System.out.println("Phòng ban ID: " + account.getDepartmentId());
            }
        }
    }

    //    Question 15:In ra các số chẵn nhỏ hơn hoặc bằng 20
    public static void question15() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

//    Question 16:Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break, continue

    public static void question16(List<Account> accounts) {
        int i = 0;
        while (i < accounts.size()) {
            if (accounts.get(i).getAccountID() < 4) {
                Account account = accounts.get(i);
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + account.getEmail());
                System.out.println("Full name: " + account.getFullName());
                System.out.println("Phòng ban ID: " + account.getDepartmentId());
            }
            i++;
        }
        ;
    }

    public static void question16a(List<Account> accounts) {
        int i = 0;
        while (i < Math.min(2, accounts.size())) {
            Account account = accounts.get(i);
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + account.getEmail());
            System.out.println("Full name: " + account.getFullName());
            System.out.println("Phòng ban ID: " + account.getDepartmentId());
            i++;
        }
    }

    public static void question16b(List<Account> accounts) {
        int i = 0;
        while (i < accounts.size()) {
            if (i == 1) {
                i++;
                continue;
            }
            Account account = accounts.get(i);
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + account.getEmail());
            System.out.println("Full name: " + account.getFullName());
            System.out.println("Phòng ban ID: " + account.getDepartmentId());
            i++;
        }
    }

    //    Exercise 2: System out printf
//    Question 1:Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó
//    Question 2:Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//    ra số nguyên đó thành định dạng như sau: 100,000,000
//    Question 3:Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//    thực đó chỉ bao gồm 4 số đằng sau
//    Question 4:Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.


    public static void question18() {
        int i = 5;
        System.out.printf("Số nguyên đó là:%d", i);

        int x = 100000000;
        System.out.printf("%nSố nguyên đó là:%,d", x);

        double y = 5.567098;
        System.out.printf("%nSố nguyên đó là:%5.4f", y);

        String fullName = "Nguyễn Văn A";
        System.out.printf("%nTên tôi là %s và tôi đang độc thân%n", fullName);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        String formattedDate = now.format(formatter);
        System.out.println(formattedDate);

    }

    //    Question 6In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//    table (giống trong Database)
    public static void question19(List<Account> accounts) {
        System.out.printf("%-5s %-25s %-25s %-15s\n", "ID", "Email", "Full Name", "Department");
        System.out.println("-------------------------------------------------------------------------------");
        for (Account acc : accounts) {
            System.out.printf("%-5d %-25s %-25s %-15s\n",
                    acc.getAccountID(),
                    acc.getEmail(),
                    acc.getFullName(),
                    acc.getDepartmentId().getDepartmentName());
        }
    }

    //    Exercise 5: Input from console
//    Question 1:Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình.
//    Question 2:Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình.
//    Question 3:Viết lệnh cho phép người dùng nhập họ và tên.
//    Question 4:Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ.
    public static void question20() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào 3 số nguyên");
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int l = sc.nextInt();
//        System.out.printf("3 số nguyên n=%d m=%d l=%d", n, m, l);
//
//        System.out.println("%nNhập vào 2 số thực:");
//        float x = sc.nextFloat();
//        float y = sc.nextFloat();
//        System.out.printf("2 số thực x=%f y=%f", x, y);

//        System.out.println("%nNhập vào họ và tên:");
//        String fullName = sc.nextLine();
//        System.out.println("Họ và tên:" + fullName);

//        System.out.println("%nNhập vào ngày sinh nhật");
//        LocalDate birthDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(birthDate);

        while (true) {
            System.out.println("Nhập vào chức năng muốn sử dụng:");
            System.out.println("1:Tạo account, 2:tạo department, 3:Thoát");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Tạo account");
                System.out.println("Nhập id account");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập Email: ");
                String email = sc.nextLine();
                System.out.println("Nhập username account");
                String username = sc.nextLine();
                System.out.println("Nhập full name account");
                String fullname = sc.nextLine();
                System.out.println("Nhập phòng ban");
                String departmentName = sc.nextLine();
                Department department = new Department(departmentName);
                Account account = new Account(id, email, username, fullname, department);
                System.out.println(account);
            } else if (n == 2) {
                System.out.println("Tạo department");
            } else if (n == 3) {
                break;
            } else {
                System.out.println("Moi bạn nhập lại");
            }
        }
        sc.close();
    }


    //    Exercise 4: Random Number
//    Question 1:In ngẫu nhiên ra 1 số nguyên
//    Question 2:In ngẫu nhiên ra 1 số thực
//    Question 3:Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
//    Question 4:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12- 1995
//    Question 5:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
//    Question 6:Lấy ngẫu nhiên 1 ngày trong quá khứ.
//    Question 7:Lấy ngẫu nhiên 1 số có 3 chữ số.
    public static void question21() {
        Random random = new Random();
        int x = random.nextInt();
        System.out.println(x);

        double y = random.nextDouble();
        System.out.println(y);
        String[] arr = {"Quyền", "Thành", "Hà"};
        System.out.println(arr[random.nextInt(arr.length)]);

        int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomInt = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomInt);
        System.out.println(randomDate);

        LocalDate now = LocalDate.now();
        int dayAgo = random.nextInt(365);
        LocalDate randomDateOfDay = now.minusDays(dayAgo);
        System.out.println(randomDateOfDay);

        int dateAgo = random.nextInt(10000) + 1;
        LocalDate randomDay = now.minusDays(dateAgo);
        System.out.println(randomDay);

        int number = 100 + random.nextInt(999);
        System.out.println(number);

    }
}