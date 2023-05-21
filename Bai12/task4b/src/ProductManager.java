import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    LinkedList<Product> products = new LinkedList<Product>();
    Scanner scanner = new Scanner(System.in);
    public ProductManager() {
        products.add(new Product("Ổi ", 20000, 100));
        products.add(new Product("Xoài", 25000, 150));
        products.add(new Product("Cóc", 15000, 250));
        products.add(new Product("Cam", 30000, 225));
        products.add(new Product("Mân", 25000, 300));
    }
    public void show() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng");
        } else {
            System.out.println("Danh sách sản phẩm: ");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
    public void addProduct() {
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhâp số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(name,price,quantity);
        products.add(newProduct);
        System.out.println("Thêm sản phẩm thành công.");
    }
    public void editProduct() {
        System.out.println("Nhập Id sản phẩm cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("Nhập tên sảm phẩm cần sửa: ");
                String name = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm cần sửa: ");
                double price = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số lượng sản phẩm: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                products.get(i).setName(name);
                products.get(i).setQuantity(quantity);
                products.get(i).setPrice(quantity);
                System.out.println("Thông tin sản phẩm đa được cập nhập.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có tên Id là: " + id);
        }
    }
    public void deleteProduct() {
        System.out.println("Nhập id sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                System.out.println("Xóa sản phẩm thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có id là : " + id);
        }
    }
    public void searchProductByName() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }
    public void sortProductAscending() {
        Collections.sort(products, new ProductPriceComparatorAsc());
        System.out.println("Danh sách sản phẩm được sắp xếp tăng dần là: ");
        show();
    }
    public void sortProductDescending() {
        Collections.sort(products, new ProductPriceComparatorDesc());
        System.out.println("Danh sách sản phầm được sắp xếp giảm dần là: ");
        show();
    }
    public class ProductPriceComparatorAsc implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public class ProductPriceComparatorDesc implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice() > o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() < o2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
