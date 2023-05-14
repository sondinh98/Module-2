import java.util.Scanner;

public class Tim_max_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhap kich thuoc mang: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kich thuoc mang khong vuot qua 20.");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhap phan tu thu " + (i+1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mang vua nhap la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j =0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j +1;
            }
        }
        System.out.println("Max cua mang la " + max + " tai vi tri " + index);
    }
}
