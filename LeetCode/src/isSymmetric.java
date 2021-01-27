class Solution { 
    public boolean check(TreeNode L,TreeNode R)
    {
        if(L==null&&R==null) return true;
        if(L!=null&&R==null||L==null&&R!=null) return false;
        if(L.val!=R.val) return false;
        return check(L.left,R.right)&&check(L.right,R.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return check(root.left,root.right);
    }
}