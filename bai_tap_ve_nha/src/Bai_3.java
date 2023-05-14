import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so : ");
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println("Nhap lai : ");
        } else {
            int sum = 0;
            for (int i = 2; i <= num; i++) {
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) sum += i;

            }
            System.out.println("Sum = " + sum);

        }
    }
}
