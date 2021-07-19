// 买卖股票(单次交易）
import java.util.*;
public class Solution {

    public int maxProfit (int[] nums) {
        // write code here
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int ret = 0, min = nums[0];
        for(int i = 1; i <  nums.length; i++) {
            if(nums[i] <= min) {
                min = nums[i];
            }else {
                ret = Math.max(ret, nums[i] - min);
            }
        }
        return ret;
    }
}
// 买卖股票(无限次交易)
import java.util.*;
public class Solution {
    public int maxProfit (int[] prices) {
        // write code here
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int ret = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                ret += prices[i] - prices[i - 1];
            }
        }
        return ret;
    }
}

// 链表的奇偶重排
import java.util.*;
public class Solution {
    public ListNode oddEvenList (ListNode head) {
        // write code here
        if(head == null) {
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddTail = odd;
        ListNode evenTail = even;
        while(evenTail != null && evenTail.next != null) {
            oddTail.next = oddTail.next.next;
            evenTail.next = evenTail.next.next;
            oddTail = oddTail.next;
            evenTail = evenTail.next;
        }
        oddTail.next = even;
        return head;
    }
}


 //调整数组顺序使奇数位于偶数前面
public int[] reOrderArray (int[] array) {
    int index = 0;
    int[] res = new int[array.length];
    for (int i : array) {
        if (i % 2 != 0) {
            res[index] = i;
            index++;
        }
    }
    for (int i : array) {
        if (i % 2 == 0) {
            res[index] = i;
            index++;
        }
    }
    return res;
    }
}
// 二叉搜索树与双向链表
public class Solution {
    TreeNode prev = null;
    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        root.left = prev;
        if(prev != null) {
            prev.right = root;
        }
        prev = root;
        inorder(root.right);
    }
    public TreeNode Convert(TreeNode root) {
        if(root == null) {
            return null;
        }
        inorder(root);
        TreeNode head = root, tail = root;
        while(head.left != null) {
            head = head.left;
        }
        while(tail.right != null) {
            tail = tail.right;
        }
        head.left = tail;
        tail.right = head;
        return head;  
    }
}
