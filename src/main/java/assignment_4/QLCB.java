package main.java.assignment_4;

import main.java.Entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    List<CanBo> danhSachCanBo = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void themCanBo() {
        System.out.println("Chọn loại cán bộ");
        System.out.println("1.Công nhân");
        System.out.println("2.Kỹ sư");
        System.out.println("3.Nhân viên");

        int loai = sc.nextInt();

        System.out.println("Nhập tên:");
        String name = sc.next();

        System.out.println("Nhập tuổi:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập giới tính:");
        Gender gender = Gender.valueOf(sc.nextLine().toUpperCase());

        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();

        switch (loai) {
            case 1:
                System.out.println("Nhập bậc");
                int bac = sc.nextInt();
                danhSachCanBo.add(
                        new CongNhan(name, age, gender, address, bac)
                );
                break;

            case 2:
                System.out.println("Nhập ngành đào tạo:");
                String nganhDaoTao = sc.nextLine();
                danhSachCanBo.add(
                        new KySu(name, age, gender, address, nganhDaoTao)
                );
                break;
            case 3:
                System.out.println("Nhập công việc:");
                String congViec = sc.nextLine();
                danhSachCanBo.add(
                        new NhanVien(name, age, gender, address, congViec)
                );
                break;
            default:
                System.out.println("Không hợp lệ");
        }

    }

    public void timKiem(String ten) {
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getName().equals(ten)) {
                System.out.println(canBo);
            }
        }
    }

    public void hienThiDanhSach() {
        for (CanBo canBo : danhSachCanBo) {
            System.out.println(canBo);
        }
    }

    public void xoaCanBo(String ten) {
        danhSachCanBo.removeIf(
                canBo -> canBo.getName().equals(ten));
    }
}
