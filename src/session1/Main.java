package session1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            int x = 10;
            double y = 3.14;
            String s = "Hello";
            System.out.println("x = " + x);
            y = y + 20 * x;

            if (y > 100) {
                System.out.println("y = " + y);
            } else {
                System.out.println("x =" + x);
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
            }
            //tinh S1=1+2+3+...+1000;
            int S1 = 0;
            for (int z = 0; z <= 1000; z++) {
                S1 = S1 + z;
            }
            System.out.println("S1 = " + S1);
            double S2 = 0;
            for(int a=1;a<=1000;a++){
                S2 = S2 + (double) 1/a;
            }
            System.out.println("S2 ="+S2);

            int d = tinhTong(10,15);
            System.out.println("d ="+d);
            int f = phepTru(30,5);
            System.out.println("f ="+f);
            int g = phepNhan(10,5);
            System.out.println("g ="+g);
            int h = phepChia(25,5);
            System.out.println("h ="+h);
            boolean t=true;

            // nhap 1 so nguyen tu ban phim;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap 1 so nguyen:");
            int n = sc.nextInt();

            System.out.println("Nhap 1 so thuc:");
            double l = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhap 1 string:");
            String str = sc.nextLine();
            System.out.println("n: "+n);
            System.out.println("l: "+l);
            System.out.println("str: "+str);


            //nhap 1 so nguyen n tu ban phim
            //tinh tong S =1 +2 +3... +n
            System.out.println("Nhap 1 so nguyen n tu ban phim: ");
            int sn = sc.nextInt();

            int S3 = 0;
            for(int k=0;k<=sn;k++){
                S3 = S3 +k;
            }
            System.out.println("tong S la: "+S3);

            //kiem tra so nguyen to
            int dem=0;
            for(int i=1;i<=sn;i++){
                if(sn % i == 0) {
                    dem++;
                }
            }
            if(dem==2){
                System.out.println(S3+ " la so nguyen to: ");
            }else{
                System.out.println(S3+ " khong la so nguyen to: ");
            }

        }
        static  int tinhTong(int a,int b){
            return a+b;
        }
        static int phepTru(int t,int p){
            return t-p;
        }
        static int phepNhan(int a,int b){
            return a*b;
        }
        static int phepChia(int a,int b){
            return b==0?null:a/b;
    }
}
