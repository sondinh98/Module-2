import java.util.Date;

public class NhanVien_PastTime extends QL_NhanVien{
    private double luongPastTime = 30000;
    private double sogio = 1;
    public NhanVien_PastTime() {}

    public NhanVien_PastTime(double luongPastTime) {
        this.luongPastTime = luongPastTime;
    }

    public NhanVien_PastTime(double luongPastTime, double sogio) {
        this.luongPastTime = luongPastTime;
        this.sogio = sogio;
    }

    public NhanVien_PastTime(String name, int id, int phone, Date birthday, double luongPastTime, double sogio) {
        super(name, id, phone, birthday);
        this.luongPastTime = luongPastTime;
        this.sogio = sogio;
    }

    public double getLuongPastTime() {
        return luongPastTime;
    }

    public void setLuongPastTime(double luongPastTime) {
        this.luongPastTime = luongPastTime;
    }

    public double getSogio() {
        return sogio;
    }

    public void setSogio(double sogio) {
        this.sogio = sogio;
    }

    public double tinh_luong_NVParstTime(){
        return luongPastTime * this.sogio;
    }
    @Override
    public double tinhLuong() {
       return tinh_luong_NVParstTime();
    }
}
