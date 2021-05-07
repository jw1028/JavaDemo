class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length ;
        int[] f = new int[n + 1];
        int ret = 0;
        for(int i = 0; i <= n - 1; i++) {
            f[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    f[i] = Math.max(f[i] , f[j] + 1);
                }
            }  
             ret = Math.max(ret, f[i]);  
        }
        return ret;
    }
}
//dp + 二分
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int[] q = new int[n + 1];
        int len = 0;
        for(int i = 0; i < n; i ++ )
        {
            int l = 0, r = len;
            while (l < r)
            {
                int mid = l + r + 1 >> 1;
                if (q[mid] < nums[i]) l = mid;
                else r = mid - 1;
            }
            len = Math.max(len, r + 1);
            q[r + 1] = nums[i];
        }
        return len;
    }
}
