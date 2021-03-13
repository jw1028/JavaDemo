class MinStack {

   Stack<Integer> stk, stk_min;
    public MinStack() {
        stk = new Stack<>();
        stk_min = new Stack<>();
    }
    public void push(int x) {
        stk.push(x);
        if(stk_min.isEmpty() || x<=stk_min.peek())
            stk_min.push(x);
    }
    public void pop() {
           if(stk.pop().equals(stk_min.peek()))
           {
               stk_min.pop();
           }
    }
    public int top() {
        return stk.peek();
    }
    public int min() {
        return stk_min.peek();
    }
}
