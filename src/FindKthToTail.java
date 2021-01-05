public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0)
        {
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<k-1;i++)
        {
            if(fast.next==null)
            {
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
}
