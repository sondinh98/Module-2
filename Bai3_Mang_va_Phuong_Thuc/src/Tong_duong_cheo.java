import java.util.Scanner;

public class Tong_duong_cheo {
    public static void main(String[] args) {
        int[][] array = {
                {5,2,3},
                {2,7,4},
                {4,5,6}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Mang can tinh tong duong cheo la: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (i == j) sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println("Tong cua duong cheo chinh la: "+ sum);

    }
}
