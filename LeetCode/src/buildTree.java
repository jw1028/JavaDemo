class Solution {
    public int preIndex=0;
    //遍历前序遍历数组 递归构建二叉树
    public TreeNode buildTreeChild(int[] preorder,int[] inorder, int begin,int end){
        if(begin>end) {
            return null;
        }
        TreeNode root=new TreeNode(preorder[preIndex]);
        int index=findVal(inorder,preorder[preIndex],begin,end);
        preIndex++;
        //更新条件
        root.left=buildTreeChild(preorder,inorder,begin,index-1);
        root.right=buildTreeChild(preorder,inorder,index+1,end);
        return root;
    }
    //在中序遍历中找对应的值
    public int findVal(int[] inorder,int key,int begin,int end){
        for(int i=begin;i<=end;i++)
        {
            if(inorder[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     if(preorder==null||inorder==null) return null;
      return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }
}