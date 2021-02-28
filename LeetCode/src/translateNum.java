class Solution {
    public int translateNum(int num) {
    String s = String.valueOf(num);
    int n=s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            int  tmp = (s.charAt(i-2)-'0')*10+s.charAt(i-1)-'0';
            if(tmp >= 10 && tmp<=25)
                dp[i] = dp[i-1] + dp[i-2];
            else
                dp[i] = dp[i-1];
        }
        return dp[n];
    }
}