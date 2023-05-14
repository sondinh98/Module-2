package Xay_Dung_Lop_StopWatch;

import javafx.scene.paint.Stop;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length;i++) {
            arr[i] = random.nextInt(1000);
        }
        SelectionSort stopWatch = new SelectionSort();
        stopWatch.start();
    }
}
