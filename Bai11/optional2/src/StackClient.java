public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.println("2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operation: " + stack.size());
    }
}
