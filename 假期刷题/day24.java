//最小栈
class MinStack {
    public Stack<Integer> stack=new Stack();
    public Stack<Integer> minStack=new Stack();
    /** initialize your data structure here. */
    public MinStack() {

    }  
    public void push(int x) {
      stack.push(x);
      if(minStack.empty())
      {
          minStack.push(x);
      }else{
          if(x<=minStack.peek())
          {
              minStack.push(x);
          }
      }
    }
    
    public void pop() {
     
        if(stack.pop().equals(minStack.peek()))
        {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
   return minStack.peek();
    }
}
