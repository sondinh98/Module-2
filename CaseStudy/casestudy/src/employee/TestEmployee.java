package employee;

import java.util.Scanner;

public class TestEmployee {
    public void testEmployee(){
        ManageEmployee manageEmployee = new ManageEmployee();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Hiển thị danh sách nhân viên");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Sắp xếp nhân viên theo tên");
            System.out.println("5.Tính lương cho nhân viên");
            System.out.println("6.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng. Vui lòng nhập lại");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageEmployee.addEmployee();
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageEmployee.displayEmployee();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageEmployee.deleteEmployee();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageEmployee.sortEmployeeByName();
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageEmployee.caculateSalary();
                    break;
                case 6:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    return;

            }

        }
    }
}

