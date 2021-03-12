//set解法
class Solution {
    public int duplicateInArray(int[] nums) {
      int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0 || nums[i] > len - 1) {
                return -1;
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;

    }
}
//二分解法
class Solution {
    public int duplicateInArray(int[] nums) {
     if (nums.length == 0 || nums.length == 1) {
            return -1;
        }

        // 分治法 + 抽屉原理
        int l = 1, r = nums.length - 1;
        while (l < r) {
            int mid = l+r>>1; 
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= l && nums[i] <= mid) {
                    count++;
                }
            }
            // 这里的区间应该是mid和l中间的区间
            if (count > mid - l + 1) {
                r = mid;
            } else {
                l = mid + 1; //分为左侧：[l, mid] 和[mid + 1, r] 两个区间
            }
        }

        return l;
    }
}
