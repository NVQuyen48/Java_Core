package main.java.Entity;

public class KySu extends CanBo {
    String nganhDaoTao;

    public KySu(String name, int age, Gender gender, String address, String nganhDaoTao) {
        super(name, age, gender, address);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
