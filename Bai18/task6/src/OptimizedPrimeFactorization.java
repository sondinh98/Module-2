public class OptimizedPrimeFactorization implements Runnable{
    private int current = 2;

    public void run() {
        while (true) {
            if (isPrime(current)) {
                System.out.println("Optimized Prime Factorization: " + current);

            }
            current++;
        }
    }
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i =2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
