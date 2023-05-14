import java.util.Scanner;

public class uoc_chung_max {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a : ");
        int a;
        a = input.nextInt();
        System.out.println("Nhap so b : ");
        int b;
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
