package session4;

import java.util.Scanner;

public class ChuaBaiTapSeesion3Main {
    public static void main(String[] args) {
        ChuaBaiTapSeession3[] hs = new ChuaBaiTapSeession3[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < hs.length; i++) {
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap ngay sinh:");
            String ns = sc.nextLine();
            System.out.println("Nhap dia chi:");
            String dc = sc.nextLine();
            System.out.println("lop:");
            String lh = sc.nextLine();
            System.out.println("diem trung binh:");
            double tb = sc.nextDouble();
            hs[i] = new ChuaBaiTapSeession3(ten, ns, dc, lh, tb);
        }

        for (int i = 0; i < hs.length - 1; i++) {
            for (int j = 0; j < hs.length - i - 1; j++) {
                if (hs[j].getTrungBinh() < hs[j + 1].getTrungBinh()) {
                    ChuaBaiTapSeession3 tmp;
                    tmp = hs[j];
                    hs[j] = hs[j + 1];
                    hs[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < hs.length; i++) {
            hs[i].inThongTin();
        }
        //cao nhat: hs[0]
        //thap nhat: hs[hs.legnth-1]

        //xuat sac:
        for (int i = 0; i < hs.length; i++) {
            if (hs[i].getTrungBinh() >= 9.5) {
                hs[i].inThongTin();
            }
        }
    }
}
