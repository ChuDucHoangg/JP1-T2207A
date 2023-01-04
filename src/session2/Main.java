package session2;

import java.util.ArrayList;

public class Main {
    public  static  void main(String[] arg){
        int x = 10;
        x++;
        // age ++;
        Student s1 = new Student();
        s1.age++;
        s1.eat();

        Student s2 = new Student();
        s2.eat();
        s2.learn();

        Student s3 = new Student();

        System.out.println("S1: "+s1.name);
        System.out.println("S2: "+s2.name);
        System.out.println("S3: "+s3.name);

        //array
        int[] arrNums = new int[10];//mang 10 so nguyen
        arrNums[0] = 2;
        arrNums[1] = 6;

        for(int i=0;i<10;i++){
            arrNums[i] = i;
        }

//        arrNums[9] = 18;
//        arrNums[9]++;
//        System.out.println(arrNums[9]);

        ArrayList<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("world");
        strs.add("every body");

        System.out.println(strs.get(0));
        System.out.println(strs.get(1));
        System.out.println(strs.get(2));

        for(int i=0;i<strs.size();i++){
            System.out.println(strs.get(i));
        }


        ArrayList<Student> sts = new ArrayList<>();//MANG CAC SINH VIEN
        sts.add(s1);
        sts.add(s2);
        sts.add(s3);

        sts.add(new Student());


        //MANG HOT GIRL
        ArrayList<HotGirl> stsg = new ArrayList<HotGirl>();//MANG CAC HOT GIRL
        HotGirl hg1 = new HotGirl();
        stsg.add(hg1);
        HotGirl hg2 = new HotGirl();
        stsg.add(hg2);
        HotGirl hg3 = new HotGirl();
        stsg.add(hg3);

        for(int i=0;i<stsg.size();i++){
            System.out.println(stsg.get(i).name);
            System.out.println(stsg.get(i).date);
            System.out.println(stsg.get(i).adress);
        }

        //Xay dung lop tam giac co cac thong tin gom do dai cac canh.
        //Tinh chu vi va dien tich tam giac
        TamGiac tamGiac = new TamGiac();
        System.out.println("Chu vi tam giac la: "+tamGiac.tinhChuVi());
        System.out.println("Dien tich tam giac la: "+tamGiac.tinhDienTich());

        //Xay dung lop phan so.
        PhanSo p = new PhanSo();
        p.nhapPS();
        p.InPhanSo();
        p.RutGonPS();
    }
}
