package session6;

import session5.VietNamese;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        SinhVien sv1 = new SinhVien();
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("Chọn chức năng:");
            System.out.println("1.Lớp Sinh Viên!");
            System.out.println("2.Lớp Lớp Học!");
            int chon = input.nextInt();
            switch (chon) {
                case 1:
                    sv.nhapThongTin(sc);
                    sv.inThongTin();
                    break;
                case 2:
                    Scanner sn = new Scanner(System.in);
                    LopHoc lh = new LopHoc();
                    Scanner cn = new Scanner(System.in);
                    boolean con = true;
                    do {
                        System.out.println("Chọn phương thức:");
                        System.out.println("1.Nhập thông tin lớp!");
                        System.out.println("2.Thêm sinh viên vào danh sách lớp!");
                        System.out.println("3.Cập nhập thông tin sinh viên của lớp!");
                        System.out.println("4.In ra thông tin và danh sách của lớp!");
                        System.out.println("5.Sắp xếp danh sách lớp theo thứ tự giảm dần!");
                        int cho = input.nextInt();
                        switch (cho) {
                            case 1:
                                lh.nhapThongTinLop(sn);

                                break;
                            case 2:
                                lh.nhapThongTinLop(sn);
                                sv.nhapThongTin(sc);
                                lh.themSinhVien(sv);
                                lh.inThongTinLop();
                                break;
                            case 3:
                                lh.nhapThongTinLop(sn);
                                sv.nhapThongTin(sc);
                                sv1.nhapThongTin(sc);
                                lh.themSinhVien(sv);
                                lh.themSinhVien(sv1);
                                lh.CapNhapThongTinSV(sv, sv1);
                                lh.inThongTinLop();
                                break;
                            case 4:
                                lh.nhapThongTinLop(sn);
                                lh.inThongTinLop();
                                break;
                            case 5:
                                lh.nhapThongTinLop(sn);
                                sv.nhapThongTin(sc);
                                sv1.nhapThongTin(sc);
                                lh.themSinhVien(sv);
                                lh.themSinhVien(sv1);
                                lh.sapXepGiamDan();
                                System.out.println("Sau khi sap xep : " );
                                lh.inThongTinLop();
                                break;
                        }
                    }while (cont);
                    break;
            }
        }while (cont);
    }
}
