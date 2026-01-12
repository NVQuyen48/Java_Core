package main.java.Entity;

public final class SecondaryStudent extends Student {
    private static int secondaryStudent = 0;

    public SecondaryStudent(int studentID, String name) {
        super(studentID, name);
        secondaryStudent++;
    }

    public static void resetSecondaryStudentCount() {
        secondaryStudent = 0;
    }

    public static int getSecondaryStudent() {
        return secondaryStudent;
    }
}
