import java.util.Date;

abstract class QL_NhanVien {
    private String name;
    private int id;
    private long phone;
    private Date birthday;
    public QL_NhanVien() {}

    public QL_NhanVien(String name, int id, int phone, Date birthday) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.birthday = birthday;
    }
    public double tinhLuong() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
