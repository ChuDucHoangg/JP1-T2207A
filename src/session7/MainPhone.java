package session7;

import java.util.Scanner;

public class MainPhone {
    static PhoneBook pb = new PhoneBook();
    static Scanner sc = new Scanner(System.in);
    static String name, phone;
    static void menu() {
        System.out.println("1.insertPhone");
        System.out.println("2.removePhone");
        System.out.println("3.updatePhone");
        System.out.println("4.searchPhone");
        System.out.println("5.sortPhone");
        System.out.println("6.stop");
    }
    public static void main(String[] args) {
        menu();
        while (true) {
            System.out.println("chon truc nang:");
            switch (sc.nextInt()) {
                case 1:
                    insertPhone();
                    break;
                case 2:
                    removePhone();
                case 3:
                    updatePhone();
                    break;
                case 4:
                    searchPhone();
                    break;
                case 5:
                    sort();
                    break;
                case 6:
                    return;
            }
        }
    }
        private static void insertPhone() {
            sc.nextLine();
            System.out.println(" nhap ten : ");
            name = sc.nextLine();
            System.out.println(" nhap phone : ");
            phone = sc.nextLine();
            pb.insertPhone(name, phone);
        }
        private static void removePhone() {
            sc.nextLine();
            System.out.println("nhap vao so ban muon xoa");
            name = sc.nextLine();
            pb.removePhone(name);
        }
        private static void updatePhone() {

        }
        private static void searchPhone() {
            sc.nextLine();
            System.out.println("nhap ten nguoi muon tim :");
            name = sc.nextLine();
            pb.searchPhone(name);
        }
        private static void sort() {

        }
}
