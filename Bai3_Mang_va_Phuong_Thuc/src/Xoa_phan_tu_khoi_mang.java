import java.util.Arrays;
import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập phần tử muốn xóa: ");
        int X = scanner.nextInt();
        int[] array = {1,2,3,4,5,6,7};
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử cần xóa trong mảng");
            return;
        }
        for (int i = index_del;i < array.length -1; i++) {
            array[i] = array[i+1];
        }
        array = Arrays.copyOf(array, array.length-1 );

        System.out.println(Arrays.toString(array));
    }
}
