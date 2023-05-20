import java.util.*;

public class BracketChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biểu thức cần kiểm tra: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    System.out.println("False");
                    return;
                } else {
                    char left = stack.pop();
                    if ((left == '(' && c != ')') || (left == '{' && c != '}') || (left == '[' && c != ']')) {
                        System.out.println("False");
                        return;
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}