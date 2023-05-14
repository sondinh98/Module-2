public class Bai_5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) sum += i;
        }
        System.out.println("Tổng các SNT có hai chữ số là : " + sum );
    }
}
