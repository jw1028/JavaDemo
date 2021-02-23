
//solution 1
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p=headA;
        ListNode q=headB;
        while(p!=q)
        {
            if(p!=null)
            {
                p=p.next;
            }else{
                p=headB;
            }
            if(q!=null)
            {
                q=q.next;
            }else{
                q=headA;
            }
        }
        return p;
    }
}

//solution 2
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
        {
            return null;
        }
        //假设链表A长
        ListNode pl=headA;
        ListNode ps=headB;
        int lenA=0;
        int lenB=0;
        //求链表AB的长度
        while(pl!=null)
        {
            pl=pl.next;
            lenA++;
        }
        while(ps!=null)
        {
            ps=ps.next;
            lenB++;
        }
        pl=headA;
        ps=headB;
        //求差值
        int k=lenA-lenB;
        if(k<0)
        {
            pl=headB;
            ps=headA;
            k=lenB-lenA;
        }
        while(k!=0)
        {
            pl=pl.next;
            k--;
        }
        //判断是否相等
        while(pl!=ps)
        {
            pl=pl.next;
            ps=ps.next;
        }
        return pl;
    }
}
