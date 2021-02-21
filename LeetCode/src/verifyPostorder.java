
class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return dfs(postorder, 0, postorder.length - 1);
    }
    boolean dfs(int[] postorder, int left, int right) {
        if(left >= right) return true;
        int root=postorder[right];
        int k = left;
        while(k<right&&postorder[k] < root) k++;
        for(int i=k;i<right;i++)
        {
            if(postorder[i]<root) return false;
        }
        return  dfs(postorder, left, k - 1) && dfs(postorder, k, right-1);
    }
}