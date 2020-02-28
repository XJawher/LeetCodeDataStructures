package queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lipc
 */
public class MyCircularQueue {
    /**
     * 这里需要如下的方法
     * MyCircularQueue(k): 构造器，设置队列长度为 k 。
     * Front: 从队首获取元素。如果队列为空，返回 -1 。
     * Rear: 获取队尾元素。如果队列为空，返回 -1 。
     * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
     * deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
     * isEmpty(): 检查循环队列是否为空。
     * isFull(): 检查循环队列是否已满。
     */

    /**
     * 声明队列
     */
    private List<Integer> data;

    // 首行索引
    private int headIndex;
    // 尾部索引
    private int tailIndex;

    /**
     * 构造方法，设置队列的长度
     */
    public MyCircularQueue(int length) {
        data = new ArrayList<>(length);
        headIndex = 0;
        tailIndex = 0;
    }

    /**
     * 如果是空数组，那么就返回 -1，如果不是空的就返回正常值
     *
     * @return int
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return data.get(headIndex);
    }

    /**
     * 给队列添加新的元素，添加成功返回 true
     *
     * @param value
     * @return true
     */
    public boolean enQueue(int value) {
        data.add(value);
        headIndex++;
        System.out.println(data + "  data.size() = " + data.size());
        return true;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            data.remove(tailIndex);
            System.out.println(data + "from deQueue ====>>>>  data.size() = " + data.size());
            return true;
        }
        System.out.println(data + "from deQueue isEmpty? yes !!! data.size() = " + data.size());
        return false;
    }

    /**
     * 获取队尾的元素
     *
     * @return int
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data.get(tailIndex);
    }

    /**
     * 为何是头索引的值要大于数组的长度？？？
     *
     * @return
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 判断是否满的逻辑
     * 当 isEmpty 是真的时候，说明一定是没有满的
     * 当 isEmpty 是假，并且 data.size () === data 的容量的时候，就说明是满足的已经满了的条件的
     *
     * @return
     */
    public boolean isFull() {
        if (!isEmpty()) {
            return false;
        } else {
            return headIndex == data.size();
        }
    }

}
