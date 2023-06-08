package customer;

import customer.Customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManageCustomer {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Customer> customers = new ArrayList<>();
    private final String FILE_NAME = "customers.txt";

    public ManageCustomer() {
        customers = loadCustomers();
    }

    public void addCustomer() {
        System.out.println("Nhập tên khách hàng:");
        String name = scanner.nextLine();

        String phoneRegex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(phoneRegex);

        String phone;
        while (true) {
            System.out.println("Nhập số điện thoại (10 chữ số):");
            phone = scanner.nextLine();
            Matcher matcher = pattern.matcher(phone);
            if (matcher.matches()) {
                break;
            } else {
                System.err.println("Số điện thoại không hợp lệ!");
            }
        }

        Customer customer = new Customer(name, phone);
        customers.add(customer);
        saveCustomers(customers);
        System.out.println("Thêm khách hàng thành công!");
    }

    public void showCustomers() {
        System.out.printf("%-20s%-20s\n", "Tên khách hàng", "Số điện thoại");
        for (Customer customer : customers) {
            System.out.printf("%-20s%-20s\n", customer.getName(), customer.getPhone());
        }
    }

    private void saveCustomers(ArrayList<Customer> customers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("customer.txt"))) {
            for (Customer customer : customers) {
                writer.write(customer.getName() + "," + customer.getPhone());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi dữ liệu vào file!");
            e.printStackTrace();
        }
    }

    private ArrayList<Customer> loadCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("customer.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String phone = fields[1];
                Customer customer = new Customer(name, phone);
                customers.add(customer);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc dữ liệu từ file!");
            e.printStackTrace();
        }
        return customers;
    }
}