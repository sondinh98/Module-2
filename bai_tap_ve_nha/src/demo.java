import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số đầu tiên của khoảng: ");
        int start = scanner.nextInt();
        System.out.print("Nhập số cuối cùng của khoảng: ");
        int end = scanner.nextInt();

        System.out.print("Các số hoàn hảo trong khoảng từ " + start + " đến " + end + " là: ");
        for (int i = start; i <= end; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
