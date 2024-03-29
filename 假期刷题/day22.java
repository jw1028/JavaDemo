@[TOC](这里写目录标题)
# 大数相加
[https://www.nowcoder.com/practice/11ae12e8c6fe48f883cad618c2e81475?tpId=117&&tqId=37842&&companyId=665&rp=1&ru=/company/home/code/665&qru=/ta/job-code-high/question-ranking](https://www.nowcoder.com/practice/11ae12e8c6fe48f883cad618c2e81475?tpId=117&&tqId=37842&&companyId=665&rp=1&ru=/company/home/code/665&qru=/ta/job-code-high/question-ranking)

```java
import java.util.*;
public class Solution {
    public String solve (String s, String t) {
        // write code here
        if(s == null || "".equals(s)) {
            return t;
        }
        if(t == null || "".equals(t)) {
            return s;
        }
        int i = s.length() - 1;
        int j = t.length() - 1;
        int carry = 0;
        StringBuffer ret = new StringBuffer();
        while(i >= 0 || j >= 0) {
           int n1 = i >= 0 ? s.charAt(i) - '0' : 0;
           int n2 = j >= 0 ? t.charAt(j) - '0' : 0;
           int sum = n1 + n2 + carry;
            ret.append((char)((sum % 10) + '0'));
            carry = sum / 10;
            i--;
            j--;
            
        }
        if(carry > 0) {
            ret.append('1');
        }
        ret.reverse();
        return ret.toString();
    }
}
```
# 两数相加
[https://leetcode-cn.com/problems/add-two-numbers/](https://leetcode-cn.com/problems/add-two-numbers/)
```java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode head = null;
        ListNode tail = null;
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
```
# 链表相加
[添加链接描述](https://www.nowcoder.com/practice/c56f6c70fb3f4849bc56e33ff2a50b6b?tpId=117&&tqId=37814&&companyId=665&rp=1&ru=/company/home/code/665&qru=/ta/job-code-high/question-ranking)
```java
import java.util.*;
public class Solution {
    public ListNode reverse(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode curNext = null;
        while(cur != null) {
            curNext = cur.next;https://www.nowcoder.com/practice/c56f6c70fb3f4849bc56e33ff2a50b6b?tpId=117&&tqId=37814&&companyId=665&rp=1&ru=/company/home/code/665&qru=/ta/job-code-high/question-ranking
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
```
