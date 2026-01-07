package main.java.assignment_7;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int age = inputAge();
        System.out.println("enter your age:" + age);
    }

    //    Question 5:
//    Tạo 1 method inputAge() và trả về 1 số int.
//    Trong method hãy cài đặt như sau:
//    B1: Sau đó dùng scanner để nhập vào 1 số.
//            B2: Check exeption
//    Nếu người dùng nhập vào 1 số thì return về số đó
//    Nếu người dùng không nhập vào 1 số thì sẽ in ra dòng text &quot;wrong inputing!
//    Please input an age as int, input again.&quot;
//    Nếu người dùng không nhập vào 1 số &lt; 0 thì sẽ in ra dòng text &quot;Wrong
//    inputing! The age must be greater than 0, please input again.&quot;
//    B3: hãy demo trong method main()
    private static int inputAge() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your age:");
            String input = sc.nextLine();
            try {
                int age = Integer.parseInt(input);
                if (age < 0) {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                } else {
                    return age;
                }
            } catch (NumberFormatException e) {
                System.out.println("wrong inputing! Please input an age as int, input again.");
            }

        }
    }
}
