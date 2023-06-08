
package employee;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManageEmployee {
    private ArrayList<Employee> employees;
    private Scanner scanner;

    public ManageEmployee(){
        employees = new ArrayList<>();
        scanner = new Scanner(System.in);
        FullTimeEmployee employee1 = new FullTimeEmployee(123123,"Nguyễn Văn A","01-01-1999" ,"Nam",2.0);
        FullTimeEmployee employee2 = new FullTimeEmployee(123456,"Trần Quang B","02-02-2000" ,"Nam",1.5);
        PartTimeEmployee employee3 = new PartTimeEmployee(112233,"Nguyễn Thị C","03-03-2001","Nữ",40);
        PartTimeEmployee employee4 = new PartTimeEmployee(212121,"Võ Văn T","04-04-2002","Nữ",30);
        PartTimeEmployee employee5 = new PartTimeEmployee(233223,"Hoàng Thị P","05-05-2001","Nữ",35);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        readDataFromFile();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            writeDataToFile();
        }));
    }
    public void addEmployee() {
        System.out.println("Nhập id nhân viên (6 số): ");
        String regexId = "^\\d{6}$";
        String id;
        while (true) {
            id = scanner.nextLine();
            if (id.matches(regexId)) {
                int intId = Integer.parseInt(id);
                for (Employee employee : employees) {
                    if (employee.getId() == intId) {
                        System.err.println("Mã nhân viên đã tồn tại!");
                        return;
                    }
                }
                break;
            } else {
                System.err.println("Mã nhân viên không hợp lệ! Hãy nhập lại (6 số).");
            }
        }
        System.out.println("Nhập họ và tên nhân viên: ");
        String name = scanner.nextLine();
        String regexBirthday = "^\\d{2}-\\d{2}-\\d{4}$";
        String birthday;
        while (true) {
            System.out.println("Nhập ngày tháng năm sinh (dd-mm-yyyy): ");
            birthday = scanner.nextLine();
            if (birthday.matches(regexBirthday)) {
                break;
            } else {
                System.err.println("Định dạng ngày sinh không hợp lệ! Hãy nhập lại.");
            }
        }
        String regexGender = "^(Nam|Nữ)$";
        String gender;
        while (true) {
            System.out.println("Nhập giới tính nhân viên (Nam/Nữ): ");
            gender = scanner.nextLine();
            if (gender.matches(regexGender)) {
                break;
            } else {
                System.err.println("Định dạng giới tính không hợp lệ! Hãy nhập lại.");
            }
        }
        String regexType = "^(FT|PT)$";
        String type;
        while (true) {
            System.out.println("Nhập loại nhân viên (FT/PT): ");
            type = scanner.nextLine();
            if (type.matches(regexType)) {
                break;
            } else {
                System.err.println("Định dạng loại nhân viên không hợp lệ! Hãy nhập lại.");
            }
        }
        if (type.equalsIgnoreCase("FT")) {
            double heSoLuong = 0;
            while (heSoLuong == 0) {
                try {
                    System.out.println("Nhập hệ số lương: ");
                    heSoLuong = Double.parseDouble(scanner.nextLine());
                } catch (Exception e) {
                    System.err.println("Hệ số lương nhập không hợp lệ. Hãy nhập một số.");
                    scanner.nextLine();
                }
            }
            FullTimeEmployee employee = new FullTimeEmployee(Integer.parseInt(id),name,birthday,gender,heSoLuong);
            employees.add(employee);
            System.out.println("Thêm nhân viên FT thành công");
            writeDataToFile();
        } else if (type.equalsIgnoreCase("PT")) {
            int soGioLam = 0;
            while (soGioLam == 0) {
                try {
                    System.out.println("Nhập số giờ làm: ");
                    soGioLam = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.err.println("Số giờ làm việc không hợp lệ! Hãy nhập lại một số.");
                }
            }
            PartTimeEmployee employee = new PartTimeEmployee(Integer.parseInt(id),name,birthday,gender,soGioLam);
            employees.add(employee);
            System.out.println("Thêm nhân viên PT thành công");
            writeDataToFile();
        } else {
            System.err.println("Loại nhân viên không hợp lệ!");
        }
    }

    public void displayEmployee() {
        System.out.println("Danh sách nhân viên: ");
        System.out.printf("%-10s%-20s%-20s%-10s%-20s","ID","Họ và tên","Sinh nhật", "Gới tính","Vị trí\n");
        System.out.println();
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
    public void deleteEmployee() {
        int id;
        while (true) {
            System.out.println("Nhập mã nhân viên cần xóa: ");
            id = Integer.parseInt(scanner.nextLine());
            if (id == 123123) {
                System.err.println("Không thể xóa tài khoản có ID là 123123!");
            } else {
                break;
            }
        }
        boolean check = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Xóa nhân viên thành công!");
                writeDataToFile();
                check = true;
                break;
            }
        }
        if (!check) {
            System.err.println("Không tìm thấy nhân viên có mã id: " + id);
        }
    }
    public void sortEmployeeByName() {
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("Danh sách nhân viên theo tên: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
    public void caculateSalary() {
        System.out.println("Nhập mã nhân viên cần tính lương: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Lương cửa nhân viên " + employee.getName() + " la " + employee.getSalary() + " VND");
                check = true;
                break;
            }
        }
        if (!check)
            System.err.println("Không tìm thấy nhân viên có mã id: " + id);
    }
    public void employeeName() {
        System.out.println("Nhập id nhân viên: ");
        int id = Integer.parseInt(scanner.nextLine());
    }
    public String employeeName(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e.getName();
            }
        }
        return "";
    }
    public void readDataFromFile() {
        try {
            FileReader fileReader = new FileReader("employee.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String birthay = data[2];
                String gender = data[3];
                if (data[4].equalsIgnoreCase("FT")) {
                    double heSoLuong = Double.parseDouble(data[5]);
                    FullTimeEmployee employee = new FullTimeEmployee(id, name, birthay, gender, heSoLuong);
                    employees.add(employee);
                } else if (data[4].equalsIgnoreCase("PT")) {
                    int soGioLam = Integer.parseInt(data[5]);
                    PartTimeEmployee employee = new PartTimeEmployee(id, name, birthay, gender, soGioLam);
                    employees.add(employee);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Lỗi đọc dữ liệu từ file");
        }
    }
    public void writeDataToFile() {
        try {
            FileWriter fileWriter = new FileWriter("employee.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employees) {
                String data = employee.getId() + "," + employee.getName() + "," + employee.getBirthday() + "," + employee.getGender() + "," + employee.getClass().getSimpleName() + ",";
                if (employee instanceof FullTimeEmployee) {
                    FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
                    data += fullTimeEmployee.getHeSoLuong() + "\n";
                } else if (employee instanceof PartTimeEmployee) {
                    PartTimeEmployee partTimeEmployee = (PartTimeEmployee) employee;
                    data += partTimeEmployee.getSoGioLam() + "\n";
                }
                bufferedWriter.write(data);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Lỗi ghi dữ liệu vào file");
        }
    }
}
