package main.java.assignment_4;

import main.java.Entity.Bao;
import main.java.Entity.Sach;
import main.java.Entity.TaiLieu;
import main.java.Entity.TapChi;

import java.util.ArrayList;
import java.util.Scanner;

public class QLTV {
    ArrayList<TaiLieu> danhSach = new ArrayList<>();

    public void themTaiLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn loại tài liệu:");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");

        int loai = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập mã tài liệu: ");
        String maTaiLieu = sc.nextLine();

        System.out.print("Nhập nhà xuất bản: ");
        String tenNSX = sc.nextLine();

        System.out.print("Nhập số bản phát hành: ");
        int soBanPhatHanh = sc.nextInt();
        sc.nextLine();

        TaiLieu tl = null;

        switch (loai) {
            case 1:
                System.out.println("Nhập tên tác giả");
                String tenTacGia = sc.nextLine();
                System.out.println("Nhập số trang:");
                int soTrang = sc.nextInt();
                tl = new Sach(maTaiLieu, tenNSX, soBanPhatHanh, tenTacGia, soTrang);
                break;
            case 2:
                System.out.println("Nhập số phát hành:");
                int soPhatHanh = sc.nextInt();
                System.out.println("nhập tháng phát hành:");
                int thangPhatHanh = sc.nextInt();
                tl = new TapChi(maTaiLieu, tenNSX, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                break;
            case 3:
                sc.nextLine();
                System.out.print("Nhập ngày phát hành: ");
                String ngay = sc.nextLine();
                tl = new Bao(maTaiLieu, tenNSX, soBanPhatHanh, ngay);
                break;

            default:
                System.out.println("Loại không hợp lệ!");
                return;
        }
        danhSach.add(tl);
    }

    public void xoaTaiLieu(String ma) {
        danhSach.removeIf(tl -> tl.getMaTaiLieu().equals(ma));
    }

    public void hienThi() {
        for (TaiLieu tl : danhSach) {
            tl.hienThi();
        }
    }

    public void timTheoLoai(String loai) {
        for (TaiLieu tl : danhSach) {
            if (loai.equalsIgnoreCase("sach") && tl instanceof Sach) {
                tl.hienThi();
            }
            if (loai.equalsIgnoreCase("tapchi") && tl instanceof TapChi) {
                tl.hienThi();
            }
            if (loai.equalsIgnoreCase("bao") && tl instanceof Bao) {
                tl.hienThi();
            }
        }
    }
}
