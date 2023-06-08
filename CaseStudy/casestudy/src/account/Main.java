package account;

import customer.ManageCustomer;
import employee.ManageEmployee;
import employee.TestEmployee;
import fruit.ManageFruit;
import fruit.StoreFruit;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ManageEmployee manageEmployee = new ManageEmployee();

        Account admin = new Account("admin","admin",123123,true);
        accounts.add(admin);
        boolean loggedIn = false;
        Account currentUser = null;
        while (!loggedIn) {
            System.out.println("1.Đăng nhập");
            System.out.println("2.Đăng kí");
            System.out.println("3.Thoát");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Vui lòng nhập số từ 1 đến 3.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Bạn đang đang nhập");
                    System.out.println("Tên đăng nhập: ");
                    String username = scanner.nextLine();
                    System.out.println("Mật khẩu: ");
                    String password = scanner.nextLine();
                    for (Account account : accounts) {
                        if (account.getUsername().equals(username) &&
                        account.getPassword().equals(password)) {
                            loggedIn = true;
                            currentUser = account;
                            String name = manageEmployee.employeeName(account.getEmployeeID());
                            System.out.println("Xin chào " + name);
                            break;
                        }
                    }
                    if (loggedIn) {
                        if (currentUser.isAdmin()) {
                            boolean check = true;
                            while (check) {
                                System.out.println("Đăng nhập thành công với tài khoản admin");
                                System.out.println("Menu: ");
                                System.out.println("1.Quản lý sản phẩm");
                                System.out.println("2.Quản lý nhân viên");
                                System.out.println("3.Hiển thị danh sách khách hàng");
                                System.out.println("0.Quay lại");
                                int choice1 = 0;
                                try {
                                    choice1 = Integer.parseInt(scanner.nextLine());
                                } catch (Exception e) {
                                    System.out.println("Nhập sai định dạng. Mời bạn nhập lại");
                                    continue;
                                }
                                switch (choice1) {
                                    case 1:
                                        StoreFruit mainFruit = new StoreFruit();
                                        mainFruit.storeFruit();
                                        break;
                                    case 2:
                                        TestEmployee testEmployee = new TestEmployee();
                                        testEmployee.testEmployee();
                                        break;
                                    case 3:
                                        ManageCustomer manageCustomer = new ManageCustomer();
                                        manageCustomer.showCustomers();
                                        break;
                                    case 0:
                                        check = false;
                                        break;

                                }
                            }

                        } else {
                            System.out.println("Đăng nhập thành công với tài khoản nhân viên");
                            boolean check = true;
                            while (check) {
                                System.out.println("Menu: ");
                                System.out.println("1.Thêm khách hàng");
                                System.out.println("2.Tạo đơn hàng");
                                System.out.println("3.Thoát");
                                System.out.println("Mời bạn lựa chọn");
                                int choice2 = Integer.parseInt(scanner.nextLine());
                                switch (choice2) {
                                    case 1:
                                        ManageCustomer manageCustomer = new ManageCustomer();
                                        manageCustomer.addCustomer();
                                        break;
                                    case 2:
                                        ManageFruit manageFruit = new ManageFruit();
                                        manageFruit.showFruit();
                                        manageFruit.buyFruit();
                                        break;
                                    case 3:
                                        check =false;
                                        break;
                                }
                            }
                        }
                    } else {
                        System.err.println("Đăng nhập không thành công. vui lòng thử lại.");
                    }
                    break;
                case 2:
                    System.out.println("Bạn đang đăng kí tài khoản");
                    System.out.println("Tên đăng nhập: ");
                    String newUsername = scanner.nextLine();
                    System.out.println("Mật khẩu: ");
                    String newPassword = scanner.nextLine();
                    Account newAccount = new Account(newUsername,newPassword,1,false);
                    accounts.add(newAccount);
                    System.out.println("Đăng kí tài khoản thành công.");
                    break;
                case 3:
                    System.out.println("Tạm biệt");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng lựa chọn từ 1 đến 3");
                    break;
            }
            loggedIn = false;
        }

    }

}
