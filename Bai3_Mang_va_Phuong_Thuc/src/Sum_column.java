import java.util.Scanner;

public class Sum_column {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {2,3,4,5},
                {4,5,6,7}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri cot muon tinh tong: ");
        int col = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length;i++) {
            sum += arr[i][col-1];
        }
        System.out.print("Tong cac phan tu cua cot " + col + " la " + sum);
    }
}
