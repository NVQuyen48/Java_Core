package main.java.Entity;

public abstract class TaiLieu {
    String maTaiLieu;
    String tenNSX;
    int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String tenNSX, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNSX = tenNSX;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public abstract void hienThi();
}
