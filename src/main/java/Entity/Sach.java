package main.java.Entity;

public class Sach extends TaiLieu {
    String tenTacGia;
    int soTrang;

    public Sach(String maTaiLieu, String tenNSX, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNSX, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public void hienThi() {
        System.out.println(
                "Sách | Mã: " + maTaiLieu +
                        ", NXB: " + tenNSX +
                        ", Số bản: " + soBanPhatHanh +
                        ", Tác giả: " + tenTacGia +
                        ", Số trang: " + soTrang
        );
    }

}
