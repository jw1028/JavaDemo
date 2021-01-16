class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
     if(s.length()==0)
     {
         return false;
     }
     boolean[] F=new boolean[s.length()+1];
     F[0]=true;
     for(int i=1;i<=s.length();i++)
     {
         for(int j=i-1;j>=0;j--)
         {
             //substring左开右闭(] 所以真实取值为j+1到i
             if(F[j]&&wordDict.contains(s.substring(j,i)))
             {
                 F[i]=true;
                 break;
             }
         }
     }
     return F[s.length()];
    }
}
