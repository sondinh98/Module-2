import java.util.Arrays;
import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        int[] array1 = new int[2];
        int[] array2 = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập giá trị cho mảng 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Gia tri thu " + (i+1) + " cua mang 1 la: ");
            array1[i] = input.nextInt();
        }
        System.out.println("Nhập giá trị cho mảng 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Gia tri thu " + (i+1) + " cua mang 2 la: ");
            array2[i] = input.nextInt();
        }

        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("Mang 3 sau khi gop la : ");
        System.out.println(Arrays.toString(array3));
    }
}
