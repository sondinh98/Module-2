public class LazyPrimeFactorization implements Runnable {
    private int current = 2;

    @Override
    public void run() {
        while (true) {
            if (isPrime(current)) {
                System.out.println("Lazy PrimeFactorization: " + current);
            }
            current++;
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
