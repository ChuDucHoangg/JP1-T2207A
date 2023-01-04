package session2;

import java.util.Scanner;

public class PhanSo {
    int tuso;
    int mauso;

    //cac thuoc tinh
    public  PhanSo() {
        tuso = 0;
        mauso = 1;
    }

    public void nhapPS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tuso = sc.nextInt();
        System.out.println("Nhap mau so: ");
        mauso = sc.nextInt();
    }

    //in ra phan so
    public  void InPhanSo() {
        if (tuso * mauso < 0) {
            System.out.println("Ban da nhap sai cu phap!");
        }else{
            System.out.println("phan so vua nhap la: "+tuso+"/"+mauso);
        }
    }

    //rut gon phan so
    public  void  RutGonPS() {
        int t = tuso;
        int m = mauso;
        int ucln = UCLN(t,m);
        System.out.println("phan so sau khi rut gon: " +ucln);
    }
    static int UCLN(int t,int m){
        while (t != m) {
            if (t > m) {
                t -= m;
            }else{
                m -= t;
            }
        }
        return t;
    }
}
