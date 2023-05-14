import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập từ cần kiểm tra: ");
        String input = scanner.nextLine();
        boolean check = true;
        int a = input.length();
        for (int i = 0; i < a / 2; i++) {
            if (input.charAt(i) != input.charAt(a - 1 - i)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Chuỗi bạn nhập là chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi bạn nhập không phải là chuỗi đối xứng.");
        }
    }
}
