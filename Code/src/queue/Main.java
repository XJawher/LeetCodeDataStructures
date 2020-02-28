package queue;

public class Main {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.print("开始插入元素 1，插入结果是：" + circularQueue.enQueue(1) + "\n");
        System.out.print("开始插入元素 2，插入结果是：" + circularQueue.enQueue(2) + "\n");
        System.out.print("开始插入元素 3，插入结果是：" + circularQueue.enQueue(3) + "\n");
        System.out.print("开始插入元素 4，插入结果是：" + circularQueue.enQueue(4) + "\n");
        System.out.print("开始返回最后插入元素 3，返回结果是：" + circularQueue.Rear() + "\n");
        System.out.print("开始检查是否已经满员，返回结果是：" + circularQueue.isFull() + "\n");
        System.out.print("开始删除队列元素，返回结果是：" + circularQueue.deQueue() + "\n");
        System.out.print("开始删除队列元素，返回结果是：" + circularQueue.deQueue() + "\n");
        System.out.print("开始插入元素 4，插入结果是：" + circularQueue.enQueue(4) + "\n");
        System.out.print("开始插入元素 4，插入结果是：" + circularQueue.enQueue(4) + "\n");
        System.out.print("开始插入元素 4，插入结果是：" + circularQueue.enQueue(4) + "\n");
        System.out.print("开始返回最后插入元素 4，返回结果是：" + circularQueue.Rear() + "\n");
        System.out.print("开始删除队列元素，返回结果是：" + circularQueue.deQueue() + "\n");
        System.out.print("开始删除队列元素，返回结果是：" + circularQueue.deQueue() + "\n");
        System.out.print("开始删除队列元素，返回结果是：" + circularQueue.deQueue() + "\n");
        System.out.print("开始返回最后插入元素 4，返回结果是：" + circularQueue.Rear() + "\n");
    }
}
