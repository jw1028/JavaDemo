
public class MyQueue {
    public Node first;//头
    public Node last;//尾

    /**
     * 尾插一个元素
     * @param val
     * @return
     */

    public boolean offer(int val) {
        Node node = new Node(val);
        if(this.first == null) {
            this.first = node;
            this.last = node;
        }else {
            this.last.next = node;
            this.last = node;
        }
        return true;
    }

    /**
     * 得到队头元素且删除
     * @return
     * @throws RuntimeException
     */
    public int poll() throws RuntimeException  {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        int ret = this.first.val;
        this.first = this.first.next;
        return ret;
    }

    /**
     * 得到队头元素不删除
     * @return
     * @throws RuntimeException
     */
    public int peek() throws RuntimeException  {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        return this.first.val;
    }

    public boolean isEmpty() {
        if(this.last==null && this.first==null) {
            return true;
        }
        return false;
    }
    public int size(){
        int count=0;
        Node cur=first;
        while(cur!=null)
        {
            cur=cur.next;
            count++;
        }
        return count;
    }


}
