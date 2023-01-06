package session4;

public class ChuaBaiTapSeession3 {
    String hoten;
    String ngaySinh;
    String diachi;
    String tenlop;
    double trungBinh;

    public ChuaBaiTapSeession3(String hoten,String ngaySinh,String diachi,String tenlop,double trungBinh){
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.diachi = diachi;
        this.tenlop = tenlop;
        this.trungBinh = trungBinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public double getTrungBinh() {
        return trungBinh;
    }

    public void setTrungBinh(double trungBinh) {
        trungBinh = trungBinh;
    }

    public void baoCaoKetQua(){
        if(trungBinh < 4){
            System.out.println("Yeu");
        }else if(trungBinh < 6.5){
            System.out.println("Trung Binh");
        }else if(trungBinh < 8){
            System.out.println("Kha");
        }else if(trungBinh < 9.5){
            System.out.println("Gioi");
        }else{
            System.out.println("Xuat Sac");
        }
    }

    public void inThongTin(){
        System.out.println("Ho ten:" +hoten);
        System.out.println("Ngay Sinh:" +ngaySinh);
        System.out.println("Dia Chi:" +diachi);
        System.out.println("Lop Hoc:" +tenlop);
        System.out.println("Diem TB:" +trungBinh);
    }
}
