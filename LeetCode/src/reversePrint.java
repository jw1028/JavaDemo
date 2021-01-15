class Solution {
    public int[] reversePrint(ListNode head) {
    
        ListNode cur=head;
        int len=0;
        while(cur!=null)
        {
            len++;
            cur=cur.next;
        }
        cur=head;
        int[] arr=new int[len];
        while(cur!=null)
        {
           arr[len-1]=cur.val;
           len--;
           cur=cur.next;
        }
        return arr;
    }
}