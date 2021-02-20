class Solution {
    public String longestCommonPrefix(String[] strs) {
    if(strs.length==0) return "";
    String ans=strs[0];
    for(int i=1;i<strs.length;i++)
    {
        int j=0;
        for(;j<ans.length()&&j<strs[i].length();j++)
        {
           if(strs[i].charAt(j)!=ans.charAt(j)) 
           {
               break;
           }
        }
        ans=ans.substring(0,j);
    }
    return ans;
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) 
        {
            return "";
        }
        String ans=strs[0];
        for (int i = 0; i < strs[0].length(); i++)
         {
            char ch = ans.charAt(i);
            for (int j = 1; j < strs.length; j++) 
            {
                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return ans.substring(0, i);
                }
            }
        }
        return ans;
    }
}