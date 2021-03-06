class Solution {
    public int search(int[] nums, int target) {
    int left=0;int right=nums.length-1;
    while(left<right)
    {
       int mid=(left+right)/2;
       if(nums[mid]>=target)
       {
           right=mid;
       }else{
           left=mid+1;
       }
    }
    int count=0;
    while(left<nums.length&&nums[left]==target)
    {
        count++;
        left++;
    }
    return count;
    }
}