/加减的目标值
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
                int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if((target + sum) % 2 == 1){
            return 0;
        }
        int cap = (target + sum >> 1);

        int[] dp = new int[cap + 1];
        dp[0] = 1;
        for(int num : nums){
            for(int i = cap; i >= num; -- i){
                dp[i] += dp[i - num];
            }
        }
        return dp[cap];

    }
}
