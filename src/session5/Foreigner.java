package session5;

public class Foreigner {
    private Integer maKH;
    private String nameKH;
    private String ngayraHD;
    private String quoctich;
    private Float soluong;
    protected float thanhtien;

    public Foreigner(){
    }

    public Foreigner(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public Foreigner(Integer maKH, String nameKH, String ngayraHD, String quoctich, Float soluong) {
        this.maKH = maKH;
        this.nameKH = nameKH;
        this.ngayraHD = ngayraHD;
        this.quoctich = quoctich;
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

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public Float getSoluong() {
        return soluong;
    }

    public void setSoluong(Float soluong) {
        this.soluong = soluong;
    }

    public double ThanhTien() {
        if (this.soluong > 0) {
            return this.thanhtien = soluong * 2000;
        } else {
            return this.thanhtien = soluong * 2000;
        }
    }

    public void inThongTin(){
        System.out.println("Mã Khách Hàng: " +maKH);
        System.out.println("Tên Khách Hàng: " +nameKH);
        System.out.println("Ngày Ra Hoá Đơn: " +ngayraHD);
        System.out.println("Quốc Tịch Khách Hàng: " +quoctich);
        System.out.println("Số Lượng KW sử dụng: " +soluong);
    }
}
