class Solution {
    public int countSegments(String s) {
     s=s.trim();
     if(s==null||s.isEmpty())
     {
         return 0;
     }
     String[] str=s.split(" ");
     int count=0;
     for(int i=0;i<str.length;i++)
     {
         if(str[i].isEmpty())
         {
             continue;
         }
         count++;
     }
     return count;
    }
}