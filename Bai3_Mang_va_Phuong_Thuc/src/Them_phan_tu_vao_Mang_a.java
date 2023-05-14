import java.util.Arrays;
import java.util.Scanner;

public class Them_phan_tu_vao_Mang_a {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị cần thêm vào mảng: ");
        int X = input.nextInt();
        System.out.println("Nhập vij trí muốn thêm vào mảng: ");
        int index = input.nextInt();

        if (index < 0 || index > array.length -1) {
            System.out.println("Khong chen duoc phan tu vao mang.");
        }

        int[] newArray = new int[array.length+1];
        for (int i = 0,j = 0; i < array.length +1; i++) {
            if ((i) == index) {
                newArray[i] = X;
            } else {
                newArray[i] = array[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
