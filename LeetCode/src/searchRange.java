class Solution {
    public int[] searchRange(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) >>>1;
            if(nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }else {
                int start = mid, end = mid;
                while(start > 0 && nums[start - 1] == target){
                    start--;
                }
                while(end < nums.length - 1 && nums[end + 1] == target) {
                    end++;
                }
                return new int[]{start, end};
            }
        }
        return new int[]{-1, -1};
    }
}