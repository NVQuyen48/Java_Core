package main.java.Entity;

import main.java.assignment_7.InvalidAgeInputingException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;


public class Account {
    int accountID;
    public String email;
    public String userName;
    public String fullName;
    Department departmentId;
    Position position;
    String firstName;
    String lastName;
    public LocalDate createDate;
    private int age;

    static Scanner sc = new Scanner(System.in);

    public void inputAge() throws InvalidAgeInputingException {
        while (true) {
            try {
                System.out.print("Input age: ");
                int inputAge = Integer.parseInt(sc.nextLine());

                if (inputAge <= 0) {
                    throw new InvalidAgeInputingException(
                            "The age must be greater than 0"
                    );
                }

                this.age = inputAge;
                break;

            } catch (InvalidAgeInputingException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int getAge() {
        return age;
    }

    public Account() {
        this.accountID = 0;
        this.email = null;
        this.userName = null;
        this.fullName = null;
        this.departmentId = null;
        this.position = null;
        this.createDate = LocalDate.now();
    }

    public Account(int accountID, String email, String userName, String firstName, String lastName) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public Account(int accountID, String email, String userName, String firstName, String lastName, Position position, LocalDate createDate) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDate.now();
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
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public Account(int accountID, String email, String userName, String fullName, Department departmentId, Position position, LocalDate createDate) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.departmentId = departmentId;
        this.position = position;
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
                ", positionID=" + position.getPositionId() +
                ", createDate=" + createDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        ;
        if (o instanceof Account) {
            Account account = (Account) o;
        }
        ;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accountID);
    }
}
