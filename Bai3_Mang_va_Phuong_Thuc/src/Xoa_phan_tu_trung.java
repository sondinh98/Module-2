public class Xoa_phan_tu_trung {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,2,7,2};

        // In mang khoi tao
        System.out.println("Mang truoc khi xoa la : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Duyet mang xoa phan tu
        int count = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == 2)
                count++;
        }
        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 2) {
                newArray[index] = array[i];
                index++;
            }
        }

        // In mang moi
        System.out.println("Mang moi la : ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
