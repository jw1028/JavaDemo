
public class MyStack {
    private int[] elem;
    private int top;//既可以代表下标，也可以代表有多少个元素 默认在0位置放
    private int capacity;
    public MyStack(int capacity){
        this.capacity=capacity;
        this.elem=new int[capacity];
    }
    public boolean isFull(){
        return this.top==this.elem.length;
    }
    public int push(int value) {
        if(isFull()) {
            throw new RuntimeException("栈为满");
        }
        this.elem[this.top] = value;
        this.top++;
        return this.elem[this.top-1];
    }

    /**
     * 弹出栈顶元素 并且删除
     * @return
     */
    public int pop() {
        if(empty()) {
            //return -1;
            throw new RuntimeException("栈为空");
        }
        this.top--;
        return this.elem[this.top];
    }

    /**
     * 拿到栈顶元素不删除
     * @return
     */
    public int peek() {
        if(empty()) {
            //return -1;
            throw new RuntimeException("栈为空");
        }
        return this.elem[this.top-1];
    }

    /**
     * 判断栈为空
     * @return
     */
    public boolean empty() {
        return this.top == 0;
    }

    /**
     * 显示栈
     */
    public void list() {
        if (empty()) {
            System.out.println("没有数据");
            return;
        }

        for (int i = top-1; i >= 0; i--) {
            System.out.print(this.elem[i] + " ");
        }
    }

    public int size() {
        return this.top;
    }
    

}
