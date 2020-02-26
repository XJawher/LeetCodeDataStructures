package queue;

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        /**
         * 核心思想就是入队和出队，然后要有一个索引，指向当前的队列头部
         */
        q.inQueen(4);
        System.out.println("这是输入为 4 时候的队列首位的值：" + q.getFrontData() + "\n");
        q.inQueen(5);
        System.out.println("这是输入为 4，5 时候的队列首位的值：" + q.getFrontData() + "\n");
        q.inQueen(6);
        System.out.println("这是输入为 4，5，6 时候的队列首位的值：" + q.getFrontData() + "\n");
        q.outQueen();
        System.out.println("这是输入为 4，5，6 然后执行第一次出队的时候队列首位的值：" + q.getFrontData() + "\n");
        q.outQueen();
        System.out.println("这是输入为 4，5，6 然后执行第二次出队的时候队列首位的值：" + q.getFrontData() + "\n");
        q.outQueen();
        System.out.println("这是输入为 4，5，6 然后执行第三次出队的时候队列首位的值：" + q.getFrontData() + "\n");
    }
}
