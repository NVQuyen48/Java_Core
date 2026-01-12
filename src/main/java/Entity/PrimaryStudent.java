package main.java.Entity;

public final class PrimaryStudent extends Student {
    private static int primaryStudent = 0;

    public PrimaryStudent(int studentID, String name) {
        super(studentID, name);
        primaryStudent++;
    }

    public static void resetPrimaryStudentCount() {
        primaryStudent = 0;
    }

    public static int getPrimaryStudent() {
        return primaryStudent;
    }
}
