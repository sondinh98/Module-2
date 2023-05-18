import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        for (int i =0; i < n; i++) {
           arr[i] = stack.pop();
        }
        System.out.println("Mang sau khi dao nguoc: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
}
