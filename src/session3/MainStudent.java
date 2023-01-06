package session3;


public class MainStudent {
    public static void main(String[] args) {
//        Student sv1 = new Student("Nguyen Van A",  "20/1/2004", "HaNoi", "t2207a",9);
//        Student sv2 = new Student("Nguyen Thi B",  "2/10/2004", "HaNoi", "t2207a",8);
//        Student sv3 = new Student("Hoang Thi C",  "4/9/2004", "HaNoi", "t2207a",6);
//        Student sv4 = new Student("Nguyen The D",  "10/1/2004", "HaNoi", "t2207a",9);
//        Student sv5 = new Student("Hoang Van E",  "2/11/2004", "HaNoi", "t2207a",8);
//        Student sv6 = new Student("Phung Van F",  "2/4/2004", "HaNoi", "t2207a",10);
//        Student sv7 = new Student("Nguyen Thi G",  "21/11/2004", "HaNoi", "t2207a",4);
//        Student sv8 = new Student("Dao Van H",  "25/6/2004", "HaNoi", "t2207a",5);
//        Student sv9 = new Student("Nguyen Thanh I",  "4/12/2004", "HaNoi", "t2207a",7);
//        Student sv10 = new Student("Kieu Van K",  "2/1/2004", "HaNoi", "t2207a",8);
//
//        System.out.println(sv1);
//        System.out.println(" ");
//        System.out.println(sv2);
//        System.out.println(" ");
//        System.out.println(sv3);
//        System.out.println(" ");
//        System.out.println(sv4);
//        System.out.println(" ");
//        System.out.println(sv5);
//        System.out.println(" ");
//        System.out.println(sv6);
//        System.out.println(" ");
//        System.out.println(sv7);
//        System.out.println(" ");
//        System.out.println(sv8);
//        System.out.println(" ");
//        System.out.println(sv9);
//        System.out.println(" ");
//        System.out.println(sv10);
//        System.out.println(" ");

        Student[] std = new Student[10];
            std[0] = new Student("Nguyen Van A",  "20/1/2004", "HaNoi", "t2207a",9);
            std[1] = new Student("Nguyen Thi B",  "2/10/2004", "HaNoi", "t2207a",8);
            std[2] = new Student("Hoang Thi C",  "4/9/2004", "HaNoi", "t2207a",6);
            std[3] = new Student("Nguyen The D",  "10/1/2004", "HaNoi", "t2207a",9);
            std[4] = new Student("Hoang Van E",  "2/11/2004", "HaNoi", "t2207a",8);
            std[5] = new Student("Phung Van F",  "2/4/2004", "HaNoi", "t2207a",10);
            std[6] = new Student("Nguyen Thi G",  "21/11/2004", "HaNoi", "t2207a",4);
            std[7] = new Student("Dao Van H",  "25/6/2004", "HaNoi", "t2207a",5);
            std[8] = new Student("Nguyen Thanh I",  "4/12/2004", "HaNoi", "t2207a",7);
            std[9] = new Student("Kieu Van K",  "2/1/2004", "HaNoi", "t2207a",8);

            for(int s=0;s < std.length;s++){
                for(int x=s+1;x < std.length;x++){
                    if(std[x].getDiemTB() > std[s].getDiemTB()){
                        Student temp = new Student();
                        temp = std[x];
                        std[x] = std[s];
                        std[s] = temp;
                    }
                }
            }
            for (int i = 0; i < std.length; i++) {
                System.out.print(std[i] + "  ");
            }
    }
}
