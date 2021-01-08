

public class MySingnalList {
    public Node head;

    public MySingnalList() {
        this.head = null;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addTail(int data) {
        Node node = new Node(data);
        Node tail = head;

        if (head == null) {
            head = node;
        } else {
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = node;
        }
    }


    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data) {
        Node node = new Node(data);

        if (index < 0 && index > this.size()) {
            return false;
        } else if (index == 0) {
            this.addFirst(data);
            return true;
        } else {
            Node cur = head;
            while ((index - 1) > 0) {
                cur = cur.next;
                index--;
            }
            node.next = cur.next;
            cur.next = node;
            return true;
        }
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        if (head != null) {
            Node cur = head;
            while (cur != null) {
                if ((cur.data == key)) {
                    return true;
                }
                cur = cur.next;
            }
        }
        return false;
    }

    private Node searchPrev(int key) {

        Node cur = head;
        while (cur.next != null) {
            if (cur.next.data == key)
                return cur;
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            System.out.println("单链表为空");
            return;
        }
        //0、删除的节点是否是头结点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }

        //1、找到key的前驱  如果返回空
        Node prev = searchPrev(key);

        //2、删除节点
        if (prev != null) {
            prev.next = prev.next.next;
        }
    }


    //删除所有值为key的节点
    public void removeAllKey( int val) {
        if(head==null)
        {
            return ;
        }
        Node prev=head;
        Node cur=head.next;
        while(cur!=null)
        {
            if(cur.data==val)
            {
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(head.data==val)
        {
            head=head.next;
        }
        return ;
    }

    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //清空单链表
    public void clear() {
        this.head = null;
    }

    public Node reverseList() {
        Node prev = null;
        Node newHead = null;
        Node cur = head;

        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }

            cur.next = prev;
            prev = cur;
            cur = curNext;

        }

        return newHead;
    }


    public Node findMiddleNode() {    //中间节点
        if (this.head == null) {
            return null;
        }

        Node fast = this.head;
        Node slow = this.head;

        while (fast.next != null) {
//            fast = fast.next.next;
            slow = slow.next;
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
            } else {
                break;
            }
        }
        return slow;
    }

    //找倒数第k个节点
    public Node findLastK(int k) {
        if(head==null||k<=0)
        {
            return null;
        }
        Node fast=head;
        Node slow=head;
        for(int i=0;i<k-1;i++)
        {
            if(fast.next==null)
            {
                System.out.println("没有这个节点");
                return null;
            }
            fast=fast.next;
        }

        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }


    //删除重复的节点
    public Node deleteDuplication() {
        Node node = new Node(-1);
        Node cur = this.head;
        Node tmp = node;
        while (cur != null) {
            if (cur.next != null &&
                    cur.data == cur.next.data) {
                //1、循环
                //2、退出循环 cur要多走一步
                while (cur.next != null &&
                        cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
                //
            } else {
                //当前节点 不等于下一个节点的时候
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next=null;
        return node.next;
    }


    //链表的回文结构
    public boolean chkPalindrome() {
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转
        Node p = slow.next;
        while (p != null) {
            Node pNext = p.next;
            //反转
            p.next = slow;
            slow = p;
            p = pNext;
        }

        //slow往前    head 往后  .data不一样 返回false
        //直到相遇
        while (slow != head){
            if(slow.data != head.data){
                return false;
            }

            if(head.next ==  slow){
                return true;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }


    //是否有环
    public boolean hasCvcle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //创建环-
    public void creatCycle(){
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }

        cur.next = this.head.next;
    }


    //是否有环，有的话位置在那
    public Node detectCycle(){
        Node fast = head;
        Node slow = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                flag = true;
                break;
            }
        }

        if(flag == true){
            fast = head;
            while (true){
                fast = fast.next;
                slow = slow.next;

                if(slow == fast){
                    return slow;
                }
            }
        }else {
            return null;
        }
    }

    //如果有环，求环长度
    public int findCycle(){
        Node fast = head;
        Node slow = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                flag = true;
                break;
            }
        }

        if(flag == true){
            int count = 1;
            slow = slow.next;
            while (slow != fast){

                slow = slow.next;
                count++;
            }
            return count;
        }else {
            return 0;
        }
    }
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public Node partition(int x) {
        Node cur = this.head;
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;
        while (cur != null) {
            //cur.data < x
            if(cur.data < x) {
                //第一次插入
                if(beforeStart==null) {
                    beforeStart = cur;
                    beforeEnd = cur;
                }else {
                    beforeEnd.next = cur;
                    beforeEnd = beforeEnd.next;
                }
            }else {
                //第一次插入
                if(afterStart == null) {
                    afterStart = cur;
                    afterEnd = cur;
                }else {
                    afterEnd.next = cur;
                    afterEnd = afterEnd.next;
                }
            }
            cur = cur.next;
        }
        if(beforeEnd == null){
            return  afterStart;
        } else{
            if(afterStart != null){
                afterEnd.next = null;
            }
            beforeEnd.next = afterStart;
            return beforeStart;
        }
    }



    public Node reverse() {
        if(head==null)
        {
            return null;
        }
        Node prev=null;
        Node cur=head;
        Node newHead=new Node(-1);
        while(cur!=null)
        {
            Node curNext=cur.next;
            if(curNext==null)
            {
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
}
