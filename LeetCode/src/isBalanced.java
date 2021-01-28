class Solution {
    public int  high(TreeNode root){
        if(root==null) return 0;
        int LH=high(root.left);
        int RH=high(root.right);
        if(LH>=0&&RH>=0&&Math.abs(LH-RH)<=1)
        {
            return Math.max(LH,RH)+1;
        }else{
            return -1;
        }
    }
    public boolean isBalanced(TreeNode root) {
       return high(root)>=0;
    }
}