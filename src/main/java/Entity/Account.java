package main.java.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Account {
    int accountID;
    String email;
    String userName;
    String fullName;
    Department departmentId;
    Position positionID;
    LocalDate createDate;

    public Account(int id, String email, String username, String fullname, Department departmentId) {
    }


    public int getAccountID() {
        return accountID;
    }

    public String getUserName() {
        return userName;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public Position getPositionID() {
        return positionID;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public Account(int accountID, String email, String userName, String fullName, Department departmentId, Position positionID, LocalDate createDate) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.departmentId = departmentId;
        this.positionID = positionID;
        this.createDate = createDate;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentId=" + departmentId.getDepartmentName() +
                ", positionID=" + positionID.getPositionId() +
                ", createDate=" + createDate +
                '}';
    }
}
