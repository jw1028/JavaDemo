class Solution {
    public int cuttingRope(int n) {
      if(n<=3) return 1*(n-1);
      int ret=1;
      if(n%3==1)
      {
          ret*=4;
          n-=4;
      }
      if(n%3==2)
      {
          ret*=2;
          n-=2;
      }
      while(n!=0)
      {
          ret*=3;
          n-=3;
      }
      return ret;
    }
}