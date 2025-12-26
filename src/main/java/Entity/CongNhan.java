package main.java.Entity;

public class CongNhan extends CanBo {
    int bac;

    public CongNhan(String name, int age, Gender gender, String address, int bac) {
        super(name, age, gender, address);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                '}';
    }
}
