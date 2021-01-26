//遍历实现
class Solution {
    
    public void pre(TreeNode root,List list)
    {
        if(root==null) return ;
        list.add(root.val);
        pre(root.left,list);
        pre(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list=new ArrayList<>();
    pre(root,list);
    return list;  
    }
}
//子问题递归求解
class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list=new ArrayList<>();
       if(root!=null)
    {
       list.add(root.val);
       List<Integer> leftList=preorderTraversal(root.left);
       list.addAll(leftList);
       List<Integer> rightList=preorderTraversal(root.right);
       list.addAll(rightList);     
    }
      return list;
  }
}