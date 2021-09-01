//二叉树中和为某一值的路径
class Solution {
    List<List<Integer>> ret = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root == null) {
            return ret;
        }
        dfs(root, target);
        return ret;
    }
    public void dfs(TreeNode root, int target) {
        if(root == null) {
            return ;
        }
        path.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null) {
            ret.add(new LinkedList(path));
        }
        dfs(root.left, target);
        dfs(root.right, target);
        path.removeLast();
    }
}

//带重复数字的
