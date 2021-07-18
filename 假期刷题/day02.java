// 两数之和
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode head = null, tail = null;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if(head == null) {
                head = tail = new ListNode(sum % 10);
    
            }else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if(carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
// 两个链表生成相加链表
public class Solution {
    public ListNode reverse(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode curNext = null;
        while(cur != null) {
            curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
    public ListNode addInList (ListNode h1, ListNode h2) {
        // write code here
        if(h1 == null) {
            return h2;
        }
        if(h2 == null) {
            return h1;
        }
        ListNode newH1 = reverse(h1);
        ListNode newH2 = reverse(h2);
        ListNode head = null, tail = null;
        int carry = 0;
        while(newH1 != null || newH2 != null) {
            int n1 = newH1 != null ? newH1.val : 0;
            int n2 = newH2 != null ? newH2.val : 0;
            int sum = n1 + n2 + carry;
            if(head == null) {
                head = tail = new ListNode(sum % 10);
            }else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if(newH1 != null) {
                newH1 = newH1.next;
            }
            if(newH2 != null) {
               newH2 = newH2.next;
            }
        }
        if(carry > 0) {
            tail.next = new ListNode(carry);
        }
       ListNode ret = reverse(head);
        return ret;
    }
}

//  链表内指定区间反转
import java.util.*;
public class Solution {
    public ListNode reverseBetween (ListNode head, int l, int r) {
        // write code here
        if(head == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode tmp = newHead;
        for(int i = 0; i < l - 1; i++){
            tmp = tmp.next;
        }
        ListNode prev = tmp.next;
        ListNode cur = prev.next;
        ListNode curNext = null;
        for(int i = 0; i < r - l; i++){
            curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        tmp.next.next = cur;
        tmp.next = prev;
        return newHead.next;
    }
}

//  删除有序链表中重复的元素
import java.util.*;
public class Solution {
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head == null){
            return null;
        }
        ListNode cur = head;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead; 
        while(cur != null ) {
            if(cur.next != null && cur.val == cur.next.val) {
                while( cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
}
//重排链表
public class Solution {
    public ListNode reorderList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        // 第一步：找到链表中点
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // 从中点处断开链表并且翻转中点往后的链表
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode newHead = reverse(tmp);
        // 重排链表
        ListNode cur = head;
        int k = 0;
        while(cur != null && newHead != null){
            if(k % 2 == 0){
                ListNode next = cur.next;
                cur.next = newHead;
                cur = next;
            }else{
                ListNode next = newHead.next;
                newHead.next = cur;
                newHead = next;
            }
            k++;
        }
        return head;
    }
     
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode curNext = null;
        while(cur!=null){
            curNext  = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return pre;
    }
}


SQL练习
select s.*,d.dept_no 
from salaries s,dept_manager d
where s.emp_no=d.emp_no;

select emp.last_name, emp.first_name, dep.dept_no 
    from employees emp,dept_emp dep 
    where dep.emp_no = emp.emp_no;
