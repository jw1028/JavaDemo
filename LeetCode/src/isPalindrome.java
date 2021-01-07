class Solution {
    public boolean isPalindrome(ListNode head) {
        // write code here
        if(head==null)
        {
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode pre = null;
        ListNode slowNext=null;
        while (slow != null) {
            slowNext = slow.next;
            slow.next = pre;
            pre = slow;
            slow = slowNext;
        }
        // 前后两段比较是否一致
        while (pre != null) {
            if (pre.val != head.val) {
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }
}