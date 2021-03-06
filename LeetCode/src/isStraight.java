class Solution {
    public boolean isStraight(int[] nums) {
    if(nums==null) return false;
        Arrays.sort(nums);
        int k=0;
        while(nums[k]==0) k++;
        for(int i=k+1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]) return false;
        }
        return ((nums[nums.length-1]-nums[k])<=4) ;
    }
}
