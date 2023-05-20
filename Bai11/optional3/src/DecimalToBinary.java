import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thap phan can chuyen doi: ");
        int decimal = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        while (decimal > 0) {
            int remainder = decimal / 2;
            stack.push(remainder);
            decimal /= 2;
        }
        System.out.println("Ket qua chuyen doi sang hej nhi phan la: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
