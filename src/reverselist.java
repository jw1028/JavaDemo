
//三指针法
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode prev=null;
        ListNode cur=head;
        ListNode newHead=new ListNode();
        while(cur!=null)
        {
            ListNode curNext=cur.next;
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
//头插法
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode node=new ListNode();
        ListNode curNext=new ListNode();
        ListNode cur=head;
        while(cur!=null)
        {
            curNext=cur.next;
            cur.next=node.next;
            node.next=cur;
            cur=curNext;
        }
        return node.next;

    }
}