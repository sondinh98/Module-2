import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> productList = new ArrayList<Product>();
    private Scanner scanner = new Scanner(System.in);
    public ProductManager() {
        productList.add(new Product("Áo T-Shirt",200000,20));
        productList.add(new Product("Mũ lưỡi trai",150000,10));
        productList.add(new Product("Áo dài tay",160000,15));
        productList.add(new Product("Quần vải Kaki",200000,30));
    }
    public void addProduct(){
//        System.out.println("Nhập mã sản phẩm: ");
//        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sảm phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(name,price,quantity);
        productList.add(newProduct);
        System.out.println("Thêm sản phẩm thành công: " + newProduct);

    }
    public void editProduct(){
        System.out.println("Nhập mã ID sản phẩm cần sửa thông tin");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < productList.size(); i ++) {
            if (productList.get(i).getId() == id) {
                System.out.println("Nhập tên sản phẩm mới: ");
                String productName = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm mới: ");
                int productPrice = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số lượng sản phẩm mới: ");
                int productQuantity = Integer.parseInt(scanner.nextLine());
                productList.get(i).setName(productName);
                productList.get(i).setPrice(productPrice);
                productList.get(i).setQuantity(productQuantity);
                System.out.println("Thông tin sản phẩm mới đã được cập nhập.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có id là : " + id);
        }


    }
    public void deleteProduct() {
        System.out.println("Nhập id sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                System.out.println("Xóa sản phẩm thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có id là: " + id);
        }
    }
    public void showProduct(){
        if (productList.isEmpty()) {
            System.out.println("Danh sach san pham trong");
        } else {
            System.out.println("Danh sach san pham:");
            for (Product product : productList) {
                System.out.println(product);
            }
        }

    }
    public void searchProductByName(){
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Tên sản phẩm bạn tìm kiếm không có trong danh sách.");
        }
    }
    public void sortProductAscending(){
        Collections.sort(productList, new ProductPriceComparatorAsc());
        System.out.println("Danh sách sản phẩm tăng dần theo giá là: ");
        showProduct();
    }
    public void sortProductDescending(){
        Collections.sort(productList,new ProductPriceComparatorDesc());
        System.out.println("Danh sách sản phẩm giảm dần theo giá là: ");
        showProduct();
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