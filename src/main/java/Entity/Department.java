package main.java.Entity;

public class Department {
    int departmentId;
    String departmentName;

    public Department(int id, String name) {
        this.departmentId = id;
        this.departmentName = name;
    }

    public String getName() {
        return departmentName;
    }


    public int getDepartmentId() {
        return departmentId;
    }


    public String toString() {
        return "Department ID:" + departmentId + "  Department Name:" + departmentName;
    }
}
