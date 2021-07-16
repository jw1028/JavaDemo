class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                 if(node.left != null) queue.offer(node.left);
                 if(node.right != null) queue.offer(node.right);
                 if(size - 1 == i) {
                     ret.add(node.val);
                 }
            }
        }
        return ret;
    }
}
