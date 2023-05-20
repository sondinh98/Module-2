import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();
        for (int i = 0; i < input.length(); i ++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()) {
            char c1 = stack.pop();
            char c2 = queue.remove();
            if (c1 != c2) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Chuoi " + input + " la chuoi Palindrome.");
        } else {
            System.out.println("Chuoi " + input + " khong phai la chuoi Palindmore.");
        }
    }
}
