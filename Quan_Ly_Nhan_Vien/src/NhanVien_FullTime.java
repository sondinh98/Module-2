import java.util.Date;

public class NhanVien_FullTime extends QL_NhanVien{
    private double luongNV = 3000000;
    private double heso = 1;

    public NhanVien_FullTime() {
    }

    public NhanVien_FullTime(double luongNV, double heso) {
        this.luongNV = luongNV;
        this.heso = heso;
    }

    public NhanVien_FullTime(String name, int id, int phone, Date birthday, double luongNV, double heso) {
        super(name, id, phone, birthday);
        this.luongNV = luongNV;
        this.heso = heso;
    }

    public double getLuongNV() {
        return luongNV;
    }

    public void setLuongNV(double luongNV) {
        this.luongNV = luongNV;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    public double tinh_luong_fulltime(){
        return luongNV * this.heso;

    }
    @Override
    public double tinhLuong () {
        return tinh_luong_fulltime();
    }
}
