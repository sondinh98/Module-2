import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1.Hiển thị toàn bộ sản phầm.");
            System.out.println("2.Thêm sản phẩm.");
            System.out.println("3.Sủa thông tin sản phẩm.");
            System.out.println("4.Xóa sản phẩm theo id.");
            System.out.println("5.Tìm kiếm sản phẩm theo tên.");
            System.out.println("6.Sắp xếp sản phẩm theo giá tăng dần.");
            System.out.println("7.Sắp xếp sản phẩm theo giá giảm dần.");
            System.out.println("0.Thoát chương trình.");
            System.out.println("----------------------------------------------------------");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.show();
                    System.out.println("----------------------------------------------------------");
                    break;
                case 2:
                    productManager.addProduct();
                    System.out.println("----------------------------------------------------------");
                    break;
                case 3:
                    productManager.editProduct();
                    System.out.println("----------------------------------------------------------");
                    break;
                case 4:
                    productManager.deleteProduct();
                    System.out.println("----------------------------------------------------------");
                    break;
                case 5:
                    productManager.searchProductByName();
                    System.out.println("----------------------------------------------------------");
                    break;
                case 6:
                    productManager.sortProductAscending();
                    System.out.println("----------------------------------------------------------");
                    break;
                case 7:
                    productManager.sortProductDescending();
                    System.out.println("----------------------------------------------------------");
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
