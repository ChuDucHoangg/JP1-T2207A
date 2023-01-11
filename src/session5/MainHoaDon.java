package session5;

import java.util.ArrayList;
import java.util.Scanner;

public class MainHoaDon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("Nhập 1 nếu khách hàng là người việt, nhập 2 nếu khách hàng là người nước ngoài:");
            int chon = input.nextInt();
            switch (chon) {
                case 1:
                    ArrayList<VietNamese> vn = new ArrayList<>();
                    Scanner sc = new Scanner(System.in);
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Nhap ma khach hang:");
                        int maKH = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap ten khach hang:");
                        String nameKH = sc.nextLine();
                        System.out.println("Nhap ngay ra hoa don:");
                        String ngayraHD = sc.nextLine();
                        System.out.println("Nhap doi tuong khach hang:");
                        String doituong = sc.nextLine();
                        System.out.println("Nhap so luong tieu thu:");
                        Float soluong = sc.nextFloat();
                        vn.add(new VietNamese(maKH, nameKH, ngayraHD, doituong, soluong));
                    }
                    System.out.println(" ");
                    vn.get(0).inThongTin();
                    System.out.print("Thành tiền của khách hàng "+vn.get(0).getNameKH()+" là : "+vn.get(0).ThanhTien());
                    System.out.println(" ");
                    System.out.println(" ");
                    break;

                case 2:
                    ArrayList<Foreigner> nc = new ArrayList<>();
                    Scanner sn = new Scanner(System.in);
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Nhap ma khach hang:");
                        int maKH = sn.nextInt();
                        sn.nextLine();
                        System.out.println("Nhap ten khach hang:");
                        String nameKH = sn.nextLine();
                        System.out.println("Nhap ngay ra hoa don:");
                        String ngayraHD = sn.nextLine();
                        System.out.println("Nhap quoc tich khach hang:");
                        String quoctich = sn.nextLine();
                        System.out.println("Nhap so luong tieu thu:");
                        Float soluong = sn.nextFloat();
                        nc.add(new Foreigner(maKH, nameKH, ngayraHD, quoctich, soluong));
                    }
                    System.out.println(" ");
                    nc.get(0).inThongTin();
                    System.out.print("Thành tiền của khách hàng "+nc.get(0).getNameKH()+" là : "+nc.get(0).ThanhTien());
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
            }
        }while (cont) ;
    }
}

