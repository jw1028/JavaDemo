class Solution {

    public int[] reversePrint(ListNode head) {
    if(head==null) return new int[0];
    ListNode prev=null,cur=head,curNext=null;
    int count = 0;
    while(cur!=null)
    {
      curNext=cur.next;
      cur.next=prev;
      prev=cur;
      cur=curNext;
      count++;
    }
       int[] ret = new int[count];
       int k = 0;
        while(prev != null){
            ret[k] = prev.val;
            prev = prev.next;
            k++;
        }
        return ret;
    }
}
