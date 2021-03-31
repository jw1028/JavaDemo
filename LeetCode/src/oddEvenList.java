class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode odd = head;
        ListNode oddTail = odd;
        ListNode even = head.next;
        ListNode evenTail = even;
        while(evenTail != null && evenTail.next != null){
            oddTail.next = oddTail.next.next;
            evenTail.next = evenTail.next.next;
            oddTail = oddTail.next;
            evenTail = evenTail.next;
        }
        oddTail.next = even;
        return head;
    }
}
