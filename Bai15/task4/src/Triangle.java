import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ nhất của tam giác: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập cạnh thứ hai của tam giác: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập cạnh thứ ba của tam giác: ");
        double side3 = scanner.nextDouble();
        try {
            if (side1 <= 0 || side2 <= 0 || side3 <= 0
            || (side1 + side2) <= side3
            || (side2 + side3) <= side1
            || (side1 + side3) <= side2) {
                throw new IllegalAccessException("Cạnh của tam giác không hợp lệ!");
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Các cạnh của tam giác hợp lệ!");
    }
}
