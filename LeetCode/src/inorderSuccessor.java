class Solution {
    public TreeNode inorderSuccessor(TreeNode p) {
        if(p.right!=null)
        {
            p=p.right;
            while(p.left!=null)
            {
                p=p.left;
            }
            return p;
        }
        while(p.father!=null&&p==p.father.right)
        {
            p=p.father;
        }
        return p.father;
    }
}