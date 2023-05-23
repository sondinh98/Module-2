import java.util.Arrays;

public class SelectionSort {
    static double[] list = {16, 3, 25, 10, 5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currenMin = list[i];
            int currenMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currenMin > list[j]) {
                    currenMin = list[j];
                    currenMinIndex = j;
                }
            }
            if (currenMin != i) {
                list[currenMinIndex] = list[i];
                list[i] = currenMin;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(list));
        System.out.println();
        System.out.println("Mảng sau khi được sắp xếp");
        selectionSort(list);
        System.out.println(Arrays.toString(list));

    }
}
