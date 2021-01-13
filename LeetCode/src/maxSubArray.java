class Solution {
    public int maxSubArray(int[] array) {
          if(array==null)
          {
              return -1;
          }
          //保存第一个数（初态）
          int ret=array[0];
          for(int i=1;i<array.length;i++)
          {

              array[i]=Math.max(array[i-1]+array[i],array[i]);
              //将上一次的值与这一次作比较
              ret=Math.max(ret,array[i]);
          }
          return ret;
    }
}