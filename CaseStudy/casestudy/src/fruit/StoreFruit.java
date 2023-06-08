package fruit;

import java.util.Scanner;

public class StoreFruit {
    public void storeFruit() {
        Scanner scanner = new Scanner(System.in);
        ManageFruit manageFruit = new ManageFruit();
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Hiển thị danh sách sản phẩm");
            System.out.println("3.Sửa sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("6.Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("7.Tìm kiếm sản phẩm theo tên");
            System.out.println("8.Tìm kiếm sản phẩm theo Id");
            System.out.println("0.Thoát");
            System.out.println("Mời bạn lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageFruit.addFruit();
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageFruit.sortByName();
                    manageFruit.showFruit();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageFruit.editFruit();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageFruit.deleteFruit();
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageFruit.sortByPriceAscending();
                    break;
                case 6:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageFruit.sortByPriceDescending();
                    break;
                case 7:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageFruit.searchByName();
                    break;
                    case 8:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    manageFruit.searchById();
                    break;

                case 0:
                    return;

            }

        }
    }
}
