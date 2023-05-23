public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 2, 5};
        insertionSort(arr);

    }

    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
            System.out.print("Bước " + i + " :");
            for (int value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
