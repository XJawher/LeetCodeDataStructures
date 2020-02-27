package queue;

public class Main {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(10);
        circularQueue.enQueue(1);
        circularQueue.deQueue();
        circularQueue.deQueue();
        circularQueue.enQueue(3);
    }
}
