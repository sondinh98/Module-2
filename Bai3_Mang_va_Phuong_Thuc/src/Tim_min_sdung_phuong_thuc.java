
public class Tim_min_sdung_phuong_thuc {
    public static void main(String[] args) {
        int[] arr = {4,3,7,23,12,43,78,4,6,4,39};
        int index = minValue(arr);
        System.out.println("Gia tri nho nhat: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
