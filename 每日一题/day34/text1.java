
class Solution {
    public int majorityElement(int[] nums) {
        int val = 0, count = 0;
        for(int x : nums){
            if(count == 0)
            {
               val=x;
               count=1;
            }else{
                if(val==x)
                {
                    count++;
                }else{
                    count--;
                }
            }
        }
        return val;
    }
}
