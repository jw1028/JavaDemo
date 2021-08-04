import java.util.ArrayList;
import java.util.*;
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if(root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--) {
               
                TreeNode node = queue.poll();
                if(ret.size() % 2 == 0) {
                    tmp.add(node.val);
                }else {
                    tmp.add(0, node.val);
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
               
            }
             ret.add(tmp);
        }
        return ret;
        
    }

}
