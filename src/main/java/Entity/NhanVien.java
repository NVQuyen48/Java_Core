package main.java.Entity;

public class NhanVien extends CanBo {
    String congViec;

    public NhanVien(String name, int age, Gender gender, String address, String congViec) {
        super(name, age, gender, address);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
