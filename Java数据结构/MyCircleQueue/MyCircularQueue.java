import java.util.Arrays;

public class MyCircularQueue {
    private int front;
    private int rear;//代表当前可以存放数据元素的下标
    private int[] elem;

    @Override
    public String toString() {
        return "MyCircularQueue{" +
                "front=" + front +
                ", rear=" + rear +
                ", elem=" + Arrays.toString(elem) +
                '}';
    }

    public MyCircularQueue(int k) {
        this.elem = new int[k+1];
        this.front = 0;
        this.rear = 0;

    }

    /**
     * 队列是否为满
     * @return
     */
    public boolean isFull() {
       return (this.rear+1)%this.elem.length==front;
    }

    /**
     * 队列是否为空
     * @return
     */
    public boolean isEmpty() {
       return this.rear==this.front;
    }
    /**
     * 入队
     * (rear+1)  % len
     * @param value
     * @return
     */
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        //放到数组的rear下标  rear往后走
        this.elem[this.rear]=value;
        this.rear=(this.rear+1)%this.elem.length;
        return true;
    }
    /**
     * 出队
     * @return
     */
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        //只需要挪动front这个下标就好了
        this.front=(this.front+1)%this.elem.length;
        return true;
    }
    /**
     * 得到队头元素
     * @return
     */
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }
    /**
     * 得到队尾元素
     * @return
     */
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
       return this.elem[(rear+this.elem.length-1)%this.elem.length];
    }

}
