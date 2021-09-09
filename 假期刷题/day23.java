//链表中没k组反转
public class Solution {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k < 2) return head;
        ListNode newHead = new ListNode(0);
        ListNode pre,cur,temp;
        newHead.next = head;
        pre = newHead;
        cur = head;
        //计算链表长度
        int len = 0;
        while(cur != null)
        {
            len++;
            cur = cur.next;
        }
        cur = head;//注意这一句不能少，不然cur就到了最后面
        
        for(int i = 0; i < len / k; i++)
        {
            for(int j = 1; j < k; j++)
            {
                temp = cur.next;
                cur.next = temp.next;
                temp.next = pre.next;
                pre.next = temp;
            }
            pre = cur;
            cur = pre.next;    
        }
        return newHead.next;
	}
}
