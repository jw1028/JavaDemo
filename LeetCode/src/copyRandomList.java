//哈希表
class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node cur=head;
        while(cur!=null)
        {
            Node node=new Node(cur.val);
            map.put(cur,node);
            cur=cur.next;
        }
        cur=head;
        while(cur!=null)
        {
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }
}
//链接+拆分
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node cur=head;
        while(cur!=null)
        {
            Node node=new Node(cur.val);
            node.next=cur.next;
            cur.next=node;
            cur=node.next;
        }
        cur=head;
        while(cur!=null)
        {
            if(cur.random!=null)
            {
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }
        cur=head;
        Node newHead=new Node(-1);
        Node tmp=newHead;
        while(cur!=null)
        {
            tmp.next=cur.next;
            tmp=tmp.next;
            cur.next=tmp.next;
            cur=cur.next;
        }
        return newHead.next;
    }
}