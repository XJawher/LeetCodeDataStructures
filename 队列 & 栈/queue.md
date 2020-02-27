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

## 设计循环队列
在上面的代码中实现了一个简单低效的队列实现，但是有一种更加有效的队列实现就是使用循环队列。具体的实现来说就是我们可以固定一个大小确定的数组，然后再确定
两个指针，一个是头指针，一个是尾指针，目的是重用我们之前提到的被浪费的存储。   
设计一个队列循环的实现。循环队列是一种线性的数据结构，其操作表现基于FIFO（先进先出）原则，并且队尾在和队首链接以后形成一个循环，它也被称之为“环形缓冲器”
循环队列的一个好处就是我们可以用这个队列之前用过的存储空间。在一个普通的队列里，一旦一个队列满了我们就不能再往这个队列中添加新的元素，即使在队列的前面
还有空间，但是我们也不能往里面插入新的值。使用循环队列就可以解决这个问题，可以用这些空间去存储新的值。
循环队列应该支持如下的操作：   

* `MyCircularQueue(k)`：构造器，设置队列长度为 K 。    
* `Front`：从队首获取元素。如果队列返回值为空就返回 -1。   
* `Rear`：从队尾获取元素，如果没有就返回 -1.      
* `enQueue(value)`： 向队列中添加一个元素如果插入成功就返回真。失败就返回假。    
* `deQueue()`：从队列循环中删除一个元素，成功就返回 true。      
* `isEmpty()`：检查队列是不是空。      
* `isFull()`：检查队列是否已经满了      



