class MyStack {

    private Queue<Integer> qu1=new LinkedList<>();
    private Queue<Integer> qu2=new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {

    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(!qu1.isEmpty())
        {
            qu1.offer(x);
        }else if(!qu2.isEmpty())
        {
            qu2.offer(x);
        }else{
            //第一次默认放到qu1当中
            qu1.offer(x);
        }
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
       if(empty())
       {
           return -1;
       }
       if(!qu1.isEmpty())
       {
           int size=qu1.size()-1;
           while(size!=0)
           {
               qu2.offer(qu1.poll());
               size--;
           }
           return qu1.poll();
       }else{
           int size=qu2.size()-1;
           while(size!=0)
           {
               qu1.offer(qu2.poll());
               size--;
           }
           return qu2.poll();
       }
    }
    
    /** Get the top element. */
    public int top() {
      if(empty())
      {
          return -1;
      }
      if(!qu1.isEmpty())
      {
          int size=qu1.size();
          int ret=0;//用作最后返回
          while(size!=0)
          {
              ret=qu1.poll();
              qu2.offer(ret);
              size--;
          }
          return ret;
      }else{
          int size=qu2.size();
          int ret=0;
          while(size!=0)
          {
              ret=qu2.poll();
              qu1.offer(ret);
              size--;
          }
          return ret;

      }
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
       return qu1.isEmpty()&&qu2.isEmpty();
    }
}
