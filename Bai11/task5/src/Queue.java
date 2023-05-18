public class Queue {
    private Node rear; // phần tử được đưa vào cuối cùng trong hàng đợi
    private Node front; // phần tử được đưa vào đầu tiên trong hàng đợi

    // định nghĩa lớp Node để đại diện cho từng phần tử trong hàng đợi
    private class Node {
        int data;
        Node next;
    }

    // hàm thêm phần tử vào hàng đợi
    public void enQueue(int value) {
        Node node = new Node();
        node.data = value;

        // kiểm tra hàng đợi trống hay không
        if (front == null) {
            front = node;
            rear = node;
            rear.next = front; // vòng liên kết vòng
        } else {
            rear.next = node;
            rear = node;
            rear.next = front; // vòng liên kết vòng
        }
    }

    // hàm lấy phần tử khỏi hàng đợi
    public int deQueue() {
        // kiểm tra hàng đợi trống hay không
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = front.data;
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.next;
                rear.next = front; // vòng liên kết vòng
            }
            return value;
        }
    }

    // hàm in ra các phần tử trong hàng đợi
    public void display() {
        // kiểm tra hàng đợi trống hay không
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != front);
            System.out.println();
        }
    }
}
