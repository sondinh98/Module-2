import java.util.Scanner;
public class in_20_SNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố : ");
        int number = sc.nextInt();

        int count = 0;

        int N = 2;

        while (count < number) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
