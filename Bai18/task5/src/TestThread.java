public class TestThread {
    public static void main(String[] args) {
        OldThread oldThread = new OldThread();
        EvenThread evenThread = new EvenThread();
        oldThread.start();
        evenThread.start();
    }
}
