import java.util.Scanner;

public class TT_dem_so_luong_sv_thi_do {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < size; i ++) {
            System.out.print("Enter a mark for student " + (i+1)+ ": ");
            array[i] = sc.nextInt();
        }
        int count = 0;
        System.out.printf("%-20s%s" , "List of mark: " , "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println();
        System.out.print("The number of students passing the exam is " + count);
    }
}
