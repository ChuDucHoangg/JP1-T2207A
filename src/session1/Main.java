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

            //Nhập 1 số nguyên n, kiểm tra nó có phải số hoàn hảo hay không.
            Scanner ab = new Scanner(System.in);
            System.out.println("nhap vao tu ban phim mot so nguyen");
            int a = ab.nextInt();

            int sum=0;
            for(int i=1;i<=a/2;i++){
                if(a % i == 0){
                    sum+=i;
                }
            }
            if (sum==a){
                System.out.println(a+ " la so hoan hao");
            }else{
                System.out.println(a+ " khong la so hoan hao");
            }
            //Nhập 1 số nguyên n, tìm số có vị trí thứ n của dãy Fibonaci.
            Scanner cd = new Scanner(System.in);
            System.out.println("nhap vao so nguyen n:");
            int p = cd.nextInt();

            if(p < 0){
                System.out.println("so khong hop le!");
            }else{
                if(p == 0){
                    System.out.println(" 0 ");
                }
                if(p == 1){
                    System.out.println(" 1 ");
                }
                if(p >= 2){
                    int fn = 0 , f0 = 0 , f1 = 1;
                    for(int i=2;i<=p;i++){

                        fn = f0 + f1;
                        f0 = f1;
                        f1 = fn;
                    }
                    System.out.println("so co vi tri thu n la: " +fn);
                }
            }
            //Nhập 2 số nguyên, tìm ước chung lớn nhất và bội chung nhỏ nhất của 2 số đó.

            //UCLN
            Scanner ef = new Scanner(System.in);
            System.out.println("nhap vao so thu nhat: ");
            int j = ef.nextInt();
            System.out.println("nhap vao so thu hai: ");
            int k = ef.nextInt();
            int ucln = UCLN(j,k);
            int bcnn = BCNN(j,k);

            System.out.println("uoc chung lon nhat la:" +ucln);
            System.out.println("uoc chung lon nhat la:" +bcnn);
        }
        static int UCLN(int j, int k) {
            while (j != k){
                if(j > k ){
                    j = j - k;
                }else{
                    k = k -j;
                }
            }
            return j;
        }
        static  int BCNN(int j,int k) {
            return (j*k)/UCLN(j,k);
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
