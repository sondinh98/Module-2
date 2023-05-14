import java.util.Scanner;

abstract class NhanVien {
    protected String ma_nv;
    protected String ho_ten;
    protected String gioi_tinh;
    protected int tuoi;
    protected String dia_chi;

    public NhanVien(String ma_nv, String ho_ten, String gioi_tinh, int tuoi, String dia_chi) {
        this.ma_nv = ma_nv;
        this.ho_ten = ho_ten;
        this.gioi_tinh = gioi_tinh;
        this.tuoi = tuoi;
        this.dia_chi = dia_chi;
    }

    public abstract double tinhLuong();
}

class NhanVienFulltime extends NhanVien {
    private double luong_co_ban;
    private int so_ngay_cong;

    public NhanVienFulltime(String ma_nv, String ho_ten, String gioi_tinh, int tuoi, String dia_chi, double luong_co_ban, int so_ngay_cong) {
        super(ma_nv, ho_ten, gioi_tinh, tuoi, dia_chi);
        this.luong_co_ban = luong_co_ban;
        this.so_ngay_cong = so_ngay_cong;
    }

    @Override
    public double tinhLuong() {
        return this.luong_co_ban * this.so_ngay_cong;
    }
}

class NhanVienParttime extends NhanVien {
    private double so_gio_lam_viec;
    private double luong_theo_gio;

    public NhanVienParttime(String ma_nv, String ho_ten, String gioi_tinh, int tuoi, String dia_chi, double so_gio_lam_viec, double luong_theo_gio) {
        super(ma_nv, ho_ten, gioi_tinh, tuoi, dia_chi);
        this.so_gio_lam_viec = so_gio_lam_viec;
        this.luong_theo_gio = luong_theo_gio;
    }

    @Override
    public double tinhLuong() {
        return this.so_gio_lam_viec * this.luong_theo_gio;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int so_luong_nhan_vien = Integer.parseInt(scanner.nextLine());

        NhanVien[] danh_sach_nhan_vien = new NhanVien[so_luong_nhan_vien];

        for (int i = 0; i < so_luong_nhan_vien; i++) {
            System.out.print("Nhập loại nhân viên (fulltime/parttime): ");
            String loai_nv = scanner.nextLine();
            System.out.print("Nhập mã nhân viên: ");
            String ma_nv = scanner.nextLine();
            System.out.print("Nhập họ tên: ");
            String ho_ten = scanner.nextLine();
            System.out.print("Nhập giới tính: ");
            String gioi_tinh = scanner.nextLine();
            System.out.print("Nhập tuổi: ");
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập địa chỉ: ");
            String dia_chi = scanner.nextLine();

            if (loai_nv.toLowerCase().equals("fulltime")) {
                System.out.print("Nhập lương cơ bản: ");
                double luong_co_ban = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập số ngày công: ");
                int so_ngay_cong = Integer.parseInt(scanner.nextLine());
                NhanVien nhan_vien = new NhanVienFulltime(ma_nv, ho_ten, gioi_tinh, tuoi, dia_chi, luong_co_ban, so_ngay_cong);
                danh_sach_nhan_vien[i] = nhan_vien;
            } else if (loai_nv.toLowerCase().equals("parttime")) {
                System.out.print("Nhập số giờ làm việc: ");
                double so_gio_lam_viec = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập lương theo giờ: ");
                double luong_theo_gio = Double.parseDouble(scanner.nextLine());
                NhanVien nhan_vien = new NhanVienParttime(ma_nv, ho_ten, gioi_tinh, tuoi, dia_chi, so_gio_lam_viec, luong_theo_gio);
                danh_sach_nhan_vien[i] = nhan_vien;
            }
        }

        int lua_chon;
        do {
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Tính lương nhân viên");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            lua_chon = Integer.parseInt(scanner.nextLine());
            switch (lua_chon) {
                case 1:
                    for (NhanVien nhan_vien : danh_sach_nhan_vien) {
                        System.out.println(nhan_vien.ma_nv + " " + nhan_vien.ho_ten);
                    }
                    break;
                case 2:
                    System.out.print("Nhập mã nhân viên: ");
                    String ma_nv = scanner.nextLine();
                    for (NhanVien nhan_vien : danh_sach_nhan_vien) {
                        if (nhan_vien.ma_nv.equals(ma_nv)) {
                            System.out.println("Lương của nhân viên " + nhan_vien.ho_ten + " là " + nhan_vien.tinhLuong());
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (lua_chon != 0);
    }
}
