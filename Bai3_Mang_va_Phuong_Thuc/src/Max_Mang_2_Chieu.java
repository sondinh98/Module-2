import java.util.Scanner;

public class Max_Mang_2_Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng 2 chiều: ");
        System.out.println();
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng 2 chiều : ");
        System.out.println();
        int cols = scanner.nextInt();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho mảng tại hàng " + (i+1) + " và tại cột " + (j+1) + " : ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println();
        double max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng 2 chiều là : " + max + " .Tại hàng " + (maxRow +1) + " cột " + (maxCol +1) );

    }
}
