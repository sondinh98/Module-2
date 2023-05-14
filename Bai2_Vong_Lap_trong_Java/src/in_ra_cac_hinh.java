import java.util.Scanner;
public class in_ra_cac_hinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1.In hình chữ nhật");
            System.out.println("2.In tam giác vuông botton-left");
            System.out.println("3.In tam giác vuông top-left");
            System.out.println("4.In tam giác vuông botton-right");
            System.out.println("5In tam giác vuông top-right");
            System.out.println("6.In tam giac cân");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // In hình chữ nhật
                    int width, height;
                    System.out.print("Nhập chiều dài: ");
                    width = input.nextInt();
                    System.out.print("Nhập chiều rộng: ");
                    height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    // In tam giác vuông botton-left
                    int size1;
                    System.out.print("Nhập kích thước của tam giác vuông: ");
                    size1 = input.nextInt();
                    for (int i = 1; i <= size1; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // In tam giác vuông top-left
                    int size2;
                    System.out.println("Nhập kích thước của tam giác vuông: ");
                    size2 = input.nextInt();
                    for (int i = size2; i >= 1; i--){
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    // In tam giác vuông botton-right
                    int size3;
                    System.out.println("Nhập kich thước của tam giác vuông: ");
                    size3 = input.nextInt();
                    for (int i = 0; i < size3; i++) {
                        for (int j = 0; j < (size3 - (i +1)); j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < (size3 -(size3 - (i+1))); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    // In tam giác vuông top-right
                    int size4;
                    System.out.println("Nhập kích thước của tam giác vuông: ");
                    size4 = input.nextInt();
                    for (int i = 0; i < size4; i++) {
                        for (int j = 0; j < (size4 -(size4-i)); j ++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <  (size4 -i); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    // In tam giác cân
                    int size;
                    System.out.println("Nhập kích thước của tam giác: ");
                    size = input.nextInt();
                    for (int i = 0; i < size; i ++) {
                        for (int j = size - i; j > 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i*2 +1 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }
    }
}
