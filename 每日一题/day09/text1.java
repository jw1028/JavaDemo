public class Solution {
    public int preIndex = 0;
    public TreeNode dfs(int[] pre, int[] in, int l, int r) {
        if(l > r) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preIndex]);
        int index = findVal(in, pre[preIndex], l, r);
        preIndex++;
        root.left = dfs(pre, in, l, index - 1);
        root.right = dfs(pre, in, index + 1, r);
        return root;
        
    }
    public int findVal(int[] in, int key, int l, int r) {
        for(int i = l; i <= r; i++) {
            if(key == in[i]) {
                return i;
            }
        }
        return -1;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null) {
            return null;
        }
        return dfs(pre, in, 0, in.length - 1);
    }
}
