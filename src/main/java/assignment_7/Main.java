package main.java.assignment_7;

import main.java.Entity.Account;
import main.java.Entity.Position;
import main.java.Entity.ScannerUtils;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-1, 1, 3, 5, -5, -8};
        int maxValue = getMaxValue(numbers);
        int minValue = getMinValue(numbers);
        System.out.println("Max Value: " + maxValue);
        System.out.println("Min Value: " + minValue);
//        input();
//        inputPosition();
        inputAge();
    }

    //    Exercise 1: Debug
    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    //    Question 7: làm tương tự câu 6
//    Tạo 1 class ScannerUtils, trong class sẽ tạo 1 method inputInt() chuyên để nhập
//    dữ liệu dạng int như age, id, …
//    Gợi ý: inputInt() sẽ có parameter là String errorMessage để người dùng có thể tự
//    điền được errorMessage vào.
    public static void input() {
        System.out.println("Nhập tuổi của bạn:");
        int age = ScannerUtils.inputInt("Bạn nhập sai tuổi, hãy nhập lại");
        System.out.println("Tuổi bạn vừa nhập là:" + age);

        System.out.println("Nhập id của bạn:");
        int id = ScannerUtils.inputInt("Bạn nhập sai id, hãy nhập lại");
        System.out.println("Id của bạn là: " + id);
    }

    //    Question 9:
//    Sử dụng ScannerUtils vừa tạo để nhập thông tin cho Department,
//    Position với điều kiện khi khởi tạo object sẽ yêu cầu nhập vào thông
//    tin luôn trong constructor
    public static void inputPosition() {
        Position position = new Position();
        System.out.println("Position: "
                + position.getPositionId() + " - " + position.getPositionName());
    }

    //    Question 11 : Custom Exception
//    Tạo custom Exception tên là: InvalidAgeInputingException.
//    Hãy viết method inputAge() ở class Account với yêu cầu như sau:
//    Khi người dùng nhập vào tuổi &lt;= 0 thì throw ra Exception
//    InvalidAgeInputingException với message là: &quot;The age must be greater than 0&quot;
    public static void inputAge() {
        Account account = new Account();
        try {
            account.inputAge();
            System.out.println("age" + account.getAge());
        } catch (InvalidAgeInputingException e) {
            System.out.println(e.getMessage());
        }
    }
}
