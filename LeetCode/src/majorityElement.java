//排序
class Solution {
    public int majorityElement(int[] nums) {
      Arrays.sort(nums);
      return nums[nums.length/2];
    }
}
//摩尔投票
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
//哈希表
class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length/2;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
            if(i >= len && map.get(nums[i]) > len) return nums[i];
        }
        return 0;
    }
}