1.排序
import java.util.*;
public class Solution {
    public void quickSort(int[] arr, int l, int r) {
        if(l >= r) {
            return ;
        }
        int i = l, j = r;
        int tmp =arr[l];
        while(i < j) {
            while(i < j && arr[j] >= tmp) {
                j--;
            }
            arr[i] = arr[j];
            while(i <j && arr[i] <= tmp) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = tmp;
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }
    public int[] MySort (int[] arr) {
        // write code here
        if(arr == null || arr.length == 0) {
            return null;
        }
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }
}

2. 实现二叉树先序，中序和后序遍历
import java.util.*;
public class Solution {
    ArrayList<Integer> pre = new ArrayList<>();
    ArrayList<Integer> in = new ArrayList<>();
    ArrayList<Integer> post = new ArrayList<>();
    
    public int[][] threeOrders (TreeNode root) {
        // write code here
        List<List<Integer>> ret = new ArrayList<>();
        preOrder(root);
        inOrder(root);
        postOrder(root);
        ret.add(pre);
        ret.add(in);
        ret.add(post);
        int[][] ans = new int[ret.size()][ret.get(0).size()];
        for(int i = 0; i < ret.size(); i++) {
            for(int j = 0; j < ret.get(0).size(); j++) {
                ans[i][j] = ret.get(i).get(j);
            }
        }
        return ans;
    }
    public void preOrder(TreeNode root) {
        if(root == null) {
            return ;
        }
        pre.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
        
    }
    public void inOrder(TreeNode root) {
        if(root == null) {
            return ;
        }
        
        inOrder(root.left);
        in.add(root.val);
        inOrder(root.right);
        
    }
    public void postOrder(TreeNode root) {
        if(root == null) {
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        post.add(root.val);
        
    }
}
3.最小的k个数
  import java.util.ArrayList;
import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(input == null || input.length == 0) {
            return ret;
        }
        PriorityQueue<Integer> bigheap = new PriorityQueue<>((o1,o2)->(o2 - o1));
        for(int x : input) {
            bigheap.offer(x);
            if(bigheap.size() > k) {
                bigheap.poll();
            }
        }
        for(int i = 0; i < k; i++) {
            ret.add(bigheap.poll());
        }
        return ret;
    }
}
4.二叉树的层序遍历
import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
         ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        if(root==null) return ret;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
           ArrayList<Integer>  curList=new ArrayList<>();
            int size=queue.size();
            while(size!=0)
            {
                TreeNode cur=queue.poll();
                curList.add(cur.val);
                if(cur.left!=null)
                {
                    queue.offer(cur.left);
                }
                if(cur.right!=null)
                {
                    queue.offer(cur.right);
                }
                size--;
            }
            ret.add(curList);
        }
        return ret;
    }
}
5. 链表中环的入口结点
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        while(fast != head) {
            fast = fast.next;
            head = head.next;
        }
        return fast;
    }
}


SQL：
1.select * from employees where hire_date = 
(select distinct hire_date from employees order by hire_date desc limit 0, 1);
2.select * from employees
    where hire_date = (select distinct hire_date from employees 
     order by hire_date desc limit 2, 1);
