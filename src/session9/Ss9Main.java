package session9;

public class Ss9Main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
//            if(y<5){
//                throw new Exception("chua cap nhap ban moi nhat");
//            }
            System.out.println("x/y=");
            int z = phepChia(x,y);
            System.out.println(z);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e ){
            System.out.println("Looi roi >>> "+e.getMessage());
        }finally {
            //hoan thanh
        }
        System.out.println("Done");
    }
    public static int phepChia(int a,int b) throws Exception
    {
        return a/b;
    }
}
