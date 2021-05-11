import java.util.*;


public class Solution {
   
    public String solve (String str) {
        // write code here
        char[] s=str.toCharArray();
        char[] res=new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--){
            res[j++]=s[i];
        }
        return String.valueOf(res);
    }
}
