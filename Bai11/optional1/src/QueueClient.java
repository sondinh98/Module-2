public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.enqueue(16);
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(25);
        queue.enqueue(10);
        queue.dequeue();
    }
}
