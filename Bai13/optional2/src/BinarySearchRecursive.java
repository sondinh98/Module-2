import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();
        int index = binarySearch(array,0,size -1, value);
        if (index == -1) {
            System.out.println("Giá trị bạn nhập không tồn tại trong mảng.");
        } else {
            System.out.println("Giá trị bạn nhập được tìm thấy trong mảng.");
        }
    }
    public static int binarySearch(int[] array, int left, int right, int value) {
        left = 0;
        right = array.length -1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (value == array[mid]) {
                return mid;
            } else if (value > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
