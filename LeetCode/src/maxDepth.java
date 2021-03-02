//递归
class Solution {
     public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return leftHeight  > rightHeight  ?  leftHeight +1 : rightHeight +1;
    }
}
//非递归
class Solution {
    public int maxDepth(TreeNode root) {
    if(root==null) return 0;
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    int depth=0;
    while(!queue.isEmpty())
    {
        depth++;
        int size=queue.size();
        for(int i=0;i<size;i++)
        {
            TreeNode node=queue.poll();
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node. right);
        }
    }
    return depth;
    }
}
