package session6;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
    Integer maSV;
    String nameSV;
    Integer SDT;
    String diaChi;
    double diemThi;

    public SinhVien(){
    }

    public SinhVien(Integer maSV, String nameSV, Integer SDT, String diaChi, double diemThi) {
        this.maSV = maSV;
        this.nameSV = nameSV;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.diemThi = diemThi;
    }

    public Integer getMaSV() {
        return maSV;
    }

    public void setMaSV(Integer maSV) {
        this.maSV = maSV;
    }

    public String getNameSV() {
        return nameSV;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public Integer getSDT() {
        return SDT;
    }

    public void setSDT(Integer SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public void nhapThongTin(Scanner sc) {
        int m,s;
        String n,d;
        double t;
        System.out.println("Nhập mã sinh viên:");
        m = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên sinh viên:");
        n = sc.nextLine();
        System.out.println("Nhập số điện thoại sinh viên:");
        s = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ sinh viên:");
        d = sc.nextLine();
        System.out.println("Nhập điểm thi sinh viên:");
        t = sc.nextDouble();

        this.maSV = m;
        this.nameSV = n;
        this.SDT = s;
        this.diaChi = d;
        this.diemThi = t;
    }

    public void inThongTin(){
        System.out.println("Mã Sinh Viên : " +this.maSV);
        System.out.println("Tên Sinh Viên : " +this.nameSV);
        System.out.println("Số Điện Thoại : " +this.SDT);
        System.out.println("Địa Chỉ : " +this.diaChi);
        System.out.println("Điểm Thi : " +this.diemThi);
        System.out.println(" ");
    }
}
