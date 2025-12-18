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


    public int getAccountID() {
        return accountID;
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
                ", departmentId=" + departmentId.getDepartmentId() +
                ", positionID=" + positionID.getPositionId() +
                ", createDate=" + createDate +
                '}';
    }
}
