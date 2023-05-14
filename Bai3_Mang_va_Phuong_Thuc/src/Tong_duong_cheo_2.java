import java.util.Scanner;

public class Tong_duong_cheo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int rows = sc.nextInt();
        System.out.println("Nhap so cot: ");
        int cols = sc.nextInt();
        System.out.println();

        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap gia tri cho mang tai hang " + (i+1) + " tai cot " + (j+1) + " ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Mang hinh vuong vua nhap la: ");
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (i == j) sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Tong hinh cheo cua hinh vuong la: " + sum);
    }
}
