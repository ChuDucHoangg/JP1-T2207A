package session6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class LopHoc{
    private String nameClass;
    private String phongHoc;
    ArrayList<SinhVien> list = new ArrayList<>();

    public LopHoc(){
    }

    public LopHoc(String nameClass, String phongHoc) {
        this.nameClass = nameClass;
        this.phongHoc = phongHoc;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public void nhapThongTinLop(Scanner sn) {
        String n, p;
            System.out.println("Nhập tên lớp: ");
            n = sn.nextLine();
            System.out.println("Nhập phòng học: ");
            p = sn.nextLine();

            this.nameClass = n;
            this.phongHoc = p;
    }

    public void themSinhVien(SinhVien sv){
        if(!list.contains(sv)){
            this.list.add(sv);
        }
    }

    public void CapNhapThongTinSV(SinhVien SV,SinhVien newSV) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<list.size();i++){
            if(list.get(i).maSV == SV.maSV){
                list.get(i).maSV = SV.maSV;
                list.get(i).nameSV = SV.nameSV;
                list.get(i).SDT = SV.SDT;
                list.get(i).diaChi = SV.diaChi;
                list.get(i).diemThi = SV.diemThi;
                System.out.println("Nhập thông tin mới của học sinh " +list.get(i).getNameSV());
                newSV.nhapThongTin(sc);
                list.set(i, newSV);
            }
        }
    }

    public void inThongTinLop(){
        System.out.println("Tên lớp:" +this.nameClass);
        System.out.println("Phòng học:" +this.phongHoc);
        for(int i=0;i<list.size();i++){
            list.get(i).inThongTin();
        }
        System.out.println(" ");
    }

    public void sapXepGiamDan(){
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getDiemThi() < o2.getDiemThi()?-1:0;
            }
        });
    }
}
