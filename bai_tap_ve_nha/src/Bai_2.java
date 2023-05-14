import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so bat dau: ");
        int start = scanner.nextInt();
        System.out.println("Nhap so ket thuc: ");
        int end = scanner.nextInt();
        System.out.println("Các số hoàn hảo trong khoảng trên là: ");
        for (int i = start; i <= end; i++){
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j ;
                }
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}
