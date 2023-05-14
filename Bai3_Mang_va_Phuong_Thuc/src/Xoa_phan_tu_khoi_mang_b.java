import java.util.Arrays;

public class Xoa_phan_tu_khoi_mang_b {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int X = 7;

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
        int[] newArray = new int[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i ++) {
            if (i != index_del) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
