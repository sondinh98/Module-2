import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 2, 3, 4, 5};

        // In mảng trước khi xóa phần tử
        System.out.println("Mảng trước khi xóa phần tử: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Duyệt mảng và xóa phần tử
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 2) {
                array[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array));

        // Giảm độ dài của mảng bằng số phần tử bị xóa
        int newLength = index;
        int[] newArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArray[i] = array[i];
        }

        // In mảng sau khi xóa phần tử
        System.out.println("Mảng sau khi xóa phần tử: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
}
