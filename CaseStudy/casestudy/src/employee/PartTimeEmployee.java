package employee;

public class PartTimeEmployee extends Employee {
    private int soGioLam;

    public PartTimeEmployee(int id, String name, String birthday, String gender, int soGioLam) {
        super(id, name, birthday, gender);
        this.soGioLam = soGioLam;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    @Override
    public double getSalary() {
        return 30000 * soGioLam;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-20s","PartTime");
    }
}
