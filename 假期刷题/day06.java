// 最长公共前缀

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String ret = strs[0];
        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if(i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return ret.substring(0, i);
                }
            }
        }
        return ret;
    }
}
```

// 最长公共子串

```java
import java.util.*;
public class Solution {
    public String LCS (String s1, String s2) {
        // write code here
        if(s1 == null || s1 == null || s1.length() == 0 || s2.length() == 0) {
            return "";
        }
        int n = s1.length(), m = s2.length();
        int[][] f = new int[n + 1][m + 1];
        int max = 0, end = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - 1] + 1);
                    if(max < f[i][j]) {
                        max = f[i][j];
                        end = i;
                    }
                }
            }
        }
        return s1.substring(end - max, end);
    }
}
```

// 最长公共子序列

```java
class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[][] f = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i - 1) != s2.charAt(j - 1)) {
                    f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                }else {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - 1] + 1);
                }
            }
        }
        return f[n][m];
    }
}
```

//  无重复最长子串

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
    if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int ret = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            ret = Math.max(ret, i - left + 1);
        }
        return ret;
    }
}
```

// 连续子数组最大和

```java
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int ret = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            ret = Math.max(ret, nums[i]);
        }
        return ret;
    }
}
```

// 最长递增子序列

```java
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int n = nums.length;
        int[] f = new int[n + 1];
        int ret = 0;
        for(int i = 0; i < n; i++) {
            f[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);               
                }        
            }
        }  
        for(int i = 0; i < n; i++){
            ret = Math.max(ret, f[i]);
        }
        return ret;
    }
}
```

