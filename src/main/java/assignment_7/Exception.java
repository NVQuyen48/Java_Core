package main.java.assignment_7;

public class Exception {


    public static void main(String[] args) {
//        Question 1: try…catch…finally
//        Question 2: tiếp tục Question 1 chỉ cần thêm finally cho question 1
        float result = devile(7, 0);
        System.out.println(result);
//      Question 3:Hãy xử lý exception cho VD trên và in ra thông tin lỗi.

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

//        Question 4:Tạo 1 array departments gồm 3 phần tử
//        Sau đó viết 1 method getIndex(int index) để lấy thông tin phần tử thứ index trong
//        array departments. Nếu index vượt quá length lấy ra thì sẽ in ra text &quot;Cannot find
//        department.&quot;
        getIndex(2);
    }

    static String[] departments = {"HR", "Test", "Dev"};

    private static void getIndex(int index) {
        try {

            System.out.println(departments[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find departments");
        }

    }


    private static float devile(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("cannot divide 0");
            return 0;
        } finally {
            System.out.println("divide completed");
        }
    }


}
