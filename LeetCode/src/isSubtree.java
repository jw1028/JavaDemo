class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
      if(s==null||t==null) return false;
      if(isSameTree(s,t)) return true;
      if(isSubtree(s.left,t)) return true;
      if(isSubtree(s.right,t)) return true;
      return false;
        
    }
        public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p!=null&&q==null||p==null&&q!=null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);   
    }
}