class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
     ListNode newHead=new ListNode(-1);
     newHead.next=head;
     ListNode a=newHead;
     for(int i=0;i<left-1;i++)
     {
         a=a.next;
     }
     ListNode b=a.next,c=b.next;
     for(int i=0;i<right-left;i++)
     {
         ListNode d=c.next;
         c.next=b;
         b=c;
         c=d;
     }
     a.next.next=c;
     a.next=b;
     return newHead.next;
    }
}
