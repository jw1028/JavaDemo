import java.util.*;


public class Solution {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        if(strs == null || strs.length == 0) {
            return "";
        }
        String ret = strs[0];
        for(int i = 0; i < strs[0].length(); i++) {
            char ch = ret.charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return ret.substring(0, i);
                }
            }
        }
        return ret;
    }
}
