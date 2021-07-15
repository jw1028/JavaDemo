public class Solution {
    public int high(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int l = high(root.left);
        int r = high(root.right);
        if(Math.abs(l - r) <= 1 && l != -1 && r != -1) {
            return Math.max(l, r) + 1;
        }else {
            return -1;
        }
    }
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) {
            return true;
        }
        return high(root) >= 0;
    }
}
