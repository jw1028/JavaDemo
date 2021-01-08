
public class DoubleLinkedList {

    private ListNode head;//头
    private ListNode last;
    //打印
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+ " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            head.prev = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int pos,int data) {
         if(pos<0||pos>size())
         {
             return ;
         }
         if(pos==0)
         {
             addFirst(data);
             return ;
         }
         if(pos==size())
         {
             addLast(data);
         }
         ListNode cur=this.head;
         while(pos!=0)
         {
             cur=cur.next;
             pos--;
         }
         ListNode node=new ListNode(data);
         node.next=cur;
         node.prev=cur.prev;
         cur.prev.next=node;
         cur.prev=node;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //得到单链表的长度
    public int size() {
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public ListNode findNode(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = this.findNode(key);
        if(cur == null) {
            return;
        }
        //
        if(cur == this.head) {
            this.head=this.head.next;
            this.head.prev = null;
            return;
        }
        if(cur == this.last) {
            cur.prev.next=null;
            this.last=this.last.prev;
            return;
        }
        cur.prev.next=cur.next;
        cur.next.prev=cur.prev;
    }


    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    //头结点
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        //cur.next == null
                        this.last = this.last.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    public void clear() {
        this.head = null;
        this.last = null;
    }

    /*public void clear2() {
        ListNode cur = this.head;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
        this.last = null;
        this.head = null;
    }*/
}
