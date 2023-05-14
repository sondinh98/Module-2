import java.util.Scanner;

public class Sum_column2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.print("Nhập số cột của mảng: ");
        int cols = sc.nextInt();
        System.out.println();

        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho mảng tại hàng " + (i + 1) + " tại cột " + (j + 1) + ":");
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Mảng đã nhập là: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Nhập cột muốn tính tổng: ");
        int col = sc.nextInt();
        if (col > 0 && col <= cols) {
            double sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][(col-1)];
                    System.out.println(sum);
            }
            System.out.println("Tổng của cột là : " + sum);
        } else
            System.out.println("Nhập lại cột phù hợp.");

    }
}
