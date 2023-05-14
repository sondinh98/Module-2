import java.util.Scanner;
public class bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vi tri so nguyen to can tim: ");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        while (count < n) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                if (count == n) {
                    System.out.println("SNT tai vi tri " + n +" la: " + num);
                }
            }
            num++;
        }
    }
}