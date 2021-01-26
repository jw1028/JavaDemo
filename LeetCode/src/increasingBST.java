class Solution {    
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList();
        inorder(root, list);
        TreeNode ret = new TreeNode(0), cur = ret;
        for (int x: list) {
            cur.right = new TreeNode(x);
            cur = cur.right;
        }
        return ret.right;
    }
    //中序遍历
    public void inorder(TreeNode root, List list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}