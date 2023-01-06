package session3;

public class Student {
    private String TenSV;
    private String NgaySinh;
    private String DiaChi;
    private String TenLop;
    private float DiemTB;

    public Student(){
    }

    public Student(String TenSV,String NgaySinh,String DiaChi,String TenLop,float DiemTB){
        this.TenSV = TenSV;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.TenLop = TenLop;
        this.DiemTB = DiemTB;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String tenSV) {
        TenSV = tenSV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(int diemTB) {
        DiemTB = diemTB;
    }

    public int xepLoai() {
        if(DiemTB == 10){
            System.out.println("Xep loai Xuat Sac!");
        }else if( (DiemTB>=8) && (DiemTB<=9) ){
            System.out.println("Xep loai Gioi!");
        }else if( (DiemTB>=6) && (DiemTB<=7.9) ){
            System.out.println("Xep loai Kha!");
        }else if( (DiemTB>=5) && (DiemTB<=5.9) ){
            System.out.println("Xep loai Trung Binh!");
        }else if( (DiemTB>=0) && (DiemTB<=4.9) ){
            System.out.println("Xep loai Yeu!");
        }
        System.out.println(" ");
        return 0;
    }

    @Override
    public String toString() {
        System.out.println(TenSV);
        System.out.println(NgaySinh);
        System.out.println(DiaChi);
        System.out.println(TenLop);
        System.out.println(DiemTB);
        return "" + xepLoai();
    }

}
