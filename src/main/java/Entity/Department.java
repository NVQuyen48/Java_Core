package main.java.Entity;

public class Department {
    private static int counter = 0;
    int departmentId;
    String departmentName;

    public Department(String name) {
        this.departmentId = ++counter;
        this.departmentName = name;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }


    public String toString() {
        return "Department ID:" + departmentId + "  Department Name:" + departmentName;
    }
}
