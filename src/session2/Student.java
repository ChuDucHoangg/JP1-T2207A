package session2;

import java.util.Scanner;

public class Student {
    String name;
    String email;
    int age = 18;


    //Hàm khởi tạo
    public Student(){
        //tự động chạy khi tạo đối tượng
//        System.out.println("xin chào");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap email:");
        email = sc.nextLine();
    }


    public void eat(){
        System.out.println("Eating...");
    }
    public void learn(){
        System.out.println("Learning...");
    }
}