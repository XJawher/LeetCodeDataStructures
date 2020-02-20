# 队列
>队列是一种先入先出的数据结构
![队列图](https://aliyun-lc-upload.oss-cn-hangzhou.aliyuncs.com/aliyun-lc-upload/uploads/2018/08/14/screen-shot-2018-05-03-at-151021.png)

在 FIFO 结构中将首先处理 **队列中的第一个元素**
新元素始终是放在队列的**末尾的元素**，插入（insert）的操作也称之为入队（enqueue），而要移除一个元素也必须是第一个元素也就是称之为出队（dequeue），移除只能移除**第一个元素**

# 队列的实现
为了实现队列我们可以使用动态数组和指向队列头部的索引
这样的话队列是有两种特性的，一个就是这个队列的长度属性，一个就是可以操作队列出队和进队的属性。入队可以给队列添加一个元素，出队则可以给队列删除一个元素。           
代码实现
```java
// "static void main" must be defined in a public class.

class MyQueue {
    // store elements
    private List<Integer> data;         
    // a pointer to indicate the start position
    private int p_start;            
    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    /** Insert an element into the queue. Return true if the operation is successful. */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    };    
    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }
    /** Get the front item from the queue. */
    public int Front() {
        return data.get(p_start);
    }
    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return p_start >= data.size();
    }     
};

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }
}
```



