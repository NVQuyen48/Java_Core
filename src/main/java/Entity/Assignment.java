package main.java.Entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Assignment {
//    Exercise 1: Datatype Casting
//    Question 1:Khai báo 2 số lương có kiểu dữ liệu là float.
//    Khởi tạo Lương của Account 1 là 5240.5 $
//    Khởi tạo Lương của Account 2 là 10970.055$
//    Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//    Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra

    public void question1() {
        float account1 = 5240.5F;
        float account2 = 10970.055f;

        int accountSalary1 = (int) (account1);
        int accountSalary2 = (int) (account2);

        System.out.println("Account salary 1: " + accountSalary1);
        System.out.println("Account salary 2: " + accountSalary2);
    }

    //    Question 2:Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
//
//    Question 3:Lấy 2 số cuối của số ở Question 2 và in ra.
//    Gợi ý:
//    Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//    Cách 2: chia lấy dư số đó cho 100
    public void question2_and_question3() {
        Random random = new Random();
        int number = random.nextInt(10000);
        String result = String.format("%05d", number);

        System.out.println(result);
        String result2 = String.valueOf(number);
        String lastTwo = result2.substring(result2.length() - 2);
        System.out.println("Account salary 1: " + lastTwo);
    }

    //    Question 4:Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng.
    public void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so nguyen");
        int n = sc.nextInt();
        int x = sc.nextInt();
        int result = n / x;
        System.out.println(result);
    }

    //    Question 1:
//    Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử
//    theo cú pháp (sử dụng vòng for để khởi tạo):
//             Email: &quot;Email 1&quot;
// Username: &quot;User name 1&quot;
//         FullName: &quot;Full name 1&quot;
// CreateDate: now

    public void question5() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].email = "email" + i;
            accounts[i].userName = "user" + i;
            accounts[i].fullName = "fullName" + i;
            accounts[i].createDate = LocalDate.now();
        }
        for (Account acc : accounts) {
            System.out.println("account1:" + acc.email + " " + acc.userName + " " + acc.fullName + " " + acc.createDate);
        }
    }

    //    Exercise 3: Boxing &amp; Unboxing
//    Question 1Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//    Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau
//            dấu thập phân).
//    Question 2:Khai báo 1 String có value = &quot;1234567&quot;
//    Hãy convert String đó ra số int
//    Question 3:Khởi tạo 1 số Integer có value là chữ &quot;1234567&quot;
//    Sau đó convert số trên thành datatype int
    public void question6() {
        Integer x = 5000;
        float y = x.floatValue();
        System.out.printf("Result: %.2f", y);


        String str = "1234567";
        int val = Integer.parseInt(str);
        System.out.println("%n result" + val);

        Integer b = 1234567;
        int c = b;
        System.out.println("%n result" + c);
    }

    //    Exercise 4: String
//    Question 1:Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau
//            bằng nhiều khoảng trắng );
//    Question 2:Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;

    public void question7() {
        String str = "xâu kí tự";
        int a = str.length();
        System.out.println("Result: " + a);

        String str2 = "xâu 2";
        String result = str + str2;
        System.out.println("Nối sâu: " + result);
    }

    //    Question 3:Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chữ viết hoa chữ cái
//    đầu thì viết hoa lên.
//    Question 4:Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
    public void question8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        String str = sc.nextLine().trim();
        if (str.length() > 0) {
            String result = str.substring(0, 1).toUpperCase() + str.substring(1);
            System.out.println("Tên bạn là: " + result);
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println("Kí tự " + i + ": " + str.charAt(i));
        }
    }

    //    Question 5:Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên
//
//    Question 6:Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ
//    tách ra họ, tên , tên đệm
//    Question 7:Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và
    public void question9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ người dùng:");
        String str = sc.nextLine();
        System.out.println("Nhập tên người dùng:");
        String str2 = sc.nextLine();
        String tenDem = "Văn";
        String fullName = str + " " + tenDem + " " + str2;
        System.out.println(fullName);

        String[] result = fullName.trim().split("\\s+");
        System.out.println("Họ là: " + result[0]);
        System.out.println("Tên là: " + result[result.length - 1]);
        if (result.length > 2) {
            String tenDem2 = "";
            for (int i = 1; i < result.length - 1; i++) {
                tenDem2 += result[i];
            }
            System.out.println("Tên đệm là: " + tenDem2.trim());
        } else {
            System.out.println("Khong có tên đệm");
        }
        String result2 = " ";
        for (String str3 : result) {
            result2 += str3.substring(0, 1).toUpperCase() + str3.substring(1) + " ";
        }
        System.out.println(result2.trim());
    }

    //    Question 8:In ra tất cả các group có chứa chữ &quot;Java&quot;
    public void question10(List<Group> groups) {
        for (Group group : groups) {
            if (group.groupName != null && group.groupName.toLowerCase().contains("java")) {
                System.out.println(group.groupName);
            }
        }
    }

    //    Question 10:Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//    Nếu có xuất ra “OK” ngược lại “KO”.
//    Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
    public void question11(String s1, String s2) {
        String reversed = new StringBuilder(s1).reverse().toString();

        if (reversed.equals(s2)) {
            System.out.println("Ok");
        } else {
            System.out.println("KO");
        }
    }

    //    Question 11: Count special Character
//    Tìm số lần xuất hiện ký tự &quot;a&quot; trong chuỗi
    public void question12(String s1) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') {
                count++;
            }

        }
        System.out.println("số lần xuất hiện là: " + count);
    }

    //    Question 13String not contains digit
//    Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
    public static boolean question13(String s1) {
        if (s1 == null) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    //    Question 14: Replace characteCho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
    public static String question14(String s1, char old, char news) {
        if (s1 == null) {
            return null;
        }
        return s1.replace(old, news);
    }
}
