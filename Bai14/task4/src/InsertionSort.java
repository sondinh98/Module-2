public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {16,3,25,20,10};
        sort(arr);
    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int key = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = key;
            System.out.println();
            System.out.print("Bước " + i + ": ");
            printArray(arr);
        }
    }
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
