//自顶向下
class Solution {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
//自底向上
class Solution {
    public boolean flag=true;
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        if(Math.abs(left-right)>1) flag=false;
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
    dfs(root);
    return flag;
    }
}
