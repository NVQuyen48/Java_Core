package main.java.Entity;

public class Department {
    private static int counter = 0;
    int departmentId;
    String departmentName;

    public Department(String name) {
        this.departmentId = 0;
        this.departmentName = name;
    }

    public Department() {
        this.departmentId = 0;
        this.departmentName = null;

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
