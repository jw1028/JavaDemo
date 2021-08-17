//单链表的排序
import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList (ListNode head) {
        // write code here
        ArrayList<Integer> ret = new ArrayList<>();
        while(head != null){
            ret.add(head.val);
            head = head.next;
        }
        Collections.sort(ret);
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        for(int i = 0; i < ret.size(); i++){
            tmp.next = new ListNode(ret.get(i));
            tmp = tmp.next;
        }
        return newHead.next;
        
    }
}
