package session2;

import java.util.Scanner;

public class HotGirl {
    String name;
    String date;
    String adress;

    public HotGirl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten:");
        name = sc.nextLine();
        System.out.println("Ngay sinh:");
        date = sc.nextLine();
        System.out.println("Dia chi:");
        adress = sc.nextLine();
    }
}
