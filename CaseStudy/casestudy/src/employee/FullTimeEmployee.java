package employee;

public class FullTimeEmployee extends Employee {
    private double heSoLuong;

    public FullTimeEmployee(int id, String name, String birthday, String gender, double heSoLuong) {
        super(id, name, birthday, gender);
        this.heSoLuong = heSoLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double getSalary() {
        return 3000000 * heSoLuong;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-20s", "FullTime");
    }
}
