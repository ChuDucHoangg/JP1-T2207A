package session5;

public class VietNamese {
    private Integer maKH;
    private String nameKH;
    private String ngayraHD;
    private String doituong;
    private Float soluong;
    protected float thanhtien;

    public VietNamese() {
    }

    public VietNamese(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public VietNamese(Integer maKH, String nameKH, String ngayraHD, String doituong, Float soluong) {
        this.maKH = maKH;
        this.nameKH = nameKH;
        this.ngayraHD = ngayraHD;
        this.doituong = doituong;
        this.soluong = soluong;
    }

    public Integer getMaKH() {
        return maKH;
    }

    public void setMaKH(Integer maKH) {
        this.maKH = maKH;
    }

    public String getNameKH() {
        return nameKH;
    }

    public void setNameKH(String nameKH) {
        this.nameKH = nameKH;
    }

    public String getNgayraHD() {
        return ngayraHD;
    }

    public void setNgayraHD(String ngayraHD) {
        this.ngayraHD = ngayraHD;
    }

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public Float getSoluong() {
        return soluong;
    }

    public void setSoluong(Float soluong) {
        this.soluong = soluong;
    }

//    public void Level(){
//        if(level <= 50){
//            dongia = 1000;
//        }else if(level > 50 && level <=100){
//            dongia = 1200;
//        }else if(level > 100 && level <=200){
//            dongia = 1500;
//        }else if(level > 200){
//            dongia = 2000;
//        }
//    }

    public double ThanhTien() {
        if (this.soluong <= 50) {
            return this.thanhtien = soluong * 1000;
        } else if(this.soluong <= 100){
            return this.thanhtien = soluong * 1200;
        } else if(this.soluong <= 200){
            return this.thanhtien = soluong * 1500;
        } else {
            return this.thanhtien = soluong * 2000;
        }
    }

    public void inThongTin(){
        System.out.println("Mã Khách Hàng: " +maKH);
        System.out.println("Tên Khách Hàng: " +nameKH);
        System.out.println("Ngày Ra Hoá Đơn: " +ngayraHD);
        System.out.println("Đối Tượng Khách Hàng: " +doituong);
        System.out.println("Số Lượng KW sử dụng: " +soluong);
    }
}

