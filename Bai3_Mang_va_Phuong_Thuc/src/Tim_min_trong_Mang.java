import java.util.Scanner;

public class Tim_min_trong_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size: ");
             size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i+1)+ " : ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s","Element in array","");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("Min in array: " + min);
    }
}
