package main.java.Entity;

import java.time.LocalDate;

public class Bao extends TaiLieu {
    String ngayPhatHanh;

    public Bao(String maTaiLieu, String tenNSX, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNSX, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void hienThi() {
        System.out.println(
                "Báo | Mã: " + maTaiLieu +
                        ", NXB: " + tenNSX +
                        ", Số bản: " + soBanPhatHanh +
                        ", Ngày phát hành: " + ngayPhatHanh
        );
    }
}
