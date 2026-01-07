package main.java.Entity;

public class Security extends Person {


    public Security(String name, int age) {
        super(name, age);
    }

    @Override
    public void rollUp() {

    }

    public void collectTicket() {
        System.out.println("Security Collecting Ticket");
    }
}
