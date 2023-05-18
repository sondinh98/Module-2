public class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public boolean isFull() {
        return (top == maxSize -1);
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public void push ( int value) {
        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }
        stackArray[++top] = value;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

}
