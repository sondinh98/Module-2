import java.util.Scanner;

public class Dem_so_lan_xuat_hien_ky_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        System.out.println("Nhap ky tu can dem: ");
        char a = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + a + " la " + count);
    }
}
