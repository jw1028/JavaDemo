public class Solution {
    public boolean HasSubtree(TreeNode s,TreeNode t) {
        if (t == null) return true;   // t 为 null 一定都是 true
        if (s == null) return false;  // 这里 t 一定不为 null, 只要 s 为 null，肯定是 false
        return HasSubtree(s.left, t) || HasSubtree(s.right, t) || isSametree(s,t);
    }
    public boolean isSametree(TreeNode p, TreeNode q) {
         if(p == null && q == null) return true;
        if((p != null && q == null) || (p == null && q != null)) return false;
        if(p.val != q.val) return false;
        return isSametree(p.left, q.left) && isSametree(p.right, q.right);
    }
}
