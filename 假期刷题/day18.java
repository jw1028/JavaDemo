
// 最长回文子串
import java.util.*;

public class Solution {
    public boolean isHuiWen(String s) {
        if(s == null ||s.length() == 0) {
            return false;
        }
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int getLongestPalindrome(String s, int n) {
        // write code here
        int ret = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j <= n; j++) {
                if(isHuiWen(s.substring(i, j))) {
                    if(ret < j - i) {
                        ret  = j - i;
                    }
                }
            }
        }
        return ret;     
    }
}
