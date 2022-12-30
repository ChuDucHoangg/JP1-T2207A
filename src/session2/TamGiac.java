package session2;

import java.util.Scanner;

public class TamGiac {

    int canh1, canh2, canh3;

    public TamGiac() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Canh 1:");
            canh1 = sc.nextInt();
            System.out.println("Canh 2:");
            canh2 = sc.nextInt();
            System.out.println("Canh 3:");
            canh3 = sc.nextInt();
        } while(!kiemTra());
    }

    public boolean kiemTra(){
        return canh1+canh2>canh3 && canh2+canh3>canh1 && canh1+canh3>canh2;
    }

    public int tinhChuVi(){
        return canh1+canh2+canh3;
    }

    public double tinhDienTich(){
        double p = tinhChuVi()/2.0;
        double s = Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
        return s;
    }
}
