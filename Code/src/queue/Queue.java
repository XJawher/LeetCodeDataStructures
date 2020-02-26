package queue;

import java.util.ArrayList;
import java.util.List;

class MyQueue {
    /**
     * 1 先声明一个变量，存储下队列的数据
     * 2 声明变量，存储当前的元素最新的索引
     * 3 声明入队方法，将新加的元素入队，记录好最新的索引
     * 4 声明出队的方法，将要出队的元素出队，记录好最新的索引
     * 5 声明检查队列索引的方法，当索引值等于 0 的时候说明已经是空了。
     * 6 获取当前索引下队列的值
     */

    /**
     * 1 声明变量，存储队列的数据。
     * 为啥要在 List<Integer> 中放 Integer 这个引用的对象？？？？
     * https://stackoverflow.com/questions/2721546/why-dont-java-generics-support-primitive-types
     * 按照这个解释就是 Java 中的泛型是在完全编译的时候才去构建的
     * Generics in Java are an entirely compile-time construct -
     * 编译器将所有泛型使用转换为正确的类型。
     * the compiler turns all generic uses into casts to the right type.
     * 这是为了保持与以前的JVM运行时的向后兼容性。
     * This is to maintain backwards compatibility with previous JVM runtimes.
     */
    private List<Integer> data;

    /**
     * 存储队列的索引
     * 初始的默认数据值是怎么进行填充的？？？== 这个初始的值是通过 public MyQueue () {} 函数进行初始化的。这个函数就是类似 react 中的构造函数
     * int 和 Integer 的区别是啥来着？？？== 这俩的区别是基本数据类型和引用数据类型的区别。两者有如下的区别
     * 1 int 是基本的数据类型
     * 2 Integer 是 int 的封装类
     * 3 int 和 Integer 都可以表示某一个值
     * 4 int 和 Integer 是不能互用的，因为代表了两个不同数据类型。
     */
    private int indexData;

    /**
     * TODO 有一个疑问?为何 MyQueue 这个函数不需要 boolean 之类的修饰词？？？
     * 目前掌握到的知识看，当一个方法和 class 同名且前面没有 void 的时候，他就是构造方法。
     * 基本上为了区别，除了构造方法是大驼峰，其余的方法都是小驼峰
     */
    MyQueue() {
        data = new ArrayList<>();

        // 都不知道赋值怎么搞，Java 还是很烦的，还是没掌握到诀窍，烦的一批
        indexData = 0;
        this.myQueue();
    }

    private void myQueue() {
        System.out.println(111);
    }

    /**
     * 有个疑问？ 为何 MyQueue 函数就不需要做函数前面变量的声明，而其他的函数却需要做这个变量的声明？？？
     * 初步看应该是构造函数不需要，其他的函数是需要返回值的声明的，不知道泛型是不是也需要这个？
     */
    public boolean inQueen(int x) {
        data.add(x);
        System.out.print("这是 data 的数据：" + data + "\n");
        return true;
    }

    public boolean outQueen() {
        if (this.isEmpty()) {
            return false;
        }
        indexData++;
        return true;
    }

    public String getFrontData() {
        System.out.print("这是 indexData 的数据：" + indexData + "\n");
        if(this.isEmpty()) {
            return String.valueOf(data);
        }
        return String.valueOf(data.get(indexData));
    }
    public boolean isEmpty() {
        return indexData >= data.size();
    }
};

