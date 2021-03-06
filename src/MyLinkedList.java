class Node{
    public int value;
    public Node next;
    public Node(){};
    public Node(int value){
        this.value=value;
    }
}


class MyLinkedList {
    public Node head;
    public void  frontAdd(int value){
        Node node=new Node(value);
        if(this.head==null){
            this.head=node;
        }else{
            node.next=this.head;
            this.head=node;
        }

    }
    public void backAdd(int value)
    {
        Node node=new Node(value);
        if(this.head==null)
        {
            this.head=node;
        }else{
            Node cur=this.head;
            while(cur.next!=null)
            {
                cur=cur.next;
            }
            cur.next=node;
        }
    }
    public void dispaly(){
        Node cur=new Node();
        cur=this.head;
        while(cur!=null)
        {
            System.out.print(cur.value+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public int getSize(){
        int count=0;
        Node cur=this.head;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        return count;
    }

    public void insert(int pos,int value){
        if(pos<0||pos>getSize())
        {
            System.out.println("插入位置不合法");
            return ;
        }
        if(pos==0)
        {
            frontAdd(value);
            return ;
        }
        if(pos==getSize())
        {
            backAdd(value);
            return ;
        }
        Node node=new Node(value);
        Node cur=this.head;
        int index=pos-1;
        while(index!=0)
        {
            cur=cur.next;
            index--;
        }
        node.next=cur.next;
        cur.next=node;

    }
    public Node findLastTwoNode() {
        if(this.head==null||this.head.next==null)
        {
            return null;
        }
        Node cur=this.head;
        while(cur.next.next!=null)
        {
            cur=cur.next;
        }
        return cur;

    }

    public int getPosvalue(int pos){
        if(this.head==null)
        {
            return -1;
        }
        if(pos<0||pos>getSize()-1)
        {
            System.out.println("输入pos位置不合法！");
            return -1;
        }
        int count=0;
        Node cur=this.head;
        while(count!=pos)
        {
            cur=cur.next;
            count++;
        }
        return cur.value;
    }
    //链表中是否包含某个元素
    public boolean contain(int value){
        Node cur=this.head;
        while(cur!=null)
        {
            if(cur.value==value)
            {
                System.out.println("包含元素"+value);
                return true;
            }
            cur=cur.next;
        }
        System.out.println("不包含这个元素");
        return false;

    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head==null)
        {
            return ;
        }
        if(this.head.value==key)
        {
            this.head=this.head.next;
        }
        Node cur=this.head;
        while(cur!=null)
        {
            if(cur.next.value==key)
            {
                break;
            }
            cur=cur.next;
        }
        Node del=cur.next;
        cur.next=del.next;

    }
    // 删除所有值为key的节点
    public void removeAllKey(int key){
        if(head==null)
        {
            return ;
        }
        Node prev=head;
        Node cur=head.next;
        while(cur!=null)
        {
            if(cur.value==key)
            {
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(head.value==key)
        {
            head=head.next;
        }
        return ;

    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.frontAdd(0);
        myLinkedList.frontAdd(1);
        myLinkedList.backAdd(2);
        myLinkedList.backAdd(3);
        myLinkedList.backAdd(4);
        myLinkedList.backAdd(4);
        myLinkedList.backAdd(4);
        myLinkedList.insert(0,111);
        myLinkedList.insert(8,666);
        myLinkedList.dispaly();
        Node ret1=myLinkedList.findLastTwoNode();
        System.out.println(ret1.value);
        System.out.println(myLinkedList.getPosvalue(5));
        System.out.println(myLinkedList.getSize());
        myLinkedList.contain(11111);
        myLinkedList.contain(111);
        myLinkedList.remove(1);
        myLinkedList.removeAllKey(4);
        myLinkedList.dispaly();
    }
}