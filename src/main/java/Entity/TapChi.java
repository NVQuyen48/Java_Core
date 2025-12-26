package main.java.Entity;

import java.time.LocalDate;

public class TapChi extends TaiLieu {
    int soPhatHanh;
    int thangPhatHanh;

    public TapChi(String maTaiLieu, String tenNSX, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNSX, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public void hienThi() {
        System.out.println(
                "Tạp chí | Mã: " + maTaiLieu +
                        ", NXB: " + tenNSX +
                        ", Số bản: " + soBanPhatHanh +
                        ", Số phát hành: " + soPhatHanh +
                        ", Tháng: " + thangPhatHanh
        );
    }
}
