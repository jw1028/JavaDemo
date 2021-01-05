class Solution {
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode newHead=new ListNode();
        ListNode tmp=newHead;
        while(headA!=null&&headB!=null)
        {
            if(headA.val<=headB.val)
            {
                tmp.next=headA;
                headA=headA.next;
                tmp=tmp.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
        }
        if(headA!=null)
        {
            tmp.next=headA;
        }
        if(headB!=null)
        {
            tmp.next=headB;
        }
        return newHead.next;
    }
}
