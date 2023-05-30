import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, maxLength = 0;
        while (i < input.length()) {
            char c = input.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                maxLength = Math.max(maxLength, set.size());
                i++;
            } else {
                set.remove(input.charAt(j));
                j++;
            }
        }
        System.out.println("Chuỗi con có độ dài lớn nhất không chứa các ký tự lặp lại: " + maxLength);
    }
}